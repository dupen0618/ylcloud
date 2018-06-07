package com.ykcloud.soa.erp.api.so.request;

import java.util.Date;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

public class VoucherNumIdUpdateRequest extends AbstractRequest {

	private static final long serialVersionUID = 1L;
	
	@NotNull(message="门店编号不能为空")
	private Long subUnitNumId;   //门店
	
	@NotNull(message="单据日期不能为空")
	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
	private Date orderDate;      //订单日期
	
	@NotNull(message="单据编号不能为空")
	private String reservedNo;  //  单据编号
	
	@NotNull(message="单据类型不能为空")
	private Long billType;     //单据类别
	
	@NotNull(message="凭证单号不能为空")
	private String voucherNumId; //凭证单号

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

	public String getReservedNo() {
		return reservedNo;
	}

	public void setReservedNo(String reservedNo) {
		this.reservedNo = reservedNo;
	}

	public Long getBillType() {
		return billType;
	}

	public void setBillType(Long billType) {
		this.billType = billType;
	}

	public String getVoucherNumId() {
		return voucherNumId;
	}

	public void setVoucherNumId(String voucherNumId) {
		this.voucherNumId = voucherNumId;
	}
	
	

}
