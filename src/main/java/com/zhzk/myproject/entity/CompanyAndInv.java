package com.zhzk.myproject.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author
 * @create 2019-07-17-10:44
 */
@Setter
@Getter
@ToString
public class CompanyAndInv {
    private Company company;
    private CpyInv cpyInv;

}
