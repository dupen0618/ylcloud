package com.ykcloud.soa.erp.api.so.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.gb.soa.omp.ccommon.api.request.AbstractRequest;
import com.gb.soa.omp.ccommon.api.request.AbstractSessionRequest;
import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;
import com.ykcloud.soa.erp.api.so.model.ApplySeries;

import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @Author: fred.zhao
 * @Description: 更新退货申请单单头状态
 * @Date: Created in 20:05:2018/3/30
 */
public class ApplyHdrStatusForGenerateApprovalReturnOrderUpdateRequest extends AbstractUserSessionRequest {
    private static final long serialVersionUID = 7408670469942211437L;

    @NotNull(message = "门店编号不能为空!")
    private Long subUnitNumId;

    @NotNull(message = "订货日期不能为空!")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date orderDate;// 日期，格式：yyyy-mm-dd

    @NotNull(message = "退货申请单号不能为空！")
    private String applyNumId;

    @NotNull(message = "申请单身序号不能为空！")
    private List<ApplySeries> applySeriesList;


    public Long getSubUnitNumId() {
        return subUnitNumId;
    }

    public void setSubUnitNumId(Long subUnitNumId) {
        this.subUnitNumId = subUnitNumId;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public String getApplyNumId() {
        return applyNumId;
    }

    public void setApplyNumId(String applyNumId) {
        this.applyNumId = applyNumId;
    }

    public List<ApplySeries> getApplySeriesList() {
        return applySeriesList;
    }

    public void setApplySeriesList(List<ApplySeries> applySeriesList) {
        this.applySeriesList = applySeriesList;
    }


}
