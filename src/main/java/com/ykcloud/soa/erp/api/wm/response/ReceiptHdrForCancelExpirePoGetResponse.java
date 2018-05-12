package com.ykcloud.soa.erp.api.wm.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;

/**
 * @author tz.x
 * @date 2018年5月11日下午4:52:05
 */
public class ReceiptHdrForCancelExpirePoGetResponse extends MessagePack {

	private static final long serialVersionUID = 5306576903148578642L;
	
	/**
	 * 单据状态
	 */
	private Long statusNumId;
	
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

	public Long getStatusNumId() {
		return statusNumId;
	}

	public void setStatusNumId(Long statusNumId) {
		this.statusNumId = statusNumId;
	}

	

}
