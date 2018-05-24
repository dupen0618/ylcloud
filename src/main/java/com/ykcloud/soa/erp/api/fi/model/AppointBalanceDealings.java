package com.ykcloud.soa.erp.api.fi.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

/**
 * @Author:ALi
 * @Description: TODO
 * @Date:
 */
public class AppointBalanceDealings implements Serializable {
    private static final long serialVersionUID = 1L;
    @NotNull(message = "行号不能为空！")
    private String series; // 行号
    @NotNull(message = "orderDate日期不能为空！")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date orderDate; // 业务日期
    @NotNull(message = "单据编号不能为空！")
    private String reservedNo;
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
