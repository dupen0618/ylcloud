package com.ykcloud.soa.erp.api.scm.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;
import com.ykcloud.soa.erp.api.scm.model.ReplenishProduct;
import java.util.List;

public class DistributionProductInfoGetResponse extends MessagePack {

	private static final long serialVersionUID = 1L;

	private List<ReplenishProduct> data;

	public List<ReplenishProduct> getData() {
		return data;
	}

	public void setData(List<ReplenishProduct> data) {
		this.data = data;
	}
	
}
