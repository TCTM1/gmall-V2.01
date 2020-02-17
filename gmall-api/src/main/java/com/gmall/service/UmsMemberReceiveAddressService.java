package com.gmall.service;


import com.gmall.pojo.UmsMemberReceiveAddress;

import java.util.List;

public interface UmsMemberReceiveAddressService {
    List<UmsMemberReceiveAddress> getUserReceiveAddress(String memberId);
}
