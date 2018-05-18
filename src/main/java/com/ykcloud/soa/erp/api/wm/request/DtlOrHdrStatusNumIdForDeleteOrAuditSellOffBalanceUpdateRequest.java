package com.ykcloud.soa.erp.api.wm.request;

import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;

import javax.validation.constraints.NotNull;

/**
 * @Author:ALi
 * @Description: 修改验收入库主表
 * @Date:
 */
public class DtlOrHdrStatusNumIdForDeleteOrAuditSellOffBalanceUpdateRequest extends AbstractUserSessionRequest {
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
    @NotNull(message = "结算状态不能为空！")//表体结算状态
    private Long statusNumId;
    private Long hdrStatusNumId;//表头结算状态
    private boolean flagAudit;//是否需要判断审核

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

    public Long getReservedTypeNumId() {
        return reservedTypeNumId;
    }

    public void setReservedTypeNumId(Long reservedTypeNumId) {
        this.reservedTypeNumId = reservedTypeNumId;
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

    public Long getHdrStatusNumId() {
        return hdrStatusNumId;
    }

    public void setHdrStatusNumId(Long hdrStatusNumId) {
        this.hdrStatusNumId = hdrStatusNumId;
    }

    public boolean isFlagAudit() {
        return flagAudit;
    }

    public void setFlagAudit(boolean flagAudit) {
        this.flagAudit = flagAudit;
    }
}
