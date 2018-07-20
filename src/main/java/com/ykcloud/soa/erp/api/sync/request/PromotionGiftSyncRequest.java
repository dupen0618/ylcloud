package com.ykcloud.soa.erp.api.sync.request;

import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;

public class PromotionGiftSyncRequest extends AbstractUserSessionRequest {
    private static final long serialVersionUID = 442174380072325926L;
    private String reservedId;

    public String getReservedId() {
        return reservedId;
    }

    public void setReservedId(String reservedId) {
        this.reservedId = reservedId;
    }
}
