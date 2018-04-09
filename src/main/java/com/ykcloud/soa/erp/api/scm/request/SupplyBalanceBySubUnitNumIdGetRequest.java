package com.ykcloud.soa.erp.api.scm.request;

import javax.validation.constraints.NotNull;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

/**
 * @Description:根据门店选择当前可结算的供应商
 * @author Song
 * @Date 2018年4月4日 下午12:45:40
 */
public class SupplyBalanceBySubUnitNumIdGetRequest extends AbstractRequest {

	private static final long serialVersionUID = 7988475632052221318L;
	
	@NotNull(message = "门店编号不能为空！")
	private Long subUnitNumId;

	public Long getSubUnitNumId() {
		return subUnitNumId;
	}

	public void setSubUnitNumId(Long subUnitNumId) {
		this.subUnitNumId = subUnitNumId;
	}
	
}
