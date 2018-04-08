package com.ykcloud.soa.erp.api.scm.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;
import com.ykcloud.soa.erp.api.scm.model.DistributionProduct;
import java.util.List;

public class DistributionProductInfoGetResponse extends MessagePack {

	private static final long serialVersionUID = 1L;

	private List<DistributionProduct> data;

	public List<DistributionProduct> getData() {
		return data;
	}

	public void setData(List<DistributionProduct> data) {
		this.data = data;
	}

}
