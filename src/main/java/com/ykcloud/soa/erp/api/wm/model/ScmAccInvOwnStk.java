package com.ykcloud.soa.erp.api.wm.model;

import java.util.Date;

/**
 * @Author Hewei
 * @Date 2018/3/25 21:27
 * 此类特殊，需要与Entity一样
 */
public class ScmAccInvOwnStk {
    private Long TENANT_NUM_ID;
    private Long DIV_NUM_ID;
    private Long STORAGE_NUM_ID;
    private Long LOC_PTY_NUM_ID;
    private Long ITEM_NUM_ID;
    private Long PHYSIC_QTY;
    private Long RESERVED_QTY;
    private Long LOCK_QTY;
    private Long KEEP_QTY;
    private Long AVAL_QTY;
    private String CANCELSIGN;
    private String INSERTDATA;
    private String UPDATEDATA;
    private Long VIRTUAL_QTY;
    private Long FACT_VIRTUAL_QTY;
    private Long SUB_UNIT_NUM_ID;
    private Long SAMPLE_QTY;
    private Long DEFECTIVE_QTY;
    private Long SERIES;
    private Long CREATE_USER_ID;
    private Long LAST_UPDATE_USER_ID;
    private Date CREATE_DTME;
    private Date LAST_UPDTME;
    private Long CARRY_SIGN;
    private Long DATA_SIGN;

    public Long getTENANT_NUM_ID() {
        return TENANT_NUM_ID;
    }

    public void setTENANT_NUM_ID(Long TENANT_NUM_ID) {
        this.TENANT_NUM_ID = TENANT_NUM_ID;
    }

    public Long getDIV_NUM_ID() {
        return DIV_NUM_ID;
    }

    public void setDIV_NUM_ID(Long DIV_NUM_ID) {
        this.DIV_NUM_ID = DIV_NUM_ID;
    }

    public Long getSTORAGE_NUM_ID() {
        return STORAGE_NUM_ID;
    }

    public void setSTORAGE_NUM_ID(Long STORAGE_NUM_ID) {
        this.STORAGE_NUM_ID = STORAGE_NUM_ID;
    }

    public Long getLOC_PTY_NUM_ID() {
        return LOC_PTY_NUM_ID;
    }

    public void setLOC_PTY_NUM_ID(Long LOC_PTY_NUM_ID) {
        this.LOC_PTY_NUM_ID = LOC_PTY_NUM_ID;
    }

    public Long getITEM_NUM_ID() {
        return ITEM_NUM_ID;
    }

    public void setITEM_NUM_ID(Long ITEM_NUM_ID) {
        this.ITEM_NUM_ID = ITEM_NUM_ID;
    }

    public Long getPHYSIC_QTY() {
        return PHYSIC_QTY;
    }

    public void setPHYSIC_QTY(Long PHYSIC_QTY) {
        this.PHYSIC_QTY = PHYSIC_QTY;
    }

    public Long getRESERVED_QTY() {
        return RESERVED_QTY;
    }

    public void setRESERVED_QTY(Long RESERVED_QTY) {
        this.RESERVED_QTY = RESERVED_QTY;
    }

    public Long getLOCK_QTY() {
        return LOCK_QTY;
    }

    public void setLOCK_QTY(Long LOCK_QTY) {
        this.LOCK_QTY = LOCK_QTY;
    }

    public Long getKEEP_QTY() {
        return KEEP_QTY;
    }

    public void setKEEP_QTY(Long KEEP_QTY) {
        this.KEEP_QTY = KEEP_QTY;
    }

    public Long getAVAL_QTY() {
        return AVAL_QTY;
    }

    public void setAVAL_QTY(Long AVAL_QTY) {
        this.AVAL_QTY = AVAL_QTY;
    }

    public String getCANCELSIGN() {
        return CANCELSIGN;
    }

    public void setCANCELSIGN(String CANCELSIGN) {
        this.CANCELSIGN = CANCELSIGN;
    }

    public String getINSERTDATA() {
        return INSERTDATA;
    }

    public void setINSERTDATA(String INSERTDATA) {
        this.INSERTDATA = INSERTDATA;
    }

    public String getUPDATEDATA() {
        return UPDATEDATA;
    }

    public void setUPDATEDATA(String UPDATEDATA) {
        this.UPDATEDATA = UPDATEDATA;
    }

    public Long getVIRTUAL_QTY() {
        return VIRTUAL_QTY;
    }

    public void setVIRTUAL_QTY(Long VIRTUAL_QTY) {
        this.VIRTUAL_QTY = VIRTUAL_QTY;
    }

    public Long getFACT_VIRTUAL_QTY() {
        return FACT_VIRTUAL_QTY;
    }

    public void setFACT_VIRTUAL_QTY(Long FACT_VIRTUAL_QTY) {
        this.FACT_VIRTUAL_QTY = FACT_VIRTUAL_QTY;
    }

    public Long getSUB_UNIT_NUM_ID() {
        return SUB_UNIT_NUM_ID;
    }

    public void setSUB_UNIT_NUM_ID(Long SUB_UNIT_NUM_ID) {
        this.SUB_UNIT_NUM_ID = SUB_UNIT_NUM_ID;
    }

    public Long getSAMPLE_QTY() {
        return SAMPLE_QTY;
    }

    public void setSAMPLE_QTY(Long SAMPLE_QTY) {
        this.SAMPLE_QTY = SAMPLE_QTY;
    }

    public Long getDEFECTIVE_QTY() {
        return DEFECTIVE_QTY;
    }

    public void setDEFECTIVE_QTY(Long DEFECTIVE_QTY) {
        this.DEFECTIVE_QTY = DEFECTIVE_QTY;
    }

    public Long getSERIES() {
        return SERIES;
    }

    public void setSERIES(Long SERIES) {
        this.SERIES = SERIES;
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
}
