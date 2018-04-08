package com.ykcloud.soa.erp.api.fi.model;

import java.io.Serializable;

/**
 * @Author: fred.zhao
 * @Description:科目对象
 * @Date: Created in 15:51:2018/4/7
 */
public class SubjectBalance implements Serializable {

    private static final long serialVersionUID = -8794263871888252779L;

    private Long subjectNumId;

    private Double balanceAmount;

    public Long getSubjectNumId() {
        return subjectNumId;
    }

    public void setSubjectNumId(Long subjectNumId) {
        this.subjectNumId = subjectNumId;
    }

    public Double getBalanceAmount() {
        return balanceAmount;
    }

    public void setBalanceAmount(Double balanceAmount) {
        this.balanceAmount = balanceAmount;
    }
}
