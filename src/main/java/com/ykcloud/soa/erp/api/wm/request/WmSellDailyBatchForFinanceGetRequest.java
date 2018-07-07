package com.ykcloud.soa.erp.api.wm.request;

import java.util.Date;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

public class WmSellDailyBatchForFinanceGetRequest extends AbstractRequest{

	/**
	 * 
	 */
	private static final long serialVersionUID = 861764332079987504L;
	
	@NotNull(message = "门店编号不能为空!")
	private Long subUnitNumId;
	
	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
	@NotNull(message = "日结日期不能为空!")
	private Date orderDate;
	
	@NotNull(message = "分页开始位置不能为空!")
	private Long from ;
	
	@NotNull(message = "分页条数不能为空!")
	private Long limit;
	
	@NotNull(message = "统计标识不能为空!")
	private Long isCount;//是否是统计查询0不是,1是
	

	public Long getIsCount() {
		return isCount;
	}

	public void setIsCount(Long isCount) {
		this.isCount = isCount;
	}

	public Long getFrom() {
		return from;
	}

	public void setFrom(Long from) {
		this.from = from;
	}

	public Long getLimit() {
		return limit;
	}

	public void setLimit(Long limit) {
		this.limit = limit;
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
