package com.cz.cloud.mapper;


import com.cz.cloud.entity.Admin;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface PaymentMapper {
    @Select("select * from admins where id = #{id}")
    Admin getSomething(@Param("id")String id);
}
