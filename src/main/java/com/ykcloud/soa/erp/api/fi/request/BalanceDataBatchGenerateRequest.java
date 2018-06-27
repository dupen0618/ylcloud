package com.ykcloud.soa.erp.api.fi.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;

import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

/**
 * @Description:供应商结算生成结算单
 * @author Ali
 * @Date 2018年4月4日 下午1:47:35
 */
public class BalanceDataBatchGenerateRequest extends AbstractUserSessionRequest {

	private static final long serialVersionUID = 4627685577873375711L;

	@NotNull(message = "门店编号不能为空！")
	private Long subUnitNumId;

	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
	@NotNull(message = "结算日期不能为空！")
	private Date balanceDate;

	@NotNull(message = "供应商不能为空！")
	private List<Long> supplyUnitNumId;

	@NotNull(message = "结算单号不能为空！")
	private String balanceNo;

	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
	@NotNull(message = "开始日期不能为空！")
	private Date startDate;

	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
	@NotNull(message = "截止日期不能为空！")
	private Date endDate;

	@NotNull(message = "结算方式不能为空！")
	private Long settlementType;

	//结算周期
	private Long  balaneCYC;

	public Long getBalaneCYC() {
		return balaneCYC;
	}

	public void setBalaneCYC(Long balaneCYC) {
		this.balaneCYC = balaneCYC;
	}

	public Long getSubUnitNumId() {
		return subUnitNumId;
	}

	public void setSubUnitNumId(Long subUnitNumId) {
		this.subUnitNumId = subUnitNumId;
	}

	public Long getSettlementType() {
		return settlementType;
	}

	public void setSettlementType(Long settlementType) {
		this.settlementType = settlementType;
	}

	public List<Long> getSupplyUnitNumId() {
		return supplyUnitNumId;
	}

	public void setSupplyUnitNumId(List<Long> supplyUnitNumId) {
		this.supplyUnitNumId = supplyUnitNumId;
	}

	public String getBalanceNo() {
		return balanceNo;
	}

	public void setBalanceNo(String balanceNo) {
		this.balanceNo = balanceNo;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Date getBalanceDate() {
		return balanceDate;
	}

	public void setBalanceDate(Date balanceDate) {
		this.balanceDate = balanceDate;
	}
}
