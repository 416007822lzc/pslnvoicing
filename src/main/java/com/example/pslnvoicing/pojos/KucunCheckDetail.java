package com.example.pslnvoicing.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "kucun_check_detail", schema = "pslnvoicing", catalog = "")
public class KucunCheckDetail {
	private int checkDetailId;

	@Id
	@Column(name = "check_detail_id")
	public int getCheckDetailId() {
		return checkDetailId;
	}

	public void setCheckDetailId(int checkDetailId) {
		this.checkDetailId = checkDetailId;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		KucunCheckDetail that = (KucunCheckDetail) o;
		return checkDetailId == that.checkDetailId;
	}

	@Override
	public int hashCode() {
		return Objects.hash(checkDetailId);
	}
}
