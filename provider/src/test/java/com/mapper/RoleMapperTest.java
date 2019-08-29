package com.mapper;

import com.ProviderTest;
import com.pojo.Role;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

public class RoleMapperTest extends ProviderTest{

    @Autowired
    private RoleMapper roleMapper;

    @Test
    public void selectByPrimaryKey() {
        Role role = roleMapper.selectByPrimaryKey(1);
        System.out.println(role);
    }
}