package com.ykcloud.soa.erp.api.wm.request;

import java.util.Date;
import java.util.List;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.gb.soa.omp.ccommon.api.request.AbstractRequest;
import com.ykcloud.soa.erp.api.scm.model.CiteDtl;
//删除指定商品引用负出库单及验收单
public class ReturnCiteDtlByCiteProductDeleteRequest extends AbstractRequest {

	private static final long serialVersionUID = 6660472995585236101L;
	
		@NotNull(message="退货门店编号（总仓门店)不能为空")
		private Long subUnitNumId;   //退货门店编号（总仓门店）
		
		@NotNull(message="日期不能为空")
		@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
		private Date orderDate;
		
		@NotNull(message="退货审批单单号不能为空")
		private String approvalNumId;
		
		@NotNull(message="商品编号不能为空")
		private List<Long> itemNumIds;

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

		public List<Long> getItemNumIds() {
			return itemNumIds;
		}

		public void setItemNumIds(List<Long> itemNumIds) {
			this.itemNumIds = itemNumIds;
		}

		

		
		
		
	
	

}
