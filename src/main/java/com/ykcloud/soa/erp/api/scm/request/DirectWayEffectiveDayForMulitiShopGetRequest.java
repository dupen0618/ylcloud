package com.ykcloud.soa.erp.api.scm.request;

import javax.validation.constraints.NotNull;
  
import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

/**
* 
* @ClassName: DirectWayEffectiveDayForMulitiShopGetRequest.java
* @Description: 
* @version: v1.0.0
* @author: fred.zhao
* @date: 2018年3月14日 下午3:24:33
*/
public class DirectWayEffectiveDayForMulitiShopGetRequest extends AbstractRequest {

	private static final long serialVersionUID = -7703346861219155669L;

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
