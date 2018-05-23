package com.ykcloud.soa.erp.api.wm.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;
import com.ykcloud.soa.erp.api.fi.model.WmBlShipHdr;

/**
 * @Author Hewei
 * @Date 2018/5/23 14:37
 */
public class WmBlShipHdrResponse extends MessagePack {
    private static final long serialVersionUID = -129883236463593716L;

    WmBlShipHdr wmBlShipHdr;

    public WmBlShipHdr getWmBlShipHdr() {
        return wmBlShipHdr;
    }

    public void setWmBlShipHdr(WmBlShipHdr wmBlShipHdr) {
        this.wmBlShipHdr = wmBlShipHdr;
    }
}
