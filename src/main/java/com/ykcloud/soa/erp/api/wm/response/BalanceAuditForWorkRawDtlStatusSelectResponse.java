package com.ykcloud.soa.erp.api.wm.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;

public class BalanceAuditForWorkRawDtlStatusSelectResponse extends MessagePack {

	private static final long serialVersionUID = 6068174599924427648L;

	private  Integer  sum;//修改行数

	public Integer getSum() {
		return sum;
	}

	public void setSum(Integer sum) {
		this.sum = sum;
	}
	
}
