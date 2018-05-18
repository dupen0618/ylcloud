package com.ykcloud.soa.erp.api.fi.model;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

/**
 * @Author:ALi
 * @Description: TODO
 * @Date:
 */
public class SeriesAndOrderDateForUpdate implements Serializable {
    private static final long serialVersionUID = 1L;
    @NotNull(message = "行号不能为空！")
    private String series; // 行号
    @NotNull(message = "业务日期不能为空！")
    private Date orderDate; // 业务日期

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
}
