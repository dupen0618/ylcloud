package com.ykcloud.soa.erp.api.wm.request;

import java.util.Map;

import javax.validation.constraints.NotNull;

import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;

public class WmCreateDistributionWithShipRequest extends AbstractUserSessionRequest {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6748061260569895955L;
	
	@NotNull(message = "门店编号不能为空! ")
	private Long subUnitNumId;
	
	@NotNull(message = "出库单号不能为空! ")
	private String reservedNo;
	
	@NotNull(message = "验收单号不能为空! ")
	private String receiptReservedNo;
	
	@NotNull(message = "验收单行号不能为空! ")
	private Map<Long, String> itemReceiptMap;
	

	public Long getSubUnitNumId() {
		return subUnitNumId;
	}

	public void setSubUnitNumId(Long subUnitNumId) {
		this.subUnitNumId = subUnitNumId;
	}

	public String getReservedNo() {
		return reservedNo;
	}

	public void setReservedNo(String reservedNo) {
		this.reservedNo = reservedNo;
	}

	public String getReceiptReservedNo() {
		return receiptReservedNo;
	}

	public void setReceiptReservedNo(String receiptReservedNo) {
		this.receiptReservedNo = receiptReservedNo;
	}

	public Map<Long, String> getItemReceiptMap() {
		return itemReceiptMap;
	}

	public void setItemReceiptMap(Map<Long, String> itemReceiptMap) {
		this.itemReceiptMap = itemReceiptMap;
	}
	
}
