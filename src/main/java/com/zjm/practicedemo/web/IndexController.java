package com.zjm.practicedemo.web;

import com.zjm.practicedemo.modal.vo.ApiResult;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zjm
 */
@Tag(name = "接口", description = "接口")
@RestController
@RequestMapping("/hello")
public class IndexController {

    @Operation(summary = "测试接口")
    @GetMapping("/hello")
    public ApiResult<String> getViewObjectListMapping(){
        //...
        return ApiResult.success("hello world");
    }
}
