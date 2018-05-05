package com.ykcloud.soa.erp.api.fi.request;

import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;

import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * @author:shenq
 * @description: 商品进销存毛利
 * @date :2018/5/4 - 17:41
 * @version:v1.0
 */
public class CalcSaleGrossProfitRequest extends AbstractUserSessionRequest {

    /**
     * 销售日期
     */
    @NotNull(message = "销售日期不能为空")
    private Date orderDate;

    /**
     * 门店编号
     */
    @NotNull(message = "门店编号不能为空")
    private Long subUnitNumId;

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Long getSubUnitNumId() {
        return subUnitNumId;
    }

    public void setSubUnitNumId(Long subUnitNumId) {
        this.subUnitNumId = subUnitNumId;
    }
}
