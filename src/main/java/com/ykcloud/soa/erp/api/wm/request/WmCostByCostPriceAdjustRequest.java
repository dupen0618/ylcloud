package com.ykcloud.soa.erp.api.wm.request;

import javax.validation.constraints.NotNull;

import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;

/**
 * @Description:固定价格调价(批次明细中价格等于CostPrice都需要调整)
 * @author Song
 * @Date 2018年5月16日 下午2:15:02
 */
public class WmCostByCostPriceAdjustRequest extends AbstractUserSessionRequest{

	private static final long serialVersionUID = -8807311741265844439L;

	@NotNull(message = "库存金额调整单号不能为空！")
	private String reservedNo;
	
	@NotNull(message = "门店编号不能为空！")
	private Long subUnitNumId;

	public String getReservedNo() {
		return reservedNo;
	}

	public void setReservedNo(String reservedNo) {
		this.reservedNo = reservedNo;
	}

	public Long getSubUnitNumId() {
		return subUnitNumId;
	}

	public void setSubUnitNumId(Long subUnitNumId) {
		this.subUnitNumId = subUnitNumId;
	}
	
	
}
