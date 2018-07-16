package com.ykcloud.soa.erp.api.fi.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;
import com.ykcloud.soa.erp.api.fi.model.BalanceTotalAmount;

import java.util.List;

/**
 *
 * @Description: 根据税率汇总金额
 *
 * @auther: sheen.lee
 * @date: 15:19 2018/7/14
 * @param:
 * @return:
 *
 */
public class TotalAmountGroupByTaxRateGetResponse extends MessagePack {

    private static final long serialVersionUID = -5263333989932540555L;

    private List<BalanceTotalAmount> data;

    public List<BalanceTotalAmount> getData() {
        return data;
    }

    public void setData(List<BalanceTotalAmount> data) {
        this.data = data;
    }
}
