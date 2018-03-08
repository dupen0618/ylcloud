package com.ykcloud.soa.erp.api.md.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;

/**
 * Created by yiako on 2018/3/8
 */
public class MdShopRespone extends MessagePack {

    private Long subUnitNumId;//总部门店编号

    public Long getSubUnitNumId() {
        return subUnitNumId;
    }

    public void setSubUnitNumId(Long subUnitNumId) {
        this.subUnitNumId = subUnitNumId;
    }
}
