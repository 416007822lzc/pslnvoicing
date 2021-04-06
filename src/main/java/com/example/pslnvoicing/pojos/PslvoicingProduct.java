package com.example.pslnvoicing.pojos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class PslvoicingProduct {
	private String productName;
	private int productId;
	private String productNum;
	private String productSpec;
	private String productCategories;
	private String productUnit;
	private BigDecimal productOpeningNum;
	private int productStatus;
	private String productRemark;
	private Timestamp productCreateTime;
	private BigDecimal productSalesPrice;
	private BigDecimal productPurchasePrice;
	private BigDecimal productOpeningCost;
	private Integer warehouseId;
	private String productDescription;


}
