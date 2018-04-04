package com.ykcloud.soa.erp.api.wm.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.gb.soa.omp.ccommon.api.annotation.ApiField;
import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;
import java.util.Date;
import javax.validation.constraints.NotNull;

/**
 * @Description: 扫码商品条码盘点的入参
 * @author: henry.wang
 * @date: 2018/4/4 10:06
 **/
public class ItemBarcodeStockCheckScanRequest extends AbstractUserSessionRequest {

    private static final long serialVersionUID = 1L;

    @ApiField(description = "门店编号")
    @NotNull(message = "门店编号不能为空！")
    private Long subUnitNumId;

    @ApiField(description = "计划日期")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date inventoryDate;

    @ApiField(description = "盘点计划单号")
    @NotNull(message = "盘点计划单号不能为空！")
    private String reservedNo;

    @ApiField(description = "货架号")
    @NotNull(message = "货架号不能为空！")
    private String trayLabserlno;

    @ApiField(description = "商品条码")
    @NotNull(message = "商品条码不能为空！")
    private String barcode;

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

    public String getTrayLabserlno() {
        return trayLabserlno;
    }

    public void setTrayLabserlno(String trayLabserlno) {
        this.trayLabserlno = trayLabserlno;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }
}
