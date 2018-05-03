package com.ykcloud.soa.erp.api.wm.request;

import java.util.Date;

import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;
import com.ykcloud.soa.erp.api.scm.model.CiteDtl;
//保存明细表
public class ReturnCiteDtlSaveRequest extends AbstractUserSessionRequest {
	private static final long serialVersionUID = 1L;

	private CiteDtl citeDtl;  
	
	private Long subUnitNumId; //门店编号
	
	private Date orderDate;  //日期
	
	private String approvalNumId; //审批单号

	public CiteDtl getCiteDtl() {
		return citeDtl;
	}

	public void setCiteDtl(CiteDtl citeDtl) {
		this.citeDtl = citeDtl;
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

	public String getApprovalNumId() {
		return approvalNumId;
	}

	public void setApprovalNumId(String approvalNumId) {
		this.approvalNumId = approvalNumId;
	}
	
	

}
