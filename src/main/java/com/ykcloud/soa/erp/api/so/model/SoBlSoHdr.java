package com.ykcloud.soa.erp.api.so.model;

import java.util.Date;

public class SoBlSoHdr {

    /**
     * 存储方式
     */
    private Long STORE_TYPE;

    /**
     * 种号
     */
    private Long SOW_NUM_ID;
    /**
     * 行号
     */
    private String SERIES;
    /**
     * 租户ID
     */
    private Long TENANT_NUM_ID;

    /**
     * 0: 正式 1：测试
     */
    private Long DATA_SIGN;

    private String SO_NUM_ID;

    private String APPLY_NUM_ID;

    private Long SUB_UNIT_NUM_ID;

    private Date ORDER_DATE;

    private Long CUST_UNIT_NUM_ID;

    private Long CUST_SUB_UNIT_NUM_ID;

    private Long STATUS_NUM_ID;

    private Long SETTLEMENT_TYPE;

    private String WLBC_NUM_ID;

    private Long DIV_NUM_ID;

    private Long CLASSIFY_NUM_ID;

    private String TML_NUM_ID;

    private Long SO_FROM_TYPE;

    private Long TYPE_NUM_ID;

    private Long STORAGE_NUM_ID;

    private Long PHYSICAL_NUM_ID;

    private Long REC_STORAGE_NUM_ID;

    private Long REC_PHYSICAL_NUM_ID;

    private Long REC_ADR_NUM_ID;

    private Date DELIVERY_DATE;

    private Double DEPOSIT_AMOUNT;

    private String APPROVAL_NUM_ID;

    private String REMARK;

    /** 创建时间 */
    private Date CREATE_DTME;
    /** 最后更新时间 */
    private Date LAST_UPDTME;
    /** 用户 */
    private Long CREATE_USER_ID = 1L;
    /** 更新用户 */
    private Long LAST_UPDATE_USER_ID = 1L;
    /** 删除 */
    private String CANCELSIGN = "N";
    /** 新增 */
    private Long CARRY_SIGN;

    private Long CONFIRM_TYPE;   //复核标识



    public Long getSTORE_TYPE() {
        return STORE_TYPE;
    }

    public void setSTORE_TYPE(Long sTORE_TYPE) {
        STORE_TYPE = sTORE_TYPE;
    }

    public Long getCONFIRM_TYPE() {
        return CONFIRM_TYPE;
    }

    public void setCONFIRM_TYPE(Long cONFIRM_TYPE) {
        CONFIRM_TYPE = cONFIRM_TYPE;
    }

    public Long getSOW_NUM_ID() {
        return SOW_NUM_ID;
    }

    public void setSOW_NUM_ID(Long sOW_NUM_ID) {
        SOW_NUM_ID = sOW_NUM_ID;
    }

    public String getSERIES() {
        return SERIES;
    }

    public void setSERIES(String sERIES) {
        SERIES = sERIES;
    }

    public Long getTENANT_NUM_ID() {
        return TENANT_NUM_ID;
    }

    public void setTENANT_NUM_ID(Long tENANT_NUM_ID) {
        TENANT_NUM_ID = tENANT_NUM_ID;
    }

    public Long getDATA_SIGN() {
        return DATA_SIGN;
    }

    public void setDATA_SIGN(Long dATA_SIGN) {
        DATA_SIGN = dATA_SIGN;
    }

    public String getSO_NUM_ID() {
        return SO_NUM_ID;
    }

    public void setSO_NUM_ID(String sO_NUM_ID) {
        SO_NUM_ID = sO_NUM_ID;
    }

    public String getAPPLY_NUM_ID() {
        return APPLY_NUM_ID;
    }

    public void setAPPLY_NUM_ID(String aPPLY_NUM_ID) {
        APPLY_NUM_ID = aPPLY_NUM_ID;
    }

    public Long getSUB_UNIT_NUM_ID() {
        return SUB_UNIT_NUM_ID;
    }

    public void setSUB_UNIT_NUM_ID(Long sUB_UNIT_NUM_ID) {
        SUB_UNIT_NUM_ID = sUB_UNIT_NUM_ID;
    }

    public Date getORDER_DATE() {
        return ORDER_DATE;
    }

    public void setORDER_DATE(Date oRDER_DATE) {
        ORDER_DATE = oRDER_DATE;
    }

    public Long getCUST_UNIT_NUM_ID() {
        return CUST_UNIT_NUM_ID;
    }

    public void setCUST_UNIT_NUM_ID(Long cUST_UNIT_NUM_ID) {
        CUST_UNIT_NUM_ID = cUST_UNIT_NUM_ID;
    }

    public Long getCUST_SUB_UNIT_NUM_ID() {
        return CUST_SUB_UNIT_NUM_ID;
    }

    public void setCUST_SUB_UNIT_NUM_ID(Long cUST_SUB_UNIT_NUM_ID) {
        CUST_SUB_UNIT_NUM_ID = cUST_SUB_UNIT_NUM_ID;
    }

    public Long getSTATUS_NUM_ID() {
        return STATUS_NUM_ID;
    }

    public void setSTATUS_NUM_ID(Long sTATUS_NUM_ID) {
        STATUS_NUM_ID = sTATUS_NUM_ID;
    }

    public Long getSETTLEMENT_TYPE() {
        return SETTLEMENT_TYPE;
    }

