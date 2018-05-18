package com.ykcloud.soa.erp.api.fi.request;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;
import com.ykcloud.soa.erp.api.fi.model.BalanceDtlAppoint;

import java.util.Date;
import java.util.List;

/**
 * @Description:选择指定验收入库单明细项目生成结算明细
 * @author ali
 * @Date 2018年4月4日 下午5:20:28
 */
public class AppointBalanceDtlGenerateRequest extends AbstractUserSessionRequest {
	private static final long serialVersionUID = 3737818551885038156L;
	private List<BalanceDtlAppoint> balanceDtlAppoints;
	@NotNull(message = "结算单号不能为空！")
	private String balanceNo;
	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
	@NotNull(message = "结算日期不能为空！")
	private Date balanceDate;
	@NotNull(message = "门店编号不能为空！")
	private Long subUnitNumId;

	public List<BalanceDtlAppoint> getBalanceDtlAppoints() {
		return balanceDtlAppoints;
	}

	public void setBalanceDtlAppoints(List<BalanceDtlAppoint> balanceDtlAppoints) {
		this.balanceDtlAppoints = balanceDtlAppoints;
	}

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
}
