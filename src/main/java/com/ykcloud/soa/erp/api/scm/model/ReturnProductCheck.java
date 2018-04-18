package com.ykcloud.soa.erp.api.scm.model;

import java.io.Serializable;

/**
 * @Author: fred.zhao
 * @Description:
 * @Date: Created in 18:10:2018/4/18
 */
public class ReturnProductCheck implements Serializable {
    private static final long serialVersionUID = 3729077346782730829L;
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
