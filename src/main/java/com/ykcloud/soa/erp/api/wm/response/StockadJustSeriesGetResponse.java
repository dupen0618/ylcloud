package com.ykcloud.soa.erp.api.wm.response;

import java.util.List;

import com.gb.soa.omp.ccommon.api.response.MessagePack;
import com.ykcloud.soa.erp.api.wm.model.WmSellDaily;

public class StockadJustSeriesGetResponse extends MessagePack {

	private static final long serialVersionUID = -9181232935877591119L;

	private List<WmSellDaily> wmSellDaily;

	public List<WmSellDaily> getWmSellDaily() {
		return wmSellDaily;
	}

	public void setWmSellDaily(List<WmSellDaily> wmSellDaily) {
		this.wmSellDaily = wmSellDaily;
	}

	
}