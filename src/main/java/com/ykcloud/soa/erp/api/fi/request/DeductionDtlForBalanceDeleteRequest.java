package com.ykcloud.soa.erp.api.fi.request;

import javax.validation.constraints.NotNull;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

/**
 * @Description:删除结算单扣款明细中的指定项目
 * @author Song
 * @Date 2018年4月4日 下午5:19:40
 */
public class DeductionDtlForBalanceDeleteRequest extends AbstractRequest {

	private static final long serialVersionUID = 5602269731920270845L;

	@NotNull(message = "行号不能为空！")
	private Long series;
	
	@NotNull(message = "数据源单号不能为空！")
	private Long reservedNo;
	
	@NotNull(message = "结算单号不能为空！")
	private Long balanceNo;
	
	@NotNull(message = "操作人ID不能为空！")
	private Long createUserId;

	public Long getSeries() {
		return series;
	}

	public void setSeries(Long series) {
		this.series = series;
	}

	public Long getReservedNo() {
		return reservedNo;
	}

	public void setReservedNo(Long reservedNo) {
		this.reservedNo = reservedNo;
	}

	public Long getBalanceNo() {
		return balanceNo;
	}

	public void setBalanceNo(Long balanceNo) {
		this.balanceNo = balanceNo;
	}

	public Long getCreateUserId() {
		return createUserId;
	}

	public void setCreateUserId(Long createUserId) {
		this.createUserId = createUserId;
	}
	
}
