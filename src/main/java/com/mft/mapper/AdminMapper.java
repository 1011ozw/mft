package com.mft.mapper;

import com.mft.entity.Admin;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface AdminMapper {
    @Select("select * from admin where adminPW = 123456")
    Admin getadminID();
}
