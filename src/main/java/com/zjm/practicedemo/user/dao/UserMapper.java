package com.zjm.practicedemo.user.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zjm.practicedemo.user.modal.UserEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author zjm
 * @description user mapper接口
 */
@Repository
@Mapper
public interface UserMapper extends BaseMapper<UserEntity> {

}
