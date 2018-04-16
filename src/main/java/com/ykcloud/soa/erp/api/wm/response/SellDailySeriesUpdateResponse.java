package com.ykcloud.soa.erp.api.wm.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;
import com.ykcloud.soa.erp.api.wm.model.WmSellDaily;

import java.util.List;

/**
 * @Description: 销售日报出库修改出参
 * @Author: ALi
 * @Date: 2018/4/13 20:49
 */
public class SellDailySeriesUpdateResponse  extends MessagePack {
    private static final long serialVersionUID = -3708825331021090125L;
    private  Integer  sum;//修改行数

    public Integer getSum() {
        return sum;
    }

    public void setSum(Integer sum) {
        this.sum = sum;
    }
}
