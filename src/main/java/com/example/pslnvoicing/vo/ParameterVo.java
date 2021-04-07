package com.example.pslnvoicing.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ParameterVo {
    private String startTime;
    private String endTime;
    private String empNameOrStoreNameOrNumber;
    private Integer orderStatus;
    private Integer pageNum;
    private Integer pageSize;

}
