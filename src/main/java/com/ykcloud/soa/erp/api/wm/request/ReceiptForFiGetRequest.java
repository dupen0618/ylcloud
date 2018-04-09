package com.ykcloud.soa.erp.api.wm.request;

import java.util.Date;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

public class ReceiptForFiGetRequest extends AbstractRequest{

	private static final long serialVersionUID = -1455476110754112096L;

	@NotNull(message = "门店编号不能为空！")
	private Long subUnitNumId;
	
	@NotNull(message = "供应商编号不能为空！")
	private Long unitNumId;
	
	@NotNull(message = "租户不能为空！")
	private Long tenantNumId;
	
	@NotNull(message = "生产或测试标识不能为空！")
	private Long dataSign;
	
	@JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
	@NotNull(message = "开始日期不能为空！")
	private String startDate;
	
	@JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
	@NotNull(message = "截止日期不能为空！")
	private String endDate;
	
	@NotNull(message = "经营方式不能为空！")
	private Long settlementType;
	
	@NotNull(message = "结算周期不能为空！")
	private Date balanceDate;
	
	@NotNull(message = "操作人ID不能为空！")
	private Long userNumId;
	
	@NotNull(message = "结算单号不能为空！")
	private Long balanceNo;

	public Long getSubUnitNumId() {
		return subUnitNumId;
	}

	public void setSubUnitNumId(Long subUnitNumId) {
		this.subUnitNumId = subUnitNumId;
	}

	public Long getUnitNumId() {
		return unitNumId;
	}

	public void setUnitNumId(Long unitNumId) {
		this.unitNumId = unitNumId;
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

	public Date getBalanceDate() {
		return balanceDate;
	}

	public void setBalanceDate(Date balanceDate) {
		this.balanceDate = balanceDate;
	}

	public Long getUserNumId() {
		return userNumId;
	}

	public void setUserNumId(Long userNumId) {
		this.userNumId = userNumId;
	}

	public Long getBalanceNo() {
		return balanceNo;
	}

	public void setBalanceNo(Long balanceNo) {
		this.balanceNo = balanceNo;
	}

	public Long getTenantNumId() {
		return tenantNumId;
	}

	public void setTenantNumId(Long tenantNumId) {
		this.tenantNumId = tenantNumId;
	}

	public Long getDataSign() {
		return dataSign;
	}

	public void setDataSign(Long dataSign) {
		this.dataSign = dataSign;
	}
	
	
	
}
