package com.ykcloud.soa.erp.api.wm.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;

/**
 * fakir
 * 2018/4/18
 */
public class WorkLossChangeConfirmResponse extends MessagePack {
    private static final long serialVersionUID = 1L;
    private String lossNumId;

    public String getLossNumId() {
        return lossNumId;
    }

    public void setLossNumId(String lossNumId) {
        this.lossNumId = lossNumId;
    }
}
