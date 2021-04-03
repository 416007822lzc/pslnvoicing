package com.example.pslnvoicing.model.pojos;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "kucun_outbound_detail", schema = "pslnvoicing", catalog = "")
public class KucunOutboundDetail {
	private int outboundDetailId;
	private Integer outboundId;

	@Id
	@Column(name = "outbound_detail_id")
	public int getOutboundDetailId() {
		return outboundDetailId;
	}

	public void setOutboundDetailId(int outboundDetailId) {
		this.outboundDetailId = outboundDetailId;
	}

	@Basic
	@Column(name = "outbound_id")
	public Integer getOutboundId() {
		return outboundId;
	}

	public void setOutboundId(Integer outboundId) {
		this.outboundId = outboundId;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		KucunOutboundDetail that = (KucunOutboundDetail) o;
		return outboundDetailId == that.outboundDetailId &&
				Objects.equals(outboundId, that.outboundId);
	}

	@Override
	public int hashCode() {
		return Objects.hash(outboundDetailId, outboundId);
	}
}
