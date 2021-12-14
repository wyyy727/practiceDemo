package com.zjm.practicedemo.user.modal;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author zjm
 */
@Schema(name = "用户", description = "用户实体定义")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("user")
public class UserEntity implements Serializable {
    private static final long serialVersionUID = 111222L;

    @Schema(description = "主键id", required = true, example = "1")
    private Long id;
    /**
     * 名称
     */
    @Schema(description = "名称", required = true, example = "张三")
    private String name;

    @Schema(description = "年龄", required = true, example = "22")
    private Integer age;

    @Schema(description = "邮箱", required = true, example = "13@qq.com")
    private String email;

    public UserEntity(String name) {
        this.name = name;
    }
}
