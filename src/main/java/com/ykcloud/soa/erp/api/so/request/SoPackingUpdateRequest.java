package com.ykcloud.soa.erp.api.so.request;

import java.util.Date;

import javax.validation.constraints.NotNull;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

public class SoPackingUpdateRequest extends AbstractRequest {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4821061928816988147L;
	
	@NotNull(message = "本次播种数量不能为空!")
	private Double bzNum;
	
	
	@NotNull(message = "拨入或者拨出标识符不能为空!")
	private Long cancelSign;
	
	
	@NotNull(message = "门店不能为空!")
	private String subUnitNumId;

	@NotNull(message = "订单明细行号不能为空!")
	private String soLineId;
	
	private Date orderDate;

	public Double getBzNum() {
		return bzNum;
	}

	public void setBzNum(Double bzNum) {
		this.bzNum = bzNum;
	}

	public Long getCancelSign() {
		return cancelSign;
	}

	public void setCancelSign(Long cancelSign) {
		this.cancelSign = cancelSign;
	}


	public String getSubUnitNumId() {
		return subUnitNumId;
	}

	public void setSubUnitNumId(String subUnitNumId) {
		this.subUnitNumId = subUnitNumId;
	}


	public String getSoLineId() {
		return soLineId;
	}

	public void setSoLineId(String soLineId) {
		this.soLineId = soLineId;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	
	
}
