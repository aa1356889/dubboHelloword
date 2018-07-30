package com.liqiang.service.impl;

import com.liqiang.entity.UserEntity;
import com.liqiang.service.UserService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public List<UserEntity> findAll() {
        List<UserEntity> userEntitys=new ArrayList<UserEntity>();
        UserEntity userEntity=null;
        //模拟db查询数据
        for(int i=0;i<=10;i++){
            userEntity=new UserEntity();
            userEntity.setName("小明"+i);
            userEntity.setAge(i+1);
            userEntitys.add(userEntity);
        }
        return userEntitys;
    }
}
