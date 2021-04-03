package com.example.pslnvoicing.pojos;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;


public class KucunAllot {
	private int allotId;
	private String allotOdd;
	private Timestamp allotDate;
	private Integer allotCallout;
	private Integer allotFold;
	private String allotName;
	private Integer allotTotal;
	private Timestamp allotTime;
	private Integer allotState;
	private String allotRemark;

	@Id
	@Column(name = "allot_id")
	public int getAllotId() {
		return allotId;
	}

	public void setAllotId(int allotId) {
		this.allotId = allotId;
	}

	@Basic
	@Column(name = "allot_odd")
	public String getAllotOdd() {
		return allotOdd;
	}

	public void setAllotOdd(String allotOdd) {
		this.allotOdd = allotOdd;
	}

	@Basic
	@Column(name = "allot_date")
	public Timestamp getAllotDate() {
		return allotDate;
	}

	public void setAllotDate(Timestamp allotDate) {
		this.allotDate = allotDate;
	}

	@Basic
	@Column(name = "allot_callout")
	public Integer getAllotCallout() {
		return allotCallout;
	}

	public void setAllotCallout(Integer allotCallout) {
		this.allotCallout = allotCallout;
	}

	@Basic
	@Column(name = "allot_fold")
	public Integer getAllotFold() {
		return allotFold;
	}

	public void setAllotFold(Integer allotFold) {
		this.allotFold = allotFold;
	}

	@Basic
	@Column(name = "allot_name")
	public String getAllotName() {
		return allotName;
	}

	public void setAllotName(String allotName) {
		this.allotName = allotName;
	}

	@Basic
	@Column(name = "allot_total")
	public Integer getAllotTotal() {
		return allotTotal;
	}

	public void setAllotTotal(Integer allotTotal) {
		this.allotTotal = allotTotal;
	}

	@Basic
	@Column(name = "allot_time")
	public Timestamp getAllotTime() {
		return allotTime;
	}

	public void setAllotTime(Timestamp allotTime) {
		this.allotTime = allotTime;
	}

	@Basic
	@Column(name = "allot_state")
	public Integer getAllotState() {
		return allotState;
	}

	public void setAllotState(Integer allotState) {
		this.allotState = allotState;
	}

	@Basic
	@Column(name = "allot_remark")
	public String getAllotRemark() {
		return allotRemark;
	}

	public void setAllotRemark(String allotRemark) {
		this.allotRemark = allotRemark;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		KucunAllot that = (KucunAllot) o;
		return allotId == that.allotId &&
				Objects.equals(allotOdd, that.allotOdd) &&
				Objects.equals(allotDate, that.allotDate) &&
				Objects.equals(allotCallout, that.allotCallout) &&
				Objects.equals(allotFold, that.allotFold) &&
				Objects.equals(allotName, that.allotName) &&
				Objects.equals(allotTotal, that.allotTotal) &&
				Objects.equals(allotTime, that.allotTime) &&
				Objects.equals(allotState, that.allotState) &&
				Objects.equals(allotRemark, that.allotRemark);
	}

	@Override
	public int hashCode() {
		return Objects.hash(allotId, allotOdd, allotDate, allotCallout, allotFold, allotName, allotTotal, allotTime, allotState, allotRemark);
	}
}
