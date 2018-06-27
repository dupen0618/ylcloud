package com.ykcloud.soa.erp.api.fi.model;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

/**
 * @Author:ALi
 * @Description: 修改参数
 * @Date:
 */
public class BillDtlForWriteBackStatus implements Serializable {
    private static final long serialVersionUID = 1L;
    @NotNull(message = "行号不能为空！")
    private String series; // 行号
    private Date orderDate; // 业务日期
    @NotNull(message = "单据编号不能为空！")
    private String reservedNo; // 单据编号
    @NotNull(message = "门店不能为空！")
    private Long subUnitNumId; // 门店
    private Long reservedTypeNumId;

    public String getSeries() {
        return series;
    }
    public void setSeries(String series) {
        this.series = series;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public String getReservedNo() {
        return reservedNo;
    }

    public void setReservedNo(String reservedNo) {
        this.reservedNo = reservedNo;
    }

    public Long getSubUnitNumId() {
        return subUnitNumId;
    }

    public void setSubUnitNumId(Long subUnitNumId) {
        this.subUnitNumId = subUnitNumId;
    }

    public Long getReservedTypeNumId() {
        return reservedTypeNumId;
    }

    public void setReservedTypeNumId(Long reservedTypeNumId) {
        this.reservedTypeNumId = reservedTypeNumId;
    }
}
