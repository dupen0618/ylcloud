package com.ykcloud.soa.erp.api.fi.request;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * @Description: TODO
 * @Author: ALi
 * @Date: 2018/4/17 20:32
 */
public class DiscountUnderCutSnapGetRequest extends AbstractRequest {
    private static final long serialVersionUID = 1L;
    @NotNull(message = "供应商信息不能为空！")
    private Long supplyUnitNumId;
    @NotNull(message = "商品编号不能为空！")
    private Long itemNumId;
    @NotNull(message = "业务日期不能为空！")
    private Date operatDate;
    @NotNull(message = "采购协议单号不能为空！")
    private String reservedNo;

    public Long getSupplyUnitNumId() {
        return supplyUnitNumId;
    }

    public void setSupplyUnitNumId(Long supplyUnitNumId) {
        this.supplyUnitNumId = supplyUnitNumId;
    }

    public Long getItemNumId() {
        return itemNumId;
    }

    public void setItemNumId(Long itemNumId) {
        this.itemNumId = itemNumId;
    }

    public Date getOperatDate() {
        return operatDate;
    }

    public void setOperatDate(Date operatDate) {
        this.operatDate = operatDate;
    }

    public String getReservedNo() {
        return reservedNo;
    }

    public void setReservedNo(String reservedNo) {
        this.reservedNo = reservedNo;
    }
}
