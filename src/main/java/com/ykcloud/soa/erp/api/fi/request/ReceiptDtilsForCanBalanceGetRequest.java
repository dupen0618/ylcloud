package com.ykcloud.soa.erp.api.fi.request;

import java.util.Date;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

/**
 * @Description://获取可结算明细
 * @author ALI
 * @Date 2018年4月4日 下午3:06:50
 */
public class ReceiptDtilsForCanBalanceGetRequest extends AbstractRequest {

	private static final long serialVersionUID = -5126554109130183317L;

	@NotNull(message = "门店编号不能为空！")
	private Long subUnitNumId;

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	@NotNull(message = "开始日期不能为空！")
	private Date startDate;

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	@NotNull(message = "截止日期不能为空！")
	private Date endDate;

	@NotNull(message = "结算方式不能为空！")
	private Long settlementType;

	@NotNull(message = "供应商不能为空！")
	private Long supplyUnitNumId;

	//结算周期
	private Long  balaneCYC;

	public Long getSubUnitNumId() {
		return subUnitNumId;
	}

	public void setSubUnitNumId(Long subUnitNumId) {
		this.subUnitNumId = subUnitNumId;
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

	public Long getSettlementType() {
		return settlementType;
	}

	public void setSettlementType(Long settlementType) {
		this.settlementType = settlementType;
	}

	public Long getSupplyUnitNumId() {
		return supplyUnitNumId;
	}

	public void setSupplyUnitNumId(Long supplyUnitNumId) {
		this.supplyUnitNumId = supplyUnitNumId;
	}

	public Long getBalaneCYC() {
		return balaneCYC;
	}

	public void setBalaneCYC(Long balaneCYC) {
		this.balaneCYC = balaneCYC;
	}
}
