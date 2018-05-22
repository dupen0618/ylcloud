package com.ykcloud.soa.erp.api.fi.request;

import java.util.List;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;
import com.ykcloud.soa.erp.api.fi.model.CostAmountAndTaxAmountForAdjust;

/**
 * 商品成本金额调整
 * @author tz.x
 * @date 2018年5月16日下午8:51:03
 */
public class CostAmountAndTaxAmountAdjustRequest extends AbstractUserSessionRequest {

	private static final long serialVersionUID = 8621368692202250424L;
	
	//@NotNull(message = "门店不能为空！")
	private Long subUnitNumId;
	
	//@NotEmpty(message = "商品成本金额调整明细不能为空！")
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
