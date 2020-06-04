package com.cykj.serveruser.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/UserControllet")
public class UserControllet {
    @RequestMapping("/getUserInfo")
    @ResponseBody
    public String getUserInfo(String msg){
        return msg;
    }
}
