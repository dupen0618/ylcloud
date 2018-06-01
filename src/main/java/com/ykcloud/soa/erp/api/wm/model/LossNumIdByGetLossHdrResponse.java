package com.ykcloud.soa.erp.api.wm.model;

import java.io.Serializable;
import java.util.Date;

public class WmBlLossHdr implements Serializable {

	private String SERIES;// 行号
	private String LOSS_NUM_ID;// 损溢单号
	private Long WORK_NUM_ID;// 加工单号
	private Long TENANT_NUM_ID;// 租户
	private Long SUB_UNIT_NUM_ID;// 门店
	private Date LOSS_DATE;// 损溢日期
	private Long STATUS_NUM_ID;// 状态
	private Long SO_FROM_TYPE;// 来源
	private Long TYPE_NUM_ID;// 业务类型
	private Long STORAGE_NUM_ID;// 逻辑仓
	private Long PHYSICAL_NUM_ID;// 物理仓库
	private Date ORDER_DATE;// 业务发生日期
	private String REMARK;// 备注
	private Long CREATE_USER_ID;// 创建人
	private Date REC_DATE;// 入账日期
	private Long LAST_UPDATE_USER_ID;// 更新人
	private Date CREATE_DTME;// 创建时间
	private Date LAST_UPDTME;// 更新时间
	private Long CARRY_SIGN;// 结转标识
	private Long DATA_SIGN;// 生产或测试标识
	private String CANCELSIGN;// 删除标识
	private Long VOUCHER_NUM_ID;

	public String getSERIES() {
		return SERIES;
	}

	public void setSERIES(String SERIES) {
		this.SERIES = SERIES;
	}

	public String getLOSS_NUM_ID() {
		return LOSS_NUM_ID;
	}

	public void setLOSS_NUM_ID(String LOSS_NUM_ID) {
		this.LOSS_NUM_ID = LOSS_NUM_ID;
	}

	public Long getWORK_NUM_ID() {
		return WORK_NUM_ID;
	}

	public void setWORK_NUM_ID(Long WORK_NUM_ID) {
		this.WORK_NUM_ID = WORK_NUM_ID;
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

	public Date getLOSS_DATE() {
		return LOSS_DATE;
	}

	public void setLOSS_DATE(Date LOSS_DATE) {
		this.LOSS_DATE = LOSS_DATE;
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

	public Long getSTORAGE_NUM_ID() {
		return STORAGE_NUM_ID;
	}

	public void setSTORAGE_NUM_ID(Long STORAGE_NUM_ID) {
		this.STORAGE_NUM_ID = STORAGE_NUM_ID;
	}

	public Long getPHYSICAL_NUM_ID() {
		return PHYSICAL_NUM_ID;
	}

	public void setPHYSICAL_NUM_ID(Long PHYSICAL_NUM_ID) {
		this.PHYSICAL_NUM_ID = PHYSICAL_NUM_ID;
	}

	public Date getORDER_DATE() {
		return ORDER_DATE;
	}

	public void setORDER_DATE(Date ORDER_DATE) {
		this.ORDER_DATE = ORDER_DATE;
	}

	public String getREMARK() {
		return REMARK;
	}

	public void setREMARK(String REMARK) {
		this.REMARK = REMARK;
	}

	public Long getCREATE_USER_ID() {
		return CREATE_USER_ID;
	}

	public void setCREATE_USER_ID(Long CREATE_USER_ID) {
		this.CREATE_USER_ID = CREATE_USER_ID;
	}

	public Date getREC_DATE() {
		return REC_DATE;
	}

	public void setREC_DATE(Date REC_DATE) {
		this.REC_DATE = REC_DATE;
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

	public String getCANCELSIGN() {
		return CANCELSIGN;
	}

	public void setCANCELSIGN(String CANCELSIGN) {
		this.CANCELSIGN = CANCELSIGN;
	}

	public Long getVOUCHER_NUM_ID() {
		return VOUCHER_NUM_ID;
	}

	public void setVOUCHER_NUM_ID(Long VOUCHER_NUM_ID) {
		this.VOUCHER_NUM_ID = VOUCHER_NUM_ID;
	}
}
