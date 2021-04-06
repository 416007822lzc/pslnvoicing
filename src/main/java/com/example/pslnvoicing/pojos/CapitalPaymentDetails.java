package com.example.pslnvoicing.pojos;

import javax.persistence.*;
import java.util.Objects;

public class CapitalPaymentDetails {
	private Integer paymentDetailsId;
	private Integer paymentId;
	private Integer paymentState;


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "payment_details_id")
	public Integer getPaymentDetailsId() {
		return paymentDetailsId;
	}

	public void setPaymentDetailsId(Integer paymentDetailsId) {
		this.paymentDetailsId = paymentDetailsId;
	}

	@Basic
	@Column(name = "payment_id")
	public Integer getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(Integer paymentId) {
		this.paymentId = paymentId;
	}

	@Basic
	@Column(name = "payment_state")
	public Integer getPaymentState() {
		return paymentState;
	}

	public void setPaymentState(Integer paymentState) {
		this.paymentState = paymentState;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		CapitalPaymentDetails that = (CapitalPaymentDetails) o;
		return Objects.equals(paymentDetailsId, that.paymentDetailsId) &&
				Objects.equals(paymentId, that.paymentId) &&
				Objects.equals(paymentState, that.paymentState);
	}

	@Override
	public int hashCode() {
		return Objects.hash(paymentDetailsId, paymentId, paymentState);
	}
}
