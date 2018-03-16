package com.ykcloud.soa.erp.api.scm.request;

import javax.validation.constraints.NotNull;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

/**
 * 直通多门店供应商有效天数的入参类
 * 
 * @author 14540
 *
 */

public class DirectWayEffectiveDayForMulitiShopGetRequest extends AbstractRequest {
	@NotNull(message = "门店编号不能为空！")
	private Long subUnitNumIds; // 门店编号列表
	@NotNull(message = "供应商编号不能为空！")
	private Long supplyUnitNumId; // 供应商编号

	public Long getSubUnitNumIds() {
		return subUnitNumIds;
	}

	public void setSubUnitNumIds(Long subUnitNumIds) {
		this.subUnitNumIds = subUnitNumIds;
	}

	public Long getSupplyUnitNumId() {
		return supplyUnitNumId;
	}

	public void setSupplyUnitNumId(Long supplyUnitNumId) {
		this.supplyUnitNumId = supplyUnitNumId;
	}

}
