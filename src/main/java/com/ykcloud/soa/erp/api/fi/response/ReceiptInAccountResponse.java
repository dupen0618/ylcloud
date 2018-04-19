package com.ykcloud.soa.erp.api.fi.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;

/**
 * @Author Hewei
 * @Date 2018/4/10 11:31
 */
public class ReceiptInAccountResponse extends MessagePack {

	private static final long serialVersionUID = 1L;

	private Exception e;

	public Exception getE() {
		return e;
	}

	public void setE(Exception e) {
		this.e = e;
	}
}
