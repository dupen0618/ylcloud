package com.ykcloud.soa.erp.api.fi.model;

import java.io.Serializable;
import java.util.Date;

public class FiBlCustBalanceDtl implements Serializable {

  // 行号
  private String SERIES;
  // 租户编号
  private Long TENANT_NUM_ID;
  // 0: 正式 1：测试
  private Long DATA_SIGN;
  // 创建时间
  private Date CREATE_DTME;
  // 最后更新时间
  private Date LAST_UPDTME;
  // 创建用户
  private Long CREATE_USER_ID;
  // 更新用户
  private Long LAST_UPDATE_USER_ID;
  // 删除标识
  private String CANCELSIGN;
  private String BALANCE_NO;
  private Long SUB_UNIT_NUM_ID;
  private Date BALANCE_DATE;
  private String RESERVED_NO;
  private Long RESERVED_TYPE_NUM_ID;
  private Long TYPE_NUM_ID;
  private Date OPERAT_DATE;
  private Long ITEM_NUM_ID;
  private Long DIV_NUM_ID;
  private String BARCODE;
  private String ITEM_NAME;
  private Long PRODUCT_ORIGIN_NUM_ID;
  private Double CONVERSION_QTY;
  private String CONVERSION_STYLE_DESC;
  private Double QTY;
  private Double PRICE;
  private Double AMOUNT;
  private Long BATCH_SERIES;
  private Long BATCH_PROMOTION_GRADE;
  private Long BATCH_SUPPLY_UNIT_NUM_ID;
  private Double BATCH_PO_PRICE;
  private Long CARRY_SIGN;
  private String ITEMID;
  private Double TAX_RATE;
  private Double TAX_AMOUNT;
  private Double EXCHANGE_RATE;
  private Long CONVERSION_UNIT_NUM_ID;


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

  public Long getDATA_SIGN() {
    return DATA_SIGN;
  }

  public void setDATA_SIGN(Long DATA_SIGN) {
    this.DATA_SIGN = DATA_SIGN;
  }

  public Date getCREATE_DTME() {
    return CREATE_DTME;
  }

  public void setCREATE_DTME(Date CREATE_DTME) {
    this.CREATE_DTME = CREATE_DTME;
  }

  public Date getLAST_UPDTME() {
    return LAST_UPDTME;
  }

  public void setLAST_UPDTME(Date LAST_UPDTME) {
    this.LAST_UPDTME = LAST_UPDTME;
  }

  public Long getCREATE_USER_ID() {
    return CREATE_USER_ID;
  }

  public void setCREATE_USER_ID(Long CREATE_USER_ID) {
    this.CREATE_USER_ID = CREATE_USER_ID;
  }

  public Long getLAST_UPDATE_USER_ID() {
    return LAST_UPDATE_USER_ID;
  }

  public void setLAST_UPDATE_USER_ID(Long LAST_UPDATE_USER_ID) {
    this.LAST_UPDATE_USER_ID = LAST_UPDATE_USER_ID;
  }

  public String getCANCELSIGN() {
    return CANCELSIGN;
  }

  public void setCANCELSIGN(String CANCELSIGN) {
    this.CANCELSIGN = CANCELSIGN;
  }

  public String getBALANCE_NO() {
    return BALANCE_NO;
  }

  public void setBALANCE_NO(String BALANCE_NO) {
    this.BALANCE_NO = BALANCE_NO;
  }


  public Long getSUB_UNIT_NUM_ID() {
    return SUB_UNIT_NUM_ID;
  }

  public void setSUB_UNIT_NUM_ID(Long SUB_UNIT_NUM_ID) {
    this.SUB_UNIT_NUM_ID = SUB_UNIT_NUM_ID;
  }


  public Date getBALANCE_DATE() {
    return BALANCE_DATE;
  }

  public void setBALANCE_DATE(Date BALANCE_DATE) {
    this.BALANCE_DATE = BALANCE_DATE;
  }


  public String getRESERVED_NO() {
    return RESERVED_NO;
  }

  public void setRESERVED_NO(String RESERVED_NO) {
    this.RESERVED_NO = RESERVED_NO;
  }


  public Long getRESERVED_TYPE_NUM_ID() {
    return RESERVED_TYPE_NUM_ID;
  }

  public void setRESERVED_TYPE_NUM_ID(Long RESERVED_TYPE_NUM_ID) {
    this.RESERVED_TYPE_NUM_ID = RESERVED_TYPE_NUM_ID;
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


  public Double getQTY() {
    return QTY;
  }

  public void setQTY(Double QTY) {
    this.QTY = QTY;
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


  public Long getBATCH_SUPPLY_UNIT_NUM_ID() {
    return BATCH_SUPPLY_UNIT_NUM_ID;
  }

  public void setBATCH_SUPPLY_UNIT_NUM_ID(Long BATCH_SUPPLY_UNIT_NUM_ID) {
    this.BATCH_SUPPLY_UNIT_NUM_ID = BATCH_SUPPLY_UNIT_NUM_ID;
  }


  public Double getBATCH_PO_PRICE() {
    return BATCH_PO_PRICE;
  }

  public void setBATCH_PO_PRICE(Double BATCH_PO_PRICE) {
    this.BATCH_PO_PRICE = BATCH_PO_PRICE;
  }


  public Long getCARRY_SIGN() {
    return CARRY_SIGN;
  }

  public void setCARRY_SIGN(Long CARRY_SIGN) {
    this.CARRY_SIGN = CARRY_SIGN;
  }


  public String getITEMID() {
    return ITEMID;
  }

  public void setITEMID(String ITEMID) {
    this.ITEMID = ITEMID;
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


  public Double getEXCHANGE_RATE() {
    return EXCHANGE_RATE;
  }

  public void setEXCHANGE_RATE(Double EXCHANGE_RATE) {
    this.EXCHANGE_RATE = EXCHANGE_RATE;
  }

  public Long getCONVERSION_UNIT_NUM_ID() {
    return CONVERSION_UNIT_NUM_ID;
  }

  public void setCONVERSION_UNIT_NUM_ID(Long CONVERSION_UNIT_NUM_ID) {
    this.CONVERSION_UNIT_NUM_ID = CONVERSION_UNIT_NUM_ID;
  }
}
