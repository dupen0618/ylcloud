package com.ykcloud.soa.erp.api.so.request;

import javax.validation.constraints.NotNull;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

public class SoUpdatePackingRequest extends AbstractRequest {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4821061928816988147L;
	
	@NotNull(message = "本次播种数量不能为空!")
	private Long bzNum;
	
	@NotNull(message = "商品ID不能为空!")
	private Long itemNumId;
	
	@NotNull(message = "订单ID不能为空!")
	private Long soNumId;;
	
	@NotNull(message = "拨入或者拨出标识符不能为空!")
	private Long dealType;
	
	@NotNull(message = "是否是赠品标识符不能为空!")
	private Long pmtSign;
	
	@NotNull(message = "门店不能为空!")
	private Long subUnitNumId;

	public Long getBzNum() {
		return bzNum;
	}

	public void setBzNum(Long bzNum) {
		this.bzNum = bzNum;
	}

	public Long getItemNumId() {
		return itemNumId;
	}

	public void setItemNumId(Long itemNumId) {
		this.itemNumId = itemNumId;
	}


	public Long getSoNumId() {
		return soNumId;
	}

	public void setSoNumId(Long soNumId) {
		this.soNumId = soNumId;
	}

	public Long getDealType() {
		return dealType;
	}

	public void setDealType(Long dealType) {
		this.dealType = dealType;
	}

	public Long getPmtSign() {
		return pmtSign;
	}

	public void setPmtSign(Long pmtSign) {
		this.pmtSign = pmtSign;
	}

	public Long getSubUnitNumId() {
		return subUnitNumId;
	}

	public void setSubUnitNumId(Long subUnitNumId) {
		this.subUnitNumId = subUnitNumId;
	}
	
	

}
