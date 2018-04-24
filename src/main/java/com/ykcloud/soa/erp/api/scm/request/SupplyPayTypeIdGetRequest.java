package com.ykcloud.soa.erp.api.scm.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * @Author:ALi
 * @Description: 获得结算周期
 * @Date:
 */
public class SupplyPayTypeIdGetRequest extends AbstractRequest {

    private static final long serialVersionUID = 7988475632052221318L;

    @NotNull(message = "门店编号不能为空！")
    private Long unitNumId;
    @NotNull(message = "供应商不能为空！")
    private Long supplyUnitNumId;
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @NotNull(message = "订单日期不能为空！")
    private Date orderDate;
    @NotNull(message = "经营类型不能为空！")
    private Long settlementType;

    public Long getUnitNumId() {
        return unitNumId;
    }

    public void setUnitNumId(Long unitNumId) {
        this.unitNumId = unitNumId;
    }

    public Long getSupplyUnitNumId() {
        return supplyUnitNumId;
    }

    public void setSupplyUnitNumId(Long supplyUnitNumId) {
        this.supplyUnitNumId = supplyUnitNumId;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Long getSettlementType() {
        return settlementType;
    }

    public void setSettlementType(Long settlementType) {
        this.settlementType = settlementType;
    }
}
