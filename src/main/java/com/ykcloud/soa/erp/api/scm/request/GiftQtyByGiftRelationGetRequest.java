package com.ykcloud.soa.erp.api.scm.request;

import java.util.Date;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

public class GiftQtyByGiftRelationGetRequest extends AbstractRequest {

	private static final long serialVersionUID = 7988475632052221318L;

	@NotNull(message = "供应商编号不能为空！")
	private Long supplyUnitNumId;
	@NotNull(message = "商品编号不能为空！")
	private Long itemNumId;
	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
	@NotNull(message = "日期不能为空！")
	private Date orderDtme;
	@DecimalMin(value = "0", message = "数量应大于零!")
	@NotNull(message = "数量不能为空！")
	private Double qty;

	public Long getSupplyUnitNumId() {
		return supplyUnitNumId;
	}

	public void setSupplyUnitNumId(Long supplyUnitNumId) {
		this.supplyUnitNumId = supplyUnitNumId;
	}

	public Long getItemNumId() {
		return itemNumId;
	}

	public void setItemNumId(Long itemNumId) {
		this.itemNumId = itemNumId;
	}

	public Date getOrderDtme() {
		return orderDtme;
	}

	public void setOrderDtme(Date orderDtme) {
		this.orderDtme = orderDtme;
	}

	public Double getQty() {
		return qty;
	}

	public void setQty(Double qty) {
		this.qty = qty;
	}
}
