package com.ykcloud.soa.erp.api.so.request;


import javax.validation.constraints.NotNull;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

/**
 * 生成销售日期
 * @author tz.x
 * @date 2018年6月5日上午11:46:11
 */
public class SalesEndOfDayDtlGenerateRequest extends AbstractRequest {

	private static final long serialVersionUID = -453993622404266799L;
	
    @NotNull(message = "门店编号不能为空！")
    public Long subUnitNumId;

	public Long getSubUnitNumId() {
		return subUnitNumId;
	}

	public void setSubUnitNumId(Long subUnitNumId) {
		this.subUnitNumId = subUnitNumId;
	}
	

}
