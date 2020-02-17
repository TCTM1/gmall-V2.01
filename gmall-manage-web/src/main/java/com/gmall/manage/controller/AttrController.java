package com.gmall.manage.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.gmall.pojo.PmsBaseAttrInfo;
import com.gmall.service.AttrService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AttrController {
    @Reference
    private AttrService attrService;

    @RequestMapping("attrInfoList")
    public List<PmsBaseAttrInfo> attrInfoList(String catalog3Id){
        List<PmsBaseAttrInfo> pmsBaseAttrInfos = attrService.attrInfoList(catalog3Id);
        return pmsBaseAttrInfos;
    }
}
