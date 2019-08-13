package com.zhzk.myproject.mapper;

import com.zhzk.myproject.entity.CpyInv;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author
 * @create 2019-07-17-9:45
 */
@Mapper
@Component
public interface CpyInvMapper {
        int insert(CpyInv cpyInv);
        List<CpyInv> findAll();
}

