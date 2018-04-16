package com.ykcloud.soa.erp.api.wm.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;

/**
 * @Author: fred.zhao
 * @Description:
 * @Date: Created in 18:48:2018/4/12
 */
public class ShipForMaterialIssueBackGenerateResponse extends MessagePack {
    private static final long serialVersionUID = 3983456256727256371L;

    private String reservedNo;


    public String getReservedNo() {
        return reservedNo;
    }

    public void setReservedNo(String reservedNo) {
        this.reservedNo = reservedNo;
    }
}
