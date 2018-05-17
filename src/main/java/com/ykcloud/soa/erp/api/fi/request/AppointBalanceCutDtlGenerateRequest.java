package com.ykcloud.soa.erp.api.fi.request;

import javax.validation.constraints.NotNull;
import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;
import com.ykcloud.soa.erp.api.fi.model.AppointBalanceCut;

import java.util.List;

/**
 * @Description:选择指定扣款项明细项目生成结算明细
 * @author Song
 * @Date 2018年4月4日 下午5:21:30
 */
public class AppointBalanceCutDtlGenerateRequest extends AbstractUserSessionRequest {

	private static final long serialVersionUID = 8338043862824578275L;

	private List<AppointBalanceCut> appointBalanceCuts;
	@NotNull(message = "结算单号不能为空！")
	private String balanceNo;
	@NotNull(message = "门店不能为空！")
	private Long subUnitNumId;

	public List<AppointBalanceCut> getAppointBalanceCuts() {
		return appointBalanceCuts;
	}

	public void setAppointBalanceCuts(List<AppointBalanceCut> appointBalanceCuts) {
		this.appointBalanceCuts = appointBalanceCuts;
	}

	public String getBalanceNo() {
		return balanceNo;
	}

	public void setBalanceNo(String balanceNo) {
		this.balanceNo = balanceNo;
	}

	public Long getSubUnitNumId() {
		return subUnitNumId;
	}

	public void setSubUnitNumId(Long subUnitNumId) {
		this.subUnitNumId = subUnitNumId;
	}
}
