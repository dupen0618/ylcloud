package com.ykcloud.soa.erp.api.so.request;

import java.util.Date;
import java.util.List;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

//so中用于自动补货查询商品销售的相关信息的入参类
public class ItemSaleInfoByItemNumIdAndOrderDateGetRequest extends AbstractRequest {

	private static final long serialVersionUID = 1L;

	@NotNull(message = "商品编号不能为空")
	private List<Long> itemNumIds; // 商品编号集合

	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
	@NotNull(message = "订单日期不能为空")
	private Date orderDate; // 订单日期

	public List<Long> getItemNumIds() {
		return itemNumIds;
	}

	public void setItemNumIds(List<Long> itemNumIds) {
		this.itemNumIds = itemNumIds;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	

}
