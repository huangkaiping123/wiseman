package com.mapper;

import com.pojo.RoleUser;

public interface RoleUserMapper {
    int deleteByPrimaryKey(RoleUser key);

    int insert(RoleUser record);

    int insertSelective(RoleUser record);
}