package com.ykcloud.soa.erp.api.so.model;

import java.io.Serializable;
import java.util.List;

/**
 * @Author: fred.zhao
 * @Description:
 * @Date: Created in 20:37:2018/4/12
 */
public class ApplySeries implements Serializable {
    private static final long serialVersionUID = 3822634867143474721L;

    private String approvalNumId;//退货审批单号

    private List<String> series;//处理完的申请单序号

    public String getApprovalNumId() {
        return approvalNumId;
    }

    public void setApprovalNumId(String approvalNumId) {
        this.approvalNumId = approvalNumId;
    }

    public List<String> getSeries() {
        return series;
    }

    public void setSeries(List<String> series) {
        this.series = series;
    }
}
