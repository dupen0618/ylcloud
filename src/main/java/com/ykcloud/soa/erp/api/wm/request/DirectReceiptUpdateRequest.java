package com.ykcloud.soa.erp.api.wm.request;

import javax.validation.constraints.NotNull;

import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;

/**
*一键收货请求类
@author hank.zhu
@date 2018年3月26日 上午10:02:06 新建
**/
public class DirectReceiptUpdateRequest extends AbstractUserSessionRequest {

	private static final long serialVersionUID = 7417876855969251381L;

	@NotNull(message = "验收单号不能为空!")
	private String reservedNo;//验收单号
	
	@NotNull(message = "商品ID布不能为空!")
	private Long itemNumId;//商品ID
	
	@NotNull(message = "收货数量不能为空!")
	private Double qty;//收货数量
	
	@NotNull(message = "赠品数量不能为空!")
	private Double pmtQty;//赠品数量
	
	private String actualProductionDate;

	public String getReservedNo() {
		return reservedNo;
	}

	public void setReservedNo(String reservedNo) {
		this.reservedNo = reservedNo;
	}

	public Long getItemNumId() {
		return itemNumId;
	}

	public void setItemNumId(Long itemNumId) {
		this.itemNumId = itemNumId;
	}

	public Double getQty() {
		return qty;
	}

	public void setQty(Double qty) {
		this.qty = qty;
	}

	public Double getPmtQty() {
		return pmtQty;
	}

	public void setPmtQty(Double pmtQty) {
		this.pmtQty = pmtQty;
	}

	public String getActualProductionDate() {
		return actualProductionDate;
	}

	public void setActualProductionDate(String actualProductionDate) {
		this.actualProductionDate = actualProductionDate;
	}
	

}
