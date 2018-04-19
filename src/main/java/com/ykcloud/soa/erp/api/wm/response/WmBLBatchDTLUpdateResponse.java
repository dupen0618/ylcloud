package com.ykcloud.soa.erp.api.wm.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;

/**
 * @Author Hewei
 * @Date 2018/4/8 15:56
 */
public class WmBLBatchDTLUpdateResponse extends MessagePack {

	private static final long serialVersionUID = 1L;

	private Exception e;

	public Exception getE() {
		return e;
	}

	public void setE(Exception e) {
		this.e = e;
	}
}
