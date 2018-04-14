package com.ykcloud.soa.erp.api.fi.request;

import java.util.Date;
import javax.validation.constraints.NotNull;
import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;

/**
 * @Description:刷新扣款项
 * @author Song
 * @Date 2018年4月4日 下午2:50:06
 */
public class SupplyByBalanceDeductionFlushRequest extends AbstractUserSessionRequest {

	private static final long serialVersionUID = 4627685577873375711L;
	
	@NotNull(message = "门店编号不能为空！")
	private Long subUnitNumId;
	
	@NotNull(message = "供应商编号不能为空！")
	private Long unitNumId;

	@NotNull(message = "开始日期不能为空！")
	private Date startDate;

	@NotNull(message = "截止日期不能为空！")
	private Date endDate;
	
	/*@NotNull(message = "经营方式不能为空！")
	private Long settlementType;
	
	@NotNull(message = "结算周期不能为空！")
	private Date balanceDate;*/
	
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
/*	public Long getSettlementType() {
		return settlementType;
	}

	public void setSettlementType(Long settlementType) {
		this.settlementType = settlementType;
	}

	public Long getBalanceDate() {
		return balanceDate;
	}

	public void setBalanceDate(Long balanceDate) {
		this.balanceDate = balanceDate;
	}*/

	public String getBalanceNo() {
		return balanceNo;
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

	public void setBalanceNo(Long balanceNo) {
		this.balanceNo = balanceNo;
	}


	
}
