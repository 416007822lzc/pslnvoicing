package com.example.pslnvoicing.model.pojos;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;


public class KucunAllot {
	private int allotId;
	private String allotOdd;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
	private Timestamp allotDate;
	private String allotCallout;
	private String allotFold;
	private String allotName;
	private Integer allotTotal;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
	private Timestamp allotTime;
	private Integer allotState;
	private String allotRemark;
	private String allotShr;


	@Override
	public String toString() {
		return "KucunAllot{" +
				"allotId=" + allotId +
				", allotOdd='" + allotOdd + '\'' +
				", allotDate=" + allotDate +
				", allotCallout='" + allotCallout + '\'' +
				", allotFold='" + allotFold + '\'' +
				", allotName='" + allotName + '\'' +
				", allotTotal=" + allotTotal +
				", allotTime=" + allotTime +
				", allotState=" + allotState +
				", allotRemark='" + allotRemark + '\'' +
				", allotShr='" + allotShr + '\'' +
				'}';
	}

	@Id
	@Column(name = "allot_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getAllotId() {
		return allotId;
	}

	public void setAllotId(int allotId) {
		this.allotId = allotId;
	}


	@Basic
	@Column(name = "allot_callot")
	public String getAllotCallout() {
		return allotCallout;
	}

	public void setAllotCallout(String allotCallout) {
		this.allotCallout = allotCallout;
	}

	@Basic
	@Column(name = "allot_fold")
	public String getAllotFold() {
		return allotFold;
	}

	public void setAllotFold(String allotFold) {
		this.allotFold = allotFold;
	}

	@Basic
	@Column(name = "allot_shr")
	public String getAllotShr() {
		return allotShr;
	}

	public void setAllotShr(String allotShr) {
		this.allotShr = allotShr;
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

	@Basic
	@Column(name = "allot_shr")
	public String getAllShr() {
		return allotShr;
	}

	public void setAllShr(String allShr) {
		this.allotShr = allShr;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		KucunAllot that = (KucunAllot) o;
		return allotId == that.allotId &&
				Objects.equals(allotOdd, that.allotOdd) &&
				Objects.equals(allotDate, that.allotDate) &&
//				Objects.equals(allotCallout, that.allotCallout) &&
//				Objects.equals(allotFold, that.allotFold) &&
				Objects.equals(allotName, that.allotName) &&
				Objects.equals(allotTotal, that.allotTotal) &&
				Objects.equals(allotTime, that.allotTime) &&
				Objects.equals(allotState, that.allotState) &&
				Objects.equals(allotRemark, that.allotRemark);
	}

	@Override
	public int hashCode() {
		return Objects.hash(allotId, allotOdd, allotDate, allotName, allotTotal, allotTime, allotState, allotRemark);
	}
}
