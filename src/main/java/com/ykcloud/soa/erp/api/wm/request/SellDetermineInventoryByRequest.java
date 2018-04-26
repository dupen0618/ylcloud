package com.ykcloud.soa.erp.api.wm.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.gb.soa.omp.ccommon.api.annotation.ApiField;
import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;
import com.ykcloud.soa.erp.api.wm.model.ShipSellDailyInfo;
import java.util.Date;
import javax.validation.constraints.NotNull;

/**
 * @Description: 以销定入商品日结的处理
 * @author: henry.wang
 * @date: 2018/4/24 19:00
 **/
public class SellDetermineInventoryByRequest extends AbstractUserSessionRequest {

    private static final long serialVersionUID = -3101956261800131597L;

    @ApiField(description = "门店编号")
    @NotNull(message = "门店编号不能为空！")
    private Long subUnitNumId;

    @ApiField(description = "成本方案")
    @NotNull(message = "成本方案不能为空！")
    private Long costPlanNumId;

    @ApiField(description = "出库日报对象")
    @NotNull(message = "出库日报对象不能为空！")
    private ShipSellDailyInfo shipSellDailyInfo;

    public Long getSubUnitNumId() {
        return subUnitNumId;
    }

    public void setSubUnitNumId(Long subUnitNumId) {
        this.subUnitNumId = subUnitNumId;
    }

    public Long getCostPlanNumId() {
        return costPlanNumId;
    }

    public void setCostPlanNumId(Long costPlanNumId) {
        this.costPlanNumId = costPlanNumId;
    }

    public ShipSellDailyInfo getShipSellDailyInfo() {
        return shipSellDailyInfo;
    }

    public void setShipSellDailyInfo(ShipSellDailyInfo shipSellDailyInfo) {
        this.shipSellDailyInfo = shipSellDailyInfo;
    }
}
