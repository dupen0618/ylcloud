package com.ykcloud.soa.erp.api.wm.request;

import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;
import com.ykcloud.soa.erp.api.wm.model.WmBlCostAdjustDtl;
import com.ykcloud.soa.erp.api.wm.model.WmBlCostAdjustHdr;

public class WmCostAdjustRequest extends AbstractUserSessionRequest
{
    private static final long serialVersionUID = 1L;

    private WmBlCostAdjustHdr wmBlCostAdjustHdr;//库存金额调整单头

    private WmBlCostAdjustDtl wmBlCostAdjustDtl;//库存金额调整单表体

    public WmBlCostAdjustHdr getWmBlCostAdjustHdr()
    {
        return wmBlCostAdjustHdr;
    }

    public void setWmBlCostAdjustHdr(WmBlCostAdjustHdr wmBlCostAdjustHdr)
    {
        this.wmBlCostAdjustHdr = wmBlCostAdjustHdr;
    }

    public WmBlCostAdjustDtl getWmBlCostAdjustDtl()
    {
        return wmBlCostAdjustDtl;
    }

    public void setWmBlCostAdjustDtl(WmBlCostAdjustDtl wmBlCostAdjustDtl)
    {
        this.wmBlCostAdjustDtl = wmBlCostAdjustDtl;
    }
}
