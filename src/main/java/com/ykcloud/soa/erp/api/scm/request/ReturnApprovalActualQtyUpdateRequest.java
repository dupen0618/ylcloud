package com.ykcloud.soa.erp.api.scm.request;

import java.util.Date;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

//退货so单回写退货申请单实际发货数量
public class ReturnApprovalActualQtyUpdateRequest extends AbstractRequest {

	private static final long serialVersionUID = 1L;

	private String soNumId; // 退货单单号

	private Long subUnitNumId; // 门店编号

	private Date orderDate; // 日期

	private Long soTypeNumId;// 9,10,11

	private Long custSubUnitNumId;// 直送为0，直通、配送为总部门店

	public String getSoNumId() {
		return soNumId;
	}

	public void setSoNumId(String soNumId) {
		this.soNumId = soNumId;
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

	public Long getSoTypeNumId() {
		return soTypeNumId;
	}

	public void setSoTypeNumId(Long soTypeNumId) {
		this.soTypeNumId = soTypeNumId;
	}

	public Long getCustSubUnitNumId() {
		return custSubUnitNumId;
	}

	public void setCustSubUnitNumId(Long custSubUnitNumId) {
		this.custSubUnitNumId = custSubUnitNumId;
	}

}
