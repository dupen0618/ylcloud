package com.ykcloud.soa.erp.api.wm.response;

import java.util.List;

import com.gb.soa.omp.ccommon.api.response.MessagePack;
import com.ykcloud.soa.erp.api.wm.model.SupBalanceDtl;

public class StockadJustDataGetResponse extends MessagePack  {

	private static final long serialVersionUID = -9217414069554445610L;

	private List<SupBalanceDtl> wmSellDaily;

	public List<SupBalanceDtl> getWmSellDaily() {
		return wmSellDaily;
	}

	public void setWmSellDaily(List<SupBalanceDtl> wmSellDaily) {
		this.wmSellDaily = wmSellDaily;
	}

	
}
