package com.ykcloud.soa.erp.api.wm.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.gb.soa.omp.ccommon.api.annotation.ApiField;
import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;
import java.util.Date;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

/**
 * @Description: 归集码商品处理盘点财务账的入参
 * @author: henry.wang
 * @date: 2018/4/18 17:21
 **/
public class AccountForStockCheckByClassifyNumIdProcessRequest extends AbstractUserSessionRequest {

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
    private Long itemNumId;

    @ApiField(description = "盘点金额")
    @NotNull(message = "盘点金额不能为空！")
    private Double checkAmount;

    @ApiField(description = "盈亏标识")
    @NotNull(message = "盈亏标识不能为空！")
    @Pattern(regexp = "[1-2]", message = "盈亏标识只能为1或2")
    private String riseOrLoss;

    @ApiField(description = "全盘或部分盘标识")
    @NotNull(message = "全盘或部分盘标识不能为空！")
    @Pattern(regexp = "[1-2]", message = "全盘或部分盘标识只能为1或2")
    private String fullOrPart;

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

    public Long getItemNumId() {
        return itemNumId;
    }

    public void setItemNumId(Long itemNumId) {
        this.itemNumId = itemNumId;
    }

    public Double getCheckAmount() {
        return checkAmount;
    }

    public void setCheckAmount(Double checkAmount) {
        this.checkAmount = checkAmount;
    }

    public String getRiseOrLoss() {
        return riseOrLoss;
    }

    public void setRiseOrLoss(String riseOrLoss) {
        this.riseOrLoss = riseOrLoss;
    }

    public String getFullOrPart() {
        return fullOrPart;
    }

    public void setFullOrPart(String fullOrPart) {
        this.fullOrPart = fullOrPart;
    }
}
