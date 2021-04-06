package com.example.pslnvoicing.pojos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Arrays;
import java.util.Objects;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PurchaseProductdetails {
	private int pPdId;
	private String pOPurchasenumber;
	private String pPdCpid;
	private String pPdSname;
	private Integer pPdNumber;
	private String pPdCompany;
	private Double pPdUnitprice;
	private Double pPdTotalprice;
}
