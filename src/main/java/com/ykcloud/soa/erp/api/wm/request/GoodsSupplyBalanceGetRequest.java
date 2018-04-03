package com.ykcloud.soa.erp.api.wm.request;

import java.util.Date;

import javax.validation.constraints.NotNull;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

/**
 * @Description:供应商结算相关业务
 * @author Song
 * @Date 2018年4月2日 下午5:50:13
 */
public class GoodsSupplyBalanceGetRequest extends AbstractRequest {

	private static final long serialVersionUID = 1L;
	
	@NotNull(message = "供应商不能为空")
	private Long subUnitNumId;
	
	@NotNull(message = "起始日期不能为空")
	private String startDate;
	
	@NotNull(message = "截止日期不能为空")
	private String endDate;

	public Long getSubUnitNumId() {
		return subUnitNumId;
	}

	public void setSubUnitNumId(Long subUnitNumId) {
		this.subUnitNumId = subUnitNumId;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}


	
	
}
