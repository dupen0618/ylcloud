package com.ykcloud.soa.erp.api.scm.request;

import java.util.Date;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

/**
 * 为产生验收单获取采购单头、单身、供应商协同单身信息入参
 * @author tz.x
 *
 * @date 2018年3月27日下午2:13:24
 * @see
 */
public class PoForGenerateReceiptGetRequest extends AbstractRequest {

	private static final long serialVersionUID = -5263386150358402518L;
	
	/**
	 * 门店编号
	 */
	@NotNull(message = "门店编号不能为空！")
	private Long subUnitNumId;
	
	/**
	 * 订单日期 格式：yyyy-mm-dd
	 */
	//@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
	@JsonFormat(pattern = "yyyy-MM-dd")
	@NotNull(message = "订单日期不能为空！")
	private Date orderDate;
	
	/**
	 * 采购单号
	 */
	@NotNull(message = "采购单号不能为空！")
	private String poNumId;
	
	/**
	 * 产生类别
	 */
	@NotNull(message = "产生类别不能为空！")
	private Long generateType;

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

}
