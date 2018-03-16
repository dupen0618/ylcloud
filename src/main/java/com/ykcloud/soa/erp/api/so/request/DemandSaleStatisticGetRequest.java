package com.ykcloud.soa.erp.api.so.request;

import java.util.Date;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.gb.soa.omp.ccommon.api.request.AbstractRequest;
/**
 * 查询销售单据的入参类
 * @author 14540
 *
 */
public class DemandSaleStatisticGetRequest extends AbstractRequest {
	@NotNull(message="门店编号不能为空!")
	private  Long subUnitNumId;   //门店编号
	@NotNull(message="商品编号不能为空!")
	private  Long itemNumId;     //商品编号
	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
	@NotNull(message = "日期不能为空！")
	private  Date orderDate;   //订单日期

	public Long getSubUnitNumId() {
		return subUnitNumId;
	}

	public void setSubUnitNumId(Long subUnitNumId) {
		this.subUnitNumId = subUnitNumId;
	}

	public Long getItemNumId() {
		return itemNumId;
	}

	public void setItemNumId(Long itemNumId) {
		this.itemNumId = itemNumId;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}	

}
