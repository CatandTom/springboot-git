package com.qf.springbootgit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Gbg
 * @Date 2019/6/5
 */
@Controller
@RequestMapping("my")
public class Mycontroller {

    @RequestMapping("aa")
    @ResponseBody
    public  String aa(){
        System.out.println("你好；我来啦！等我~~~哈哈哈");
        System.out.println("翠花儿宝贝！！！嘻嘻嘻····");
        System.out.println("我是dev....");
        return "aa";
    }
}
