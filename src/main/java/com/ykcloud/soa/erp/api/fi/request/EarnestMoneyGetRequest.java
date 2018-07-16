package com.ykcloud.soa.erp.api.fi.request;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

<<<<<<< HEAD
import javax.validation.constraints.NotNull;

public class EarnestMoneyGetRequest extends AbstractRequest {
    @NotNull(message = "门店编号不能为空！")
    private Long subUnitNumId;
    @NotNull(message = "供应商编号不能为空！")
=======
public class EarnestMoneyGetRequest extends AbstractRequest {
    private static final long serialVersionUID = 1L;
    private Long subUnitNumId;
>>>>>>> 去合同保证金
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
