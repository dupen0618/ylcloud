package com.ykcloud.soa.erp.api.wm.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;

/**
 * @Description: TODO
 * @Author: ALi
 * @Date: 2018/4/17 19:43
 */
public class DiscountUndercutSnapGetResponse extends MessagePack {
    private static final long serialVersionUID = -420261746747848058L;
    private Double undercutSnap1;
    private Double undercutSnap2;
    private Double undercutSnap3;
    private Double undercutSnap4;
    private Double discount1;
    private Double discount2;
    private Double discount3;

    public Double getUndercutSnap1() {
        return undercutSnap1;
    }

    public void setUndercutSnap1(Double undercutSnap1) {
        this.undercutSnap1 = undercutSnap1;
    }

    public Double getUndercutSnap2() {
        return undercutSnap2;
    }

    public void setUndercutSnap2(Double undercutSnap2) {
        this.undercutSnap2 = undercutSnap2;
    }

    public Double getUndercutSnap3() {
        return undercutSnap3;
    }

    public void setUndercutSnap3(Double undercutSnap3) {
        this.undercutSnap3 = undercutSnap3;
    }

    public Double getUndercutSnap4() {
        return undercutSnap4;
    }

    public void setUndercutSnap4(Double undercutSnap4) {
        this.undercutSnap4 = undercutSnap4;
    }

    public Double getDiscount1() {
        return discount1;
    }

    public void setDiscount1(Double discount1) {
        this.discount1 = discount1;
    }

    public Double getDiscount2() {
        return discount2;
    }

    public void setDiscount2(Double discount2) {
        this.discount2 = discount2;
    }

    public Double getDiscount3() {
        return discount3;
    }

    public void setDiscount3(Double discount3) {
        this.discount3 = discount3;
    }
}
