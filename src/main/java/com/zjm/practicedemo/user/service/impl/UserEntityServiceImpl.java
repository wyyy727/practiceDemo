package com.zjm.practicedemo.user.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zjm.practicedemo.user.dao.UserMapper;
import com.zjm.practicedemo.user.modal.UserEntity;
import com.zjm.practicedemo.user.service.UserEntityService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author zjm
 * @description  用户service实体类
 */
@Service("userEntityService")
public class UserEntityServiceImpl extends ServiceImpl<UserMapper,UserEntity> implements UserEntityService{

    @Resource
    private UserMapper userMapper;

    /**
     * 获取全部用户
     * @return list
     */
    @Override
    public List<UserEntity> getAllUsers(){
        return userMapper.selectList(null);
    }

}
