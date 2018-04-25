package com.ykcloud.soa.erp.api.wm.request;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

import com.gb.soa.omp.ccommon.api.annotation.ApiField;
import com.gb.soa.omp.ccommon.api.request.AbstractRequest;
import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;

/**
*更新生产日期,证照验证响应类
@author hank.zhu
@date 2018年3月13日 下午4:19:33 新建
**/
//过期控制  证照控制 入参类
public class ReceiptProduceDateUpdateRequest extends AbstractUserSessionRequest {

	private static final long serialVersionUID = 8792481116124137792L;

	@ApiField(description = "验收单号")
	@NotNull(message = "验收单号不能为空!")
	private String reservedNo;
	
	@ApiField(description = "门店编号")
	@NotEmpty(message = "门店编号不能为空!")
	private Long subUnitNumId;
	
	@ApiField(description = "托盘号")
	@NotNull(message = "托盘号不能为空!")
	private String traySerlno;
	
	@ApiField(description = "商品ID")
	@NotNull(message = "商品ID不能为空!")
	private Long itemNumId;
	
	@ApiField(description = "实际生产日期")
	@NotEmpty(message = "时期生产日期不能为空!")
	private String actualProductionDate;
	
	

	public String getReservedNo() {
		return reservedNo;
	}

	public void setReservedNo(String reservedNo) {
		this.reservedNo = reservedNo;
	}

	public String getTraySerlno() {
		return traySerlno;
	}

	public void setTraySerlno(String traySerlno) {
		this.traySerlno = traySerlno;
	}

	public Long getItemNumId() {
		return itemNumId;
	}

	public void setItemNumId(Long itemNumId) {
		this.itemNumId = itemNumId;
	}

	public String getActualProductionDate() {
		return actualProductionDate;
	}

	public void setActualProductionDate(String actualProductionDate) {
		this.actualProductionDate = actualProductionDate;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Long getSubUnitNumId() {
		return subUnitNumId;
	}

	public void setSubUnitNumId(Long subUnitNumId) {
		this.subUnitNumId = subUnitNumId;
	}

	

}
