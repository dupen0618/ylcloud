package com.ykcloud.soa.erp.api.fi.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;

public class SupplyHdrStatusUpdateResponse extends MessagePack{

	private static final long serialVersionUID = -7516775069518317561L;
	
	private  Integer  sum;//修改行数

	public Integer getSum() {
		return sum;
	}

	public void setSum(Integer sum) {
		this.sum = sum;
	}
}
