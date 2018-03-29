package com.ykcloud.soa.erp.api.so.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * 查询退货审批单状态
 * @author fred.zhao
 */
public class StatusNumIdGetRequest  extends AbstractRequest{

    private static final long serialVersionUID = -1766194600343205361L;

    @NotNull(message = "门店编号不能为空!")
    private Long subUnitNumId;

    @NotNull(message = "订货日期不能为空!")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date orderDate;// 日期，格式：yyyy-mm-dd

    @NotNull(message = "退货申请单号不能为空！")
    private String applyNumId;


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
}
