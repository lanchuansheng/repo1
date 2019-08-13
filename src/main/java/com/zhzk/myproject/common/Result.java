package com.zhzk.myproject.common;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author
 * @create 2019-07-30-10:15
 */
@Setter
@Getter
@ToString
public class Result {
    private Boolean success;
    private Integer errCode;
    private String errMsg;
    private Object Data;
}




