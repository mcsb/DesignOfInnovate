package com.marcello.controller;

import com.marcello.entity.Std;
import com.marcello.service.StdService;
import com.marcello.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description
 * @Author mcsb
 * CreateDate 2018/3/29$ 19:41$
 **/
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/getUserList")
    public @ResponseBody Std getUserList(String stdNum,String stdSex,String stdAge,String stdTel){
        Map<String,Object> map=new HashMap<String, Object>();
        map.put("stdNum",stdNum);
        map.put("stdSex",stdSex);
        map.put("stdAge",stdAge);
        map.put("stdTel",stdTel);
        Std std= UserService.getUserList(map);
        return std;
    }
}
