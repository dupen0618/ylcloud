package com.ykcloud.soa.erp.api.wm.request;

import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;

import javax.validation.constraints.NotNull;

/**
 * @Author Hewei
 * @Date 2018/4/8 15:55
 */
public class WmBLBatchDTLUpdateRequest extends AbstractUserSessionRequest {
	private static final long serialVersionUID = 1L;
	@NotNull(message = "订单编号不能为空！")
    String reservedNo;
	@NotNull(message="门店编号不能为空")
    String subUnitNumId;

    public String getReservedNo() {
        return reservedNo;
    }

    public void setReservedNo(String reservedNo) {
        this.reservedNo = reservedNo;
    }

    public String getSubUnitNumId() {
        return subUnitNumId;
    }

    public void setSubUnitNumId(String subUnitNumId) {
        this.subUnitNumId = subUnitNumId;
    }
}
