package com.ykcloud.soa.erp.api.fi.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;
import com.ykcloud.soa.erp.api.fi.model.BalanceDtlAppoint;

import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

/**
 * @Description:选择指定验收入库单明细项目生成结算明细
 * @author ali
 * @Date 2018年4月4日 下午5:20:28
 */
public class AppointBalanceBillDtlGenerateRequest extends AbstractUserSessionRequest {
	private static final long serialVersionUID = 3737818551885038156L;

	@NotNull(message = "结算单号不能为空！")
	private String balanceNo;
	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
	@NotNull(message = "结算日期不能为空！")
	private Date balanceDate;
	@NotNull(message = "门店编号不能为空！")
	private Long subUnitNumId;
	@NotNull(message = "发生门店不能为空！")
	private Long balanceSubUnitNumId;
	@NotNull(message = "税率不能为空！")
	private Double taxRate;
	@NotNull(message = "供应商不能为空！")
	private Long supplyUnitNumId;
	@NotNull(message = "结算方式不能为空！")
	private Long settlementType;
	@NotNull(message = "单据编号不能为空！")
	private String reservedNo;
	@NotNull(message = "单据类型不能为空！")
	private  Long  reservedTypeNumId;
	public String getBalanceNo() {
		return balanceNo;
	}

	public void setBalanceNo(String balanceNo) {
		this.balanceNo = balanceNo;
	}

	public Date getBalanceDate() {
		return balanceDate;
	}
	public void setBalanceDate(Date balanceDate) {
		this.balanceDate = balanceDate;
	}

	public Long getSubUnitNumId() {
		return subUnitNumId;
	}

	public void setSubUnitNumId(Long subUnitNumId) {
		this.subUnitNumId = subUnitNumId;
	}

	public Long getBalanceSubUnitNumId() {
		return balanceSubUnitNumId;
	}

	public void setBalanceSubUnitNumId(Long balanceSubUnitNumId) {
		this.balanceSubUnitNumId = balanceSubUnitNumId;
	}

	public Double getTaxRate() {
		return taxRate;
	}

	public void setTaxRate(Double taxRate) {
		this.taxRate = taxRate;
	}

	public Long getSupplyUnitNumId() {
		return supplyUnitNumId;
	}

	public void setSupplyUnitNumId(Long supplyUnitNumId) {
		this.supplyUnitNumId = supplyUnitNumId;
	}

	public Long getSettlementType() {
		return settlementType;
	}

	public void setSettlementType(Long settlementType) {
		this.settlementType = settlementType;
	}

	public String getReservedNo() {
		return reservedNo;
	}

	public void setReservedNo(String reservedNo) {
		this.reservedNo = reservedNo;
	}

	public Long getReservedTypeNumId() {
		return reservedTypeNumId;
	}

	public void setReservedTypeNumId(Long reservedTypeNumId) {
		this.reservedTypeNumId = reservedTypeNumId;
	}
}
