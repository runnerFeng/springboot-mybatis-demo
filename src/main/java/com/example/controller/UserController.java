package com.example.controller;

import com.example.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author jinx
 * @date 2018/2/22 17:07
 * Desc:
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

//    @ResponseBody
//    @PostMapping(value = "/add", produces = {"application/json;charset=UTF-8"})
//    public int addUser(User user){
//        return userService.addUser(user);
//    }

    @RequestMapping("index")
    public String index(){
        return "Hello Spring Boot";
    }

//    @ResponseBody
//    @PostMapping(value = "/all/{pageNum}/{pageSize}", produces = {"application/json;charset=UTF-8"})
//    public Object findAllUser(@PathVariable("pageNum") int pageNum, @PathVariable("pageSize") int pageSize){
//        return userService.findAllUser(pageNum,pageSize);
//    }
}
