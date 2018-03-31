package com.ykcloud.soa.erp.api.wm.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;

/**
*
@author hank.zhu
@date 2018年3月12日 下午8:00:15 新建
**/
public class ReceiptHdrGetResponse extends MessagePack {

	private static final long serialVersionUID = 1L;
	private String reservedNo;
	public String getReservedNo() {
		return reservedNo;
	}
	public void setReservedNo(String reservedNo) {
		this.reservedNo = reservedNo;
	}
	
	

}
