package com.ykcloud.soa.erp.api.fi.model;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @Description: TODO
 * @Author: ALi
 * @Date: 2018/4/17 9:19
 */
public class BalanceDtlAppoint implements Serializable {
    private static final long serialVersionUID = 1L;
    @NotNull(message = "行号不能为空！")
    private  String series;//行号
    @NotNull(message = "单据类型不能为空！")
    private  Long  reservedTypeNumId;//单据类型

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public Long getReservedTypeNumId() {
        return reservedTypeNumId;
    }

    public void setReservedTypeNumId(Long reservedTypeNumId) {
        this.reservedTypeNumId = reservedTypeNumId;
    }
}
