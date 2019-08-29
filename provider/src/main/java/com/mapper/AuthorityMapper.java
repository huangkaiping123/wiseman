package com.mapper;

import com.pojo.Authority;

public interface AuthorityMapper {
    int deleteByPrimaryKey(Integer authNameId);

    int insert(Authority record);

    int insertSelective(Authority record);

    Authority selectByPrimaryKey(Byte authNameId);

    int updateByPrimaryKeySelective(Authority record);

    int updateByPrimaryKey(Authority record);
}