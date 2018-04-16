package com.ykcloud.soa.erp.api.wm.model;

import java.io.Serializable;
import java.util.Date;

public class WmSellDaily  implements Serializable {

    private static final long serialVersionUID = 1L;
    /**
     * 行号
     */
    private String SERIES;

    /**
     * 租户
     */
    private Long TENANT_NUM_ID;

    /**
     * 门店
     */
    private Long SUB_UNIT_NUM_ID;

    /**
     * 单据编号
     */
    private String RESERVED_NO;

    /**
     * 业务类型
     */
    private Long TYPE_NUM_ID;

    /**
     * 业务日期
     */
    private Date OPERAT_DATE;

    /**
     * 商品
     */
    private Long ITEM_NUM_ID;

    /**
     * 商品中心（部门）
     */
    private Long DIV_NUM_ID;

    /**
     * 商品条码
     */
    private String BARCODE;

    /**
     * 商品品名
     */
    private String ITEM_NAME;

    /**
     * 产地
     */
    private Long PRODUCT_ORIGIN_NUM_ID;

    /**
     * 件装单位
     */
    private Double CONVERSION_QTY;

    /**
     * 件装规格
     */
    private String CONVERSION_STYLE_DESC;

    /**
     * 结算价格
     */
    private Double PRICE;

    /**
     * 结算金额
     */
    private Double AMOUNT;

    /**
     * 批次行号
     */
    private Long BATCH_SERIES;

    /**
     * 批次促销档期
     */
    private Long BATCH_PROMOTION_GRADE;

    /**
     * 批次供应商
     */
    private Integer BATCH_SUPPLY_UNIT_NUM_ID;

    /**
     * 批次采购价格
     */
    private Double BATCH_PO_PRICE;

    /**
     * 税率
     */
    private Double TAX_RATE;

    /**
     * 税金
     */
    private Double TAX_AMOUNT;

    /**
     * 结转标识
     */
    private Long CARRY_SIGN;

    /**
     * 生产或测试标识
     */
    private Long DATA_SIGN;

    /**
     * 商品商家编码
     */
    private String ITEMID;

    public String getSERIES() {
        return SERIES;
    }

    public void setSERIES(String SERIES) {
        this.SERIES = SERIES;
    }


    public Long getTENANT_NUM_ID() {
        return TENANT_NUM_ID;
    }

    public void setTENANT_NUM_ID(Long TENANT_NUM_ID) {
        this.TENANT_NUM_ID = TENANT_NUM_ID;
    }

    public Long getSUB_UNIT_NUM_ID() {
        return SUB_UNIT_NUM_ID;
    }

    public void setSUB_UNIT_NUM_ID(Long SUB_UNIT_NUM_ID) {
        this.SUB_UNIT_NUM_ID = SUB_UNIT_NUM_ID;
    }


    public String getRESERVED_NO() {
        return RESERVED_NO;
    }

    public void setRESERVED_NO(String RESERVED_NO) {
        this.RESERVED_NO = RESERVED_NO;
    }

    public Long getTYPE_NUM_ID() {
        return TYPE_NUM_ID;
    }

    public void setTYPE_NUM_ID(Long TYPE_NUM_ID) {
        this.TYPE_NUM_ID = TYPE_NUM_ID;
    }

    public Date getOPERAT_DATE() {
        return OPERAT_DATE;
    }

    public void setOPERAT_DATE(Date OPERAT_DATE) {
        this.OPERAT_DATE = OPERAT_DATE;
    }

    public Long getITEM_NUM_ID() {
        return ITEM_NUM_ID;
    }

    public void setITEM_NUM_ID(Long ITEM_NUM_ID) {
        this.ITEM_NUM_ID = ITEM_NUM_ID;
    }

    public Long getDIV_NUM_ID() {
        return DIV_NUM_ID;
    }

    public void setDIV_NUM_ID(Long DIV_NUM_ID) {
        this.DIV_NUM_ID = DIV_NUM_ID;
    }

