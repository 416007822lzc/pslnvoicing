package com.example.pslnvoicing.pojos;

import javax.persistence.*;
import java.util.Objects;


public class PslnvoicingIncomeExpenses {
	private int ieId;
	private String incomeName;
	private String expensesName;

	@Id
	@Column(name = "ie_id")
	public int getIeId() {
		return ieId;
	}

	public void setIeId(int ieId) {
		this.ieId = ieId;
	}

	@Basic
	@Column(name = "income_name")
	public String getIncomeName() {
		return incomeName;
	}

	public void setIncomeName(String incomeName) {
		this.incomeName = incomeName;
	}

	@Basic
	@Column(name = "expenses_name")
	public String getExpensesName() {
		return expensesName;
	}

	public void setExpensesName(String expensesName) {
		this.expensesName = expensesName;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		PslnvoicingIncomeExpenses that = (PslnvoicingIncomeExpenses) o;
		return ieId == that.ieId &&
				Objects.equals(incomeName, that.incomeName) &&
				Objects.equals(expensesName, that.expensesName);
	}

	@Override
	public int hashCode() {
		return Objects.hash(ieId, incomeName, expensesName);
	}
}
