package com.ykcloud.soa.erp.api.scm.request;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

import javax.validation.constraints.NotNull;

public class ScmBlChangeCostRequest extends AbstractRequest
{
    private static final long serialVersionUID = 1L;
    @NotNull(message = "门店编号不能为空")
    private Long subUnitNumId;
    @NotNull(message = "调整库存成本标志不能为空")//(0=不调整库存 1=调低库存)
    private Long upCostFlag;
    @NotNull(message = "状态不能为空")
    private Long statusNumId;

    public Long getSubUnitNumId()
    {
        return subUnitNumId;
    }

    public void setSubUnitNumId(Long subUnitNumId)
    {
        this.subUnitNumId = subUnitNumId;
    }

    public Long getUpCostFlag()
    {
        return upCostFlag;
    }

    public void setUpCostFlag(Long upCostFlag)
    {
        this.upCostFlag = upCostFlag;
    }

    public Long getStatusNumId()
    {
        return statusNumId;
    }

    public void setStatusNumId(Long statusNumId)
    {
        this.statusNumId = statusNumId;
    }
}
