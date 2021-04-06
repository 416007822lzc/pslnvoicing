package com.example.pslnvoicing.vo.workbench;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RatifyVo {
    private Integer id;
    private String number; //单据编号
    private String numberType;//单据类型
    private String supplier;//客户/供应商
    private Double price; //金额
    private String submitter;//提交人
    private Date submitterTime;//提交时间
}
