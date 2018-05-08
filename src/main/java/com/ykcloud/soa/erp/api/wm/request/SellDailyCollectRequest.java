package com.ykcloud.soa.erp.api.wm.request;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

import java.util.Date;

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
    private Long subUnitNumId;

    /**
     * 商品编号
     */
    private Long itemNumId;

    /**
     * 出货物理仓库
     */
    private Long physicalNumId;

    /**
     * 商品产地
     */
    private Integer productOriginNumId;

    /**
     * 结算方式
     */
    private Long settlementType;

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

    public Long getItemNumId() {
        return itemNumId;
    }

    public void setItemNumId(Long itemNumId) {
        this.itemNumId = itemNumId;
    }

    public Long getPhysicalNumId() {
        return physicalNumId;
    }

    public void setPhysicalNumId(Long physicalNumId) {
        this.physicalNumId = physicalNumId;
    }

    public Integer getProductOriginNumId() {
        return productOriginNumId;
    }

    public void setProductOriginNumId(Integer productOriginNumId) {
        this.productOriginNumId = productOriginNumId;
    }

    public Long getSettlementType() {
        return settlementType;
    }

    public void setSettlementType(Long settlementType) {
        this.settlementType = settlementType;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }
}
