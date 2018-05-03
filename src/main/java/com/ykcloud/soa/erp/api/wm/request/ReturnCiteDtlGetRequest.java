package com.ykcloud.soa.erp.api.wm.request;

import java.util.Date;

import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;

public class ReturnCiteDtlGetRequest extends AbstractUserSessionRequest {
	private static final long serialVersionUID = 1L;
	
	private  Long subUnitNumId;   //门店/仓库编号
	
	private Date orderDate;       //日期
	
	private String approvalNumId; //退货审批单编号
	
	private String citeReservedNo; // 出库/验收单号
	
	private String citeLine;    //出库/验收单行号

	public Long getSubUnitNumId() {
		return subUnitNumId;
	}

	public void setSubUnitNumId(Long subUnitNumId) {
		this.subUnitNumId = subUnitNumId;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public String getApprovalNumId() {
		return approvalNumId;
	}

	public void setApprovalNumId(String approvalNumId) {
		this.approvalNumId = approvalNumId;
	}

	public String getCiteReservedNo() {
		return citeReservedNo;
	}

	public void setCiteReservedNo(String citeReservedNo) {
		this.citeReservedNo = citeReservedNo;
	}

	public String getCiteLine() {
		return citeLine;
	}

	public void setCiteLine(String citeLine) {
		this.citeLine = citeLine;
	}
	
	

}
