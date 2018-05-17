package com.ykcloud.soa.erp.api.fi.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author:ALi
 * @Description: TODO
 * @Date:
 */
public class AppointBalanceCut implements Serializable {
    private static final long serialVersionUID = 1L;
    private Date orderDate; // 业务日期
    private String reservedNo;
    private String series; // 行号

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

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }
}
