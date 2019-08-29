package com.mapper;

import com.pojo.OrderProduct;

public interface OrderProductMapper {
    int deleteByPrimaryKey(OrderProduct key);

    int insert(OrderProduct record);

    int insertSelective(OrderProduct record);
}