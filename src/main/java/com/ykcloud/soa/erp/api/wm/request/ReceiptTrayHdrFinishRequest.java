package com.ykcloud.soa.erp.api.wm.request;

import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;

/**
*托盘完成请求类
@author hank.zhu
@date 2018年3月28日 下午2:49:15 新建
**/
public class ReceiptTrayHdrFinishRequest extends AbstractUserSessionRequest {
	private static final long serialVersionUID = 7297928684649536716L;
	private String reservedNo;
	private String traySerlno;
	public String getReservedNo() {
		return reservedNo;
	}
	public void setReservedNo(String reservedNo) {
		this.reservedNo = reservedNo;
	}
	public String getTraySerlno() {
		return traySerlno;
	}
	public void setTraySerlno(String traySerlno) {
		this.traySerlno = traySerlno;
	}

}
