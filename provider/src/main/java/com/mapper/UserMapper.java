package com.mapper;

import com.pojo.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    //根据手机号查询user
    User getUserByPhoneNumber(String phoneNumber);

    //通过邮箱查询user
    User getUserByEmail(String Email);

    int deleteByPrimaryKey(Integer userId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}