    public void setSETTLEMENT_TYPE(Long sETTLEMENT_TYPE) {
        SETTLEMENT_TYPE = sETTLEMENT_TYPE;
    }

    public String getWLBC_NUM_ID() {
        return WLBC_NUM_ID;
    }

    public void setWLBC_NUM_ID(String wLBC_NUM_ID) {
        WLBC_NUM_ID = wLBC_NUM_ID;
    }

    public Long getDIV_NUM_ID() {
        return DIV_NUM_ID;
    }

    public void setDIV_NUM_ID(Long dIV_NUM_ID) {
        DIV_NUM_ID = dIV_NUM_ID;
    }

    public Long getCLASSIFY_NUM_ID() {
        return CLASSIFY_NUM_ID;
    }

    public void setCLASSIFY_NUM_ID(Long cLASSIFY_NUM_ID) {
        CLASSIFY_NUM_ID = cLASSIFY_NUM_ID;
    }

    public String getTML_NUM_ID() {
        return TML_NUM_ID;
    }

    public void setTML_NUM_ID(String tML_NUM_ID) {
        TML_NUM_ID = tML_NUM_ID;
    }

    public Long getSO_FROM_TYPE() {
        return SO_FROM_TYPE;
    }

    public void setSO_FROM_TYPE(Long sO_FROM_TYPE) {
        SO_FROM_TYPE = sO_FROM_TYPE;
    }

    public Long getTYPE_NUM_ID() {
        return TYPE_NUM_ID;
    }

    public void setTYPE_NUM_ID(Long tYPE_NUM_ID) {
        TYPE_NUM_ID = tYPE_NUM_ID;
    }

    public Long getSTORAGE_NUM_ID() {
        return STORAGE_NUM_ID;
    }

    public void setSTORAGE_NUM_ID(Long sTORAGE_NUM_ID) {
        STORAGE_NUM_ID = sTORAGE_NUM_ID;
    }

    public Long getPHYSICAL_NUM_ID() {
        return PHYSICAL_NUM_ID;
    }

    public void setPHYSICAL_NUM_ID(Long pHYSICAL_NUM_ID) {
        PHYSICAL_NUM_ID = pHYSICAL_NUM_ID;
    }

    public Long getREC_STORAGE_NUM_ID() {
        return REC_STORAGE_NUM_ID;
    }

    public void setREC_STORAGE_NUM_ID(Long rEC_STORAGE_NUM_ID) {
        REC_STORAGE_NUM_ID = rEC_STORAGE_NUM_ID;
    }

    public Long getREC_PHYSICAL_NUM_ID() {
        return REC_PHYSICAL_NUM_ID;
    }

    public void setREC_PHYSICAL_NUM_ID(Long rEC_PHYSICAL_NUM_ID) {
        REC_PHYSICAL_NUM_ID = rEC_PHYSICAL_NUM_ID;
    }

    public Long getREC_ADR_NUM_ID() {
        return REC_ADR_NUM_ID;
    }

    public void setREC_ADR_NUM_ID(Long rEC_ADR_NUM_ID) {
        REC_ADR_NUM_ID = rEC_ADR_NUM_ID;
    }

    public Date getDELIVERY_DATE() {
        return DELIVERY_DATE;
    }

    public void setDELIVERY_DATE(Date dELIVERY_DATE) {
        DELIVERY_DATE = dELIVERY_DATE;
    }

    public Double getDEPOSIT_AMOUNT() {
        return DEPOSIT_AMOUNT;
    }

    public void setDEPOSIT_AMOUNT(Double dEPOSIT_AMOUNT) {
        DEPOSIT_AMOUNT = dEPOSIT_AMOUNT;
    }

    public String getAPPROVAL_NUM_ID() {
        return APPROVAL_NUM_ID;
    }

    public void setAPPROVAL_NUM_ID(String aPPROVAL_NUM_ID) {
        APPROVAL_NUM_ID = aPPROVAL_NUM_ID;
    }

    public String getREMARK() {
        return REMARK;
    }

    public void setREMARK(String rEMARK) {
        REMARK = rEMARK;
    }

    public Date getCREATE_DTME() {
        return CREATE_DTME;
    }

    public void setCREATE_DTME(Date cREATE_DTME) {
        CREATE_DTME = cREATE_DTME;
    }

    public Date getLAST_UPDTME() {
        return LAST_UPDTME;
    }

    public void setLAST_UPDTME(Date lAST_UPDTME) {
        LAST_UPDTME = lAST_UPDTME;
    }

    public Long getCREATE_USER_ID() {
        return CREATE_USER_ID;
    }

    public void setCREATE_USER_ID(Long cREATE_USER_ID) {
        CREATE_USER_ID = cREATE_USER_ID;
    }

    public Long getLAST_UPDATE_USER_ID() {
        return LAST_UPDATE_USER_ID;
    }

    public void setLAST_UPDATE_USER_ID(Long lAST_UPDATE_USER_ID) {
        LAST_UPDATE_USER_ID = lAST_UPDATE_USER_ID;
    }

    public String getCANCELSIGN() {
        return CANCELSIGN;
    }

    public void setCANCELSIGN(String cANCELSIGN) {
        CANCELSIGN = cANCELSIGN;
    }

    public Long getCARRY_SIGN() {
        return CARRY_SIGN;
    }

    public void setCARRY_SIGN(Long cARRY_SIGN) {
        CARRY_SIGN = cARRY_SIGN;
    }
}
