package com.ykcloud.soa.erp.api.fi.request;

import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;
import com.ykcloud.soa.erp.api.wm.model.WmBlWorkHdr;

public class GenerateSupplierRequest extends AbstractUserSessionRequest {
    private static final long serialVersionUID = 1L;

    private WmBlWorkHdr wmBlWorkHdr;//加工单头表

    public WmBlWorkHdr getWmBlWorkHdr() {
        return wmBlWorkHdr;
    }

    public void setWmBlWorkHdr(WmBlWorkHdr wmBlWorkHdr) {
        this.wmBlWorkHdr = wmBlWorkHdr;
    }
}
