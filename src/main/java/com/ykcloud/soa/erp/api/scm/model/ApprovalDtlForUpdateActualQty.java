package com.ykcloud.soa.erp.api.scm.model;

/**
 * 
 * @author tz.x
 *
 * @date 2018年4月23日下午3:10:31
 */
public class ApprovalDtlForUpdateActualQty {
	
	/**
	 * 申请单号
	 */
	private String applyNumId;
	
	/**
	 * 申请单行号
	 */
	private String applyLine;
	
	/**
	 * 数量
	 */
	private Double qty;
	
	/**
	 * 赠品数量
	 */
	private Double pmyQty;
	
	/**
	 * 审批单号
	 */
	private String approvalNumId;
	
	/**
	 * 审批单行号
	 */
	private String series;


	public String getSeries() {
		return series;
	}

	public void setSeries(String series) {
		this.series = series;
	}

	public String getApprovalNumId() {
		return approvalNumId;
	}

	public void setApprovalNumId(String approvalNumId) {
		this.approvalNumId = approvalNumId;
	}

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

	public Double getQty() {
		return qty;
	}

	public void setQty(Double qty) {
		this.qty = qty;
	}

	public Double getPmyQty() {
		return pmyQty;
	}

	public void setPmyQty(Double pmyQty) {
		this.pmyQty = pmyQty;
	}

}
