package com.ykcloud.soa.erp.api.wm.request;


import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

public class ReceiptForFiGetRequest extends AbstractRequest{

	private static final long serialVersionUID = -1455476110754112096L;

	@NotNull(message = "门店编号不能为空！")
	private Long subUnitNumId;
	
	@JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
	@NotNull(message = "开始日期不能为空！")
	private String startDate;
	
	@JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
	@NotNull(message = "截止日期不能为空！")
	private String endDate;
	
	@NotNull(message = "经营方式不能为空！")
	private Long settlementType;
	
	@NotNull(message = "结算单号不能为空！")
	private Long reservedNo;

	@NotNull(message = "供应商编号不能为空！")
	private Long supplyUnitNumId;
	
	@NotNull(message = "操作人ID不能为空！")
	private Long userNumId;
	

	public Long getSubUnitNumId() {
		return subUnitNumId;
	}

	public void setSubUnitNumId(Long subUnitNumId) {
		this.subUnitNumId = subUnitNumId;
	}

	public Long getSupplyUnitNumId() {
		return supplyUnitNumId;
	}

	public void setSupplyUnitNumId(Long supplyUnitNumId) {
		this.supplyUnitNumId = supplyUnitNumId;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public Long getSettlementType() {
		return settlementType;
	}

	public void setSettlementType(Long settlementType) {
		this.settlementType = settlementType;
	}

	/*public Long getPhysicalNumId() {
		return physicalNumId;
	}

	public void setPhysicalNumId(Long physicalNumId) {
		this.physicalNumId = physicalNumId;
	}*/

	public Long getUserNumId() {
		return userNumId;
	}

	public void setUserNumId(Long userNumId) {
		this.userNumId = userNumId;
	}

	public Long getReservedNo() {
		return reservedNo;
	}

	public void setReservedNo(Long reservedNo) {
		this.reservedNo = reservedNo;
	}

	
	
	
}
