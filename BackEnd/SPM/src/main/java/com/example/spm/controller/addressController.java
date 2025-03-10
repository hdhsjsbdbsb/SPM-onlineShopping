package com.example.spm.controller;

import com.example.spm.pojo.Result;
import com.example.spm.pojo.Address;
import com.example.spm.service.addressService;
import com.example.spm.utils.JwtUtil;
import com.example.spm.utils.ThreadLocalUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/address")
public class addressController {

    @Autowired
    private addressService addressService;

    /*
    * 添加收获地址*/
    @PostMapping("/add")
    public Result addAddress(@RequestBody @Validated Address address) {
        Map<String, Object> map = ThreadLocalUtil.get();
        Integer id = (Integer) map.get("id");
        address.setUserId(id);

        System.out.println(address);

        addressService.addAddress(address);
        return Result.success();
    }

  /*  *//*
    * 获取收货地址*//*
    @GetMapping("/getAddress")
    public Result getAddress() {
        Map<String, Object> map = ThreadLocalUtil.get();
        Integer id = (Integer) map.get("id");
        List<Address> addresses = addressService.findById(id);
        return Result.success(addresses);
    }*/
}
