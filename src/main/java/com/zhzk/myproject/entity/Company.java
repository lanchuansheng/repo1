package com.zhzk.myproject.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author
 * @create 2019-07-08-9:04
 */
@Setter
@Getter
@ToString
public class Company implements Serializable {
    private Integer id;

    @NotBlank
    @Size(max=50,min=0,message = "长度不能大于50")
    private String name;

    @NotBlank
    @Size(max=6,min=0,message = "长度不能大于6")
    private String suoxie;

    private Integer provinceid;

    private Integer cityid;

    private Integer areaid;

    private Integer scale;

    @NotBlank
    @Size(max=50,min=0,message = "长度不能大于50")
    private String pickupman;

    @NotBlank
    @Size(max=50,min=0,message = "长度不能大于50")
    private String tel;

    private String smsphone;

    private Long saleman;

    private Integer ckstate;

    private Integer state;

    private Long accountid;

    private Long operator;

    private String creator;

    private Date createtime;

    private String changeUser;

    private Date changeTime;

    private BigDecimal balance;

    private String cityname;

    private CpyInv cpyInv;




}
