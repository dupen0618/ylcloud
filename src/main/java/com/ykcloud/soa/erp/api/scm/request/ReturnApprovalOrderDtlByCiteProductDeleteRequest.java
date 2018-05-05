package com.ykcloud.soa.erp.api.scm.request;

import java.util.Date;
import java.util.List;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.gb.soa.omp.ccommon.api.request.AbstractRequest;
import com.ykcloud.soa.erp.api.scm.model.CiteDtl;
//删除指定商品引用负出库单及验收单、退货审批单单身
public class ReturnApprovalOrderDtlByCiteProductDeleteRequest extends AbstractRequest {
		private static final long serialVersionUID = 1L;
		
		@NotNull(message="总仓编号不能为空")
		private Long subUnitNumId;  //退货门店编号（总仓门店）
		
		@NotNull(message="日期不能为空")
		@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
		private Date orderDate;    //日期
		
		@NotNull(message="退货审批单号")
		private String approvalNumId;  //退货审批单号
		
		@NotNull(message="商品编号不能为空")
		private List<Long> itemNumIds; //商品编号

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
