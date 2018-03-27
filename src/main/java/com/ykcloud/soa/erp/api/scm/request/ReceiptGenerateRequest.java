package com.ykcloud.soa.erp.api.scm.request;

import java.util.Date;

import javax.validation.constraints.NotNull;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

/**
 * 形成验收单入参
 * @author tz.x
 *
 * @date 2018年3月22日下午5:36:25
 */
public class ReceiptGenerateRequest extends AbstractRequest {

	private static final long serialVersionUID = -2262099624185318920L;
	
	/**
	 * 门店编号
	 */
	@NotNull(message = "门店编号不能为空！")
	private Long subUnitNumId;
	
	/**
	 * 订单日期 格式：yyyy-mm-dd
	 */
	@NotNull(message = "订单日期不能为空！")
	private Date orderDate;
	
	/**
	 * 采购单号
	 */
	@NotNull(message = "采购单号不能为空！")
	private String poNumId;
	
	/**
	 * 产生类型
	 * 1:直送自动产生 2:供应商确认
	 */
	@NotNull(message = "产生类型不能为空！")
	private Long generateType;
	
	/**
	 * 供应商确认送货日期,generate_type为2时必须传入
	 */
	private Date confirmDeliveryDate;

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

	public String getPoNumId() {
		return poNumId;
	}

	public void setPoNumId(String poNumId) {
		this.poNumId = poNumId;
	}

	public Long getGenerateType() {
		return generateType;
	}

	public void setGenerateType(Long generateType) {
		this.generateType = generateType;
	}

	public Date getConfirmDeliveryDate() {
		return confirmDeliveryDate;
	}

	public void setConfirmDeliveryDate(Date confirmDeliveryDate) {
		this.confirmDeliveryDate = confirmDeliveryDate;
	}

}
