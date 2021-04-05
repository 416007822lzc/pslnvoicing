package com.example.pslnvoicing.pojos;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

@Data
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

	@Basic
	@Column(name = "product_name")
	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	@Id
	@Column(name = "product_id")
	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	@Basic
	@Column(name = "product_num")
	public String getProductNum() {
		return productNum;
	}

	public void setProductNum(String productNum) {
		this.productNum = productNum;
	}

	@Basic
	@Column(name = "product_spec")
	public String getProductSpec() {
		return productSpec;
	}

	public void setProductSpec(String productSpec) {
		this.productSpec = productSpec;
	}

	@Basic
	@Column(name = "product_categories")
	public String getProductCategories() {
		return productCategories;
	}

	public void setProductCategories(String productCategories) {
		this.productCategories = productCategories;
	}

	@Basic
	@Column(name = "product_unit")
	public String getProductUnit() {
		return productUnit;
	}

	public void setProductUnit(String productUnit) {
		this.productUnit = productUnit;
	}

	@Basic
	@Column(name = "product_opening_num")
	public BigDecimal getProductOpeningNum() {
		return productOpeningNum;
	}

	public void setProductOpeningNum(BigDecimal productOpeningNum) {
		this.productOpeningNum = productOpeningNum;
	}

	@Basic
	@Column(name = "product_status")
	public int getProductStatus() {
		return productStatus;
	}

	public void setProductStatus(int productStatus) {
		this.productStatus = productStatus;
	}

	@Basic
	@Column(name = "product_remark")
	public String getProductRemark() {
		return productRemark;
	}

	public void setProductRemark(String productRemark) {
		this.productRemark = productRemark;
	}

	@Basic
	@Column(name = "product_create_time")
	public Timestamp getProductCreateTime() {
		return productCreateTime;
	}

	public void setProductCreateTime(Timestamp productCreateTime) {
		this.productCreateTime = productCreateTime;
	}

	@Basic
	@Column(name = "product_sales_price")
	public BigDecimal getProductSalesPrice() {
		return productSalesPrice;
	}

	public void setProductSalesPrice(BigDecimal productSalesPrice) {
		this.productSalesPrice = productSalesPrice;
	}

	@Basic
	@Column(name = "product_purchase_price")
	public BigDecimal getProductPurchasePrice() {
		return productPurchasePrice;
	}

	public void setProductPurchasePrice(BigDecimal productPurchasePrice) {
		this.productPurchasePrice = productPurchasePrice;
	}

	@Basic
	@Column(name = "product_opening_cost")
	public BigDecimal getProductOpeningCost() {
		return productOpeningCost;
	}

	public void setProductOpeningCost(BigDecimal productOpeningCost) {
		this.productOpeningCost = productOpeningCost;
	}

	@Basic
	@Column(name = "warehouse_id")
	public Integer getWarehouseId() {
		return warehouseId;
	}

	public void setWarehouseId(Integer warehouseId) {
		this.warehouseId = warehouseId;
	}

	@Basic
	@Column(name = "warehouse_id")
	public String getproductDescription() {
		return productDescription;
	}

	public void setproductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		PslvoicingProduct that = (PslvoicingProduct) o;
		return productId == that.productId &&
				productNum == that.productNum &&
				productStatus == that.productStatus &&
				Objects.equals(productName, that.productName) &&
				Objects.equals(productSpec, that.productSpec) &&
				Objects.equals(productCategories, that.productCategories) &&
				Objects.equals(productUnit, that.productUnit) &&
				Objects.equals(productOpeningNum, that.productOpeningNum) &&
				Objects.equals(productRemark, that.productRemark) &&
				Objects.equals(productCreateTime, that.productCreateTime) &&
				Objects.equals(productSalesPrice, that.productSalesPrice) &&
				Objects.equals(productPurchasePrice, that.productPurchasePrice) &&
				Objects.equals(productOpeningCost, that.productOpeningCost) &&
				Objects.equals(productDescription, that.productDescription) &&
				Objects.equals(warehouseId, that.warehouseId);
	}

	@Override
	public int hashCode() {
		return Objects.hash(productName, productId, productNum, productSpec, productCategories, productUnit, productOpeningNum, productStatus, productRemark, productCreateTime, productSalesPrice, productPurchasePrice, productOpeningCost, warehouseId,productDescription);
	}
}
