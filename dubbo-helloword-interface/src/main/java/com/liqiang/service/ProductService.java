package com.liqiang.service;

import com.liqiang.entity.ProductEntity;
import com.liqiang.entity.UserEntity;

import java.util.List;

public interface ProductService  {
    public List<ProductEntity> findAll();
}
