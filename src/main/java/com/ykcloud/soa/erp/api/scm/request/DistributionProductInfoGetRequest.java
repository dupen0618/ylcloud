package com.ykcloud.soa.erp.api.scm.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.gb.soa.omp.ccommon.api.request.AbstractRequest;
import javax.validation.constraints.NotNull;
import java.util.Date;

public class DistributionProductInfoGetRequest extends AbstractRequest {
	private static final long serialVersionUID = 1L;

	@NotNull(message = "门店编号不能为空")
	private Long subUnitNumId;
	
	private Long settlementType;//物流方式:供应商自下联营订单时控制 

	@NotNull(message = "门店编号不能为空")
	private String barcode;// 商品编号、商品条码二选一

	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
	@NotNull(message = "日期不能为空")
	private Date orderDate;// 日期，格式：yyyy-mm-dd

	public Long getSubUnitNumId() {
		return subUnitNumId;
	}

	public void setSubUnitNumId(Long subUnitNumId) {
		this.subUnitNumId = subUnitNumId;
	}

	public String getBarcode() {
		return barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public Long getSettlementType() {
		return settlementType;
	}

	public void setSettlementType(Long settlementType) {
		this.settlementType = settlementType;
	}

	
}
