package com.ykcloud.soa.erp.api.wm.request;

import java.util.Date;
import java.util.List;

import javax.validation.constraints.NotNull;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;
import com.ykcloud.soa.erp.api.wm.model.ApprovalDtlForWriteoffCiteQty;
//退供应商引用负出库单和验收单核销入参
public class CiteQtyForAuditApprovalReturnOrderByBuyerWriteoffRequest extends AbstractRequest {
	private static final long serialVersionUID = 1L;
	
	@NotNull(message="门店编号不能为空")
	private Long subUnitNumId; //门店编号
	
	@NotNull(message="日期不能为空")
	private Date orderDate;     //日期
	
	@NotNull(message="退货审批单号不能为空")
	private String approvalNumId;//退货审批单号
	
	@NotNull(message="退货单明细不能为空")
	private List<ApprovalDtlForWriteoffCiteQty> approvalDtls;  //退货单明细

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

	public List<ApprovalDtlForWriteoffCiteQty> getApprovalDtls() {
		return approvalDtls;
	}

	public void setApprovalDtls(List<ApprovalDtlForWriteoffCiteQty> approvalDtls) {
		this.approvalDtls = approvalDtls;
	}
	
	

}
