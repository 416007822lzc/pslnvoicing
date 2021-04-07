package com.example.pslnvoicing.pojos;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;


public class PslvoicingProduct {
	private String productName;
	private int productId;
	private int productNum;
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

	public PslvoicingProduct() {
	}

	public PslvoicingProduct(String productName, int productId, int productNum, String productSpec, String productCategories, String productUnit, BigDecimal productOpeningNum, int productStatus, String productRemark, Timestamp productCreateTime, BigDecimal productSalesPrice, BigDecimal productPurchasePrice, BigDecimal productOpeningCost, Integer warehouseId, String productDescription) {
		this.productName = productName;
		this.productId = productId;
		this.productNum = productNum;
		this.productSpec = productSpec;
		this.productCategories = productCategories;
		this.productUnit = productUnit;
		this.productOpeningNum = productOpeningNum;
		this.productStatus = productStatus;
		this.productRemark = productRemark;
		this.productCreateTime = productCreateTime;
		this.productSalesPrice = productSalesPrice;
		this.productPurchasePrice = productPurchasePrice;
		this.productOpeningCost = productOpeningCost;
		this.warehouseId = warehouseId;
		this.productDescription = productDescription;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public int getProductNum() {
		return productNum;
	}

	public void setProductNum(int productNum) {
		this.productNum = productNum;
	}

	public String getProductSpec() {
		return productSpec;
	}

	public void setProductSpec(String productSpec) {
		this.productSpec = productSpec;
	}

	public String getProductCategories() {
		return productCategories;
	}

	public void setProductCategories(String productCategories) {
		this.productCategories = productCategories;
	}

	public String getProductUnit() {
		return productUnit;
	}

	public void setProductUnit(String productUnit) {
		this.productUnit = productUnit;
	}

	public BigDecimal getProductOpeningNum() {
		return productOpeningNum;
	}

	public void setProductOpeningNum(BigDecimal productOpeningNum) {
		this.productOpeningNum = productOpeningNum;
	}

	public int getProductStatus() {
		return productStatus;
	}

	public void setProductStatus(int productStatus) {
		this.productStatus = productStatus;
	}

	public String getProductRemark() {
		return productRemark;
	}

	public void setProductRemark(String productRemark) {
		this.productRemark = productRemark;
	}

	public Timestamp getProductCreateTime() {
		return productCreateTime;
	}

	public void setProductCreateTime(Timestamp productCreateTime) {
		this.productCreateTime = productCreateTime;
	}

	public BigDecimal getProductSalesPrice() {
		return productSalesPrice;
	}

	public void setProductSalesPrice(BigDecimal productSalesPrice) {
		this.productSalesPrice = productSalesPrice;
	}

	public BigDecimal getProductPurchasePrice() {
		return productPurchasePrice;
	}

	public void setProductPurchasePrice(BigDecimal productPurchasePrice) {
		this.productPurchasePrice = productPurchasePrice;
	}

	public BigDecimal getProductOpeningCost() {
		return productOpeningCost;
	}

	public void setProductOpeningCost(BigDecimal productOpeningCost) {
		this.productOpeningCost = productOpeningCost;
	}

	public Integer getWarehouseId() {
		return warehouseId;
	}

	public void setWarehouseId(Integer warehouseId) {
		this.warehouseId = warehouseId;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
}
