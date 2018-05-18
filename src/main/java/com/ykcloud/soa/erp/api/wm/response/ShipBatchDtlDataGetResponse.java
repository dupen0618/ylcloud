package com.ykcloud.soa.erp.api.wm.response;

import java.util.List;

import com.gb.soa.omp.ccommon.api.response.MessagePack;
import com.ykcloud.soa.erp.api.wm.model.SupBalanceDtl;

public class ShipBatchDtlDataGetResponse extends MessagePack{

	private static final long serialVersionUID = -6285356175567284747L;

	private List<SupBalanceDtl> wmSellDaily;

	public List<SupBalanceDtl> getWmSellDaily() {
		return wmSellDaily;
	}

	public void setWmSellDaily(List<SupBalanceDtl> wmSellDaily) {
		this.wmSellDaily = wmSellDaily;
	}

}
