package com.serviceImpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.service.SendService;


@Service
public class SendServiceImpl implements SendService {
    public void sendmail(String mail,String code) {

    }

    public void sendMessage(String phoneNumber,String code) {

    }
}
