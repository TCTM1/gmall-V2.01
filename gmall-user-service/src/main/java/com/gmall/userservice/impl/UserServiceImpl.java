package com.gmall.userservice.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.gmall.pojo.UmsMember;
import com.gmall.service.UserService;
import com.gmall.userservice.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<UmsMember> getAllUser() {
        List<UmsMember> umsMembers = userMapper.selectAll();
        return umsMembers;
    }


}
