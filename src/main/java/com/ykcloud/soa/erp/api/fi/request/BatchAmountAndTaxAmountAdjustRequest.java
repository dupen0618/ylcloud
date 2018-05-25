package com.ykcloud.soa.erp.api.fi.request;

import java.util.List;

import javax.validation.constraints.NotNull;

import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;
import com.ykcloud.soa.erp.api.fi.model.BatchAmountAndTaxAmountForAdjust;

/**
 * 调整批次日进销存 调整金额，调整税金
 * @author tz.x
 * @date 2018年5月16日上午11:21:23
 */
public class BatchAmountAndTaxAmountAdjustRequest extends AbstractUserSessionRequest {

	private static final long serialVersionUID = -7688256958294439787L;
	
	@NotNull(message = "门店编号不能为空！")
    private Long subUnitNumId;
	
	private List<BatchAmountAndTaxAmountForAdjust> AdjustAmountAndTaxAmountList;

	public Long getSubUnitNumId() {
		return subUnitNumId;
	}

	public void setSubUnitNumId(Long subUnitNumId) {
		this.subUnitNumId = subUnitNumId;
	}

	public List<BatchAmountAndTaxAmountForAdjust> getAdjustAmountAndTaxAmountList() {
		return AdjustAmountAndTaxAmountList;
	}

	public void setAdjustAmountAndTaxAmountList(List<BatchAmountAndTaxAmountForAdjust> adjustAmountAndTaxAmountList) {
		AdjustAmountAndTaxAmountList = adjustAmountAndTaxAmountList;
	}
	
}
