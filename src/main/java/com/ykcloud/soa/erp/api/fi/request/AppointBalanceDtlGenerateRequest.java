package com.ykcloud.soa.erp.api.fi.request;

import javax.validation.constraints.NotNull;
import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;
import com.ykcloud.soa.erp.api.fi.model.BalanceDtlAppoint;

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
}
