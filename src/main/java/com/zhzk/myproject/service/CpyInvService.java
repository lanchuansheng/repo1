package com.zhzk.myproject.service;


import com.zhzk.myproject.entity.CpyInv;

import java.util.List;

/**
 * @author
 * @create 2019-07-17-10:48
 */
public interface CpyInvService {

    int insert(CpyInv cpyInv);
    List<CpyInv> findAll();
}
