package com.zhzk.myproject.mapper;


import com.zhzk.myproject.entity.YzbBank;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface YzbBankMapper {
    int insert(YzbBank record);

}