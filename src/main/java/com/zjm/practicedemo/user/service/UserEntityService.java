package com.zjm.practicedemo.user.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zjm.practicedemo.user.modal.UserEntity;

import java.util.List;

/**
 * @author zjm
 * @description 用户service接口
 */
public interface UserEntityService extends IService<UserEntity>{

    /**
     * 获取全部用户
     * @return list
     */
    List<UserEntity> getAllUsers();
}
