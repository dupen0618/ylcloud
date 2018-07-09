package com.ykcloud.soa.erp.api.wm.response;

import java.util.List;

import com.gb.soa.omp.ccommon.api.response.MessagePack;
import com.ykcloud.soa.erp.api.wm.model.WmShipSellDailyBatchDtlForFinance;

public class WmSellDailyBatchForFinanceGetResponse extends MessagePack{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1211512339552862457L;
	
	private List<WmShipSellDailyBatchDtlForFinance> batchList;
	
	private Long countNum;


	public Long getCountNum() {
		return countNum;
	}

	public void setCountNum(Long countNum) {
		this.countNum = countNum;
	}

	public List<WmShipSellDailyBatchDtlForFinance> getBatchList() {
		return batchList;
	}

	public void setBatchList(List<WmShipSellDailyBatchDtlForFinance> batchList) {
		this.batchList = batchList;
	}
	
	

}
