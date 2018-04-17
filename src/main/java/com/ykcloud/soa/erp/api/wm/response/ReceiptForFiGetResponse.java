package com.ykcloud.soa.erp.api.wm.response;

import java.util.List;

import com.gb.soa.omp.ccommon.api.response.MessagePack;
import com.ykcloud.soa.erp.api.wm.model.ReceiptForFi;
import com.ykcloud.soa.erp.api.wm.model.WmSellDaily;

public class ReceiptForFiGetResponse extends MessagePack {

	private static final long serialVersionUID = 2999054411107103895L;
	
	private List<WmSellDaily> wmSellDaily;

	public List<WmSellDaily> getWmSellDaily() {
		return wmSellDaily;
	}

	public void setWmSellDaily(List<WmSellDaily> wmSellDaily) {
		this.wmSellDaily = wmSellDaily;
	}

	
	
}
