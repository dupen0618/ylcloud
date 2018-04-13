package com.ykcloud.soa.erp.api.fi.request;

import java.util.Date;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

/**
 * @Description:刷新扣款项
 * @author Song
 * @Date 2018年4月4日 下午2:50:06
 */
public class SupplyByBalanceDeductionFlushRequest extends AbstractRequest {

	private static final long serialVersionUID = 4627685577873375711L;
	
	@NotNull(message = "门店编号不能为空！")
	private Long subUnitNumId;
	
	@NotNull(message = "供应商编号不能为空！")
	private Long unitNumId;

	@NotNull(message = "开始日期不能为空！")
	private String startDate;

	@NotNull(message = "截止日期不能为空！")
	private String endtDate;
	
	@NotNull(message = "经营方式不能为空！")
	private Long settlementType;
	
	@NotNull(message = "结算周期不能为空！")
	private Date balanceDate;
	
	@NotNull(message = "操作人ID不能为空！")
	private Long createUserId;
	
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

	public Long getCreateUserId() {
		return createUserId;
	}

	public void setCreateUserId(Long createUserId) {
		this.createUserId = createUserId;
	}

	public Long getBalanceNo() {
		return balanceNo;
	}

	public void setBalanceNo(Long balanceNo) {
		this.balanceNo = balanceNo;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndtDate() {
		return endtDate;
	}

	public void setEndtDate(String endtDate) {
		this.endtDate = endtDate;
	}
}
