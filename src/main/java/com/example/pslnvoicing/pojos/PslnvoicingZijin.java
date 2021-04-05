package com.example.pslnvoicing.pojos;

import javax.persistence.*;
import java.util.Objects;

public class PslnvoicingZijin {
	private int zjId;
	private String zjName;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "zj_id")
	public int getZjId() {
		return zjId;
	}

	public void setZjId(int zjId) {
		this.zjId = zjId;
	}

	@Basic
	@Column(name = "zj_name")
	public String getZjName() {
		return zjName;
	}

	public void setZjName(String zjName) {
		this.zjName = zjName;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		PslnvoicingZijin that = (PslnvoicingZijin) o;
		return zjId == that.zjId &&
				Objects.equals(zjName, that.zjName);
	}

	@Override
	public int hashCode() {
		return Objects.hash(zjId, zjName);
	}
}
