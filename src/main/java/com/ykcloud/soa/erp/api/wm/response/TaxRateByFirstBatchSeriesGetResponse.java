package com.ykcloud.soa.erp.api.wm.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;

public class TaxRateByFirstBatchSeriesGetResponse extends MessagePack {
    private static final long serialVersionUID = 1754628776443434936L;
    private Double taxRate;//税额

    public Double getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(Double taxRate) {
        this.taxRate = taxRate;
    }
}
