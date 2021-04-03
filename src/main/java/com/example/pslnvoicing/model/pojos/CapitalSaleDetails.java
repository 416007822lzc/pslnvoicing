package com.example.pslnvoicing.model.pojos;

import javax.persistence.*;
import java.util.Objects;


public class CapitalSaleDetails {
	private int saleDetailsId;
	private Integer saleDetailsState;
	private CapitalSale capitalSaleBySaleId;

	@Id
	@Column(name = "sale_details_id")
	public int getSaleDetailsId() {
		return saleDetailsId;
	}

	public void setSaleDetailsId(int saleDetailsId) {
		this.saleDetailsId = saleDetailsId;
	}

	@Basic
	@Column(name = "sale_details_state")
	public Integer getSaleDetailsState() {
		return saleDetailsState;
	}

	public void setSaleDetailsState(Integer saleDetailsState) {
		this.saleDetailsState = saleDetailsState;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		CapitalSaleDetails that = (CapitalSaleDetails) o;
		return saleDetailsId == that.saleDetailsId &&
				Objects.equals(saleDetailsState, that.saleDetailsState);
	}

	@Override
	public int hashCode() {
		return Objects.hash(saleDetailsId, saleDetailsState);
	}

	@ManyToOne
	@JoinColumn(name = "sale_id", referencedColumnName = "sale_id")
	public CapitalSale getCapitalSaleBySaleId() {
		return capitalSaleBySaleId;
	}

	public void setCapitalSaleBySaleId(CapitalSale capitalSaleBySaleId) {
		this.capitalSaleBySaleId = capitalSaleBySaleId;
	}
}
