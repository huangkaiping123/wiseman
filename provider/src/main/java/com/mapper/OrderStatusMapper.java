package com.mapper;

import com.pojo.OrderStatus;

public interface OrderStatusMapper {
    int deleteByPrimaryKey(Short orderStatusId);

    int insert(OrderStatus record);

    int insertSelective(OrderStatus record);

    OrderStatus selectByPrimaryKey(Integer orderStatusId);

    int updateByPrimaryKeySelective(OrderStatus record);

    int updateByPrimaryKey(OrderStatus record);
}