package com.ykcloud.soa.erp.api.wm.request;

import javax.validation.constraints.NotNull;

import com.gb.soa.omp.ccommon.api.annotation.ApiField;
import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

/**
*
@author hank.zhu
@date 2018年3月13日 下午4:19:33 新建
**/
//过期控制  证照控制 入参类
public class ReceiptProduceDateUpdateRequest extends AbstractRequest {

	private static final long serialVersionUID = 8403635836329501861L;
	
	@ApiField(description = "验收单号")
	@NotNull(message = "验收单号不能为空!")
	private Long reservedNo;
	
	@ApiField(description = "托盘号")
	@NotNull(message = "托盘号不能为空!")
	private Long traySerlno;
	
	@ApiField(description = "商品ID")
	@NotNull(message = "商品ID不能为空!")
	private Long itemNumId;
	
	@ApiField(description = "实际生产日期")
	@NotNull(message = "时期生产日期不能为空!")
	private Long actualProductionDate;

	public Long getReservedNo() {
		return reservedNo;
	}

	public void setReservedNo(Long reservedNo) {
		this.reservedNo = reservedNo;
	}

	public Long getTraySerlno() {
		return traySerlno;
	}

	public void setTraySerlno(Long traySerlno) {
		this.traySerlno = traySerlno;
	}

	public Long getItemNumId() {
		return itemNumId;
	}

	public void setItemNumId(Long itemNumId) {
		this.itemNumId = itemNumId;
	}

	public Long getActualProductionDate() {
		return actualProductionDate;
	}

	public void setActualProductionDate(Long actualProductionDate) {
		this.actualProductionDate = actualProductionDate;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	
	
}
