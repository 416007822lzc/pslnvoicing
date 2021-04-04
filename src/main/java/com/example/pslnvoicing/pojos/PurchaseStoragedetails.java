package com.example.pslnvoicing.pojos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Objects;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PurchaseStoragedetails {
	private int pSdId;
	private String pSdBh;
	private Integer pWId;
	private String pSdName;
	private Integer pSdNumber;
	private String pSdCompany;
	private Double pSdUnitprice;
	private Double pSdTotalprice;
}
