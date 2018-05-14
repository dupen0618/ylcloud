package com.ykcloud.soa.erp.api.so.request;

import java.util.Date;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.gb.soa.omp.ccommon.api.annotation.ApiField;
import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;

/**
 * 店间调拨商品查询入参
 * @author tz.x
 *
 * @date 2018年4月11日下午6:30:11
 */
public class ProductInfoForSoApplyTransferBetweenShopGetRequest extends AbstractUserSessionRequest {

	private static final long serialVersionUID = -4497459672458480987L;
	
	@ApiField(description = "1:item_num_id, 2:itemid, 3:barcode")
	@NotNull(message = "商品序号类别不能为空！")
	private Long itemNumberType;
	
	@NotNull(message = "调出门店编号不能为空！")
	private Long subUnitNumId;
	
	@NotNull(message = "调入门店编号不能为空！")
	private Long recSubUnitNumId;
	
	@NotNull(message = "订货日期不能为空!")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date orderDate;
	
	@NotNull(message = "调出仓库编号不能为空!")
	private Long storageNumId;
	
	@NotEmpty(message = "调商品编号或条码不能为空!")
	private String barcode;
	
	@NotNull(message = "单头指定存储方式不能为空!")
	private Long storeType;

	public Long getItemNumberType() {
		return itemNumberType;
	}

	public void setItemNumberType(Long itemNumberType) {
		this.itemNumberType = itemNumberType;
	}

	public Long getSubUnitNumId() {
		return subUnitNumId;
	}

	public void setSubUnitNumId(Long subUnitNumId) {
		this.subUnitNumId = subUnitNumId;
	}

	public Long getRecSubUnitNumId() {
		return recSubUnitNumId;
	}

	public void setRecSubUnitNumId(Long recSubUnitNumId) {
		this.recSubUnitNumId = recSubUnitNumId;
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

	public Long getStoreType() {
		return storeType;
	}

	public void setStoreType(Long storeType) {
		this.storeType = storeType;
	}

}
