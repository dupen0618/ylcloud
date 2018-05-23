package com.ykcloud.soa.erp.api.wm.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;
import com.ykcloud.soa.erp.api.fi.model.WmBlReceiptBudHdr;

/**
 * @Author Hewei
 * @Date 2018/5/23 14:43
 */
public class WmBlReceiptBudHdrResponse extends MessagePack {

    private static final long serialVersionUID = 4326331691816191888L;

    WmBlReceiptBudHdr wmBlReceiptBudHdr;

    public WmBlReceiptBudHdr getWmBlReceiptBudHdr() {
        return wmBlReceiptBudHdr;
    }

    public void setWmBlReceiptBudHdr(WmBlReceiptBudHdr wmBlReceiptBudHdr) {
        this.wmBlReceiptBudHdr = wmBlReceiptBudHdr;
    }
}
