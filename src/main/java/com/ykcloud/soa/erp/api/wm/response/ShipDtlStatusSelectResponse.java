package com.ykcloud.soa.erp.api.wm.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;

public class ShipDtlStatusSelectResponse extends MessagePack{

	private static final long serialVersionUID = -2504519831035894706L;

	private  Integer  sum;//修改行数

	public Integer getSum() {
		return sum;
	}

	public void setSum(Integer sum) {
		this.sum = sum;
	}
}
