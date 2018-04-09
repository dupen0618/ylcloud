package com.ykcloud.soa.erp.api.fi.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;
import com.ykcloud.soa.erp.api.fi.model.SubjectBalance;

import java.util.List;

/**
 * @Author: fred.zhao
 * @Description:
 * @Date: Created in 15:35:2018/4/7
 */
public class ApBalanceForFinanceAuditApprovalReturnOrderGetResponse extends MessagePack {
    private static final long serialVersionUID = 1877305700555819324L;


    private List<SubjectBalance> subjectBalanceList;//科目余额列表

    private List<SubjectBalance> supplyCortSubjectBalanceList;//供应商cort下所有供应科目余额列表,same_supply_cort_sign为0时返回null



    public List<SubjectBalance> getSubjectBalanceList() {
        return subjectBalanceList;
    }

    public void setSubjectBalanceList(List<SubjectBalance> subjectBalanceList) {
        this.subjectBalanceList = subjectBalanceList;
    }

    public List<SubjectBalance> getSupplyCortSubjectBalanceList() {
        return supplyCortSubjectBalanceList;
    }

    public void setSupplyCortSubjectBalanceList(List<SubjectBalance> supplyCortSubjectBalanceList) {
        this.supplyCortSubjectBalanceList = supplyCortSubjectBalanceList;
    }
}
