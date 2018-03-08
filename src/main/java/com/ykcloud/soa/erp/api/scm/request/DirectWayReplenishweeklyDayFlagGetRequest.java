package com.ykcloud.soa.erp.api.scm.request;

import javax.validation.constraints.NotNull;


import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

/***
*
@author hank.zhu
@date 2018年3月7日 上午11:26:48 新建
*/
//获得直通门店供应商周期  请求参数类
public class DirectWayReplenishweeklyDayFlagGetRequest extends AbstractRequest {

	private static final long serialVersionUID = 1L;
	@NotNull(message="门店信息不能为空！")
	private Long subUnitNumId;
	@NotNull(message="供应商信息不能为空！")
	private Long supplyUnitNumId;
	public Long getSubUnitNumId() {
		return subUnitNumId;
	}
	public void setSubUnitNumId(Long subUnitNumId) {
		this.subUnitNumId = subUnitNumId;
	}
	public Long getSupplyUnitNumId() {
		return supplyUnitNumId;
	}
	public void setSupplyUnitNumId(Long supplyUnitNumId) {
		this.supplyUnitNumId = supplyUnitNumId;
	}
	

}
