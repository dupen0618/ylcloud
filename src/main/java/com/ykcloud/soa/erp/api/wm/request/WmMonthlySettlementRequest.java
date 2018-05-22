package com.ykcloud.soa.erp.api.wm.request;

import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;

import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * @Author Hewei
 * @Date 2018/5/22 9:33
 */
public class WmMonthlySettlementRequest extends AbstractUserSessionRequest {
    private static final long serialVersionUID = 1986611973470736300L;

    @NotNull(message = "门店编号不能为空！")
    private Long subUnitNumId;

    @NotNull(message = "日结日期不能为空！")
    private Date dailySettlement;

    public Long getSubUnitNumId() {
        return subUnitNumId;
    }

    public void setSubUnitNumId(Long subUnitNumId) {
        this.subUnitNumId = subUnitNumId;
    }

    public Date getDailySettlement() {
        return dailySettlement;
    }

    public void setDailySettlement(Date dailySettlement) {
        this.dailySettlement = dailySettlement;
    }
}
