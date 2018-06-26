package com.ykcloud.soa.erp.api.scm.request;


import org.hibernate.validator.constraints.NotBlank;
import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;

/**
 * 进价调整审核
 * @author tz.x
 * @date 2018年6月26日上午11:23:13
 */
public class ChangeCostAuditRequest extends AbstractUserSessionRequest {

	private static final long serialVersionUID = 4670986431124069622L;
	
	@NotBlank(message = "供应商单据不能为空！")
	private String reservedNo;

	public String getReservedNo() {
		return reservedNo;
	}

	public void setReservedNo(String reservedNo) {
		this.reservedNo = reservedNo;
	}


}
