package com.ykcloud.soa.erp.api.wm.response;

import java.util.List;

import com.gb.soa.omp.ccommon.api.response.MessagePack;
import com.ykcloud.soa.erp.api.wm.model.SupBalanceDtl;

public class ShipHdrSeriesGetResponse extends MessagePack{

	private static final long serialVersionUID = 6103929548291789381L;


	private List<SupBalanceDtl> wmSellDaily;

	public List<SupBalanceDtl> getWmSellDaily() {
		return wmSellDaily;
	}

	public void setWmSellDaily(List<SupBalanceDtl> wmSellDaily) {
		this.wmSellDaily = wmSellDaily;
	}
}
