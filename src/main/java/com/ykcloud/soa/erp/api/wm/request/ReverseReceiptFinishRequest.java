package com.ykcloud.soa.erp.api.wm.request;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;

/**
 * 
 * @author gaoyun.shen
 *
 * @date 2018年4月18日 下午8:24:56
 * 
 * @Description 返配、行政领料退库收货完成入参
 */
public class ReverseReceiptFinishRequest extends AbstractUserSessionRequest {
	private static final long serialVersionUID = 3553260953450156896L;

	@NotNull(message="门店编号不能为空!")
	private Long subUnitNumId;//门店编号
	
	@NotEmpty(message="验收单号不能为空!")
	private String reservedNo;//验收单编号
	
	@NotNull(message="短收校验标识不能为空!")
	private Long receiptSign;//短收校验标识 value {0 :不验证短收, 1 :验证短收}
	public String getReservedNo() {
		return reservedNo;
	}
	public void setReservedNo(String reservedNo) {
		this.reservedNo = reservedNo;
	}
	public Long getReceiptSign() {
		return receiptSign;
	}
	public void setReceiptSign(Long receiptSign) {
		this.receiptSign = receiptSign;
	}
	public Long getSubUnitNumId() {
		return subUnitNumId;
	}
	public void setSubUnitNumId(Long subUnitNumId) {
		this.subUnitNumId = subUnitNumId;
	}
	

}
