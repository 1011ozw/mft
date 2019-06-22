package com.mft.services;

import com.mft.entity.Admin;
import com.mft.mapper.AdminMapper;

public class Login {
    Admin admin;
    AdminMapper adminMapper;

    String getadminID(){
        admin =  adminMapper.getadminID();
        System.out.println(admin.getAdminID());
        return admin.getAdminID();
    }
}
