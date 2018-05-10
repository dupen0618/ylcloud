package com.ykcloud.soa.erp.api.scm.request;

import javax.validation.constraints.NotNull;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

/**
 * 获取生鲜标识的入参类
 * 
 * @author 14540
 *
 */

public class ProductFdcSignBySupplyNumIdAndPty3NumIdGetRequest extends AbstractRequest {
	private static final long serialVersionUID = 1L;

	@NotNull(message = "供应商编号不能为空！")
	private Long supplyUnitNumId; // 供应商编号

	@NotNull(message = "商品小类编号不能为空！")
	private Long pty3NumId; // 商品小类

	public Long getSupplyUnitNumId() {
		return supplyUnitNumId;
	}

	public void setSupplyUnitNumId(Long supplyUnitNumId) {
		this.supplyUnitNumId = supplyUnitNumId;
	}

	public Long getPty3NumId() {
		return pty3NumId;
	}

	public void setPty3NumId(Long pty3NumId) {
		this.pty3NumId = pty3NumId;
	}

}