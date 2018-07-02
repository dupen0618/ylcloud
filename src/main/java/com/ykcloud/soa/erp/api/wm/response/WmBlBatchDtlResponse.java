package com.ykcloud.soa.erp.api.wm.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;

/**
 * @Author Hewei
 * @Date 2018/5/22 16:11
 */
public class WmBlBatchDtlResponse extends MessagePack {
    private static final long serialVersionUID = -9043426126910933388L;
    private Double qty;
    private Double price;
    private Double TAX_RATE;
    private Long settlementType;

    public void setQty(Double qty) {
        this.qty = qty;
    }

    public Double getQty() {
        return qty;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getPrice() {
        return price;
    }

    public void setTAX_RATE(Double tax_rate) {
        this.TAX_RATE = tax_rate;
    }

    public Double getTAX_RATE() {
        return TAX_RATE;
    }

    public Long getSettlementType() {
        return settlementType;
    }

    public void setSettlementType(Long settlementType) {
        this.settlementType = settlementType;
    }
}
