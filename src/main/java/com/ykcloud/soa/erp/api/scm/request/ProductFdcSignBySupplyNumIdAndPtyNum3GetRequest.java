package com.ykcloud.soa.erp.api.scm.request;

import javax.validation.constraints.NotNull;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

/**
 * 获取生鲜标识的入参类
 * @author 14540
 *
 */

public class ProductFdcSignBySupplyNumIdAndPtyNum3GetRequest extends AbstractRequest {
	@NotNull(message = "供应商编号不能为空！")
	private Long supplyUnitNumId;   //供应商编号
	@NotNull(message = "商品小类编号不能为空！")
	private Long ptyNum3;           //商品小类

	public Long getSupplyUnitNumId() {
		return supplyUnitNumId;
	}

	public void setSupplyUnitNumId(Long supplyUnitNumId) {
		this.supplyUnitNumId = supplyUnitNumId;
	}

	public Long getPtyNum3() {
		return ptyNum3;
	}

	public void setPtyNum3(Long ptyNum3) {
		this.ptyNum3 = ptyNum3;
	}
	
	

}
