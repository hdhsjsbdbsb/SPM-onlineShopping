package com.example.spm.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class Result {
    private Integer code; // 业务状态码 0-成功 1-失败
    private String message; // 提示信息
    private Object data; // 响应数据

    // 全参构造函数
    public Result(Integer code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    // 快速返回操作成功响应结果（带响应数据）
    public static Result success(Object data) {
        return new Result(0, "操作成功", data);
    }

    // 快速返回操作成功响应结果
    public static Result success() {
        return new Result(0, "操作成功", null);
    }

    // 快速返回错误响应结果
    public static Result error(String message) {
        return new Result(1, message, null);
    }
}