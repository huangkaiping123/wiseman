package com.mapper;

import com.pojo.AuthRole;

public interface AuthRoleMapper {
    int deleteByPrimaryKey(AuthRole key);

    int insert(AuthRole record);

    int insertSelective(AuthRole record);
}