package com.zhzk.myproject.controller;

import com.zhzk.myproject.entity.CpyInv;
import com.zhzk.myproject.mapper.CpyInvMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author
 * @create 2019-07-25-9:37
 */
@RestController
@RequestMapping("cpyInv")
public class CpyInvController {

    @Autowired
    private CpyInvMapper cpyInvMapper;


    @GetMapping("findAll")
    public List findAll(){
        List<CpyInv> cpyInvs = cpyInvMapper.findAll();
        for (CpyInv cpyInv : cpyInvs) {
            //System.out.println(cpyInv);
            if (cpyInv.getCompany()!=null) {
                System.out.println(cpyInv.getCompany().getSuoxie());
            }
        }
        return cpyInvs;

   }
}
