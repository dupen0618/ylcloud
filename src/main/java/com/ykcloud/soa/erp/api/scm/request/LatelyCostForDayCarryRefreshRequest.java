package com.ykcloud.soa.erp.api.scm.request;


import javax.validation.constraints.NotNull;
import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;

/**
 * 日结刷新进价
 * @author tz.x
 * @date 2018年6月27日上午8:49:08
 */
public class LatelyCostForDayCarryRefreshRequest extends AbstractUserSessionRequest {

	private static final long serialVersionUID = -7831486478194771959L;
	
	@NotNull(message = "门店编号不能为空！")
	private Long subUnitNumId;
	
	public Long getSubUnitNumId() {
		return subUnitNumId;
	}

	public void setSubUnitNumId(Long subUnitNumId) {
		this.subUnitNumId = subUnitNumId;
	}

}
