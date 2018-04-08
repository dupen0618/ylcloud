package com.ykcloud.soa.erp.api.wm.request;

import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;

/**
*
@author hank.zhu
@date 2018年4月4日 上午11:48:48 新建
**/
public class ReceiptTrayGetRequest extends AbstractUserSessionRequest {
	private static final long serialVersionUID = 4267755424420696319L;
	private String  reservedNo;
	private String traySerlno;
	private Long subUnitNumId;
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
	public Long getSubUnitNumId() {
		return subUnitNumId;
	}
	public void setSubUnitNumId(Long subUnitNumId) {
		this.subUnitNumId = subUnitNumId;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	

}
