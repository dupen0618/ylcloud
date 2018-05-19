package com.ykcloud.soa.erp.api.so.request;

import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;

import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * @Author:ALi
 * @Description: 修改验收入库主表
 * @Date:
 */
public class ItemSellDailyHdrAndDtlStatusNumIdUpdateRequest extends AbstractUserSessionRequest {
    private static final long serialVersionUID = -3101956261800131597L;
    @NotNull(message = "门店编号不能为空！")
    private Long subUnitNumId;
    @NotNull(message = "单据编号不能为空！")
    private String reservedNo;
    @NotNull(message = "行号不能为空！")
    private String series; // 行号
    @NotNull(message = "业务日期不能为空！")
    private Date orderDate; // 业务日期
    @NotNull(message = "结算状态不能为空！")//表体结算状态
    private Long statusNumId;
    private Long hdrStatusNumId;//表头结算状态

    public String getReservedNo() {
        return reservedNo;
    }

    public void setReservedNo(String reservedNo) {
        this.reservedNo = reservedNo;
    }

    public Long getStatusNumId() {
        return statusNumId;
    }

    public void setStatusNumId(Long statusNumId) {
        this.statusNumId = statusNumId;
    }

    public Long getSubUnitNumId() {
        return subUnitNumId;
    }

    public void setSubUnitNumId(Long subUnitNumId) {
        this.subUnitNumId = subUnitNumId;
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

    public Long getHdrStatusNumId() {
        return hdrStatusNumId;
    }

    public void setHdrStatusNumId(Long hdrStatusNumId) {
        this.hdrStatusNumId = hdrStatusNumId;
    }
}
