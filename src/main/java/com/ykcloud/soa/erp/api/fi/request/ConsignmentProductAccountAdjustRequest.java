package com.ykcloud.soa.erp.api.fi.request;

import java.util.List;

import javax.validation.constraints.NotNull;

import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;
import com.ykcloud.soa.erp.api.fi.model.ConsignmentProductAccountAdjust;

/**
 * 代销商品款调整
 * @author tz.x
 * @date 2018年5月17日下午6:52:08
 */
public class ConsignmentProductAccountAdjustRequest extends AbstractUserSessionRequest {

	private static final long serialVersionUID = 7715074602978761755L;
	
	@NotNull(message = "门店编号不能为空！")
    private Long subUnitNumId;
	
	/**
	 * 代销商品款调整明细
	 */
	private List<ConsignmentProductAccountAdjust> cpaAdjustDetails;

	public Long getSubUnitNumId() {
		return subUnitNumId;
	}

	public void setSubUnitNumId(Long subUnitNumId) {
		this.subUnitNumId = subUnitNumId;
	}

	public List<ConsignmentProductAccountAdjust> getCpaAdjustDetails() {
		return cpaAdjustDetails;
	}

	public void setCpaAdjustDetails(List<ConsignmentProductAccountAdjust> cpaAdjustDetails) {
		this.cpaAdjustDetails = cpaAdjustDetails;
	}

}
