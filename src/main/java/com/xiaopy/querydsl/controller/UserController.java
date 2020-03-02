package com.xiaopy.querydsl.controller;

import com.xiaopy.querydsl.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xiaopeiyu
 * @since 2020/3/2
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/getuser")
    public Object getUser(){
        return  userService.findByDepartmentIdDTO(1);
    }
}
