package com.ykcloud.soa.erp.api.wm.request;

import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;

/**
*收货完成请求类
@author hank.zhu
@date 2018年4月2日 下午4:00:46 新建
**/
public class ReceiptFinishRequest extends AbstractUserSessionRequest {
	private static final long serialVersionUID = -5053743249048525040L;
	private String reservedNo;//验收单编号
	private Long receiptSign;//短收校验标识 value {0 :不验证短收, 1 :验证短收}
	private Long subUnitNumId;//门店编号
	public String getReservedNo() {
		return reservedNo;
	}
	public void setReservedNo(String reservedNo) {
		this.reservedNo = reservedNo;
	}
	public Long getReceiptSign() {
		return receiptSign;
	}
	public void setReceiptSign(Long receiptSign) {
		this.receiptSign = receiptSign;
	}
	public Long getSubUnitNumId() {
		return subUnitNumId;
	}
	public void setSubUnitNumId(Long subUnitNumId) {
		this.subUnitNumId = subUnitNumId;
	}
	

}
