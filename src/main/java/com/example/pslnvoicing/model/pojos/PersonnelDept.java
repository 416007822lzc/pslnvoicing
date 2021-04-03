package com.example.pslnvoicing.model.pojos;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "personnel_dept", schema = "pslnvoicing", catalog = "")
public class PersonnelDept {
	private int deptId;
	private String deptName;

	@Id
	@Column(name = "dept_id")
	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	@Basic
	@Column(name = "dept_name")
	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		PersonnelDept that = (PersonnelDept) o;
		return deptId == that.deptId &&
				Objects.equals(deptName, that.deptName);
	}

	@Override
	public int hashCode() {
		return Objects.hash(deptId, deptName);
	}
}
