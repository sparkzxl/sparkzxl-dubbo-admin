package com.sparksys.authority.interfaces.controller.auth;


import com.github.sparkzxl.database.base.controller.SuperCacheController;
import com.github.sparkzxl.log.annotation.WebLog;
import com.github.sparkzxl.web.annotation.ResponseResult;
import com.sparksys.authority.application.service.IRoleOrgService;
import com.sparksys.authority.infrastructure.entity.RoleOrg;
import com.sparksys.authority.interfaces.dto.role.RoleOrgPageDTO;
import com.sparksys.authority.interfaces.dto.role.RoleOrgSaveDTO;
import com.sparksys.authority.interfaces.dto.role.RoleOrgUpdateDTO;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * description: 角色组织关系管理
 *
 * @author: zhouxinlei
 * @date: 2020-07-19 21:07:35
 */
@RestController
@RequestMapping("/role/org")
@ResponseResult
@WebLog
@Api(tags = "角色组织关系管理")
public class RoleOrgController extends SuperCacheController<IRoleOrgService, Long,
        RoleOrg, RoleOrgPageDTO, RoleOrgSaveDTO, RoleOrgUpdateDTO> {

}
