package com.ykcloud.soa.erp.api.so.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;

/**
 * @Author: fred.zhao
 * @Description:
 * @Date: Created in 17:44:2018/3/30
 */
public class SupplyToReturnAmoutGetResponse extends MessagePack {
    private static final long serialVersionUID = 3018026679175786972L;

    private Double notReturnAmout;//已审未退金额

    public Double getNotReturnAmout() {
        return notReturnAmout;
    }

    public void setNotReturnAmout(Double notReturnAmout) {
        this.notReturnAmout = notReturnAmout;
    }
}
