package com.zhzk.myproject.service.impl;


import com.zhzk.myproject.entity.CpyInv;
import com.zhzk.myproject.mapper.CpyInvMapper;
import com.zhzk.myproject.service.CpyInvService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author
 * @create 2019-07-17-11:12
 */
@Service
public class CpyInvServiceimpl implements CpyInvService {
    @Autowired
    private CpyInvMapper cpyInvMapper;

    @Override
    public int insert(CpyInv cpyInv) {
        return cpyInvMapper.insert(cpyInv);

    }

    @Override
    public List<CpyInv> findAll() {
        return null;
    }


}
