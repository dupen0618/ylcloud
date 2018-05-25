package com.ykcloud.soa.erp.api.fi.request;

import java.util.List;

import javax.validation.constraints.NotNull;

import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;
import com.ykcloud.soa.erp.api.fi.model.WeightedAveragePriceForAdjust;

/**
 * 调整加权平均价格
 * @author tz.x
 * @date 2018年5月16日下午4:58:50
 */
public class AdjustWeightedAveragePriceRequest extends AbstractUserSessionRequest {

	private static final long serialVersionUID = -6098822101162842522L;
	
	@NotNull(message = "门店编号不能为空！")
    private Long subUnitNumId;
	
	//@NotEmpty(message = "调整加权平均价格明细不能为空！")
	private List<WeightedAveragePriceForAdjust> adjustWeightedAveragePriceList;

	public Long getSubUnitNumId() {
		return subUnitNumId;
	}

	public void setSubUnitNumId(Long subUnitNumId) {
		this.subUnitNumId = subUnitNumId;
	}

	public List<WeightedAveragePriceForAdjust> getAdjustWeightedAveragePriceList() {
		return adjustWeightedAveragePriceList;
	}

	public void setAdjustWeightedAveragePriceList(List<WeightedAveragePriceForAdjust> adjustWeightedAveragePriceList) {
		this.adjustWeightedAveragePriceList = adjustWeightedAveragePriceList;
	}

	
	

}
