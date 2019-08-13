package com.zhzk.myproject.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
 * @author
 * @create 2019-07-17-9:16
 */
@Setter
@Getter
@ToString
public class CpyInv implements Serializable {
    //表id
    private Integer id;
    //公司id
    private Integer cpyid;
    //企业名称
    private String name;
    //纳税人识别号
    private String taxno;
    //地址电话
    private String addressandtel;
    //银行和银行卡号
    private String bankandbankno;

    private String creator;
    private Date createtime;
    private String changeuser;
    private Date changertime;
    private Company company;
}
