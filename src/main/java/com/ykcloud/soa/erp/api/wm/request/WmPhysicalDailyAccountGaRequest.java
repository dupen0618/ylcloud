package com.ykcloud.soa.erp.api.wm.request;

import java.util.Date;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

public class WmPhysicalDailyAccountGaRequest extends AbstractRequest  {
	private static final long serialVersionUID = 1L;

	 /**
     * 销售门店编号
     */
    @NotNull(message = "门店编号不能为空")
    public Long subUnitNumId;

    /**
     * 结转日期
     */
    @NotNull(message = "销售日期不能为空")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    public Date orderDate;
    
  

	public Long getSubUnitNumId() {
		return subUnitNumId;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setSubUnitNumId(Long subUnitNumId) {
		this.subUnitNumId = subUnitNumId;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	
}
