package com.ykcloud.soa.erp.api.so.model;

import java.io.Serializable;

/**
 * 申请行号及so_num_id对应列表
 * @author tz.x
 *
 * @date 2018年4月12日上午10:41:17
 */
public class ApplyDetail implements Serializable {

	private static final long serialVersionUID = -7748882591504629790L;
	
	/**
	 * 门店编号
	 */
	private String applyLine;
	
	/**
	 * so单编号
	 */
	private String soNumId;
	
	/**
	 * 生成订单数量
	 */
	private Double orderQty;

	public String getApplyLine() {
		return applyLine;
	}

	public void setApplyLine(String applyLine) {
		this.applyLine = applyLine;
	}

	public String getSoNumId() {
		return soNumId;
	}

	public void setSoNumId(String soNumId) {
		this.soNumId = soNumId;
	}

	public Double getOrderQty() {
		return orderQty;
	}

	public void setOrderQty(Double orderQty) {
		this.orderQty = orderQty;
	}

}
