package com.ykcloud.soa.erp.api.wm.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.gb.soa.omp.ccommon.api.annotation.ApiField;
import com.gb.soa.omp.ccommon.api.request.AbstractRequest;
import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;
import java.util.Date;
import javax.validation.constraints.NotNull;

/**
 * @Description: 统计指定时间段内业务发生额的入参
 * @author: henry.wang
 * @date: 2018/5/17 16:25
 **/
public class BusinessAmountForGenKxCountRequest extends AbstractRequest {

    private static final long serialVersionUID = -3101956261800131597L;

    @ApiField(description = "门店编号")
    @NotNull(message = "门店编号不能为空！")
    private Long subUnitNumId;

    @ApiField(description = "供应商编号")
    @NotNull(message = "供应商编号不能为空！")
    private Long supplyUnitNumId;

    @ApiField(description = "起始日期")
    @NotNull(message = "起始日期不能为空！")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date beginDate;

    @ApiField(description = "截止日期")
    @NotNull(message = "截止日期不能为空！")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date endDate;

    @ApiField(description = "商品部类")
    private Long divNumId;

    @ApiField(description = "商品大类")
    private Long ptyNum1;

    @ApiField(description = "商品编码")
    private Long itemNumId;

    public Long getSubUnitNumId() {
        return subUnitNumId;
    }

    public void setSubUnitNumId(Long subUnitNumId) {
        this.subUnitNumId = subUnitNumId;
    }

    public Long getSupplyUnitNumId() {
        return supplyUnitNumId;
    }

    public void setSupplyUnitNumId(Long supplyUnitNumId) {
        this.supplyUnitNumId = supplyUnitNumId;
    }

    public Date getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Long getDivNumId() {
        return divNumId;
    }

    public void setDivNumId(Long divNumId) {
        this.divNumId = divNumId;
    }

    public Long getPtyNum1() {
        return ptyNum1;
    }

    public void setPtyNum1(Long ptyNum1) {
        this.ptyNum1 = ptyNum1;
    }

    public Long getItemNumId() {
        return itemNumId;
    }

    public void setItemNumId(Long itemNumId) {
        this.itemNumId = itemNumId;
    }
}
