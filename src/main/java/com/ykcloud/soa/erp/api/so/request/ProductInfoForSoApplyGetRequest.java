package com.ykcloud.soa.erp.api.so.request;

import java.util.Date;

import javax.validation.constraints.NotNull;

import org.apache.commons.lang3.StringUtils;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.gb.soa.omp.ccommon.api.exception.AbstractExceptionType;
import com.gb.soa.omp.ccommon.api.exception.ExceptionType;
import com.gb.soa.omp.ccommon.api.exception.ValidateClientException;
import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

//店内调拨、行政领料商品查询的入参
public class ProductInfoForSoApplyGetRequest extends AbstractRequest {
	@NotNull(message = "门店编号不能为空")
	private Long subUnitNumId; // 调出门店编号(申请门店)

	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
	@NotNull(message = "日期不能为空")
	private Date orderDate; // 日期

	@NotNull(message = "调出仓库编号不能为空")
	private Long storageNumId; // 调出仓库编号

	@NotNull(message = "条形码或者是商品编号不能为空")
	private String barcode; // 条形码或者是商品编号

	@NotNull(message = "查询类型不能为空,必须为2:店内调拨商品查询 8:行政领料商品查询")
	private Long typeNumId; // 类型 2.店内调拨商品查询 8,行政领料商品查询

	public Long getTypeNumId() {
		return typeNumId;
	}

	public void setTypeNumId(Long typeNumId) {
		this.typeNumId = typeNumId;
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

	public Long getStorageNumId() {
		return storageNumId;
	}

	public void setStorageNumId(Long storageNumId) {
		this.storageNumId = storageNumId;
	}

	public String getBarcode() {
		return barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	public void checkRequect(String subSystem,AbstractExceptionType et) {
		if (!typeNumId.equals(2L) && !typeNumId.equals(8L)) {
			throw new ValidateClientException(subSystem, et, "查询类型必须为2或者8");
		}
	}

}
