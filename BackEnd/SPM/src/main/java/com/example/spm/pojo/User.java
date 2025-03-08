package com.example.spm.pojo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
public class User {
    @NotNull
    private int id;
    private String name;
    @JsonIgnore
    private String password;
    @Email
    @NotEmpty
    private String email;
    @NotEmpty
    private String phone;
    private String nickname; //签名
    private String userPic;//用户头像地址;
    private LocalTime createTime;//创建时间
    private LocalTime updateTime;//更新时间

    public int getId() {
        return id;
    }
    public String getName(){
        return name;
    }
    public String getPassword(){
        return password;
    }
    public String getEmail(){
        return email;
    }
    public String getPhone(){
        return phone;
    }
    public String getNickname(){
        return nickname;
    }
    public String getUserPic(){
        return userPic;
    }
    public LocalTime getCreateTime(){
        return createTime;
    }
    public LocalTime getUpdateTime(){
        return updateTime;
    }


}
