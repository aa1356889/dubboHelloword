package com.liqiang.service.impl;

import com.liqiang.entity.ProductEntity;
import com.liqiang.entity.UserEntity;
import com.liqiang.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Override
    public List<ProductEntity> findAll() {

        ProductEntity productEntity=new ProductEntity();
        productEntity.setName("ddd");
        productEntity.setId("ccc");
        return Arrays.asList(new ProductEntity[]{productEntity});
    }
}
