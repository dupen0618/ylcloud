package com.ykcloud.soa.erp.api.fi.request;

import javax.validation.constraints.NotNull;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

/**
 * 获取门店、供应别未扣费用
 * @author tz.x
 * @date 2018年5月5日下午5:51:30
 */
public class CutAmountGetRequest extends AbstractRequest {

	private static final long serialVersionUID = 1813749786131716846L;
	
	/**
	 * 直送：申请退货门店编号直通：收货仓库对应门店编号
	 * 两者都取退货申请单单头sub_unit_num_id
	 */
	@NotNull(message = "门店编号不能为空！")
    private Long subUnitNumId;
	
	@NotNull(message = "供应商编号不能为空！")
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
