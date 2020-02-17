package com.gmall.manage.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.gmall.manage.mapper.PmsBaseAttrInfoMapper;
import com.gmall.manage.mapper.PmsBaseAttrValueMapper;
import com.gmall.pojo.PmsBaseAttrInfo;
import com.gmall.pojo.PmsBaseAttrValue;
import com.gmall.service.AttrService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
@Service
public class AttrServiceImpl implements AttrService {
    @Autowired
    private PmsBaseAttrInfoMapper pmsBaseAttrInfoMapper;

    @Autowired
    private PmsBaseAttrValueMapper pmsBaseAttrValueMapper;

    @Override
    public List<PmsBaseAttrInfo> attrInfoList(String catalog3Id) {
        PmsBaseAttrInfo pmsBaseAttrInfo = new PmsBaseAttrInfo();
        pmsBaseAttrInfo.setCatalog3Id(catalog3Id);
        List<PmsBaseAttrInfo> pmsBaseAttrInfos = pmsBaseAttrInfoMapper.select(pmsBaseAttrInfo);
        return pmsBaseAttrInfos;
    }

    @Override
    public String saveAttrInfo(PmsBaseAttrInfo pmsBaseAttrInfo) {
        int rows = pmsBaseAttrInfoMapper.insertSelective(pmsBaseAttrInfo);   //将空值插入数据库
        List<PmsBaseAttrValue> attrValueList = pmsBaseAttrInfo.getAttrValueList();
        for (PmsBaseAttrValue pmsBaseAttrValue:attrValueList){
            pmsBaseAttrValue.setId(pmsBaseAttrInfo.getId());
            pmsBaseAttrValueMapper.insertSelective(pmsBaseAttrValue);
        }
        return "保存成功！";
    }
}
