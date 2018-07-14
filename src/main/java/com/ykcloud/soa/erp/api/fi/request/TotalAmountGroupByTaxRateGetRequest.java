package com.ykcloud.soa.erp.api.fi.request;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 *
 * @Description: 根据税率汇总金额
 *
 * @auther: sheen.lee
 * @date: 15:20 2018/7/14
 * @param:
 * @return:
 *
 */
public class TotalAmountGroupByTaxRateGetRequest extends AbstractRequest {
    private static final long serialVersionUID = 7760183216457894957L;

    @NotNull(message = "结算单号不能为空！")
    private Long balanceNo;
    @NotNull(message = "门店不能为空！")
    private Long subUnitNumId;
    @NotNull(message = "结算日期不能为空！")
    private Date balanceDate;

    public Long getBalanceNo() {
        return balanceNo;
    }

    public void setBalanceNo(Long balanceNo) {
        this.balanceNo = balanceNo;
    }

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
}
