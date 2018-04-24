package com.ykcloud.soa.erp.api.so.request;

import java.util.Date;
import java.util.List;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;
import com.ykcloud.soa.erp.api.scm.model.UpdateActualQty;

public class ActualQtyForReturnUpdateRequest extends AbstractRequest {
	
	private Long subUnitNumId;     //门店编号
	
	private Date orderDate;       //日期
	
	private List<UpdateActualQty> updateActualQtyList;
	
	public List<UpdateActualQty> getUpdateActualQtyList() {
		return updateActualQtyList;
	}

	public void setUpdateActualQtyList(List<UpdateActualQty> updateActualQtyList) {
		this.updateActualQtyList = updateActualQtyList;
	}

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
	

}
