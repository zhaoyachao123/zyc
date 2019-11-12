package com.jk.service;

import com.alibaba.dubbo.config.annotation.Service;

import com.jk.dao.Userdao;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private Userdao userdao;
}
