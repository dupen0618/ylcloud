package com.ykcloud.soa.erp.api.fi.request;

import javax.validation.constraints.NotNull;
import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;

import java.util.List;

/**
 * @Description:选择指定扣款项明细项目生成结算明细
 * @author Song
 * @Date 2018年4月4日 下午5:21:30
 */
public class BalanceDtlByDeductionGenerateRequest extends AbstractUserSessionRequest {

	private static final long serialVersionUID = 8338043862824578275L;

	@NotNull(message = "行号不能为空！")
	private List<String> seriess;

	@NotNull(message = "结算单号不能为空！")
	private String balanceNo;

	public List<String> getSeriess() {
		return seriess;
	}

	public void setSeriess(List<String> seriess) {
		this.seriess = seriess;
	}

	public String getBalanceNo() {
		return balanceNo;
	}

	public void setBalanceNo(String balanceNo) {
		this.balanceNo = balanceNo;
	}

}
