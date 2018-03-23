package com.ykcloud.soa.erp.api.wm.request;

import java.util.Date;
import java.util.List;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

public class ReceiptForGenerateDirectWayDistributionSoGetRequest extends AbstractRequest {

	private static final long serialVersionUID = 7988475632052221318L;

	@NotNull(message = "门店编号不能为空！")
	private Long subUnitNumId;

	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
	@NotNull(message = "订单日期不能为空！")
	private Date orderDate;

	@NotBlank(message = "验收单编号不能为空！")
	private String receiptNo;

	@NotBlank(message = "产生类别不能为空！")
	// 0:第一次产生 1:直通实际收货前二次确认货或直送供应商品确认 2:实际收货后部分调整
	private Long generateType;

	// 二次调整要重新产生的分拨单相关的验收单到批次行号
	private List<String> receiptDtlSeriesList;

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

	public String getReceiptNo() {
		return receiptNo;
	}

	public void setReceiptNo(String receiptNo) {
		this.receiptNo = receiptNo;
	}

}
