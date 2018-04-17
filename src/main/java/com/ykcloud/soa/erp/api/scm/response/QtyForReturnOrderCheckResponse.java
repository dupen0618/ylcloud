package com.ykcloud.soa.erp.api.scm.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;
import com.ykcloud.soa.erp.api.scm.model.ReturnProductCheck;

import java.util.List;

/**
 * @Author: fred.zhao
 * @Description:
 * @Date: Created in 9:46:2018/4/12
 */
public class QtyForReturnOrderCheckResponse extends MessagePack {
    private static final long serialVersionUID = 1254996987277550862L;

    private List<ReturnProductCheck> data;

    public List<ReturnProductCheck> getData() {
        return data;
    }

    public void setData(List<ReturnProductCheck> data) {
        this.data = data;
    }
}
