package com.ykcloud.soa.erp.api.fi.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @Description:获取可结算扣款项明细
 * @author Song
 * @Date 2018年4月4日 下午6:04:35
 */
public class Deduction implements Serializable {

	private static final long serialVersionUID = 1L;
	private String SERIES; // 行号
	private Long TENANT_NUM_ID; // 租户编号
	private Long DATA_SIGN; // 0: 正式 1：测试
	private Date CREATE_DTME; // 创建时间
	private Date LAST_UPDTME; // 最后更新时间
	private Long CREATE_USER_ID; // 创建用户
	private Long LAST_UPDATE_USER_ID;// 更新用户
	private String BALANCE_NO; // 结算单号 组合唯一索引
	private Long SUB_UNIT_NUM_ID; // 门店 分库标识
	private Date BALANCE_DATE; // 结算日期 分表标识
	private String RESERVED_NO; // 单据编号 fi_bl_sup_cut_hdr
	private Long TYPE_NUM_ID; // 业务类型 fi_bl_sup_cut_hdr
	private Date OPERAT_DATE; // 业务日期
	private Long CUT_ITEM; // 扣款项目
	private String CUT_DESC; // 扣款说明
	private Double CUT_AMOUNT; // 扣款金额
	private Double TAX_RATE; // 税率
	private Double TAX_AMOUNT; // 税金
	private Long CARRY_SIGN; // 结转标识

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

	public Long getLAST_UPDATE_USER_ID() {
		return LAST_UPDATE_USER_ID;
	}

	public void setLAST_UPDATE_USER_ID(Long lAST_UPDATE_USER_ID) {
		LAST_UPDATE_USER_ID = lAST_UPDATE_USER_ID;
	}

	public String getBALANCE_NO() {
		return BALANCE_NO;
	}

	public void setBALANCE_NO(String bALANCE_NO) {
		BALANCE_NO = bALANCE_NO;
	}

	public Long getSUB_UNIT_NUM_ID() {
		return SUB_UNIT_NUM_ID;
	}

	public void setSUB_UNIT_NUM_ID(Long sUB_UNIT_NUM_ID) {
		SUB_UNIT_NUM_ID = sUB_UNIT_NUM_ID;
	}

	public Date getBALANCE_DATE() {
		return BALANCE_DATE;
	}

	public void setBALANCE_DATE(Date bALANCE_DATE) {
		BALANCE_DATE = bALANCE_DATE;
	}

	public String getRESERVED_NO() {
		return RESERVED_NO;
	}

	public void setRESERVED_NO(String rESERVED_NO) {
		RESERVED_NO = rESERVED_NO;
	}

	public Long getTYPE_NUM_ID() {
		return TYPE_NUM_ID;
	}

	public void setTYPE_NUM_ID(Long tYPE_NUM_ID) {
		TYPE_NUM_ID = tYPE_NUM_ID;
	}

	public Date getOPERAT_DATE() {
		return OPERAT_DATE;
	}

	public void setOPERAT_DATE(Date oPERAT_DATE) {
		OPERAT_DATE = oPERAT_DATE;
	}

	public Long getCUT_ITEM() {
		return CUT_ITEM;
	}

	public void setCUT_ITEM(Long cUT_ITEM) {
		CUT_ITEM = cUT_ITEM;
	}

	public String getCUT_DESC() {
		return CUT_DESC;
	}

	public void setCUT_DESC(String cUT_DESC) {
		CUT_DESC = cUT_DESC;
	}

	public Double getCUT_AMOUNT() {
		return CUT_AMOUNT;
	}

	public void setCUT_AMOUNT(Double cUT_AMOUNT) {
		CUT_AMOUNT = cUT_AMOUNT;
	}

	public Double getTAX_RATE() {
		return TAX_RATE;
	}

	public void setTAX_RATE(Double tAX_RATE) {
		TAX_RATE = tAX_RATE;
	}

	public Double getTAX_AMOUNT() {
		return TAX_AMOUNT;
	}

	public void setTAX_AMOUNT(Double tAX_AMOUNT) {
		TAX_AMOUNT = tAX_AMOUNT;
	}

	public Long getCARRY_SIGN() {
		return CARRY_SIGN;
	}

	public void setCARRY_SIGN(Long cARRY_SIGN) {
		CARRY_SIGN = cARRY_SIGN;
	}

	public void setCREATE_USER_ID(Long cREATE_USER_ID) {
		CREATE_USER_ID = cREATE_USER_ID;
	}

}
