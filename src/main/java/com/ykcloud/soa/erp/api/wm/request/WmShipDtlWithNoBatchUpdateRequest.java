package com.ykcloud.soa.erp.api.wm.request;

import java.util.Date;

import javax.validation.constraints.NotNull;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

public class WmShipDtlWithNoBatchUpdateRequest extends AbstractRequest {

	private static final long serialVersionUID = -8780218317707111742L;

	@NotNull(message = "门店不能为空! ")
	private Long subUnitNumId;

	// 订单ID
	@NotNull(message = "订单ID不能为空! ")
	private String soNumId;

	// 托盘码
	@NotNull(message = "托盘码不能为空! ")
	private String containerSerlno;

	// 商品ID
	@NotNull(message = "门店ID不能为空! ")
	private Long itemNumId;

	// 本次播种数量
	@NotNull(message = "播种数量不能为空! ")
	private Double qty;

	// 0更新正常品 1更新赠品 2优先更新赠品，再更新正常品
	private Long plmSign;

	// 扫入或扫回，0正向 -1反向
	@NotNull(message = "扫入或是扫入标识不能为空不能为空! ")
	private Long cancelSign;

	// 订单日期
	// @NotNull(message = "订单日期不能为空! ")
	private Date orderDate;

	public Long getSubUnitNumId() {
		return subUnitNumId;
	}

	public void setSubUnitNumId(Long subUnitNumId) {
		this.subUnitNumId = subUnitNumId;
	}

	public String getSoNumId() {
		return soNumId;
	}

	public void setSoNumId(String soNumId) {
		this.soNumId = soNumId;
	}

	public String getContainerSerlno() {
		return containerSerlno;
	}

	public void setContainerSerlno(String containerSerlno) {
		this.containerSerlno = containerSerlno;
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

	public Long getPlmSign() {
		return plmSign;
	}

	public void setPlmSign(Long plmSign) {
		this.plmSign = plmSign;
	}

	public Long getCancelSign() {
		return cancelSign;
	}

	public void setCancelSign(Long cancelSign) {
		this.cancelSign = cancelSign;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

}
