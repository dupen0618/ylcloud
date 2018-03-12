package com.ykcloud.soa.erp.api.scm.request;

import java.util.Date;

import javax.validation.constraints.NotNull;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

/**
*每日产生门店、商品类别补货参考数量 方法请求类
@author hank.zhu
@date 2018年3月11日 上午3:49:17 新建
**/
public class ShopProductDemandGenerateQtyRequest extends AbstractRequest {
	private static final long serialVersionUID = 1L;
	
	@NotNull(message="门店编号不能为空！")
	private Long subUnitNumId;
	
	@NotNull(message="订单日期布恩那个为空！")
	private Date orderDate;

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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
