package com.example.pslnvoicing.model.pojos;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "kucun_check_detail", schema = "pslnvoicing", catalog = "")
public class KucunCheckDetail {
	private int checkDetailId;
	private KucunCheck kucunCheckByCheckId;

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

	@ManyToOne
	@JoinColumn(name = "check_id", referencedColumnName = "check_id")
	public KucunCheck getKucunCheckByCheckId() {
		return kucunCheckByCheckId;
	}

	public void setKucunCheckByCheckId(KucunCheck kucunCheckByCheckId) {
		this.kucunCheckByCheckId = kucunCheckByCheckId;
	}
}
