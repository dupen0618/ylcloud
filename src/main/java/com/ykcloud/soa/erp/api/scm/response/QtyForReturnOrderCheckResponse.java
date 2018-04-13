package com.ykcloud.soa.erp.api.scm.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;

/**
 * @Author: fred.zhao
 * @Description:
 * @Date: Created in 9:46:2018/4/12
 */
public class QtyForReturnOrderCheckResponse extends MessagePack {
    private static final long serialVersionUID = 1254996987277550862L;
    private Double qty;//数量

    private Double packageQty;//件数量

    private Double stockQty;//库存数量

    public Double getQty() {
        return qty;
    }

    public void setQty(Double qty) {
        this.qty = qty;
    }

    public Double getPackageQty() {
        return packageQty;
    }

    public void setPackageQty(Double packageQty) {
        this.packageQty = packageQty;
    }

    public Double getStockQty() {
        return stockQty;
    }

    public void setStockQty(Double stockQty) {
        this.stockQty = stockQty;
    }
}
