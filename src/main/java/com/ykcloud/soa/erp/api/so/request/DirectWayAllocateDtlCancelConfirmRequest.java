package com.ykcloud.soa.erp.api.so.request;

import java.util.Date;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;

/**
 * @description 直通分拨单及分配单取消确认入参
 * @author tz.x
 * @date 2018年4月27日上午9:23:20
 */
public class DirectWayAllocateDtlCancelConfirmRequest extends AbstractUserSessionRequest {

	private static final long serialVersionUID = 1297595765240100564L;
	
	@NotNull(message = "销售门店编号不能为空！")
    private Long subUnitNumId;

    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @NotNull(message = "销售日期不能为空！")
    private Date orderDate;
    
    @NotEmpty(message = "验收单号不能为空！")
    private String receiptNo;

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
