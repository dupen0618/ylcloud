package com.ykcloud.soa.erp.api.so.request;

import java.util.Date;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;
//制单确认（仓间调拨、委外分解领用、政领料领用)的入参
public class SoApplyByAuthorConfirmRequest extends AbstractUserSessionRequest {
	    
		@NotNull(message="门店编号不能为空")
		private Long subUnitNumId;  //门店编号
		
		@NotNull(message="日期不能为空")
		@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
		private Date orderDate;    //日期
		
		@NotNull(message="申请单单号不能为空")
		private String applyNumId;

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
