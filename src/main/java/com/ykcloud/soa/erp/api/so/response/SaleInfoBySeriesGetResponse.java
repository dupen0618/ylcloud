package com.ykcloud.soa.erp.api.so.response;

import java.util.List;

import com.gb.soa.omp.ccommon.api.response.MessagePack;
import com.ykcloud.soa.erp.api.so.model.FiBlSupBalance;
//根据行号查询销售日报表体出参
public class SaleInfoBySeriesGetResponse extends MessagePack {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<FiBlSupBalance> fiBlSupBalances;

	public List<FiBlSupBalance> getFiBlSupBalances() {
		return fiBlSupBalances;
	}

	public void setFiBlSupBalances(List<FiBlSupBalance> fiBlSupBalances) {
		this.fiBlSupBalances = fiBlSupBalances;
	}
	
	

}
