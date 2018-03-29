package com.ykcloud.soa.erp.api.scm.request;

import java.util.Date;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

//前台根据商品编号获取退货商品相关信息(价格）的入参
public class ReturnProductGetRequest extends AbstractRequest {
	@NotNull(message = "门店编号不能为空")
	private Long subUnitNumId; // 门店编号
	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
	@NotNull(message = "日期不能为空")
	private Date orderDate; // 订单日期
	@NotNull(message = "商品编号不能为空")
	private Long itemNumId; // 商品编号
	@NotNull(message = "出货仓库编号不能为空")
	private Long storageNumId;// 出货仓库编号
	@NotNull(message = "退货类别不能为空")
	private Long typeNumId; // 退货类别 4：直送退供应商，5：直通退供应商，6：配送退仓

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

	public Long getItemNumId() {
		return itemNumId;
	}

	public void setItemNumId(Long itemNumId) {
		this.itemNumId = itemNumId;
	}

	public Long getStorageNumId() {
		return storageNumId;
	}

	public void setStorageNumId(Long storageNumId) {
		this.storageNumId = storageNumId;
	}

	public Long getTypeNumId() {
		return typeNumId;
	}

	public void setTypeNumId(Long typeNumId) {
		this.typeNumId = typeNumId;
	}

}
