package com.ykcloud.soa.erp.api.wm.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.gb.soa.omp.ccommon.api.annotation.ApiField;
import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;
import java.util.Date;
import javax.validation.constraints.NotNull;

/**
 * @Description: 初盘完成的入参
 * @author: henry.wang
 * @date: 2018/4/11 17:47
 **/
public class StockCheckFirstFinishRequest extends AbstractUserSessionRequest {

    private static final long serialVersionUID = -3101956261800131597L;

    @ApiField(description = "门店编号")
    @NotNull(message = "门店编号不能为空！")
    private Long subUnitNumId;

    @ApiField(description = "计划日期")
    @NotNull(message = "计划日期不能为空！")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date inventoryDate;

    @ApiField(description = "盘点计划单号")
    @NotNull(message = "盘点计划单号不能为空！")
    private String reservedNo;

    public Long getSubUnitNumId() {
        return subUnitNumId;
    }

    public void setSubUnitNumId(Long subUnitNumId) {
        this.subUnitNumId = subUnitNumId;
    }

    public Date getInventoryDate() {
        return inventoryDate;
    }

    public void setInventoryDate(Date inventoryDate) {
        this.inventoryDate = inventoryDate;
    }

    public String getReservedNo() {
        return reservedNo;
    }

    public void setReservedNo(String reservedNo) {
        this.reservedNo = reservedNo;
    }
}
