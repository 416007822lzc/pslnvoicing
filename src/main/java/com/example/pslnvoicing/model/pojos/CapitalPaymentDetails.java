package com.example.pslnvoicing.model.pojos;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "capital_payment_details", schema = "pslnvoicing", catalog = "")
public class CapitalPaymentDetails {
	private Integer paymentId;

	@Basic
	@Column(name = "payment_id")
	public Integer getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(Integer paymentId) {
		this.paymentId = paymentId;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		CapitalPaymentDetails that = (CapitalPaymentDetails) o;
		return Objects.equals(paymentId, that.paymentId);
	}

	@Override
	public int hashCode() {
		return Objects.hash(paymentId);
	}
}
