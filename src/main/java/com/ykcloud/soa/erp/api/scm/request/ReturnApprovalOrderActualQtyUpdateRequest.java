package com.ykcloud.soa.erp.api.scm.request;

import java.util.Date;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;


public class ReturnApprovalOrderActualQtyUpdateRequest extends AbstractUserSessionRequest {

	private static final long serialVersionUID = -434976730896293883L;

	@NotNull(message = "订货门店编号不能为空！")
	private Long subUnitNumId;

	@NotNull(message = "订单日期不能为空！")
	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
	private Date orderDate;

	@NotEmpty(message = "退货订单号不能为空！")
	private String soNumId;

	@NotEmpty(message = "退货审批单号不能为空！")
	private String approvalNumId;

}
