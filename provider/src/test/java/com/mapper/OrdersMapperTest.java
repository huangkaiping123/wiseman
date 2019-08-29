package com.mapper;

import com.ProviderTest;
import com.dto.SelectOrderDTO;
import com.pojo.OrderStatus;
import com.vo.OrderVO;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.core.AutoConfigureCache;

import java.util.List;

import static org.junit.Assert.*;

public class OrdersMapperTest extends ProviderTest {


    @Autowired
    private OrdersMapper ordersMapper;

    @Test
    public void getOrderInfo() {

        SelectOrderDTO selectOrderDTO = new SelectOrderDTO();
        selectOrderDTO.setUserId(1);
        selectOrderDTO.setProductName("西");

        List<OrderVO> orderInfo = ordersMapper.getOrderInfo(selectOrderDTO);
        System.out.println();
    }

    @Test
    public void getOrderStatus(){
        List<OrderStatus> orderStatus = ordersMapper.getOrderStatus();
        System.out.println();

    }

}