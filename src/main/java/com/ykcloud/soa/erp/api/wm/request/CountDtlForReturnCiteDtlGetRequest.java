package com.ykcloud.soa.erp.api.wm.request;

import java.util.Date;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

//查询引用明细表体中数量
public class CountDtlForReturnCiteDtlGetRequest extends AbstractRequest {
	private static final long serialVersionUID = 1L;
	
	
		@NotNull(message = "门店编号不能为空")
		private Long subUnitNumId;  //门店编号
		
		@NotNull(message="日期不能为空")
		@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
		private Date orderDate;
	
		@NotNull(message="审批单号不能为空")
		private String approvalNumId; //审批单号

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

		public String getApprovalNumId() {
			return approvalNumId;
		}

		public void setApprovalNumId(String approvalNumId) {
			this.approvalNumId = approvalNumId;
		}

		
		
	
}
