package com.example.spm.pojo;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class RegisterDTO {
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
}
