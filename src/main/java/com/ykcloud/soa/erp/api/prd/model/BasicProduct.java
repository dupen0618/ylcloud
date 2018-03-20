package com.ykcloud.soa.erp.api.prd.model;

/**
 * Created by yiako on 2018/3/10
 */
public class BasicProduct {
    private Long itemNumId;//商品主键
    private String itemName;//商品名称
    private String simItemName;//商品中文简称
    private String enItemName;//商品英文简称
    private String enSmpItemName;//商品英文简称
    private Long divNumId;//部类编号
    private String divName;//部类名称
    private Long ptyNum1;//商品大类
    private String pty1Name;//商品大类名称
    private Long ptyNum2;//商品中类
    private String pty2Name;//商品大类名称
    private Long ptyNum3;//商品小类
    private String pty3Name;//商品小类名称
    private Long basicUnitNumId;//商品基本单位
    private String basicUnitName;//商品基本单位名称
    private String styleDesc;//销售规格
    private Double conversionQty;//件装数
    private Long conversionUnitNumId;//件装单位
    private String conversionUnitName;//件装单位名称
    private String conversionStyleDesc;//件装描述
    private Long storeType;//存储条件
    private String storeTypeName;//存储条件名称
    private Long qualityDays;//保质期天数
    private Long gpItemNumId;//母商品

    public Long getItemNumId() {
        return itemNumId;
    }

    public void setItemNumId(Long itemNumId) {
        this.itemNumId = itemNumId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getSimItemName() {
        return simItemName;
    }

    public void setSimItemName(String simItemName) {
        this.simItemName = simItemName;
    }

    public String getEnItemName() {
        return enItemName;
    }

    public void setEnItemName(String enItemName) {
        this.enItemName = enItemName;
    }

    public String getEnSmpItemName() {
        return enSmpItemName;
    }

    public void setEnSmpItemName(String enSmpItemName) {
        this.enSmpItemName = enSmpItemName;
    }

    public Long getDivNumId() {
        return divNumId;
    }

    public void setDivNumId(Long divNumId) {
        this.divNumId = divNumId;
    }

    public String getDivName() {
        return divName;
    }

    public void setDivName(String divName) {
        this.divName = divName;
    }

    public Long getPtyNum1() {
        return ptyNum1;
    }

    public void setPtyNum1(Long ptyNum1) {
        this.ptyNum1 = ptyNum1;
    }

    public String getPty1Name() {
        return pty1Name;
    }

    public void setPty1Name(String pty1Name) {
        this.pty1Name = pty1Name;
    }

    public Long getPtyNum2() {
        return ptyNum2;
    }

    public void setPtyNum2(Long ptyNum2) {
        this.ptyNum2 = ptyNum2;
    }

    public String getPty2Name() {
        return pty2Name;
    }

    public void setPty2Name(String pty2Name) {
        this.pty2Name = pty2Name;
    }

    public Long getPtyNum3() {
        return ptyNum3;
    }

    public void setPtyNum3(Long ptyNum3) {
        this.ptyNum3 = ptyNum3;
    }

    public String getPty3Name() {
        return pty3Name;
    }

    public void setPty3Name(String pty3Name) {
        this.pty3Name = pty3Name;
    }

    public Long getBasicUnitNumId() {
        return basicUnitNumId;
    }

    public void setBasicUnitNumId(Long basicUnitNumId) {
        this.basicUnitNumId = basicUnitNumId;
    }

    public String getBasicUnitName() {
        return basicUnitName;
    }

    public void setBasicUnitName(String basicUnitName) {
        this.basicUnitName = basicUnitName;
    }

    public String getStyleDesc() {
        return styleDesc;
    }

    public void setStyleDesc(String styleDesc) {
        this.styleDesc = styleDesc;
    }

    public Double getConversionQty() {
        return conversionQty;
    }

    public void setConversionQty(Double conversionQty) {
        this.conversionQty = conversionQty;
    }

    public Long getConversionUnitNumId() {
        return conversionUnitNumId;
    }

    public void setConversionUnitNumId(Long conversionUnitNumId) {
        this.conversionUnitNumId = conversionUnitNumId;
    }

    public String getConversionUnitName() {
        return conversionUnitName;
    }

    public void setConversionUnitName(String conversionUnitName) {
        this.conversionUnitName = conversionUnitName;
    }

    public String getConversionStyleDesc() {
        return conversionStyleDesc;
    }

    public void setConversionStyleDesc(String conversionStyleDesc) {
        this.conversionStyleDesc = conversionStyleDesc;
    }

    public Long getStoreType() {
        return storeType;
    }

    public void setStoreType(Long storeType) {
        this.storeType = storeType;
    }

    public String getStoreTypeName() {
        return storeTypeName;
    }

    public void setStoreTypeName(String storeTypeName) {
        this.storeTypeName = storeTypeName;
    }

    public Long getQualityDays() {
        return qualityDays;
    }

    public void setQualityDays(Long qualityDays) {
        this.qualityDays = qualityDays;
    }

    public Long getGpItemNumId() {
        return gpItemNumId;
    }

    public void setGpItemNumId(Long gpItemNumId) {
        this.gpItemNumId = gpItemNumId;
    }
}
