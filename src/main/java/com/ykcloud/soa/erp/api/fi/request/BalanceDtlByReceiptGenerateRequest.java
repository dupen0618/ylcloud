package com.ykcloud.soa.erp.api.fi.request;

import javax.validation.constraints.NotNull;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

/**
 * @Description:选择指定验收入库单明细项目生成结算明细
 * @author Song
 * @Date 2018年4月4日 下午5:20:28
 */
public class BalanceDtlByReceiptGenerateRequest extends AbstractRequest {

	private static final long serialVersionUID = 3737818551885038156L;

	@NotNull(message = "验收单号不能为空！")
	private String reservedNo;

	@NotNull(message = "行号不能为空！")
	private String series;

	@NotNull(message = "结算单号不能为空！")
	private String balanceNo;

	public String getReservedNo() {
		return reservedNo;
	}

	public void setReservedNo(String reservedNo) {
		this.reservedNo = reservedNo;
	}

	public String getSeries() {
		return series;
	}

	public void setSeries(String series) {
		this.series = series;
	}

	public String getBalanceNo() {
		return balanceNo;
	}

	public void setBalanceNo(String balanceNo) {
		this.balanceNo = balanceNo;
	}

}
