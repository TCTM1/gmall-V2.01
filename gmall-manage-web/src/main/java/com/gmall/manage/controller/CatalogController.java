package com.gmall.manage.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.gmall.pojo.PmsBaseCatalog1;
import com.gmall.service.CatalogService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@CrossOrigin
public class CatalogController {
    @Reference
    private CatalogService catalogService;

    @RequestMapping("getCatalog1")
    @ResponseBody
    public List<PmsBaseCatalog1> getCatalog1(){
        List<PmsBaseCatalog1> catalog1 = catalogService.getCatalog1();
        return catalog1;
    }
}
