package com.ykcloud.soa.erp.api.wm.request;

import javax.validation.constraints.NotNull;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

/**
 * 取指定采购单的供应商确认日期及验收入库汇总单状态入参
 * @author tz.x
 *
 * @date 2018年3月26日下午1:58:12
 */
public class ReceiptSupConfirmDateAndStatusNumIdByPoNumIdRequest extends AbstractRequest {
	
	private static final long serialVersionUID = 4148418378983020629L;

	/**
	 * 门店编号
	 */
	@NotNull(message = "门店编号不能为空!")
	private Long subUnitNumId;   
	
	/**
	 * 采购单号
	 */
	@NotNull(message = "采购单号不能为空!")
	private String poNumId;

	public Long getSubUnitNumId() {
		return subUnitNumId;
	}

	public void setSubUnitNumId(Long subUnitNumId) {
		this.subUnitNumId = subUnitNumId;
	}

	public String getPoNumId() {
		return poNumId;
	}

	public void setPoNumId(String poNumId) {
		this.poNumId = poNumId;
	}

}
