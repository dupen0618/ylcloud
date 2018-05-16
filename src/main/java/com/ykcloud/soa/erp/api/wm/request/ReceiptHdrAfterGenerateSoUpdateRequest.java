package com.ykcloud.soa.erp.api.wm.request;

import java.util.Date;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.gb.soa.omp.ccommon.api.annotation.ApiField;
import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;

/**
 * 产生分拨单后回写验收单状态为2 供应商已确认
 * @author tz.x
 * @date 2018年5月16日上午10:11:42
 */
public class ReceiptHdrAfterGenerateSoUpdateRequest extends AbstractUserSessionRequest {

	private static final long serialVersionUID = -7276393188457053753L;
	
	@NotNull(message = "门店编号不能为空!")
	private Long subUnitNumId;
	
	@NotEmpty(message = "采购单号不能为空!")
	private String poNumId;
	
	@ApiField(description = "验收单号")
	@NotNull(message = "验收单号不能为空!")
	private String reservedNo;
	
	@NotNull(message = "订货日期不能为空！")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date orderDate;
	
	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public Long getSubUnitNumId() {
		return subUnitNumId;
	}

	public void setSubUnitNumId(Long subUnitNumId) {
		this.subUnitNumId = subUnitNumId;
	}

	public String getPoNumId() {
		return poNumId;
	}

	public void setPoNumId(String poNumId) {
		this.poNumId = poNumId;
	}

	public String getReservedNo() {
		return reservedNo;
	}

	public void setReservedNo(String reservedNo) {
		this.reservedNo = reservedNo;
	}

}