    public String getBARCODE() {
        return BARCODE;
    }

    public void setBARCODE(String BARCODE) {
        this.BARCODE = BARCODE;
    }

    public String getITEM_NAME() {
        return ITEM_NAME;
    }

    public void setITEM_NAME(String ITEM_NAME) {
        this.ITEM_NAME = ITEM_NAME;
    }

    public Long getPRODUCT_ORIGIN_NUM_ID() {
        return PRODUCT_ORIGIN_NUM_ID;
    }

    public void setPRODUCT_ORIGIN_NUM_ID(Long PRODUCT_ORIGIN_NUM_ID) {
        this.PRODUCT_ORIGIN_NUM_ID = PRODUCT_ORIGIN_NUM_ID;
    }

    public Double getCONVERSION_QTY() {
        return CONVERSION_QTY;
    }

    public void setCONVERSION_QTY(Double CONVERSION_QTY) {
        this.CONVERSION_QTY = CONVERSION_QTY;
    }

    public String getCONVERSION_STYLE_DESC() {
        return CONVERSION_STYLE_DESC;
    }

    public void setCONVERSION_STYLE_DESC(String CONVERSION_STYLE_DESC) {
        this.CONVERSION_STYLE_DESC = CONVERSION_STYLE_DESC;
    }

    public Double getPRICE() {
        return PRICE;
    }

    public void setPRICE(Double PRICE) {
        this.PRICE = PRICE;
    }

    public Double getAMOUNT() {
        return AMOUNT;
    }

    public void setAMOUNT(Double AMOUNT) {
        this.AMOUNT = AMOUNT;
    }

    public Long getBATCH_SERIES() {
        return BATCH_SERIES;
    }

    public void setBATCH_SERIES(Long BATCH_SERIES) {
        this.BATCH_SERIES = BATCH_SERIES;
    }

    public Long getBATCH_PROMOTION_GRADE() {
        return BATCH_PROMOTION_GRADE;
    }

    public void setBATCH_PROMOTION_GRADE(Long BATCH_PROMOTION_GRADE) {
        this.BATCH_PROMOTION_GRADE = BATCH_PROMOTION_GRADE;
    }

    public Integer getBATCH_SUPPLY_UNIT_NUM_ID() {
        return BATCH_SUPPLY_UNIT_NUM_ID;
    }

    public void setBATCH_SUPPLY_UNIT_NUM_ID(Integer BATCH_SUPPLY_UNIT_NUM_ID) {
        this.BATCH_SUPPLY_UNIT_NUM_ID = BATCH_SUPPLY_UNIT_NUM_ID;
    }

    public Double getBATCH_PO_PRICE() {
        return BATCH_PO_PRICE;
    }

    public void setBATCH_PO_PRICE(Double BATCH_PO_PRICE) {
        this.BATCH_PO_PRICE = BATCH_PO_PRICE;
    }

    public Double getTAX_RATE() {
        return TAX_RATE;
    }

    public void setTAX_RATE(Double TAX_RATE) {
        this.TAX_RATE = TAX_RATE;
    }

    public Double getTAX_AMOUNT() {
        return TAX_AMOUNT;
    }

    public void setTAX_AMOUNT(Double TAX_AMOUNT) {
        this.TAX_AMOUNT = TAX_AMOUNT;
    }

    public Long getCARRY_SIGN() {
        return CARRY_SIGN;
    }

    public void setCARRY_SIGN(Long CARRY_SIGN) {
        this.CARRY_SIGN = CARRY_SIGN;
    }

    public Long getDATA_SIGN() {
        return DATA_SIGN;
    }

    public void setDATA_SIGN(Long DATA_SIGN) {
        this.DATA_SIGN = DATA_SIGN;
    }

    public String getITEMID() {
        return ITEMID;
    }

    public void setITEMID(String ITEMID) {
        this.ITEMID = ITEMID;
    }
}