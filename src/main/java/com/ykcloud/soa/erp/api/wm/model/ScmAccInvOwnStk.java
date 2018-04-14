package com.ykcloud.soa.erp.api.wm.model;

import java.util.Date;

/**
 * @Author Hewei
 * @Date 2018/3/25 21:27 此类特殊，需要与Entity一样
 */
public class ScmAccInvOwnStk {
	private Long TENANT_NUM_ID;
	private Long DIV_NUM_ID;
	private Long STORAGE_NUM_ID;
	private Long LOC_PTY_NUM_ID;
	private Long ITEM_NUM_ID;
	private Double PHYSIC_QTY;
	private Double RESERVED_QTY;
	private Double LOCK_QTY;
	private Double KEEP_QTY;
	private Double AVAL_QTY;
	private String CANCELSIGN;
	private String INSERTDATA;
	private String UPDATEDATA;
	private Double VIRTUAL_QTY;
	private Double FACT_VIRTUAL_QTY;
	private Long SUB_UNIT_NUM_ID;
	private Double SAMPLE_QTY;
	private Double DEFECTIVE_QTY;
	private String SERIES;
	private Long CREATE_USER_ID;
	private Long LAST_UPDATE_USER_ID;
	private Date CREATE_DTME;
	private Date LAST_UPDTME;
	private Long CARRY_SIGN;
	private Long DATA_SIGN;

	public Long getTENANT_NUM_ID() {
		return TENANT_NUM_ID;
	}

	public void setTENANT_NUM_ID(Long tENANT_NUM_ID) {
		TENANT_NUM_ID = tENANT_NUM_ID;
	}

	public Long getDIV_NUM_ID() {
		return DIV_NUM_ID;
	}

	public void setDIV_NUM_ID(Long dIV_NUM_ID) {
		DIV_NUM_ID = dIV_NUM_ID;
	}

	public Long getSTORAGE_NUM_ID() {
		return STORAGE_NUM_ID;
	}

	public void setSTORAGE_NUM_ID(Long sTORAGE_NUM_ID) {
		STORAGE_NUM_ID = sTORAGE_NUM_ID;
	}

	public Long getLOC_PTY_NUM_ID() {
		return LOC_PTY_NUM_ID;
	}

	public void setLOC_PTY_NUM_ID(Long lOC_PTY_NUM_ID) {
		LOC_PTY_NUM_ID = lOC_PTY_NUM_ID;
	}

	public Long getITEM_NUM_ID() {
		return ITEM_NUM_ID;
	}

	public void setITEM_NUM_ID(Long iTEM_NUM_ID) {
		ITEM_NUM_ID = iTEM_NUM_ID;
	}

	public Double getPHYSIC_QTY() {
		return PHYSIC_QTY;
	}

	public void setPHYSIC_QTY(Double pHYSIC_QTY) {
		PHYSIC_QTY = pHYSIC_QTY;
	}

	public Double getRESERVED_QTY() {
		return RESERVED_QTY;
	}

	public void setRESERVED_QTY(Double rESERVED_QTY) {
		RESERVED_QTY = rESERVED_QTY;
	}

	public Double getLOCK_QTY() {
		return LOCK_QTY;
	}

	public void setLOCK_QTY(Double lOCK_QTY) {
		LOCK_QTY = lOCK_QTY;
	}

	public Double getKEEP_QTY() {
		return KEEP_QTY;
	}

	public void setKEEP_QTY(Double kEEP_QTY) {
		KEEP_QTY = kEEP_QTY;
	}

	public Double getAVAL_QTY() {
		return AVAL_QTY;
	}

	public void setAVAL_QTY(Double aVAL_QTY) {
		AVAL_QTY = aVAL_QTY;
	}

	public String getCANCELSIGN() {
		return CANCELSIGN;
	}

	public void setCANCELSIGN(String cANCELSIGN) {
		CANCELSIGN = cANCELSIGN;
	}

	public String getINSERTDATA() {
		return INSERTDATA;
	}

	public void setINSERTDATA(String iNSERTDATA) {
		INSERTDATA = iNSERTDATA;
	}

	public String getUPDATEDATA() {
		return UPDATEDATA;
	}

	public void setUPDATEDATA(String uPDATEDATA) {
		UPDATEDATA = uPDATEDATA;
	}

	public Double getVIRTUAL_QTY() {
		return VIRTUAL_QTY;
	}

	public void setVIRTUAL_QTY(Double vIRTUAL_QTY) {
		VIRTUAL_QTY = vIRTUAL_QTY;
	}

	public Double getFACT_VIRTUAL_QTY() {
		return FACT_VIRTUAL_QTY;
	}

	public void setFACT_VIRTUAL_QTY(Double fACT_VIRTUAL_QTY) {
		FACT_VIRTUAL_QTY = fACT_VIRTUAL_QTY;
	}

	public Long getSUB_UNIT_NUM_ID() {
		return SUB_UNIT_NUM_ID;
	}

	public void setSUB_UNIT_NUM_ID(Long sUB_UNIT_NUM_ID) {
		SUB_UNIT_NUM_ID = sUB_UNIT_NUM_ID;
	}

	public Double getSAMPLE_QTY() {
		return SAMPLE_QTY;
	}

	public void setSAMPLE_QTY(Double sAMPLE_QTY) {
		SAMPLE_QTY = sAMPLE_QTY;
	}

	public Double getDEFECTIVE_QTY() {
		return DEFECTIVE_QTY;
	}

	public void setDEFECTIVE_QTY(Double dEFECTIVE_QTY) {
		DEFECTIVE_QTY = dEFECTIVE_QTY;
	}

	public String getSERIES() {
		return SERIES;
	}

	public void setSERIES(String sERIES) {
		SERIES = sERIES;
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

	public Long getCARRY_SIGN() {
		return CARRY_SIGN;
	}

	public void setCARRY_SIGN(Long cARRY_SIGN) {
		CARRY_SIGN = cARRY_SIGN;
	}

	public Long getDATA_SIGN() {
		return DATA_SIGN;
	}

	public void setDATA_SIGN(Long dATA_SIGN) {
		DATA_SIGN = dATA_SIGN;
	}

}
