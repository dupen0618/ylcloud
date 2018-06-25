package com.ykcloud.soa.erp.api.fi.request;

import java.util.Date;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;

/**
 * 处理倒挤差账
 * @author zk
 *
 */
public class PoorInvertedExtrusionHandleRequest extends AbstractUserSessionRequest{

	
	private static final long serialVersionUID = -2687988759433215718L;
	
	@NotNull(message="门店编号不能为空")
	private Long subUnitNumId;   //门店
	
	@NotNull(message="单据日期不能为空")
	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
	private Date orderDate;      //订单日期

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
