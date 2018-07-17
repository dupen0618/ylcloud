package com.ykcloud.soa.erp.api.fi.request;

import com.gb.soa.omp.ccommon.api.annotation.ApiField;

import javax.validation.constraints.NotNull;

public class SupBillInfoInsertRequest extends TotalAmountGroupByTaxRateGetRequest {

    private static final long serialVersionUID = -5813869746370221587L;
    @ApiField(description = "操作人员编号")
    @NotNull(message = "操作人员编号不能为空!")
    private Long userNumId;

    /**
     * 操作人员编号
     * @return Long
     */
    public Long getUserNumId() {
        return userNumId;
    }

    /**
     * 操作人员编号
     * @param userNumId
     */
    public void setUserNumId(Long userNumId) {
        this.userNumId = userNumId;
    }
}
