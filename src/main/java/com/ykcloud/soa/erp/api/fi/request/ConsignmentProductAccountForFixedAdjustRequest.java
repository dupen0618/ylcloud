package com.ykcloud.soa.erp.api.fi.request;

import java.util.List;

import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;
import com.ykcloud.soa.erp.api.fi.model.ConsignmentProductAccountAdjust;

public class ConsignmentProductAccountForFixedAdjustRequest extends AbstractUserSessionRequest{

	private static final long serialVersionUID = -5296744420709173354L;

	/**
	 * 代销商品款调整明细
	 */
	private List<ConsignmentProductAccountAdjust> cpaAdjustDetails;

	public List<ConsignmentProductAccountAdjust> getCpaAdjustDetails() {
		return cpaAdjustDetails;
	}

	public void setCpaAdjustDetails(List<ConsignmentProductAccountAdjust> cpaAdjustDetails) {
		this.cpaAdjustDetails = cpaAdjustDetails;
	}
	

}
