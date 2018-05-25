package com.ykcloud.soa.erp.api.wm.request;

import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;

import javax.validation.constraints.NotNull;

/**
 * @Author Hewei
 * @Date 2018/5/22 16:10
 */
public class WmBlBatchDtlRequest extends AbstractUserSessionRequest {

    private static final long serialVersionUID = -5713701582172190840L;
    
    @NotNull(message = "门店编号不能为空！")
    private Long subUnitNumId;
    @NotNull(message = "批次编号编号不能为空！")
    private String batchSeries;


    public Long getSubUnitNumId() {
        return subUnitNumId;
    }

    public void setSubUnitNumId(Long subUnitNumId) {
        this.subUnitNumId = subUnitNumId;
    }

    public void setBatchSeries(String batchSeries) {
        this.batchSeries = batchSeries;
    }

    public String getBatchSeries() {
        return batchSeries;
    }
}
