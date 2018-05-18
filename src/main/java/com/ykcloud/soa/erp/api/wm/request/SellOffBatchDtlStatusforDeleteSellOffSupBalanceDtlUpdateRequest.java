package com.ykcloud.soa.erp.api.wm.request;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;
import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;

import javax.validation.constraints.NotNull;

/**
 * @Author:ALi
 * @Description: 根据行号获得
 * @Date:
 */
public class SellOffBatchDtlStatusforDeleteSellOffSupBalanceDtlUpdateRequest extends AbstractUserSessionRequest {
    private static final long serialVersionUID = -3101956261800131597L;
    @NotNull(message = "门店编号不能为空！")
    private Long subUnitNumId;
    @NotNull(message = "单据编号不能为空！")
    private String reservedNo;
    @NotNull(message = "商品不能为空！")
    private Long itemNumId;
    @NotNull(message = "批次行号不能为空！")
    private String batchSeries;
    @NotNull(message = "业务类型不能为空！")
    private Long reservedTypeNumId;
    @NotNull(message = "结算状态不能为空！")
    private Long statusNumId;

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

    public Long getItemNumId() {
        return itemNumId;
    }

    public void setItemNumId(Long itemNumId) {
        this.itemNumId = itemNumId;
    }

    public String getBatchSeries() {
        return batchSeries;
    }

    public void setBatchSeries(String batchSeries) {
        this.batchSeries = batchSeries;
    }

    public Long getReservedTypeNumId() {
        return reservedTypeNumId;
    }

    public void setReservedTypeNumId(Long reservedTypeNumId) {
        this.reservedTypeNumId = reservedTypeNumId;
    }

    public Long getStatusNumId() {
        return statusNumId;
    }

    public void setStatusNumId(Long statusNumId) {
        this.statusNumId = statusNumId;
    }
}
