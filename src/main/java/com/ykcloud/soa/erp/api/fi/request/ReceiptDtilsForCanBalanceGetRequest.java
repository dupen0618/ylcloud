package com.ykcloud.soa.erp.api.fi.request;

import java.util.Date;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;

/**
 * @Description://获取可结算验收入库明细
 * @author Song
 * @Date 2018年4月4日 下午3:06:50
 */
public class ReceiptDtilsForCanBalanceGetRequest extends AbstractUserSessionRequest {

	private static final long serialVersionUID = -5126554109130183317L;

	@NotNull(message = "门店编号不能为空！")
	private Long subUnitNumId;

	@NotNull(message = "供应商编号不能为空！")
	private Long unitNumId;

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	@NotNull(message = "开始日期不能为空！")
	private Date startDate;

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	@NotNull(message = "截止日期不能为空！")
	private Date endtDate;

	@NotNull(message = "经营方式不能为空！")
	private Long settlementType;

	@NotNull(message = "结算周期不能为空！")
	private Date balanceDate;

	@NotNull(message = "结算单号不能为空！")
	private String balanceNo;

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

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndtDate() {
		return endtDate;
	}

	public void setEndtDate(Date endtDate) {
		this.endtDate = endtDate;
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

	public String getBalanceNo() {
		return balanceNo;
	}

	public void setBalanceNo(String balanceNo) {
		this.balanceNo = balanceNo;
	}

}
