package com.ykcloud.soa.erp.api.wm.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;

/**
*
@author hank.zhu
@date 2018年3月12日 下午8:00:15 新建
**/
public class ReceiptHdrGetResponse extends MessagePack {

	private static final long serialVersionUID = 1L;
	private String reserved_no;
	public String getReserved_no() {
		return reserved_no;
	}
	public void setReserved_no(String reserved_no) {
		this.reserved_no = reserved_no;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	

}
