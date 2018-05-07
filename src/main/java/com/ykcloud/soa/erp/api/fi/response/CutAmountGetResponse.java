package com.ykcloud.soa.erp.api.fi.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;

/**
 * 获取门店、供应别未扣费用
 * @author tz.x
 * @date 2018年5月5日下午5:55:23
 */
public class CutAmountGetResponse extends MessagePack {

	private static final long serialVersionUID = -3660008938297799L;
	
	/**
	 * 未扣费用金额
	 */
	private Double cutAmount;

	public Double getCutAmount() {
		return cutAmount;
	}

	public void setCutAmount(Double cutAmount) {
		this.cutAmount = cutAmount;
	}

}
