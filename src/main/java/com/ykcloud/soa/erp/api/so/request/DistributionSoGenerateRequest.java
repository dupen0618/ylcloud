package com.ykcloud.soa.erp.api.so.request;

import java.util.Date;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.NotEmpty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.gb.soa.omp.ccommon.api.annotation.ApiField;
import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

//配送产生分拨单入参类
public class DistributionSoGenerateRequest extends AbstractRequest {

	private static final long serialVersionUID = 1L;

	@NotNull(message = "门店编号不能为空！")
	@ApiField(description = "门店编号")
	private Long subUnitNumId;

	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
	@NotNull(message = "订单日期不能为空！")
	@ApiField(description = "订单日期")
	private Date orderDate;

	@NotEmpty(message = "配送审批单单号不能为空！")
	@ApiField(description = "配送审批单单号")
	private String approvalNumId;

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

	public Long getSubUnitNumId() {
		return subUnitNumId;
	}

	
}
