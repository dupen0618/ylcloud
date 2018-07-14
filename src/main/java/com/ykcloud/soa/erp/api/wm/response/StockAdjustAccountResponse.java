package com.ykcloud.soa.erp.api.wm.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;
import com.ykcloud.soa.erp.api.wm.model.GoodsNotEnoughForStockadjust;
import java.util.List;

/**
 * @Description: 盈亏单入账的出参
 * @author: henry.wang
 * @date: 2018/4/17 11:52
 **/
public class StockAdjustAccountResponse extends MessagePack {

    private static final long serialVersionUID = -8716207623324225827L;

    private List<GoodsNotEnoughForStockadjust> notEnoughList;

    public List<GoodsNotEnoughForStockadjust> getNotEnoughList() {
        return notEnoughList;
    }

    public void setNotEnoughList(
        List<GoodsNotEnoughForStockadjust> notEnoughList) {
        this.notEnoughList = notEnoughList;
    }
}
