package com.example.pslnvoicing.model.pojos;

import javax.persistence.*;
import java.util.Objects;


public class CapitalPurchaseDetails {
	private int purchaseDetailsId;
	private Integer purchaseDetailsState;
	private CapitalPurchase capitalPurchaseByPurchaseId;

	@Id
	@Column(name = "purchase_details_id")
	public int getPurchaseDetailsId() {
		return purchaseDetailsId;
	}

	public void setPurchaseDetailsId(int purchaseDetailsId) {
		this.purchaseDetailsId = purchaseDetailsId;
	}

	@Basic
	@Column(name = "purchase_details_state")
	public Integer getPurchaseDetailsState() {
		return purchaseDetailsState;
	}

	public void setPurchaseDetailsState(Integer purchaseDetailsState) {
		this.purchaseDetailsState = purchaseDetailsState;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		CapitalPurchaseDetails that = (CapitalPurchaseDetails) o;
		return purchaseDetailsId == that.purchaseDetailsId &&
				Objects.equals(purchaseDetailsState, that.purchaseDetailsState);
	}

	@Override
	public int hashCode() {
		return Objects.hash(purchaseDetailsId, purchaseDetailsState);
	}

	@ManyToOne
	@JoinColumn(name = "purchase_id", referencedColumnName = "purchase_id")
	public CapitalPurchase getCapitalPurchaseByPurchaseId() {
		return capitalPurchaseByPurchaseId;
	}

	public void setCapitalPurchaseByPurchaseId(CapitalPurchase capitalPurchaseByPurchaseId) {
		this.capitalPurchaseByPurchaseId = capitalPurchaseByPurchaseId;
	}
}
