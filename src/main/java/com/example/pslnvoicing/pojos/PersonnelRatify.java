package com.example.pslnvoicing.pojos;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;


public class PersonnelRatify {
	private int ratifId;
	private String ratifStatus;
	private Integer empId;
	private Date ratifTime;
	private String ratifResult;

	@Id
	@Column(name = "ratif_id")
	public int getRatifId() {
		return ratifId;
	}

	public void setRatifId(int ratifId) {
		this.ratifId = ratifId;
	}

	@Basic
	@Column(name = "ratif_status")
	public String getRatifStatus() {
		return ratifStatus;
	}

	public void setRatifStatus(String ratifStatus) {
		this.ratifStatus = ratifStatus;
	}

	@Basic
	@Column(name = "emp_id")
	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	@Basic
	@Column(name = "ratif_time")
	public Date getRatifTime() {
		return ratifTime;
	}

	public void setRatifTime(Date ratifTime) {
		this.ratifTime = ratifTime;
	}

	@Basic
	@Column(name = "ratif_result")
	public String getRatifResult() {
		return ratifResult;
	}

	public void setRatifResult(String ratifResult) {
		this.ratifResult = ratifResult;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		PersonnelRatify that = (PersonnelRatify) o;
		return ratifId == that.ratifId &&
				Objects.equals(ratifStatus, that.ratifStatus) &&
				Objects.equals(empId, that.empId) &&
				Objects.equals(ratifTime, that.ratifTime) &&
				Objects.equals(ratifResult, that.ratifResult);
	}

	@Override
	public int hashCode() {
		return Objects.hash(ratifId, ratifStatus, empId, ratifTime, ratifResult);
	}
}
