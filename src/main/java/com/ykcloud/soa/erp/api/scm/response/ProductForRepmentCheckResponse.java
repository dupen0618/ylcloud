package com.ykcloud.soa.erp.api.scm.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;

public class ProductForRepmentCheckResponse extends MessagePack {
	private static final long serialVersionUID = -3621634900229807547L;
	
	private Long supplyContractCheckCode;
	
	private String supplyContractCheckMessage;

	public Long getSupplyContractCheckCode() {
		return supplyContractCheckCode;
	}

	public void setSupplyContractCheckCode(Long supplyContractCheckCode) {
		this.supplyContractCheckCode = supplyContractCheckCode;
	}

	public String getSupplyContractCheckMessage() {
		return supplyContractCheckMessage;
	}

	public void setSupplyContractCheckMessage(String supplyContractCheckMessage) {
		this.supplyContractCheckMessage = supplyContractCheckMessage;
	}
	
	
 
}
