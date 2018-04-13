package com.ykcloud.soa.erp.api.wm.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;
import com.ykcloud.soa.erp.api.so.model.MaterialIssueBackForGenerateShip;

import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * @Author: fred.zhao
 * @Description:
 * @Date: Created in 18:47:2018/4/12
 */
public class ShipForMaterialIssueBackGenerateRequest extends AbstractUserSessionRequest {
    private static final long serialVersionUID = -2565804606566389459L;

    @NotNull(message = "门店编号不能为空！")
    private Long subUnitNumId;

    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @NotNull(message = "订单日期不能为空！")
    private Date orderDate;

    @NotNull(message = "申请单号不能为空！")
    private String applyNumId;

    @NotNull(message = "申请单数据不能为空！")
    private MaterialIssueBackForGenerateShip generateShip;


    public MaterialIssueBackForGenerateShip getGenerateShip() {
        return generateShip;
    }

    public void setGenerateShip(MaterialIssueBackForGenerateShip generateShip) {
        this.generateShip = generateShip;
    }

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
