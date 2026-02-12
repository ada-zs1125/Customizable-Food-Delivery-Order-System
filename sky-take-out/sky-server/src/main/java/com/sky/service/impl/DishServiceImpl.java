package com.sky.service.impl;

import com.sky.dto.DishDTO;
import com.sky.service.DishService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.beans.Transient;


@Service
@Slf4j
public class DishServiceImpl implements DishService {
    /**
     * 新增菜品
     * @param dishDTO
     */
    @Override
    @Transactional //保证方法要么成功要么失败
    public void saveWithFlavor(DishDTO dishDTO) {

    }
}
