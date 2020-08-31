package com.example.demo.controller;

import com.example.demo.common.ResponseVO;
import com.example.demo.entity.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Value("${yu.zhi.wei}")
    String value;

    @RequestMapping("/userInfo")
    public ResponseVO getInfo(){
        User user = new User();
        user.setName(value);
        user.setAge(25);
        user.setGender("男");
        return ResponseVO.success().setDatas(user);
    }

}
