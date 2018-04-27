package com.ykcloud.soa.erp.api.so.response;

import java.util.List;

import com.gb.soa.omp.ccommon.api.response.MessagePack;
import com.ykcloud.soa.erp.api.so.model.FiBlSupBalance;

public class SaleInfoBySoTmlItemSellDailyGetResponse extends MessagePack {
	private static final long serialVersionUID = 5661477026084087628L;
	
	
	private List<FiBlSupBalance> fiBlSupBalances;

	public List<FiBlSupBalance> getFiBlSupBalances() {
		return fiBlSupBalances;
	}

	public void setFiBlSupBalances(List<FiBlSupBalance> fiBlSupBalances) {
		this.fiBlSupBalances = fiBlSupBalances;
	}
	
	

}
