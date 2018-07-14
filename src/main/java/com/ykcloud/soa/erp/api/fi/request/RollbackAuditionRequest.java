package com.ykcloud.soa.erp.api.fi.request;

import com.gb.soa.omp.ccommon.api.request.AbstractSessionRequest;

import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * 财务结算,结算单反审核请求
 *
 * @author Sealin
 * @date 2018-07-14
 */
public class RollbackAuditionRequest extends AbstractSessionRequest {
    private static final long serialVersionUID = 2608813271235725941L;
    /**
     * 门店编号
     */
    @NotNull(message = "门店不可为空")
    private Long subUnitNumId;
    /**
     * 结算日期
     */
    @NotNull(message = "结算日期")
    private Date balanceDate;
    /**
     * 结算单号
     */
    @NotNull(message = "结算单号不可为空")
    private String balanceNo;
    private Long settlementType;

    public Long getSubUnitNumId() {
        return subUnitNumId;
    }

    public void setSubUnitNumId(Long subUnitNumId) {
        this.subUnitNumId = subUnitNumId;
    }

    public Date getBalanceDate() {
        return balanceDate;
    }

    public void setBalanceDate(Date balanceDate) {
        this.balanceDate = balanceDate;
    }

    public String getBalanceNo() {
        return balanceNo;
    }

    public void setBalanceNo(String balanceNo) {
        this.balanceNo = balanceNo;
    }

    public Long getSettlementType() {
        return settlementType;
    }

    public void setSettlementType(Long settlementType) {
        this.settlementType = settlementType;
    }
}
