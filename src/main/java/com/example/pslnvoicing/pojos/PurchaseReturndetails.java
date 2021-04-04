package com.example.pslnvoicing.pojos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Objects;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PurchaseReturndetails {
	private int pRdId;
	private String pRdBh;
	private Integer pRId;
	private String pRdName;
	private Integer pRdNumber;
	private String pRdCompany;
	private Double pRdUnitprice;
	private Double pRdTotalprice;

}
