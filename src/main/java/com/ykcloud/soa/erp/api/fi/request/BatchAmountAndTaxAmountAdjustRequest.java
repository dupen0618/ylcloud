package com.ykcloud.soa.erp.api.fi.request;

import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;
import com.ykcloud.soa.erp.api.fi.model.BatchAmountAndTaxAmountForAdjust;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * 调整批次日进销存 调整金额，调整税金
 * @author tz.x
 * @date 2018年5月16日上午11:21:23
 */
public class BatchAmountAndTaxAmountAdjustRequest extends AbstractUserSessionRequest {
	private static final long serialVersionUID = -3143444622833761843L;
	@NotNull(message = "门店编号不能为空！")
    private Long subUnitNumId;
	
	private List<BatchAmountAndTaxAmountForAdjust> AdjustAmountAndTaxAmountList;
	private Long typeNumId;

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

	public Long getTypeNumId() {
		return typeNumId;
	}

	public void setTypeNumId(Long typeNumId) {
		this.typeNumId = typeNumId;
	}
}
