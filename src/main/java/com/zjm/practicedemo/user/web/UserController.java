package com.zjm.practicedemo.user.web;

import com.zjm.practicedemo.modal.vo.ApiResult;
import com.zjm.practicedemo.user.modal.UserEntity;
import com.zjm.practicedemo.user.service.UserEntityService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * userController
 * @author zjm
 */
@Tag(name = "用户接口", description = "用户相关CRUD接口")
@RestController
@RequestMapping("/user")
public class UserController{

    @Resource
    private UserEntityService userEntityService;

    @Operation(summary = "获取用户列表数据")
    @GetMapping("/list")
    public ApiResult<List<UserEntity>> getViewObjectListMapping(){
        //...
        return ApiResult.success("ok", userEntityService.getAllUsers());
    }

    @Operation(summary = "通过id获取用户数据")
    @PostMapping("/getById")
    public ApiResult<UserEntity> getViewObjectMappingById(Integer id){
        //...
        return ApiResult.success("ok", userEntityService.getById(id));
    }
}
