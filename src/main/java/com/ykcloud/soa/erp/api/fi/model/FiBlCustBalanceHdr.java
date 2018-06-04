package com.ykcloud.soa.erp.api.fi.model;


import java.io.Serializable;
import java.util.Date;

public class FiBlCustBalanceHdr implements Serializable {
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
  private String INVOICE_NO;
  private Long UNIT_NUM_ID;
  private Long BALANCE_SUB_UNIT_NUM_ID;
  private Long DIV_NUM_ID;
  private Long STATUS_NUM_ID;
  private Long SO_FROM_TYPE;
  private Long TYPE_NUM_ID;
  private Long SETTLEMENT_TYPE;
  private Long PAY_STATUS_ID;
  private Double PAY_AMOUNT;
  private Long CURRENCY;
  private Long CARRY_SIGN;
  private String REMARK;
  private Long VOUCHER_NUM_ID;
  private String TXC;
  private Date BEGIN_DATE;
  private Date END_DATE;
  private Double INVOICE_AMOUNT;
  private Double TAX_AMOUNT;
  private Date REC_DATE;


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


  public String getINVOICE_NO() {
    return INVOICE_NO;
  }

  public void setINVOICE_NO(String INVOICE_NO) {
    this.INVOICE_NO = INVOICE_NO;
  }


  public Long getUNIT_NUM_ID() {
    return UNIT_NUM_ID;
  }

  public void setUNIT_NUM_ID(Long UNIT_NUM_ID) {
    this.UNIT_NUM_ID = UNIT_NUM_ID;
  }


  public Long getBALANCE_SUB_UNIT_NUM_ID() {
    return BALANCE_SUB_UNIT_NUM_ID;
  }

  public void setBALANCE_SUB_UNIT_NUM_ID(Long BALANCE_SUB_UNIT_NUM_ID) {
    this.BALANCE_SUB_UNIT_NUM_ID = BALANCE_SUB_UNIT_NUM_ID;
  }


  public Long getDIV_NUM_ID() {
    return DIV_NUM_ID;
  }

  public void setDIV_NUM_ID(Long DIV_NUM_ID) {
    this.DIV_NUM_ID = DIV_NUM_ID;
  }


  public Long getSTATUS_NUM_ID() {
    return STATUS_NUM_ID;
  }

  public void setSTATUS_NUM_ID(Long STATUS_NUM_ID) {
    this.STATUS_NUM_ID = STATUS_NUM_ID;
  }


  public Long getSO_FROM_TYPE() {
    return SO_FROM_TYPE;
  }

  public void setSO_FROM_TYPE(Long SO_FROM_TYPE) {
    this.SO_FROM_TYPE = SO_FROM_TYPE;
  }


  public Long getTYPE_NUM_ID() {
    return TYPE_NUM_ID;
  }

  public void setTYPE_NUM_ID(Long TYPE_NUM_ID) {
    this.TYPE_NUM_ID = TYPE_NUM_ID;
  }


  public Long getSETTLEMENT_TYPE() {
    return SETTLEMENT_TYPE;
  }

  public void setSETTLEMENT_TYPE(Long SETTLEMENT_TYPE) {
    this.SETTLEMENT_TYPE = SETTLEMENT_TYPE;
  }


  public Long getPAY_STATUS_ID() {
    return PAY_STATUS_ID;
  }

  public void setPAY_STATUS_ID(Long PAY_STATUS_ID) {
    this.PAY_STATUS_ID = PAY_STATUS_ID;
  }


  public Double getPAY_AMOUNT() {
    return PAY_AMOUNT;
  }

  public void setPAY_AMOUNT(Double PAY_AMOUNT) {
    this.PAY_AMOUNT = PAY_AMOUNT;
  }


  public Long getCURRENCY() {
    return CURRENCY;
  }

  public void setCURRENCY(Long CURRENCY) {
    this.CURRENCY = CURRENCY;
  }


  public Long getCARRY_SIGN() {
    return CARRY_SIGN;
  }

  public void setCARRY_SIGN(Long CARRY_SIGN) {
    this.CARRY_SIGN = CARRY_SIGN;
  }


  public String getREMARK() {
    return REMARK;
  }

  public void setREMARK(String REMARK) {
    this.REMARK = REMARK;
  }


  public Long getVOUCHER_NUM_ID() {
    return VOUCHER_NUM_ID;
  }

  public void setVOUCHER_NUM_ID(Long VOUCHER_NUM_ID) {
    this.VOUCHER_NUM_ID = VOUCHER_NUM_ID;
  }


  public String getTXC() {
    return TXC;
  }

  public void setTXC(String TXC) {
    this.TXC = TXC;
  }


  public Date getBEGIN_DATE() {
    return BEGIN_DATE;
  }

  public void setBEGIN_DATE(Date BEGIN_DATE) {
    this.BEGIN_DATE = BEGIN_DATE;
  }


  public Date getEND_DATE() {
    return END_DATE;
  }

  public void setEND_DATE(Date END_DATE) {
    this.END_DATE = END_DATE;
  }


  public Double getINVOICE_AMOUNT() {
    return INVOICE_AMOUNT;
  }

  public void setINVOICE_AMOUNT(Double INVOICE_AMOUNT) {
    this.INVOICE_AMOUNT = INVOICE_AMOUNT;
  }


  public Double getTAX_AMOUNT() {
    return TAX_AMOUNT;
  }

  public void setTAX_AMOUNT(Double TAX_AMOUNT) {
    this.TAX_AMOUNT = TAX_AMOUNT;
  }

  public Date getREC_DATE() {
    return REC_DATE;
  }

  public void setREC_DATE(Date REC_DATE) {
    this.REC_DATE = REC_DATE;
  }
}
