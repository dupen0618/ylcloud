package com.ykcloud.soa.erp.api.fi.request;

import java.util.List;

import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;
import com.ykcloud.soa.erp.api.fi.model.ConsignmentProductAccountAdjust;

/**
 * 代销商品款调整
 * @author tz.x
 * @date 2018年5月17日下午6:52:08
 */
public class ConsignmentProductAccountAdjustRequest extends AbstractUserSessionRequest {

	private static final long serialVersionUID = 7715074602978761755L;
	
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
