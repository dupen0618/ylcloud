package com.ykcloud.soa.erp.api.so.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;

/**
 * @Author: fred.zhao
 * @Description:
 * @Date: Created in 16:16:2018/4/19
 */
public class CountSoTmlHdrGetResponse extends MessagePack {
    private static final long serialVersionUID = -5736882359414030590L;

    private Integer count;

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}
