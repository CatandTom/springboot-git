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
        return "aa";
    }
}
