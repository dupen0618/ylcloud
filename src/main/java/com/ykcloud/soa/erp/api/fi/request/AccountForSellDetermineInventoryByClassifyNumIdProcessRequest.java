package com.ykcloud.soa.erp.api.fi.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.gb.soa.omp.ccommon.api.annotation.ApiField;
import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;
import java.util.Date;
import javax.validation.constraints.NotNull;

/**
 * @Description: 以销定入商品日结财务成本处理的入参
 * @author: henry.wang
 * @date: 2018/4/24 20:16
 **/
public class AccountForSellDetermineInventoryByClassifyNumIdProcessRequest extends AbstractUserSessionRequest {

    private static final long serialVersionUID = -3101956261800131597L;

    @ApiField(description = "门店编号")
    @NotNull(message = "门店编号不能为空！")
    private Long subUnitNumId;

    @ApiField(description = "结算日期")
    @NotNull(message = "结算日期不能为空！")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date orderDate;

    @ApiField(description = "物理仓库编码")
    @NotNull(message = "物理仓库编码不能为空！")
    private Long physicalNumId;

    @ApiField(description = "归集码商品")
    @NotNull(message = "归集码商品不能为空！")
    private Long classifyNumId;

    @ApiField(description = "加工拨出金额")
    @NotNull(message = "加工拨出金额不能为空！")
    private Double workOutAmount;

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

    public Long getPhysicalNumId() {
        return physicalNumId;
    }

    public void setPhysicalNumId(Long physicalNumId) {
        this.physicalNumId = physicalNumId;
    }

    public Long getClassifyNumId() {
        return classifyNumId;
    }

    public void setClassifyNumId(Long classifyNumId) {
        this.classifyNumId = classifyNumId;
    }

    public Double getWorkOutAmount() {
        return workOutAmount;
    }

    public void setWorkOutAmount(Double workOutAmount) {
        this.workOutAmount = workOutAmount;
    }
}
