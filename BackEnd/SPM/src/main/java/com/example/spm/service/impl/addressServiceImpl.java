package com.example.spm.service.impl;

import com.example.spm.mapper.addressMapper;
import com.example.spm.pojo.Address;
import com.example.spm.pojo.addressRequest;
import com.example.spm.service.addressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class addressServiceImpl implements addressService {

    @Autowired
    private addressMapper addressMapper;

    @Override
    public void addAddress(Address address) {
        addressMapper.add(address.getUserId(), address.getRecipient(), address.getPhone(), address.getProvince(),
                address.getCity(), address.getDistrict(), address.getStreet(), 0);
    }

    @Override
    public List<Address> findByUserId(Integer id) {
        return addressMapper.findByUserId(id);
    }

    @Override
    public Address updateById(Integer id) {
        addressMapper.updateDefaultById(id);
        return addressMapper.findById(id);
    }

    @Override
    public Address findById(Integer id) {
        return addressMapper.findById(id);
    }

    @Override
    public void updateById(addressRequest address) {
        addressMapper.updateById(address.getId(), address.getRecipient(),address.getPhone(),address.getProvince(),address.getCity(),
                address.getDistrict(), address.getStreet());
    }

    @Override
    public Integer findDefault(Integer userId) {
        Integer id = addressMapper.findDefault(userId).getId();
        return id;
    }
}
