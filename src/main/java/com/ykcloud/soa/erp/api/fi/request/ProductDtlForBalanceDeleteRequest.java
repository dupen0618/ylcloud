package com.ykcloud.soa.erp.api.fi.request;

import javax.validation.constraints.NotNull;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

/**
 * @Description:删除结算单商品明细中的指定项目
 * @author Song
 * @Date 2018年4月4日 下午5:18:14
 */
public class ProductDtlForBalanceDeleteRequest extends AbstractRequest {

	private static final long serialVersionUID = 5418678300240637435L;
	
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
