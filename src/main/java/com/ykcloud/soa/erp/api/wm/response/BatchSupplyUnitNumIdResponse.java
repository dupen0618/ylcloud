package com.ykcloud.soa.erp.api.wm.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;

import java.util.List;

/**
 * @Author:ALi
 * @Description: 获得供应商
 * @Date:
 */
public class BatchSupplyUnitNumIdResponse   extends MessagePack {
    private static final long serialVersionUID = -3708825331021090125L;
    private List<Long> list;

    public List<Long> getList() {
        return list;
    }

    public void setList(List<Long> list) {
        this.list = list;
    }
}
