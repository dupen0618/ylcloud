package com.ykcloud.soa.erp.api.so.request;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

/**
 * Created by yiako on 2018/4/9
 */
public class SdBlSoHdrGetReservedQtyRequest extends AbstractRequest {

    private Long soNumId;//销售单号

    public Long getSoNumId() {
        return soNumId;
    }

    public void setSoNumId(Long soNumId) {
        this.soNumId = soNumId;
    }
}
