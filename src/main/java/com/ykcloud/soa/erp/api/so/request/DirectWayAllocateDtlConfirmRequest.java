package com.ykcloud.soa.erp.api.so.request;

import java.util.Date;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;

/**
 * @description 直通分拨单及分配单确认入参
 * @author tz.x
 * @date 2018年4月27日下午2:27:44
 */
public class DirectWayAllocateDtlConfirmRequest extends AbstractUserSessionRequest {

	private static final long serialVersionUID = 8987243315624324453L;
	
	@NotNull(message = "销售门店编号不能为空！")
    private Long subUnitNumId;

    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @NotNull(message = "销售日期不能为空！")
    private Date orderDate;
    
    @NotEmpty(message = "验收单号不能为空！")
    private String receiptNo;
    
    @NotNull(message = "是否强制审核标识不能为空！")
    private Long forceSign;

	public Long getForceSign() {
		return forceSign;
	}

	public void setForceSign(Long forceSign) {
		this.forceSign = forceSign;
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

	public String getReceiptNo() {
		return receiptNo;
	}

	public void setReceiptNo(String receiptNo) {
		this.receiptNo = receiptNo;
	}

}
