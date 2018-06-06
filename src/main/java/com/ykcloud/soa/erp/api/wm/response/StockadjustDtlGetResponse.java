package com.ykcloud.soa.erp.api.wm.response;

import java.util.List;

import com.gb.soa.omp.ccommon.api.response.MessagePack;
import com.ykcloud.soa.erp.api.wm.model.WmBlStockadjustDtl;

public class StockadjustDtlGetResponse extends MessagePack {

	private static final long serialVersionUID = 1L;

	private List<WmBlStockadjustDtl> WmBlLossDtlList;

	public List<WmBlStockadjustDtl> getWmBlLossDtlList() {
		return WmBlLossDtlList;
	}

	public void setWmBlLossDtlList(List<WmBlStockadjustDtl> wmBlLossDtlList) {
		WmBlLossDtlList = wmBlLossDtlList;
	}

}
