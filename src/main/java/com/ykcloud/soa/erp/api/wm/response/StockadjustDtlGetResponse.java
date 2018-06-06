package com.ykcloud.soa.erp.api.wm.response;

import java.util.List;

import com.gb.soa.omp.ccommon.api.response.MessagePack;
import com.ykcloud.soa.erp.api.wm.model.wmBlStockadjustDtl;

public class StockadjustDtlGetResponse extends MessagePack {

	private static final long serialVersionUID = 1L;

	private List<wmBlStockadjustDtl> WmBlLossDtlList;

	public List<wmBlStockadjustDtl> getWmBlLossDtlList() {
		return WmBlLossDtlList;
	}

	public void setWmBlLossDtlList(List<wmBlStockadjustDtl> wmBlLossDtlList) {
		WmBlLossDtlList = wmBlLossDtlList;
	}

}
