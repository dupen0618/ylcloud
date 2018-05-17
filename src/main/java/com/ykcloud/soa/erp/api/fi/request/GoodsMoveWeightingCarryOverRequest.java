package com.ykcloud.soa.erp.api.fi.request;

import java.util.Date;

import javax.validation.constraints.NotNull;

import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;

/**
 * @ClassName: GoodsMoveWeightingCarryOverRequest.java
 * @Description: 商品移动加权权重表 结转
 * @version: v1.0.0
 * @author: fred.zhao
 * @date: 2018年5月16日 上午10:39:17
 */
public class GoodsMoveWeightingCarryOverRequest extends AbstractUserSessionRequest {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@NotNull(message = "门店编号不能为空！")
	private Long subUnitNumId;

	@NotNull(message = "结算日期不能为空！")
	private Date balanceDate;

	public Long getSubUnitNumId() {
		return subUnitNumId;
	}

	public void setSubUnitNumId(Long subUnitNumId) {
		this.subUnitNumId = subUnitNumId;
	}

	public Date getBalanceDate() {
		return balanceDate;
	}

	public void setBalanceDate(Date balanceDate) {
		this.balanceDate = balanceDate;
	}

}
