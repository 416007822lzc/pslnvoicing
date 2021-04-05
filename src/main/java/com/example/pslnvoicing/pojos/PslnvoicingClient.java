package com.example.pslnvoicing.pojos;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;


public class PslnvoicingClient {
	private String clientName;
	private int clientId;
	private String clientNum;
	private String clientType;
	private BigDecimal clientPriceRatio;
	private BigDecimal clientReceivablesBalance;
	private BigDecimal clientBalancePrepayment;
	private BigDecimal clientActualReceivable;
	private String clientAddress;
	private String clientHead;
	private String clientContact;
	private String clientCreator;
	private Timestamp clientCreateTime;
	private Timestamp clientUpdateTime;
	private String clientPhone;
	private String clientContactNum;

	@Basic
	@Column(name = "client_name")
	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	@Id
	@Column(name = "client_id")
	public int getClientId() {
		return clientId;
	}

	public void setClientId(int clientId) {
		this.clientId = clientId;
	}

	@Basic
	@Column(name = "client_num")
	public String getClientNum() {
		return clientNum;
	}

	public void setClientNum(String clientNum) {
		this.clientNum = clientNum;
	}

	@Basic
	@Column(name = "client_type")
	public String getClientType() {
		return clientType;
	}

	public void setClientType(String clientType) {
		this.clientType = clientType;
	}

	@Basic
	@Column(name = "client_price_ratio")
	public BigDecimal getClientPriceRatio() {
		return clientPriceRatio;
	}

	public void setClientPriceRatio(BigDecimal clientPriceRatio) {
		this.clientPriceRatio = clientPriceRatio;
	}

	@Basic
	@Column(name = "client_receivables_balance")
	public BigDecimal getClientReceivablesBalance() {
		return clientReceivablesBalance;
	}

	public void setClientReceivablesBalance(BigDecimal clientReceivablesBalance) {
		this.clientReceivablesBalance = clientReceivablesBalance;
	}

	@Basic
	@Column(name = "client_balance_prepayment")
	public BigDecimal getClientBalancePrepayment() {
		return clientBalancePrepayment;
	}

	public void setClientBalancePrepayment(BigDecimal clientBalancePrepayment) {
		this.clientBalancePrepayment = clientBalancePrepayment;
	}

	@Basic
	@Column(name = "client_actual_receivable")
	public BigDecimal getClientActualReceivable() {
		return clientActualReceivable;
	}

	public void setClientActualReceivable(BigDecimal clientActualReceivable) {
		this.clientActualReceivable = clientActualReceivable;
	}

	@Basic
	@Column(name = "client_address")
	public String getClientAddress() {
		return clientAddress;
	}

	public void setClientAddress(String clientAddress) {
		this.clientAddress = clientAddress;
	}

	@Basic
	@Column(name = "client_head")
	public String getClientHead() {
		return clientHead;
	}

	public void setClientHead(String clientHead) {
		this.clientHead = clientHead;
	}

	@Basic
	@Column(name = "client_contact")
	public String getClientContact() {
		return clientContact;
	}

	public void setClientContact(String clientContact) {
		this.clientContact = clientContact;
	}

	@Basic
	@Column(name = "client_creator")
	public String getClientCreator() {
		return clientCreator;
	}

	public void setClientCreator(String clientCreator) {
		this.clientCreator = clientCreator;
	}

	@Basic
	@Column(name = "client_create_time")
	public Timestamp getClientCreateTime() {
		return clientCreateTime;
	}

	public void setClientCreateTime(Timestamp clientCreateTime) {
		this.clientCreateTime = clientCreateTime;
	}

	@Basic
	@Column(name = "client_update_time")
	public Timestamp getClientUpdateTime() {
		return clientUpdateTime;
	}

	public void setClientUpdateTime(Timestamp clientUpdateTime) {
		this.clientUpdateTime = clientUpdateTime;
	}

	@Basic
	@Column(name = "client_phone")
	public String getClientPhone() {
		return clientPhone;
	}

	public void setClientPhone(String clientPhone) {
		this.clientPhone = clientPhone;
	}

	@Basic
	@Column(name = "client_contact_num")
	public String getClientContactNum() {
		return clientContactNum;
	}

	public void setClientContactNum(String clientContactNum) {
		this.clientContactNum = clientContactNum;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		PslnvoicingClient that = (PslnvoicingClient) o;
		return clientId == that.clientId &&
				clientNum == that.clientNum &&
				Objects.equals(clientName, that.clientName) &&
				Objects.equals(clientType, that.clientType) &&
				Objects.equals(clientPriceRatio, that.clientPriceRatio) &&
				Objects.equals(clientReceivablesBalance, that.clientReceivablesBalance) &&
				Objects.equals(clientBalancePrepayment, that.clientBalancePrepayment) &&
				Objects.equals(clientActualReceivable, that.clientActualReceivable) &&
				Objects.equals(clientAddress, that.clientAddress) &&
				Objects.equals(clientHead, that.clientHead) &&
				Objects.equals(clientContact, that.clientContact) &&
				Objects.equals(clientCreator, that.clientCreator) &&
				Objects.equals(clientCreateTime, that.clientCreateTime) &&
				Objects.equals(clientUpdateTime, that.clientUpdateTime) &&
				Objects.equals(clientPhone , that.clientPhone ) &&
				Objects.equals(clientContactNum, that.clientContactNum);

	}

	@Override
	public int hashCode() {
		return Objects.hash(clientName, clientId, clientNum, clientType, clientPriceRatio, clientReceivablesBalance, clientBalancePrepayment, clientActualReceivable, clientAddress, clientHead, clientContact, clientCreator, clientCreateTime, clientUpdateTime,clientPhone,clientPhone,clientContactNum);
	}
}
