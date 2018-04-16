package com.ykcloud.soa.erp.api.so.request;

import java.util.Date;
import java.util.List;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.gb.soa.omp.ccommon.api.annotation.ApiField;
import com.gb.soa.omp.ccommon.api.request.AbstractRequest;
import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;

//直通收货按验收单及订货审批单产生分拨单入参类
public class DirectWayDistributionSoGenerateRequest extends AbstractUserSessionRequest {

	private static final long serialVersionUID = 1L;

	@NotNull(message = "门店编号不能为空！")
	private Long subUnitNumId; // 门店编号

	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
	@NotNull(message = "采购日期日期不能为空！")
	private Date orderDate;

	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
	@NotNull(message = "供应商确认送货日期不能为空！")
	private Date supConfirmDate;

	@NotEmpty(message = "验收单编号不能为空！")
	private String receiptNo; // 验收单编号

	@ApiField(description = "产生类别不能为空！")
	@Range(min=1,max=2)
	private Long generateType;//1:直通供应商确认	2:实际收货后部分商品数量调整

	// 二次调整要重新产生的分拨单相关的验收单到批次行号
	private List<String> receiptDtlSeriesList;

	public Long getGenerateType() {
		return generateType;
	}

	public void setGenerateType(Long generateType) {
		this.generateType = generateType;
	}

	public List<String> getReceiptDtlSeriesList() {
		return receiptDtlSeriesList;
	}

	public void setReceiptDtlSeriesList(List<String> receiptDtlSeriesList) {
		this.receiptDtlSeriesList = receiptDtlSeriesList;
	}

	public Long getSubUnitNumId() {
		return subUnitNumId;
	}

	public String getReceiptNo() {
		return receiptNo;
	}

	public void setReceiptNo(String receiptNo) {
		this.receiptNo = receiptNo;
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

	public Date getSupConfirmDate() {
		return supConfirmDate;
	}

	public void setSupConfirmDate(Date supConfirmDate) {
		this.supConfirmDate = supConfirmDate;
	}

}
