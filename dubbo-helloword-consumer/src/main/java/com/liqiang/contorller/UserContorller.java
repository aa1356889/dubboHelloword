package com.liqiang.contorller;

import com.liqiang.entity.UserEntity;
import com.liqiang.service.UserService;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class UserContorller implements BeanNameAware {
    @Autowired
    UserService userService;

    @RequestMapping(value = "/user", method = RequestMethod.GET,produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public List<UserEntity> findAll() {
        List<UserEntity> userEntities= userService.findAll();
        return userEntities;
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("初始化了");
    }
}
