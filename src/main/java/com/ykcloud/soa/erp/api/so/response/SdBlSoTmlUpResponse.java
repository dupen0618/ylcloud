package com.ykcloud.soa.erp.api.so.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;

import java.io.Serializable;

public class SdBlSoTmlUpResponse extends MessagePack implements Serializable {

    //影响行数
    private Long row;

    public Long getRow() {
        return row;
    }

    public void setRow(Long row) {
        this.row = row;
    }
}
