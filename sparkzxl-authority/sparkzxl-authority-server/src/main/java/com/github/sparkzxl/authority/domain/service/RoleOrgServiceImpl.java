package com.github.sparkzxl.authority.domain.service;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.github.sparkzxl.authority.infrastructure.constant.CacheConstant;
import com.github.sparkzxl.authority.infrastructure.entity.RoleOrg;
import com.github.sparkzxl.database.base.service.impl.AbstractSuperCacheServiceImpl;
import com.github.sparkzxl.authority.application.service.IRoleOrgService;
import com.github.sparkzxl.authority.infrastructure.mapper.RoleOrgMapper;
import org.springframework.stereotype.Service;

/**
 * description: 角色组织关系 服务实现类
 *
 * @author: zhouxinlei
 * @date: 2020-07-19 21:01:18
 */
@Service
public class RoleOrgServiceImpl extends AbstractSuperCacheServiceImpl<RoleOrgMapper, RoleOrg> implements IRoleOrgService {

    @Override
    public boolean deleteRoleOrgByOrgId(Long orgId) {
        return remove(new UpdateWrapper<RoleOrg>().lambda().eq(RoleOrg::getOrgId, orgId));
    }

    @Override
    protected String getRegion() {
        return CacheConstant.ROLE_ORG;
    }
}
