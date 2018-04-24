package com.ykcloud.soa.erp.api.scm.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;

/**
 * @Author:ALi
 * @Description: 获得结算周期
 * @Date:
 */
public class SupplyPayTypeIdGetResponse extends MessagePack {
    private static final long serialVersionUID = -1621207553036267818L;
    private Long payTypeId;

    public Long getPayTypeId() {
        return payTypeId;
    }

    public void setPayTypeId(Long payTypeId) {
        this.payTypeId = payTypeId;
    }
}
