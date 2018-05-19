package com.ykcloud.soa.erp.api.fi.request;

import java.util.List;

import org.hibernate.validator.constraints.NotEmpty;

import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;
import com.ykcloud.soa.erp.api.fi.model.CostAmountAndTaxAmountForAdjust;

/**
 * @Description:商品成本金额调整
 * @author Song
 * @Date 2018年5月17日 下午3:26:05
 */
public class CostAmountAndTaxAmountForFixedAdjustRequest extends AbstractUserSessionRequest{

	private static final long serialVersionUID = -7234070566209673379L;

	@NotEmpty(message = "门店不能为空！")
	private Long subUnitNumId;
	
	@NotEmpty(message = "商品成本金额调整明细不能为空！")
	private List<CostAmountAndTaxAmountForAdjust> fiCostDetails;

	public Long getSubUnitNumId() {
		return subUnitNumId;
	}

	public void setSubUnitNumId(Long subUnitNumId) {
		this.subUnitNumId = subUnitNumId;
	}

	public List<CostAmountAndTaxAmountForAdjust> getFiCostDetails() {
		return fiCostDetails;
	}

	public void setFiCostDetails(List<CostAmountAndTaxAmountForAdjust> fiCostDetails) {
		this.fiCostDetails = fiCostDetails;
	}
	
}
