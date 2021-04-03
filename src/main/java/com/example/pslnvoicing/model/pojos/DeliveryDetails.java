package com.example.pslnvoicing.model.pojos;

import javax.persistence.*;
import java.util.Objects;


public class DeliveryDetails {
	private int deliveryDetailsId;
	private String productName;
	private String productNumber;
	private Integer number;
	private Double salesUnitPrice;
	private Double salesAmount;
	private String orderDetailsRemarks;

	@Id
	@Column(name = "delivery_details_id")
	public int getDeliveryDetailsId() {
		return deliveryDetailsId;
	}

	public void setDeliveryDetailsId(int deliveryDetailsId) {
		this.deliveryDetailsId = deliveryDetailsId;
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
	@Column(name = "order_details_remarks")
	public String getOrderDetailsRemarks() {
		return orderDetailsRemarks;
	}

	public void setOrderDetailsRemarks(String orderDetailsRemarks) {
		this.orderDetailsRemarks = orderDetailsRemarks;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		DeliveryDetails that = (DeliveryDetails) o;
		return deliveryDetailsId == that.deliveryDetailsId &&
				Objects.equals(productName, that.productName) &&
				Objects.equals(productNumber, that.productNumber) &&
				Objects.equals(number, that.number) &&
				Objects.equals(salesUnitPrice, that.salesUnitPrice) &&
				Objects.equals(salesAmount, that.salesAmount) &&
				Objects.equals(orderDetailsRemarks, that.orderDetailsRemarks);
	}

	@Override
	public int hashCode() {
		return Objects.hash(deliveryDetailsId, productName, productNumber, number, salesUnitPrice, salesAmount, orderDetailsRemarks);
	}
}
