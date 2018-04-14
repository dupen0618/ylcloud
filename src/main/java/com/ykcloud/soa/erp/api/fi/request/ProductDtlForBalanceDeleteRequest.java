package com.ykcloud.soa.erp.api.fi.request;

import javax.validation.constraints.NotNull;
import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;

/**
 * @Description:删除结算单商品明细中的指定项目
 * @author Song
 * @Date 2018年4月4日 下午5:18:14
 */
public class ProductDtlForBalanceDeleteRequest extends AbstractUserSessionRequest {

	private static final long serialVersionUID = 5418678300240637435L;

	@NotNull(message = "行号不能为空！")
	private String series;

	@NotNull(message = "数据源单号不能为空！")
	private String reservedNo;

	@NotNull(message = "结算单号不能为空！")
	private String balanceNo;

	public String getSeries() {
		return series;
	}

	public void setSeries(String series) {
		this.series = series;
	}

	public String getReservedNo() {
		return reservedNo;
	}

	public void setReservedNo(String reservedNo) {
		this.reservedNo = reservedNo;
	}

	public String getBalanceNo() {
		return balanceNo;
	}

	public void setBalanceNo(String balanceNo) {
		this.balanceNo = balanceNo;
	}

}
