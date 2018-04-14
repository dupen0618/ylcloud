package com.ykcloud.soa.erp.api.so.request;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

/**
 * Created by yiako on 2018/4/9
 */
public class SdBlSoHdrGetReservedQtyRequest extends AbstractRequest {

	private static final long serialVersionUID = 1L;

	private String soNumId;// 销售单号

	public String getSoNumId() {
		return soNumId;
	}

	public void setSoNumId(String soNumId) {
		this.soNumId = soNumId;
	}

}
