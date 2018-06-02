package com.ykcloud.soa.erp.api.wm.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;
import com.ykcloud.soa.erp.api.wm.model.CustInfoForGenerateCustBalanceBl;
import java.util.List;

/**
 * @Description: 查询未结算或部分结算的跨子公司的购销商品出库单涉及到的客户id集合，用于生成购销客户结算单的出参
 * @author: henry.wang
 * @date: 2018/6/1 14:03
 **/
public class CustInfosForGenerateCustBalanceBlFindResponse extends MessagePack {

    private static final long serialVersionUID = -8716207623324225827L;

    private List<CustInfoForGenerateCustBalanceBl> custInfos;

    public List<CustInfoForGenerateCustBalanceBl> getCustInfos() {
        return custInfos;
    }

    public void setCustInfos(
        List<CustInfoForGenerateCustBalanceBl> custInfos) {
        this.custInfos = custInfos;
    }
}
