package com.gmall.userweb.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.gmall.pojo.UmsMemberReceiveAddress;
import com.gmall.service.UmsMemberReceiveAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UmsMemberReceiveAddressController {
    @Reference
    private UmsMemberReceiveAddressService umsMemberReceiveAddressService;

    @RequestMapping("getAddressByMemberId")
    public List<UmsMemberReceiveAddress> getAddressByMemberId(String memberId){
        List<UmsMemberReceiveAddress> umsMemberReceiveAddresses = umsMemberReceiveAddressService.getUserReceiveAddress(memberId);
        return umsMemberReceiveAddresses;
    }

}