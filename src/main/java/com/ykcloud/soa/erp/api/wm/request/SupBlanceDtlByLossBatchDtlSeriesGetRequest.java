package com.ykcloud.soa.erp.api.wm.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * @Author:ALi
 * @Description: 根据行号获得
 * @Date:
 */
public class SupBlanceDtlByLossBatchDtlSeriesGetRequest extends AbstractRequest {
    private static final long serialVersionUID = -3101956261800131597L;
    @NotNull(message = "门店编号不能为空！")
    private Long subUnitNumId;
    @NotNull(message = "单据编号不能为空！")
    private String reservedNo;
    @NotNull(message = "行号不能为空！")
    private String series;
    @NotNull(message = "订货日期不能为空！")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date orderDate;

    public Long getSubUnitNumId() {
        return subUnitNumId;
    }

    public void setSubUnitNumId(Long subUnitNumId) {
        this.subUnitNumId = subUnitNumId;
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

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }
}
