package com.ykcloud.soa.erp.api.scm.request;

import java.util.Date;
import java.util.List;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;
import com.ykcloud.soa.erp.api.scm.model.CiteDtl;
//依引用负出库单及验收单生成退货审批单单身入参
public class ReturnApprovalOrderDtlByCiteQtyGenerateRequest extends AbstractUserSessionRequest {

	private static final long serialVersionUID = 1L;
	@NotNull(message="退货门店/仓库编号不能为空")
	private Long subUnitNumId;     //退货门店编号（总仓门店）
	
	@NotNull(message="日期不能为空")
	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
	private Date orderDate;    //日期
	
	@NotNull(message="退货审批单编号不能为空")
	private String approvalNumId;  //退货审批单编号
	
	@NotNull(message="商品明细不能为空")
	private List<CiteDtl> citeDtls; //应用商品明细

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

	public List<CiteDtl> getCiteDtls() {
		return citeDtls;
	}

	public void setCiteDtls(List<CiteDtl> citeDtls) {
		this.citeDtls = citeDtls;
	}
	
	
	

}
