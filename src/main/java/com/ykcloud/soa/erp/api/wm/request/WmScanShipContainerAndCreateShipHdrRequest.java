package com.ykcloud.soa.erp.api.wm.request;

import java.util.Date;

import javax.validation.constraints.NotNull;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

public class WmScanShipContainerAndCreateShipHdrRequest extends AbstractRequest {

	private static final long serialVersionUID = -329220897215489154L;

	// 装箱识别码
	@NotNull(message = "装箱识别码不能为空")
	private String containerLabserlno;

	// 门店号
	@NotNull(message = "门店号不能为空")
	private Long subUnitNumId;

	@NotNull(message = "出库单号不能为空")
	private String reservedNo;

	// 0正向 -1反向
	@NotNull(message = "正向，反向标识符不能为空")
	private Long cancelSign;

	private Date orderDate;

	public String getContainerLabserlno() {
		return containerLabserlno;
	}

	public void setContainerLabserlno(String containerLabserlno) {
		this.containerLabserlno = containerLabserlno;
	}

	public Long getSubUnitNumId() {
		return subUnitNumId;
	}

	public void setSubUnitNumId(Long subUnitNumId) {
		this.subUnitNumId = subUnitNumId;
	}

	public String getReservedNo() {
		return reservedNo;
	}

	public void setReservedNo(String reservedNo) {
		this.reservedNo = reservedNo;
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
