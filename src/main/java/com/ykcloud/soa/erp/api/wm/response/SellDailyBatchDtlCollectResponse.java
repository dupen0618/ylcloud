package com.ykcloud.soa.erp.api.wm.response;

import java.util.List;

import com.gb.soa.omp.ccommon.api.response.MessagePack;
import com.ykcloud.soa.erp.api.wm.model.WmShipSellDailyBatchDtl;

public class SellDailyBatchDtlCollectResponse extends MessagePack{

	
	private static final long serialVersionUID = 1745330473398898396L;
	
	
	private List<WmShipSellDailyBatchDtl> shipSellDailyBatchDtlList;


	public List<WmShipSellDailyBatchDtl> getShipSellDailyBatchDtlList() {
		return shipSellDailyBatchDtlList;
	}


	public void setShipSellDailyBatchDtlList(List<WmShipSellDailyBatchDtl> shipSellDailyBatchDtlList) {
		this.shipSellDailyBatchDtlList = shipSellDailyBatchDtlList;
	}
	
	

}
