package com.example.spm.pojo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.validation.constraints.*;
import lombok.Data;


import java.time.LocalDate;
import java.time.LocalTime;

@Data
public class User {
    private int id;
    @NotBlank(message = "用户名不能为空")
    @Pattern(regexp = "^\\S{1,10}$", message = "用户名格式错误")
    private String username;

    @NotBlank(message = "密码不能为空")
    @Pattern(regexp = "^\\S{6,16}$", message = "密码格式错误")
    private String password;

    @Pattern(regexp = "^(?:\\+?86)?1[3-9]\\d{9}$", message = "手机号格式错误")
    private String phone;
    @Email
    @NotEmpty
    private String email;
    private String nickname; //签名
    private String userPic;//用户头像地址;
    private LocalTime createTime;//创建时间
    private LocalTime updateTime;//更新时间

}
