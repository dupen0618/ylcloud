package com.ykcloud.soa.erp.api.wm.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;

/**
 * 形成验收单出参
 * @author tz.x
 *
 * @date 2018年3月27日上午11:35:53
 * @see
 */
public class ReceiptGenerateResponse extends MessagePack {

	private static final long serialVersionUID = 1223354906305937696L;
	
	/**
	 * 验收单号
	 */
	private String reservedNo;

	public String getReservedNo() {
		return reservedNo;
	}

	public void setReservedNo(String reservedNo) {
		this.reservedNo = reservedNo;
	}

}
