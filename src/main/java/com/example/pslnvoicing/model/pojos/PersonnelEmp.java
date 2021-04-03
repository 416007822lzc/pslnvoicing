package com.example.pslnvoicing.model.pojos;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "personnel_emp", schema = "pslnvoicing", catalog = "")
public class PersonnelEmp {
	private int empId;
	private String empName;
	private String empGender;
	private String empPhone;
	private String empEmil;
	private String empPassword;
	private Integer deptId;

	@Id
	@Column(name = "emp_id")
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	@Basic
	@Column(name = "emp_name")
	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	@Basic
	@Column(name = "emp_gender")
	public String getEmpGender() {
		return empGender;
	}

	public void setEmpGender(String empGender) {
		this.empGender = empGender;
	}

	@Basic
	@Column(name = "emp_phone")
	public String getEmpPhone() {
		return empPhone;
	}

	public void setEmpPhone(String empPhone) {
		this.empPhone = empPhone;
	}

	@Basic
	@Column(name = "emp_emil")
	public String getEmpEmil() {
		return empEmil;
	}

	public void setEmpEmil(String empEmil) {
		this.empEmil = empEmil;
	}

	@Basic
	@Column(name = "emp_password")
	public String getEmpPassword() {
		return empPassword;
	}

	public void setEmpPassword(String empPassword) {
		this.empPassword = empPassword;
	}

	@Basic
	@Column(name = "dept_id")
	public Integer getDeptId() {
		return deptId;
	}

	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		PersonnelEmp that = (PersonnelEmp) o;
		return empId == that.empId &&
				Objects.equals(empName, that.empName) &&
				Objects.equals(empGender, that.empGender) &&
				Objects.equals(empPhone, that.empPhone) &&
				Objects.equals(empEmil, that.empEmil) &&
				Objects.equals(empPassword, that.empPassword) &&
				Objects.equals(deptId, that.deptId);
	}

	@Override
	public int hashCode() {
		return Objects.hash(empId, empName, empGender, empPhone, empEmil, empPassword, deptId);
	}
}
