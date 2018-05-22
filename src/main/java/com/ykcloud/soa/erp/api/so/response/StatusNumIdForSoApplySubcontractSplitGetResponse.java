package com.ykcloud.soa.erp.api.so.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;

public class StatusNumIdForSoApplySubcontractSplitGetResponse extends MessagePack {

    private static final long serialVersionUID = 1L;

    private Long statusNumId;

    public Long getStatusNumId() {
        return statusNumId;
    }

    public void setStatusNumId(Long statusNumId) {
        this.statusNumId = statusNumId;
    }
}
