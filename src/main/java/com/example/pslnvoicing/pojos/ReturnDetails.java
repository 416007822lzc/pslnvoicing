package com.example.pslnvoicing.pojos;

import javax.persistence.*;
import java.util.Objects;


public class ReturnDetails {
	private int returnDetailsId;
	private Integer salesReturnsId;
	private String productName;
	private String productNumber;
	private Integer number;
	private Double salesUnitPrice;
	private Double salesAmount;
	private String returnDetailsRemarks;

	@Id
	@Column(name = "return_details_id")
	public int getReturnDetailsId() {
		return returnDetailsId;
	}

	public void setReturnDetailsId(int returnDetailsId) {
		this.returnDetailsId = returnDetailsId;
	}

	@Basic
	@Column(name = "sales_returns_id")
	public Integer getSalesReturnsId() {
		return salesReturnsId;
	}

	public void setSalesReturnsId(Integer salesReturnsId) {
		this.salesReturnsId = salesReturnsId;
	}

	@Basic
	@Column(name = "product_name")
	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	@Basic
	@Column(name = "product_number")
	public String getProductNumber() {
		return productNumber;
	}

	public void setProductNumber(String productNumber) {
		this.productNumber = productNumber;
	}

	@Basic
	@Column(name = "number")
	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	@Basic
	@Column(name = "sales_unit_price")
	public Double getSalesUnitPrice() {
		return salesUnitPrice;
	}

	public void setSalesUnitPrice(Double salesUnitPrice) {
		this.salesUnitPrice = salesUnitPrice;
	}

	@Basic
	@Column(name = "sales_amount")
	public Double getSalesAmount() {
		return salesAmount;
	}

	public void setSalesAmount(Double salesAmount) {
		this.salesAmount = salesAmount;
	}

	@Basic
	@Column(name = "return_details_remarks")
	public String getReturnDetailsRemarks() {
		return returnDetailsRemarks;
	}

	public void setReturnDetailsRemarks(String returnDetailsRemarks) {
		this.returnDetailsRemarks = returnDetailsRemarks;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		ReturnDetails that = (ReturnDetails) o;
		return returnDetailsId == that.returnDetailsId &&
				Objects.equals(salesReturnsId, that.salesReturnsId) &&
				Objects.equals(productName, that.productName) &&
				Objects.equals(productNumber, that.productNumber) &&
				Objects.equals(number, that.number) &&
				Objects.equals(salesUnitPrice, that.salesUnitPrice) &&
				Objects.equals(salesAmount, that.salesAmount) &&
				Objects.equals(returnDetailsRemarks, that.returnDetailsRemarks);
	}

	@Override
	public int hashCode() {
		return Objects.hash(returnDetailsId, salesReturnsId, productName, productNumber, number, salesUnitPrice, salesAmount, returnDetailsRemarks);
	}
}
