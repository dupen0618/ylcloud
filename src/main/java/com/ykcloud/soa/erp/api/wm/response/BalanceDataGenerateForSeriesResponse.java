package com.ykcloud.soa.erp.api.wm.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;
import com.ykcloud.soa.erp.api.wm.model.SupBalanceDtl;

public class BalanceDataGenerateForSeriesResponse extends MessagePack {

	private static final long serialVersionUID = 2999054411107103895L;
	
	private SupBalanceDtl wmSellDaily;

	public SupBalanceDtl getWmSellDaily() {
		return wmSellDaily;
	}

	public void setWmSellDaily(SupBalanceDtl wmSellDaily) {
		this.wmSellDaily = wmSellDaily;
	}
}
