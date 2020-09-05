package com.sparksys.test.interfaces.controller;

import com.sparksys.authority.api.UserService;
import com.sparksys.authority.dto.UserDTO;
import com.sparksys.log.annotation.WebLog;
import com.sparksys.web.annotation.ResponseResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * description:
 *
 * @author: zhouxinlei
 * @date: 2020-09-04 15:08:58
 */
@RestController
@RequestMapping("/user")
@ResponseResult
@WebLog
@Api(tags = "测试管理")
public class TestController {

    @Reference(version = "1.0.0")
    private UserService userService;

    @GetMapping("/test")
    @ApiOperation("test dubbo")
    public UserDTO testDubbo(@RequestParam("userId") Long userId) {
        return userService.getById(userId);
    }
}
