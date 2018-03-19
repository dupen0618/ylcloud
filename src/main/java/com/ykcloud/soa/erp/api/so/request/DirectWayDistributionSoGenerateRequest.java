package com.ykcloud.soa.erp.api.so.request;

import java.util.Date;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.gb.soa.omp.ccommon.api.annotation.ApiField;
import com.gb.soa.omp.ccommon.api.request.AbstractRequest;
//直通收货按验收单及订货审批单产生分拨单入参类
public class DirectWayDistributionSoGenerateRequest extends AbstractRequest {
	
	private static final long serialVersionUID = 1L;
	
	@NotNull(message="门店编号不能为空！")
	private  Long subUnitNumId;   //门店编号
	
	@NotEmpty(message="验收单编号不能为空！")
	private  String receiptNo;     //验收单编号
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
	@NotNull(message = "供应商确认日期不能为空！")
	private Date supConfirmDate;
	
	@ApiField(description="重复产生标识,0:第一次产生1:删除已产生so,重新产生")
	private  Long againSign=0L;    
	
	public Long getSubUnitNumId() {
		return subUnitNumId;
	}

	public String getReceiptNo() {
		return receiptNo;
	}

	public void setReceiptNo(String receiptNo) {
		this.receiptNo = receiptNo;
	}

	public Date getSupConfirmDate() {
		return supConfirmDate;
	}

	public void setSupConfirmDate(Date supConfirmDate) {
		this.supConfirmDate = supConfirmDate;
	}

	public Long getAgainSign() {
		return againSign;
	}

	public void setAgainSign(Long againSign) {
		this.againSign = againSign;
	}

	public void setSubUnitNumId(Long subUnitNumId) {
		this.subUnitNumId = subUnitNumId;
	}
	
	
	
}
