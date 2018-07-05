package com.ykcloud.soa.erp.api.fi.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;

import javax.validation.constraints.NotNull;
import java.util.Date;

public class InvoiceAuditRequest extends AbstractUserSessionRequest{
    @NotNull(message = "门店不能为空！")
    private Long subUnitNumId;
    @NotNull(message = "开票日期不能为空！")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date billDate;
    @NotNull(message = "结算单号不能为空！")
    private String billNumId;

    public Long getSubUnitNumId() {
        return subUnitNumId;
    }

    public void setSubUnitNumId(Long subUnitNumId) {
        this.subUnitNumId = subUnitNumId;
    }

    public Date getBillDate() {
        return billDate;
    }

    public void setBillDate(Date billDate) {
        this.billDate = billDate;
    }

    public String getBillNumId() {
        return billNumId;
    }

    public void setBillNumId(String billNumId) {
        this.billNumId = billNumId;
    }
}
