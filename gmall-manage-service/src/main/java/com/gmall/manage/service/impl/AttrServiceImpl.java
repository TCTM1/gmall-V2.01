package com.gmall.manage.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.gmall.manage.mapper.PmsBaseAttrInfoMapper;
import com.gmall.manage.mapper.PmsBaseAttrValueMapper;
import com.gmall.pojo.PmsBaseAttrInfo;
import com.gmall.service.AttrService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
@Service
public class AttrServiceImpl implements AttrService {
    @Autowired
    private PmsBaseAttrInfoMapper pmsBaseAttrInfoAttrMapper;

    @Autowired
    private PmsBaseAttrValueMapper pmsBaseAttrValueMapper;

    @Override
    public List<PmsBaseAttrInfo> attrInfoList(String catalog3Id) {
        PmsBaseAttrInfo pmsBaseAttrInfo = new PmsBaseAttrInfo();
        pmsBaseAttrInfo.setCatalog3Id(catalog3Id);
        List<PmsBaseAttrInfo> pmsBaseAttrInfos = pmsBaseAttrInfoAttrMapper.select(pmsBaseAttrInfo);
        return pmsBaseAttrInfos;
    }
}
