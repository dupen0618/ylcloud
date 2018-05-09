package com.ykcloud.soa.erp.api.scm.request;

import java.util.Date;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.gb.soa.omp.ccommon.api.annotation.ApiField;
import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;

/**
*Po完成方法请求类
@author hank.zhu
@date 2018年4月18日 上午11:40:36 新建
**/
public class PoFinishRequest extends AbstractUserSessionRequest {
	private static final long serialVersionUID = -875614724445219444L;
	
	@ApiField(description = "门店编号")
	@NotNull(message = "门店编号不能为空!")
	private Long subUnitNumId;
	
	@ApiField(description = "采购单号")
	@NotNull(message = "采购单号不能为空!")
	private String poNumId;
	
	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
	@NotNull(message = "订单日期不能为空")
	private Date orderDate; // 订单日期


//	@ApiField(description = "用户ID")
//	@NotNull(message = "用户ID不能为空!")
//	private Long userNumId;

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

//	public Long getUserNumId() {
//		return userNumId;
//	}
//	public void setUserNumId(Long userNumId) {
//		this.userNumId = userNumId;
//	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	
}
