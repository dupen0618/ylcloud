package com.ykcloud.soa.erp.api.so.model;

import java.io.Serializable;

/**
 * 审批单明细
 * @author tz.x
 * @date 2018年4月19日上午9:50:39
 */
public class SoDtlForUpdateActualQty implements Serializable {
	
	private static final long serialVersionUID = -1152449352464241922L;

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
	
	/**
	 * 申请单行号
	 */
	private String applyLine;
	
	/**
	 * 申请单号
	 */
	private String applyNumId;

	public String getApplyNumId() {
		return applyNumId;
	}

	public void setApplyNumId(String applyNumId) {
		this.applyNumId = applyNumId;
	}

	public String getApplyLine() {
		return applyLine;
	}

	public void setApplyLine(String applyLine) {
		this.applyLine = applyLine;
	}

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
