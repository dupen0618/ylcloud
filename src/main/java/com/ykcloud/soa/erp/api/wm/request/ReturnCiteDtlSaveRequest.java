package com.ykcloud.soa.erp.api.wm.request;

import java.util.Date;
import java.util.List;

import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;
import com.ykcloud.soa.erp.api.scm.model.CiteDtl;
//保存明细表
public class ReturnCiteDtlSaveRequest extends AbstractUserSessionRequest {
	private static final long serialVersionUID = 1L;

	private List<CiteDtl> citeDtls;  
	
	private Long subUnitNumId; //门店编号
	
	private Date orderDate;  //日期
	
	private String approvalNumId; //审批单号


	public List<CiteDtl> getCiteDtls() {
		return citeDtls;
	}

	public void setCiteDtls(List<CiteDtl> citeDtls) {
		this.citeDtls = citeDtls;
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
