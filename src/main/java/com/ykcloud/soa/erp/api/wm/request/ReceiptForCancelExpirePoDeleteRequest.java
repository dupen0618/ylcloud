package com.ykcloud.soa.erp.api.wm.request;

import java.util.Date;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

/**
 * @author tz.x
 * @date 2018年5月12日上午9:23:38
 */
public class ReceiptForCancelExpirePoDeleteRequest extends AbstractRequest {
	
	private static final long serialVersionUID = 6059858611937451816L;

	@NotNull(message = "门店编号不能为空!")
	private Long subUnitNumId;
	
	@NotEmpty(message = "验收单号不能为空!")
	private String reservedNo;
	
    @NotNull(message = "订货日期不能为空！")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date orderDate;

	public Long getSubUnitNumId() {
		return subUnitNumId;
	}

	public void setSubUnitNumId(Long subUnitNumId) {
		this.subUnitNumId = subUnitNumId;
	}

	public String getReservedNo() {
		return reservedNo;
	}

	public void setReservedNo(String reservedNo) {
		this.reservedNo = reservedNo;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

}
