package com.ykcloud.soa.erp.api.so.model;

/**
 * 审批单明细
 * @author tz.x
 *
 * @date 2018年4月19日上午9:50:39
 */
public class SoDtlForUpdateActualQty {
	
	/**
	 * 审批单号
	 */
	private String approvalNumId;
	
	/**
	 * 审批单行号
	 */
	private String approvalLine;
	
	/**
	 * 商品实际发货数量
	 */
	private Double qty;
	
	/**
	 * 赠品实际发货数量
	 */
	private Long pmtSign;

	public String getApprovalNumId() {
		return approvalNumId;
	}

	public void setApprovalNumId(String approvalNumId) {
		this.approvalNumId = approvalNumId;
	}

	public String getApprovalLine() {
		return approvalLine;
	}

	public void setApprovalLine(String approvalLine) {
		this.approvalLine = approvalLine;
	}

	public Double getQty() {
		return qty;
	}

	public void setQty(Double qty) {
		this.qty = qty;
	}

	public Long getPmtSign() {
		return pmtSign;
	}

	public void setPmtSign(Long pmtSign) {
		this.pmtSign = pmtSign;
	}


}
