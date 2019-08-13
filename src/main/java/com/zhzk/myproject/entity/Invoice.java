package com.zhzk.myproject.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

/**
 * @author
 * @create 2019-07-17-8:55
 */
@Getter
@Setter
@ToString
public class Invoice {

    //发票id
    private BigInteger id;
    //发票单号
    private String invno;
    //发票抬头
    private String title;
    //发票类型，1普通，2专用
    private Integer type;
    //状态状态 1待开票 2已撤回 3已驳回 4 已确认 5已开票 6已邮寄
    private Integer state;
    //开票金额
    private BigDecimal amount;
    //企业申请类型1企业申请 2运营申请
    private Integer source;
    //公司id
    private Integer companyid;
    //备注
    private String remark;
    //快递公司1顺丰2圆通3申通4韵达5中通6EMS7邮政8其他
    private String sd;
    //快递单号
    private String sdno;
    //邮寄日期
    private Date sddate;
    //收件人
    private String attn;
    //邮寄地址
    private String address;
    //收件人电话
    private String tel;
    //发票代码
    private String invcode;
    //发票号
    private String invnum;
    //开票日期
    private Date invdate;
    //驳回原因
    private String reason;
    //...
    private BigInteger creator;
    //申请时间
    private Date createtime;
}
