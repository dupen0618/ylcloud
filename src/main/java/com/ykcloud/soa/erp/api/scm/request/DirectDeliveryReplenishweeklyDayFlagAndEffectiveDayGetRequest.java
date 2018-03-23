package com.ykcloud.soa.erp.api.scm.request;

import javax.validation.constraints.NotNull;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

/**
 * @ClassName: DirectDeliveryReplenishweeklyDayFlagAndEffectiveDayGetRequest.java
 * @Description: 直送门店、供应商订货周期、有效天数request
 * @version: v1.0.0
 * @author: fred.zhao
 * @date: 2018年3月14日 下午3:29:05
 */
public class DirectDeliveryReplenishweeklyDayFlagAndEffectiveDayGetRequest extends AbstractRequest {

	private static final long serialVersionUID = 9119399098042430937L;

	@NotNull(message = "门店编号不能为空！")
	private Long subUnitNumId; // 门店编号列表

	@NotNull(message = "供应商编号不能为空！")
	private Long supplyUnitNumId; // 供应商编号

	public Long getSubUnitNumId() {
		return subUnitNumId;
	}

	public void setSubUnitNumId(Long subUnitNumId) {
		this.subUnitNumId = subUnitNumId;
	}

	public Long getSupplyUnitNumId() {
		return supplyUnitNumId;
	}

	public void setSupplyUnitNumId(Long supplyUnitNumId) {
		this.supplyUnitNumId = supplyUnitNumId;
	}

}
