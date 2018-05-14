package com.ykcloud.soa.erp.api.wm.model;

import java.io.Serializable;
import java.util.Date;

public class WmBlLossDtl  implements Serializable {

	private String SERIES;// 行号
	private String LOSS_NUM_ID;// 损溢单号
	private String WORK_NUM_ID;// 加工单号
	private Long TENANT_NUM_ID;// 租户
	private Long SUB_UNIT_NUM_ID;// 门店
	private Date WORK_DATE;// 损耗日期
	private Long ITEM_NUM_ID;// 商品
	private Long DIV_NUM_ID;// 商品中心（部门）
	private String ITEM_NAME;// 商品品名
	private String BARCODE;// 商品条码
	private Long PRODUCT_ORIGIN_NUM_ID;// 产地
	private Double CONVERSION_QTY;// 件数
	private Long CONVERSION_UNIT_NUM_ID;// 件装单位
	private String CONVERSION_STYLE_DESC;// 件装规格
	private Double QTY;// 数量
	private Long LOC_NUM_ID;// 库位
	private Double COST_PRICE;//成本价
	private Double COST_AMOUNT;//成本金额
	private Double TAX_RATE;//税率
	private Double TAX_AMOUNT;//税额
	private Long CREATE_USER_ID;// 创建人
	private Long LAST_UPDATE_USER_ID;// 更新人
	private Date CREATE_DTME;// 创建时间
	private Date LAST_UPDTME;// 更新时间
	private Long CARRY_SIGN;// 结转标识
	private Long DATA_SIGN;// 生产或测试标识
	private String CANCELSIGN;//
	private String ITEMID;// 商品商家编码
	private String BATCH_SERIES;// 批次行号
	private Double PACKAGE_QTY;//件数
	private Long SUPPLY_UNIT_NUM_ID;
	private Long SETTLEMENT_TYPE;//结算方式

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

	public String getWORK_NUM_ID() {
		return WORK_NUM_ID;
	}

	public void setWORK_NUM_ID(String WORK_NUM_ID) {
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

	public Date getWORK_DATE() {
		return WORK_DATE;
	}

	public void setWORK_DATE(Date WORK_DATE) {
		this.WORK_DATE = WORK_DATE;
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

	public String getITEM_NAME() {
		return ITEM_NAME;
	}

	public void setITEM_NAME(String ITEM_NAME) {
		this.ITEM_NAME = ITEM_NAME;
	}

	public String getBARCODE() {
		return BARCODE;
	}

	public void setBARCODE(String BARCODE) {
		this.BARCODE = BARCODE;
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

	public Long getCONVERSION_UNIT_NUM_ID() {
		return CONVERSION_UNIT_NUM_ID;
	}

	public void setCONVERSION_UNIT_NUM_ID(Long CONVERSION_UNIT_NUM_ID) {
		this.CONVERSION_UNIT_NUM_ID = CONVERSION_UNIT_NUM_ID;
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

	public Long getLOC_NUM_ID() {
		return LOC_NUM_ID;
	}

	public void setLOC_NUM_ID(Long LOC_NUM_ID) {
		this.LOC_NUM_ID = LOC_NUM_ID;
	}

	public Double getCOST_PRICE() {
		return COST_PRICE;
	}

	public void setCOST_PRICE(Double COST_PRICE) {
		this.COST_PRICE = COST_PRICE;
	}

	public Double getCOST_AMOUNT() {
		return COST_AMOUNT;
	}

	public void setCOST_AMOUNT(Double COST_AMOUNT) {
		this.COST_AMOUNT = COST_AMOUNT;
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

	public String getCANCELSIGN() {
		return CANCELSIGN;
	}

	public void setCANCELSIGN(String CANCELSIGN) {
		this.CANCELSIGN = CANCELSIGN;
	}

	public String getITEMID() {
		return ITEMID;
	}

	public void setITEMID(String ITEMID) {
		this.ITEMID = ITEMID;
	}

	public String getBATCH_SERIES() {
		return BATCH_SERIES;
	}

	public void setBATCH_SERIES(String BATCH_SERIES) {
		this.BATCH_SERIES = BATCH_SERIES;
	}

	public Double getPACKAGE_QTY() {
		return PACKAGE_QTY;
	}

	public void setPACKAGE_QTY(Double PACKAGE_QTY) {
		this.PACKAGE_QTY = PACKAGE_QTY;
	}

	public Long getSUPPLY_UNIT_NUM_ID() {
		return SUPPLY_UNIT_NUM_ID;
	}

	public void setSUPPLY_UNIT_NUM_ID(Long SUPPLY_UNIT_NUM_ID) {
		this.SUPPLY_UNIT_NUM_ID = SUPPLY_UNIT_NUM_ID;
	}

	public Long getSETTLEMENT_TYPE() {
		return SETTLEMENT_TYPE;
	}

	public void setSETTLEMENT_TYPE(Long sETTLEMENT_TYPE) {
		SETTLEMENT_TYPE = sETTLEMENT_TYPE;
	}
	
}
