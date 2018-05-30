package com.ykcloud.soa.erp.api.scm.request;

import java.util.Date;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.gb.soa.omp.ccommon.api.request.AbstractRequest;
//根据退货申请单查询退货审批单
public class ReturnApprovalNumIdByApplyNumIdGetRequest extends AbstractRequest {
	private static final long serialVersionUID = 1L;
	
	@NotNull(message="门店编号不能为空")
	private Long subUnitNumId;    //门店
	
	@NotNull(message="日期不能为空")
	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
	private Date orderDate;     //日期
	
	@NotNull(message="申请单号不能为空")
	private String applyNumId;  //申请单号

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

	public String getApplyNumId() {
		return applyNumId;
	}

	public void setApplyNumId(String applyNumId) {
		this.applyNumId = applyNumId;
	}
	
	

}
