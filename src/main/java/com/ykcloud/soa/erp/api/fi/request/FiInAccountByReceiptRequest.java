package com.ykcloud.soa.erp.api.fi.request;

import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;
import com.ykcloud.soa.erp.api.fi.model.FiConsignmentProductAccountWba;

import javax.validation.constraints.NotNull;

/**
 * @Author Hewei
 * @Date 2018/4/18 9:51
 */
public class FiInAccountByReceiptRequest extends AbstractUserSessionRequest{
    private static final long serialVersionUID = 1L;

    @NotNull(message = "订单编号不能为空！")
    String reservedNo;
    @NotNull(message = "单据类型不能为空！")
    String typeNumId;
    @NotNull(message="门店编号不能为空")
    Long subUnitNumId;

    Long balaFuncId;

    FiConsignmentProductAccountWba fiConsignmentProductAccountWba;

    public String getReservedNo() {
        return reservedNo;
    }

    public void setReservedNo(String reservedNo) {
        this.reservedNo = reservedNo;
    }

    public String getTypeNumId() {
        return typeNumId;
    }

    public void setTypeNumId(String typeNumId) {
        this.typeNumId = typeNumId;
    }

    public Long getBalaFuncId() {
        return balaFuncId;
    }

    public void setBalaFuncId(Long balaFuncId) {
        this.balaFuncId = balaFuncId;
    }

    public Long getSubUnitNumId() {
        return subUnitNumId;
    }

    public void setSubUnitNumId(Long subUnitNumId) {
        this.subUnitNumId = subUnitNumId;
    }

    public FiConsignmentProductAccountWba getFiConsignmentProductAccountWba() {
        return fiConsignmentProductAccountWba;
    }

    public void setFiConsignmentProductAccountWba(FiConsignmentProductAccountWba fiConsignmentProductAccountWba) {
        this.fiConsignmentProductAccountWba = fiConsignmentProductAccountWba;
    }
}
