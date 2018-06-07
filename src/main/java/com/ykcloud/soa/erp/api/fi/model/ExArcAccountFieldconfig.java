package com.ykcloud.soa.erp.api.fi.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author Hewei
 * @Date 2018/3/27 17:31
 */
public class ExArcAccountFieldconfig implements Serializable {
	private static final long serialVersionUID = 1L;
	private String SERIES;
	private Long TENANT_NUM_ID;
	private String ACCOUNTNAME;
	private String ACTFIELDNAME;
	private Double QTYORAMOUNT;
	private Date CREATE_DTME;
	private Date LAST_UPDTME;
	private Long CREATE_USER_ID;
	private Long LAST_UPDATE_USER_ID;
	private String CANCELSIGN;
	private String INSERTDATA;
	private String UPDATEDATA;
	private Long DATA_SIGN;

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

	public String getACCOUNTNAME() {
		return ACCOUNTNAME;
	}

	public void setACCOUNTNAME(String ACCOUNTNAME) {
		this.ACCOUNTNAME = ACCOUNTNAME;
	}

	public String getACTFIELDNAME() {
		return ACTFIELDNAME;
	}

	public void setACTFIELDNAME(String ACTFIELDNAME) {
		this.ACTFIELDNAME = ACTFIELDNAME;
	}

	public Double getQTYORAMOUNT() {
		return QTYORAMOUNT;
	}

	public void setQTYORAMOUNT(Double QTYORAMOUNT) {
		this.QTYORAMOUNT = QTYORAMOUNT;
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

	public Long getDATA_SIGN() {
		return DATA_SIGN;
	}

	public void setDATA_SIGN(Long DATA_SIGN) {
		this.DATA_SIGN = DATA_SIGN;
	}
}
