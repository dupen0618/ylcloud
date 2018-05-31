package com.ykcloud.soa.erp.api.scm.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;
import com.ykcloud.soa.erp.api.scm.model.ScmBlContractForBalanceDay;

/**
 * @author ALi
 * @Description: 获得结算周期
 */
public class SupplyPayTypeIdGetResponse extends MessagePack {
    private static final long serialVersionUID = -1621207553036267818L;
    private ScmBlContractForBalanceDay payTypeInfo;

    public ScmBlContractForBalanceDay getPayTypeInfo() {
        return payTypeInfo;
    }

    public void setPayTypeInfo(ScmBlContractForBalanceDay payTypeInfo) {
        this.payTypeInfo = payTypeInfo;
    }
}
