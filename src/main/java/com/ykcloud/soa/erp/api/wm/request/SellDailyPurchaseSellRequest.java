package com.ykcloud.soa.erp.api.wm.request;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

import java.util.Date;

/**
 * @author:shenq
 * @description:代销获取COSTAMOUNT
 * @date :2018/5/3 - 20:26
 * @version:v1.0
 */
public class SellDailyPurchaseSellRequest extends AbstractRequest {

    /**
     * 门店编号
     */
    private Long subUnitNumId;
    /**
     * 销售日期
     */
    private Date orderDate;

    public Long getSubUnitNumId() {
        return subUnitNumId;
    }

    public void setSubUnitNumId(Long subUnitNumId) {
        this.subUnitNumId = subUnitNumId;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }
}
