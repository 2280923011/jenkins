package com.aaa.tree.controller;

import com.aaa.tree.service.PowerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * className:PowerController
 * discription:
 * author:陈同学
 * createTime:2018-12-11 10:24
 */
@Controller
@RequestMapping("/power")
public class PowerController {

    @Autowired
    private PowerService powerService;

    /**
     * 跳转权限树页面
     * @return
     */
    @RequestMapping("/toTree")
    public String toTree(){
        return "/power/tree";
    }
    @ResponseBody
    @RequestMapping("/tree")
    public Object tree(){
        return powerService.getList();
    }
}
