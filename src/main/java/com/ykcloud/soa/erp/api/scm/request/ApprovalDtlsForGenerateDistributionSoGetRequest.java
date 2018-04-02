package com.ykcloud.soa.erp.api.scm.request;

import java.util.Date;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.gb.soa.omp.ccommon.api.annotation.ApiField;
import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

//为产生配送分拨单
public class ApprovalDtlsForGenerateDistributionSoGetRequest extends AbstractRequest {

	private static final long serialVersionUID = -5263386150358402518L;

	@NotNull(message = "门店编号不能为空！")
	private Long subUnitNumId;

	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
	@NotNull(message = "订单日期不能为空！")
	private Date orderDate;

	@NotEmpty(message = "配送审批单单号不能为空！")
	private String approvalNumId;

	@NotNull(message = "配送类别不能为空！")
	@Range(min=3,max=5) //不含5
	@ApiField(description = "3：配送到店，4：配送分拨到仓，5：配送分拨到店")
	private Long typeNumId;

	@NotNull(message = "收货门店编号不能为空！")
	@ApiField(description = "收货门店编号")
	private Long custSubUnitNumId;

	@NotNull(message = "收货仓库编号不能为空！")
	@ApiField(description = "收货仓库编号")
	private Long recStorageNumId;

	@NotNull(message = "发货仓库编号不能为空！")
	@ApiField(description = "发货仓库编号")
	private Long storageNumId;

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

	public String getApprovalNumId() {
		return approvalNumId;
	}

	public void setApprovalNumId(String approvalNumId) {
		this.approvalNumId = approvalNumId;
	}

	public Long getTypeNumId() {
		return typeNumId;
	}

	public void setTypeNumId(Long typeNumId) {
		this.typeNumId = typeNumId;
	}

	public Long getCustSubUnitNumId() {
		return custSubUnitNumId;
	}

	public void setCustSubUnitNumId(Long custSubUnitNumId) {
		this.custSubUnitNumId = custSubUnitNumId;
	}

	public Long getRecStorageNumId() {
		return recStorageNumId;
	}

	public void setRecStorageNumId(Long recStorageNumId) {
		this.recStorageNumId = recStorageNumId;
	}

	public Long getStorageNumId() {
		return storageNumId;
	}

	public void setStorageNumId(Long storageNumId) {
		this.storageNumId = storageNumId;
	}

}
