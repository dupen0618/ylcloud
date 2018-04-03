package com.ykcloud.soa.erp.api.wm.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.gb.soa.omp.ccommon.api.annotation.ApiField;
import com.gb.soa.omp.ccommon.api.request.AbstractRequest;
import java.util.Date;
import javax.validation.constraints.NotNull;

/**
 * @Description: 查询盘点装箱单表头的入参
 * @author: henry.wang
 * @date: 2018/4/2 9:33
 **/
public class StockTakingConHDRGetRequest extends AbstractRequest {

    private static final long serialVersionUID = 1L;

    @ApiField(description = "门店编号")
    @NotNull(message = "门店编号不能为空！")
    private Long subUnitNumId;

    @ApiField(description = "盘存日期")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date stocktakingDate;

    @ApiField(description = "盘点计划单号")
    @NotNull(message = "盘点计划单号不能为空！")
    private String reservedNo;

    @ApiField(description = "货架号")
    @NotNull(message = "货架号不能为空！")
    private String trayLabserlno;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getSubUnitNumId() {
        return subUnitNumId;
    }

    public void setSubUnitNumId(Long subUnitNumId) {
        this.subUnitNumId = subUnitNumId;
    }

    public Date getStocktakingDate() {
        return stocktakingDate;
    }

    public void setStocktakingDate(Date stocktakingDate) {
        this.stocktakingDate = stocktakingDate;
    }

    public String getReservedNo() {
        return reservedNo;
    }

    public void setReservedNo(String reservedNo) {
        this.reservedNo = reservedNo;
    }

    public String getTrayLabserlno() {
        return trayLabserlno;
    }

    public void setTrayLabserlno(String trayLabserlno) {
        this.trayLabserlno = trayLabserlno;
    }
}
