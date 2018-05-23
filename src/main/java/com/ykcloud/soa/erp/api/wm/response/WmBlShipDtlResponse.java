package com.ykcloud.soa.erp.api.wm.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;
import com.ykcloud.soa.erp.api.fi.model.WmBlShipDtl;

import java.util.List;

/**
 * @Author Hewei
 * @Date 2018/5/23 14:41
 */
public class WmBlShipDtlResponse extends MessagePack {
    private static final long serialVersionUID = 7982042445858014401L;

    List<WmBlShipDtl> wmBlShipDtlList;

    public List<WmBlShipDtl> getWmBlShipDtlList() {
        return wmBlShipDtlList;
    }

    public void setWmBlShipDtlList(List<WmBlShipDtl> wmBlShipDtlList) {
        this.wmBlShipDtlList = wmBlShipDtlList;
    }
}
