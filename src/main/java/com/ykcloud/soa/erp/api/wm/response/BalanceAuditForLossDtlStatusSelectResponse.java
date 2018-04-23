package com.ykcloud.soa.erp.api.wm.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;

public class BalanceAuditForLossDtlStatusSelectResponse extends MessagePack {

	private static final long serialVersionUID = 2985891597248624110L;

	private  Integer  sum;//修改行数

	public Integer getSum() {
		return sum;
	}

	public void setSum(Integer sum) {
		this.sum = sum;
	}
}
