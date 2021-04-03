package com.example.pslnvoicing.model.pojos;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "capital_receipt_details", schema = "pslnvoicing", catalog = "")
public class CapitalReceiptDetails {
	private int capitalDetailsId;
	private CapitalReceipt capitalReceiptByReceiptId;

	@Id
	@Column(name = "capital_details_id")
	public int getCapitalDetailsId() {
		return capitalDetailsId;
	}

	public void setCapitalDetailsId(int capitalDetailsId) {
		this.capitalDetailsId = capitalDetailsId;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		CapitalReceiptDetails that = (CapitalReceiptDetails) o;
		return capitalDetailsId == that.capitalDetailsId;
	}

	@Override
	public int hashCode() {
		return Objects.hash(capitalDetailsId);
	}

	@ManyToOne
	@JoinColumn(name = "receipt_id", referencedColumnName = "receipt_id")
	public CapitalReceipt getCapitalReceiptByReceiptId() {
		return capitalReceiptByReceiptId;
	}

	public void setCapitalReceiptByReceiptId(CapitalReceipt capitalReceiptByReceiptId) {
		this.capitalReceiptByReceiptId = capitalReceiptByReceiptId;
	}
}
