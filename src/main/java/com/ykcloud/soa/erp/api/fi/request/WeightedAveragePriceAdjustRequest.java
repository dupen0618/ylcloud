package com.ykcloud.soa.erp.api.fi.request;

import java.util.List;

import org.hibernate.validator.constraints.NotEmpty;

import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;
import com.ykcloud.soa.erp.api.fi.model.WeightedAveragePriceForAdjust;

/**
 * @Description:
 * @author Song
 * @Date 2018年5月18日 下午2:30:19
 */
public class WeightedAveragePriceAdjustRequest extends AbstractUserSessionRequest{

	private static final long serialVersionUID = 8132435317045717719L;

	@NotEmpty(message = "调整加权平均价格明细不能为空！")
	private List<WeightedAveragePriceForAdjust> adjustWeightedAveragePriceList;

	public List<WeightedAveragePriceForAdjust> getAdjustWeightedAveragePriceList() {
		return adjustWeightedAveragePriceList;
	}

	public void setAdjustWeightedAveragePriceList(List<WeightedAveragePriceForAdjust> adjustWeightedAveragePriceList) {
		this.adjustWeightedAveragePriceList = adjustWeightedAveragePriceList;
	}

}
