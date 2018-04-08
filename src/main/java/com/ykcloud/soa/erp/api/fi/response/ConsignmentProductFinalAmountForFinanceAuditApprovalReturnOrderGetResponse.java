package com.ykcloud.soa.erp.api.fi.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;

/**
 * @Author: fred.zhao
 * @Description: 获取门店、供应别代销商品款期末余额
 * @Date: Created in 17:32:2018/4/7
 */
public class ConsignmentProductFinalAmountForFinanceAuditApprovalReturnOrderGetResponse extends MessagePack {
    private static final long serialVersionUID = 5635050325001099072L;

    private Double finalAmount;//供应商期末金额

    private Double supplyCortFinalAmount;//供应商公司期末金额, supply_cort_sign为0时，返回null

    public Double getFinalAmount() {
        return finalAmount;
    }

    public void setFinalAmount(Double finalAmount) {
        this.finalAmount = finalAmount;
    }

    public Double getSupplyCortFinalAmount() {
        return supplyCortFinalAmount;
    }

    public void setSupplyCortFinalAmount(Double supplyCortFinalAmount) {
        this.supplyCortFinalAmount = supplyCortFinalAmount;
    }
}
