package com.ykcloud.soa.erp.api.wm.response;

import java.util.List;

import com.gb.soa.omp.ccommon.api.response.MessagePack;
import com.ykcloud.soa.erp.api.wm.model.WmBlLossDtl;

public class LossNumIdByGetLossDtlResponse extends MessagePack {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private List<WmBlLossDtl> WmBlLossDtlList;

	public List<WmBlLossDtl> getWmBlLossDtlList() {
		return WmBlLossDtlList;
	}

	public void setWmBlLossDtlList(List<WmBlLossDtl> wmBlLossDtlList) {
		WmBlLossDtlList = wmBlLossDtlList;
	}

}
