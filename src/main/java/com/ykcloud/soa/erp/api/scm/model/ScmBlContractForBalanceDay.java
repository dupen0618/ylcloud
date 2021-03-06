package com.ykcloud.soa.erp.api.scm.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Sealin
 */
public class ScmBlContractForBalanceDay implements Serializable {
    private static final long serialVersionUID = -4927882135812873801L;
    private Long payTypeId;
    private Date beginDay;
    private Date endDay;
    private Integer balanceDay;
    private Long delayDay;

    public Long getPayTypeId() {
        return payTypeId;
    }

    public void setPayTypeId(Long payTypeId) {
        this.payTypeId = payTypeId;
    }

    public Date getBeginDay() {
        return beginDay;
    }

    public void setBeginDay(Date beginDay) {
        this.beginDay = beginDay;
    }

    public Date getEndDay() {
        return endDay;
    }

    public void setEndDay(Date endDay) {
        this.endDay = endDay;
    }

    public Integer getBalanceDay() {
        return balanceDay;
    }

    public void setBalanceDay(Integer balanceDay) {
        this.balanceDay = balanceDay;
    }

    public Long getDelayDay() {
        return delayDay;
    }

    public void setDelayDay(Long delayDay) {
        this.delayDay = delayDay;
    }
}
