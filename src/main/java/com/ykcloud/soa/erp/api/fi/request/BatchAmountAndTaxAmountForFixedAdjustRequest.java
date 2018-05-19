package com.ykcloud.soa.erp.api.fi.request;

import java.util.List;

import org.hibernate.validator.constraints.NotEmpty;

import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;
import com.ykcloud.soa.erp.api.fi.model.BatchAmountAndTaxAmountForAdjust;

/**
 * @Description:
 * @author Song
 * @Date 2018年5月17日 下午4:40:33
 */
public class BatchAmountAndTaxAmountForFixedAdjustRequest extends AbstractUserSessionRequest{

	private static final long serialVersionUID = 4362052094214066876L;
	
	@NotEmpty(message = "批次日进销存明细不能为空！")
	private Long subUnitNumID;

	@NotEmpty(message = "批次日进销存明细不能为空！")
	private List<BatchAmountAndTaxAmountForAdjust> AdjustAmountAndTaxAmountList;

	public Long getSubUnitNumID() {
		return subUnitNumID;
	}

	public void setSubUnitNumID(Long subUnitNumID) {
		this.subUnitNumID = subUnitNumID;
	}

	public List<BatchAmountAndTaxAmountForAdjust> getAdjustAmountAndTaxAmountList() {
		return AdjustAmountAndTaxAmountList;
	}

	public void setAdjustAmountAndTaxAmountList(List<BatchAmountAndTaxAmountForAdjust> adjustAmountAndTaxAmountList) {
		AdjustAmountAndTaxAmountList = adjustAmountAndTaxAmountList;
	}

	
}
