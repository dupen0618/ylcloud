package com.ykcloud.soa.erp.api.wm.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;

import java.util.Date;

/**
 * Created by yiako on 2018/4/2
 */
public class WmPhysicalAccountWbaGteByDateResponse extends MessagePack {

    private Long subUnitNumId;//门店编号

    private Long itemNumId;//商品编号

    private Long divNumId;//部类编号

    private String barcode;//商品条码

    private String itemName;//商品名称

    private Long productOriginNumId;//产地

    private Long conversionQty;//件装数

    private Long conversionUnitNumId;//件装单位

    private String conversionStyleDesc;//件装规格

    private Long pmtMaterial;//赠品辅料

    private Long supplyUnitNumId;//供应商编号

    private Long physicalNumId;//物理仓库

    private Long classifyNumId;//商品归集码

    private Date orderDate;//单据日期

    private Long typeNumId;//业务类型

    private Long billTypeNumId;//单据类型

    private Long triggerBillid;//单据编号

    private Long triggerBillLine;//单据行号

    private Long assistLine;//辅助行号

    private Long locNumId;//库位

    private Long packageQty;//件数

    private Long balanceFunction;//业务类型

    private Long reservedQty;//入账数量

    private Date recDate;//记账日期

    public Long getSubUnitNumId() {
        return subUnitNumId;
    }

    public void setSubUnitNumId(Long subUnitNumId) {
        this.subUnitNumId = subUnitNumId;
    }

    public Long getItemNumId() {
        return itemNumId;
    }

    public void setItemNumId(Long itemNumId) {
        this.itemNumId = itemNumId;
    }

    public Long getDivNumId() {
        return divNumId;
    }

    public void setDivNumId(Long divNumId) {
        this.divNumId = divNumId;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Long getProductOriginNumId() {
        return productOriginNumId;
    }

    public void setProductOriginNumId(Long productOriginNumId) {
        this.productOriginNumId = productOriginNumId;
    }

    public Long getConversionQty() {
        return conversionQty;
    }

    public void setConversionQty(Long conversionQty) {
        this.conversionQty = conversionQty;
    }

    public Long getConversionUnitNumId() {
        return conversionUnitNumId;
    }

    public void setConversionUnitNumId(Long conversionUnitNumId) {
        this.conversionUnitNumId = conversionUnitNumId;
    }

    public String getConversionStyleDesc() {
        return conversionStyleDesc;
    }

    public void setConversionStyleDesc(String conversionStyleDesc) {
        this.conversionStyleDesc = conversionStyleDesc;
    }

    public Long getPmtMaterial() {
        return pmtMaterial;
    }

    public void setPmtMaterial(Long pmtMaterial) {
        this.pmtMaterial = pmtMaterial;
    }

    public Long getSupplyUnitNumId() {
        return supplyUnitNumId;
    }

    public void setSupplyUnitNumId(Long supplyUnitNumId) {
        this.supplyUnitNumId = supplyUnitNumId;
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

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Long getTypeNumId() {
        return typeNumId;
    }

    public void setTypeNumId(Long typeNumId) {
        this.typeNumId = typeNumId;
    }

    public Long getBillTypeNumId() {
        return billTypeNumId;
    }

    public void setBillTypeNumId(Long billTypeNumId) {
        this.billTypeNumId = billTypeNumId;
    }

    public Long getTriggerBillid() {
        return triggerBillid;
    }

    public void setTriggerBillid(Long triggerBillid) {
        this.triggerBillid = triggerBillid;
    }

    public Long getTriggerBillLine() {
        return triggerBillLine;
    }

    public void setTriggerBillLine(Long triggerBillLine) {
        this.triggerBillLine = triggerBillLine;
    }

    public Long getAssistLine() {
        return assistLine;
    }

    public void setAssistLine(Long assistLine) {
        this.assistLine = assistLine;
    }

    public Long getLocNumId() {
        return locNumId;
    }

    public void setLocNumId(Long locNumId) {
        this.locNumId = locNumId;
    }

    public Long getPackageQty() {
        return packageQty;
    }

    public void setPackageQty(Long packageQty) {
        this.packageQty = packageQty;
    }

    public Long getBalanceFunction() {
        return balanceFunction;
    }

    public void setBalanceFunction(Long balanceFunction) {
        this.balanceFunction = balanceFunction;
    }

    public Long getReservedQty() {
        return reservedQty;
    }

    public void setReservedQty(Long reservedQty) {
        this.reservedQty = reservedQty;
    }

    public Date getRecDate() {
        return recDate;
    }

    public void setRecDate(Date recDate) {
        this.recDate = recDate;
    }
}
