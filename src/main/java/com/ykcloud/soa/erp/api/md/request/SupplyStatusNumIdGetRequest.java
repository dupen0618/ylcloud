package com.ykcloud.soa.erp.api.md.request;
/***
 * 
 * @author hank.zhu
 *2018-03-02
 *
 */
import javax.validation.constraints.NotNull;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

public class SupplyStatusNumIdGetRequest extends AbstractRequest {
	private static final long serialVersionUID = 1L;
	
	@NotNull(message = "供应商编号不能为空！")
	private Long supplyUnitNumId;



	public Long getSupplyUnitNumId() {
		return supplyUnitNumId;
	}
	public void setSupplyUnitNumId(Long supplyUnitNumId) {
		this.supplyUnitNumId = supplyUnitNumId;
	}
	

}
