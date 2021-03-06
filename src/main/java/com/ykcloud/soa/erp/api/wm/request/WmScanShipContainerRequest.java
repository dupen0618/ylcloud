package com.ykcloud.soa.erp.api.wm.request;

import java.util.Date;

import javax.validation.constraints.NotNull;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;
import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;

public class WmScanShipContainerRequest extends AbstractUserSessionRequest {

	private static final long serialVersionUID = -329220897215489154L;

	// 装箱识别码
	@NotNull(message = "装箱识别码不能为空")
	private String containerLabserlno;
	
	private String containerSerlno;

	// 门店号
	@NotNull(message = "门店号不能为空")
	private Long subUnitNumId;

	@NotNull(message = "出库单号不能为空")
	private String reservedNo;

	// 0正向 -1反向
	@NotNull(message = "正向，反向标识符不能为空")
	private Long confirmSign;


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


	public Long getConfirmSign() {
		return confirmSign;
	}

	public void setConfirmSign(Long confirmSign) {
		this.confirmSign = confirmSign;
	}

	public String getContainerSerlno() {
		return containerSerlno;
	}

	public void setContainerSerlno(String containerSerlno) {
		this.containerSerlno = containerSerlno;
	}
	
	

}
