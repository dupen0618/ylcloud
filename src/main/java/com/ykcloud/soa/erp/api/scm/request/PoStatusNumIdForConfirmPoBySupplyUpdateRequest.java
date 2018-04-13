package com.ykcloud.soa.erp.api.scm.request;

import java.util.Date;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;

/**
 * 更新采购单状态为供应商已确认（直送供应商确认生成验收单后或直通供应商确认生成验证单及分拨单后）入参
 * @author tz.x
 *
 * @date 2018年3月28日下午5:41:46
 * @see
 */
public class PoStatusNumIdForConfirmPoBySupplyUpdateRequest extends AbstractUserSessionRequest {

	private static final long serialVersionUID = 8657407766505135934L;
	
	/**
	 * 产生类型
	 * 1:直送自动产生 2:供应商确认
	 */
	@NotNull(message = "产生类型不能为空！")
	private Long generateType;
	
	/**
	 * 门店编号
	 */
	@NotNull(message = "门店编号不能为空！")
	private Long subUnitNumId;
	
	/**
	 * 订单日期 格式：yyyy-mm-dd
	 */
	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
	@NotNull(message = "订单日期不能为空！")
	private Date orderDate;
	
	/**
	 * 采购单号
	 */
	@NotNull(message = "采购单号不能为空！")
	private String poNumId;

	public Long getGenerateType() {
		return generateType;
	}

	public void setGenerateType(Long generateType) {
		this.generateType = generateType;
	}

	public String getPoNumId() {
		return poNumId;
	}

	public void setPoNumId(String poNumId) {
		this.poNumId = poNumId;
	}

	public Long getSubUnitNumId() {
		return subUnitNumId;
	}

	public void setSubUnitNumId(Long subUnitNumId) {
		this.subUnitNumId = subUnitNumId;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

}
