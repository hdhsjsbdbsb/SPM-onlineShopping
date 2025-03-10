package com.example.spm.service;

import com.example.spm.pojo.Address;

import java.util.List;

public interface addressService {
    void addAddress(Address address);

    List<Address> findById(Integer id);
}
