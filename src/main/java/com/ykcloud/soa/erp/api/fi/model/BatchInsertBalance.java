package com.ykcloud.soa.erp.api.fi.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

/**
 * @Author:ALi
 * @Description:
 * @Date:
 */
public class BatchInsertBalance implements Serializable {
    private static final long serialVersionUID = 1L;
    @NotNull(message = "供应商不能为空！")
    private Long supplyUnitNumId;
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @NotNull(message = "结束日期不能为空！")
    private Date endDate;

    public Long getSupplyUnitNumId() {
        return supplyUnitNumId;
    }

    public void setSupplyUnitNumId(Long supplyUnitNumId) {
        this.supplyUnitNumId = supplyUnitNumId;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}
