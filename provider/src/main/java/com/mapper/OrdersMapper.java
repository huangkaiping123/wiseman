package com.mapper;

import com.dto.SelectOrderDTO;
import com.pojo.OrderStatus;
import com.pojo.Orders;
import com.vo.OrderVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrdersMapper {

    //根据用户的id 商品名 订单状态查询(填充主表)
    public List<OrderVO> getOrderInfo(SelectOrderDTO selectOrderDTO);

    //获取支付状态(用于填充搜索界面的下拉框)
    public List<OrderStatus> getOrderStatus();

    int deleteByPrimaryKey(String orderId);

    int insert(Orders record);

    int insertSelective(Orders record);

    Orders selectByPrimaryKey(String orderId);

    int updateByPrimaryKeySelective(Orders record);

    int updateByPrimaryKey(Orders record);
}
