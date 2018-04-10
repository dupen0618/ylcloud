package com.ykcloud.soa.erp.api.wm.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.gb.soa.omp.ccommon.api.annotation.ApiField;
import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;
import java.util.Date;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

/**
 * @Description: 生成盘点装箱单表头的入参
 * @author: henry.wang
 * @date: 2018/4/9 16:38
 **/
public class StockTakingConHDRCreateRequest extends AbstractUserSessionRequest {

    private static final long serialVersionUID = -3101956261800131597L;

    @ApiField(description = "门店编号")
    @NotNull(message = "门店编号不能为空！")
    private Long subUnitNumId;

    @ApiField(description = "盘点计划单号")
    @NotNull(message = "盘点计划单号不能为空！")
    private String reservedNo;

    @ApiField(description = "计划日期")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date inventoryDate;

    @ApiField(description = "货架号")
    @NotNull(message = "货架号不能为空！")
    private String trayLabserlno;

    @ApiField(description = "来源")
    @NotNull(message = "来源不能为空！")
    @Pattern(regexp = "[1-2]", message = "来源只能为1或2")
    private String soFromType;

    public Long getSubUnitNumId() {
        return subUnitNumId;
    }

    public void setSubUnitNumId(Long subUnitNumId) {
        this.subUnitNumId = subUnitNumId;
    }

    public String getReservedNo() {
        return reservedNo;
    }

    public void setReservedNo(String reservedNo) {
        this.reservedNo = reservedNo;
    }

    public Date getInventoryDate() {
        return inventoryDate;
    }

    public void setInventoryDate(Date inventoryDate) {
        this.inventoryDate = inventoryDate;
    }

    public String getTrayLabserlno() {
        return trayLabserlno;
    }

    public void setTrayLabserlno(String trayLabserlno) {
        this.trayLabserlno = trayLabserlno;
    }

    public String getSoFromType() {
        return soFromType;
    }

    public void setSoFromType(String soFromType) {
        this.soFromType = soFromType;
    }
}
