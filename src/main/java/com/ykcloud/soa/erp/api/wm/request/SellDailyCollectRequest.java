package com.ykcloud.soa.erp.api.wm.request;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

import java.util.Date;

import javax.validation.constraints.NotNull;

/**
 * @author:shenq
 * @description:代销获取COSTAMOUNT
 * @date :2018/5/3 - 20:26
 * @version:v1.0
 */
public class SellDailyCollectRequest extends AbstractRequest {

    private static final long serialVersionUID = -2565804606566389460L;
    /**
     * 门店编号
     */
    @NotNull(message = "门店编号不能为空！")
    private Long subUnitNumId;

    /**
     * 销售日期
     */
    @NotNull(message = "销售日期不能为空！")
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
