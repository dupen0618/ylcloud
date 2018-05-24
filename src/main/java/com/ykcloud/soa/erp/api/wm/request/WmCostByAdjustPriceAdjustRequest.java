package com.ykcloud.soa.erp.api.wm.request;

import javax.validation.constraints.NotNull;

import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;

/**
 * 调价(不指定批次，不管批次明细中现有价格)【全部调整成新进价】
 * @author tz.x
 * @date 2018年5月15日下午1:45:21
 */
public class WmCostByAdjustPriceAdjustRequest extends AbstractUserSessionRequest {

	private static final long serialVersionUID = 2441267010961416908L;
	
	@NotNull(message = "库存金额调整单号不能为空！")
	private String reservedNo;
	
	@NotNull(message = "门店编号不能为空！")
	private Long subUnitNumId;
	
	private String series;

	public String getReservedNo() {
		return reservedNo;
	}

	public void setReservedNo(String reservedNo) {
		this.reservedNo = reservedNo;
	}

	public Long getSubUnitNumId() {
		return subUnitNumId;
	}

	public void setSubUnitNumId(Long subUnitNumId) {
		this.subUnitNumId = subUnitNumId;
	}
	
	public String getSeries() {
		return series;
	}

	public void setSeries(String series) {
		this.series = series;
	}

}
