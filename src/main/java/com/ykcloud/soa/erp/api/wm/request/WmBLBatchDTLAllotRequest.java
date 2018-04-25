package com.ykcloud.soa.erp.api.wm.request;

import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;

import javax.validation.constraints.NotNull;

/**
 * @Author Hewei
 * @Date 2018/4/9 9:18
 */
public class WmBLBatchDTLAllotRequest extends AbstractUserSessionRequest {
	private static final long serialVersionUID = 1L;

	//updateBatchDtlByShip用
//    @NotNull(message = "订单编号不能为空！")
    String reservedNo;

    //updateBatchDtlByContainer用
    @NotNull(message = "装箱单号不能为空！")
    String containerSerlno;
    @NotNull(message="门店编号不能为空")
    Long subUnitNumId;

    public String getReservedNo() {
        return reservedNo;
    }

    public void setReservedNo(String reservedNo) {
        this.reservedNo = reservedNo;
    }

    public String getContainerSerlno() {
        return containerSerlno;
    }

    public void setContainerSerlno(String containerSerlno) {
        this.containerSerlno = containerSerlno;
    }

    public Long getSubUnitNumId() {
        return subUnitNumId;
    }

    public void setSubUnitNumId(Long subUnitNumId) {
        this.subUnitNumId = subUnitNumId;
    }
}
