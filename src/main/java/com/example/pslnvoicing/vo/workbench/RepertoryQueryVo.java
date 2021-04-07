package com.example.pslnvoicing.vo.workbench;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RepertoryQueryVo {
    private String productNum;
    private String productName;
    private String productSpace;
    private String productCategories;
    private String warehouseName;
    private String productOpeningNum;

}
