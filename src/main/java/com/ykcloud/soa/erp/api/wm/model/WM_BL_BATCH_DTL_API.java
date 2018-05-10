package com.ykcloud.soa.erp.api.wm.model;


import java.io.Serializable;
import java.util.Date;

/**
 * @Author Hewei
 * @Date 2018/3/20 15:59
 */
public class WM_BL_BATCH_DTL_API implements Serializable
{
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
	private String RESERVED_NO;
	private Long TYPE_NUM_ID;
	private Long BATCH_TYPE_NUM_ID;
	private String RESERVED_LINE;
	private Long SUB_UNIT_NUM_ID;
	private Long PHYSICAL_NUM_ID;
	private Date ORDER_DATE;
	private Long LOCK_SIGN;
	private String PROMOTION_GRADE;
	private Long ITEM_NUM_ID;
	private Long DIV_NUM_ID;
	private String ITEM_NAME;
	private String BARCODE;
	private Long PRODUCT_ORIGIN_NUM_ID;
	private Double CONVERSION_QTY;
	private Long CONVERSION_UNIT_NUM_ID;
	private String CONVERSION_STYLE_DESC;
	private Double PRICE;
	private String SUP_PRODUCE_DATE;
	private String ACTUAL_PRODUCTION_DATE;
	private Long ZT_SIGN;
	private Long PMT_SIGN;
	private Long IN_ORDER;
	private Double QTY;
	private Double TAX_RATE;
	private String BATCH_ID;
	private Long SETTLEMENT_TYPE;
	private Long LOGISTICS_TYPE;
	private String VIRTUAL_BATCH_ID;
	private String FIRST_BATCH_SERIES;
	private Date FIRST_REC_DATE;
	private Long FIRST_SUPPLY_UNIT_NUM_ID;
	private String SUP_PROMOTION_GRADE;
	private Long SUPPLY_UNIT_NUM_ID;
	private Double SUP_PRICE;
	private Double PACKAGE_QTY;
	private Long CARRY_SIGN;
	private String ITEMID;
    private Long PTY_NUM_1;
    private Long PTY_NUM_2;
    private Long PTY_NUM_3;
    private Long DEPART_NUM_ID;

    public String getSERIES()
    {
        return SERIES;
    }

    public void setSERIES(String SERIES)
    {
        this.SERIES = SERIES;
    }

    public Long getTENANT_NUM_ID()
    {
        return TENANT_NUM_ID;
    }

    public void setTENANT_NUM_ID(Long TENANT_NUM_ID)
    {
        this.TENANT_NUM_ID = TENANT_NUM_ID;
    }

    public Long getDATA_SIGN()
    {
        return DATA_SIGN;
    }

    public void setDATA_SIGN(Long DATA_SIGN)
    {
        this.DATA_SIGN = DATA_SIGN;
    }

    public Date getCREATE_DTME()
    {
        return CREATE_DTME;
    }

    public void setCREATE_DTME(Date CREATE_DTME)
    {
        this.CREATE_DTME = CREATE_DTME;
    }

    public Date getLAST_UPDTME()
    {
        return LAST_UPDTME;
    }

    public void setLAST_UPDTME(Date LAST_UPDTME)
    {
        this.LAST_UPDTME = LAST_UPDTME;
    }

    public Long getCREATE_USER_ID()
    {
        return CREATE_USER_ID;
    }

    public void setCREATE_USER_ID(Long CREATE_USER_ID)
    {
        this.CREATE_USER_ID = CREATE_USER_ID;
    }

    public Long getLAST_UPDATE_USER_ID()
    {
        return LAST_UPDATE_USER_ID;
    }

    public void setLAST_UPDATE_USER_ID(Long LAST_UPDATE_USER_ID)
    {
        this.LAST_UPDATE_USER_ID = LAST_UPDATE_USER_ID;
    }

    public String getCANCELSIGN()
    {
        return CANCELSIGN;
    }

    public void setCANCELSIGN(String CANCELSIGN)
    {
        this.CANCELSIGN = CANCELSIGN;
    }

    public String getITEMID() {
		return ITEMID;
	}

	public void setITEMID(String iTEMID) {
		ITEMID = iTEMID;
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

    public Long getBATCH_TYPE_NUM_ID() {
        return BATCH_TYPE_NUM_ID;
    }

    public void setBATCH_TYPE_NUM_ID(Long BATCH_TYPE_NUM_ID) {
        this.BATCH_TYPE_NUM_ID = BATCH_TYPE_NUM_ID;
    }

    public String getRESERVED_LINE() {
        return RESERVED_LINE;
    }

    public void setRESERVED_LINE(String RESERVED_LINE) {
        this.RESERVED_LINE = RESERVED_LINE;
    }

    public Long getSUB_UNIT_NUM_ID() {
        return SUB_UNIT_NUM_ID;
    }

    public void setSUB_UNIT_NUM_ID(Long SUB_UNIT_NUM_ID) {
        this.SUB_UNIT_NUM_ID = SUB_UNIT_NUM_ID;
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

    public Long getLOCK_SIGN() {
        return LOCK_SIGN;
    }

    public void setLOCK_SIGN(Long LOCK_SIGN) {
        this.LOCK_SIGN = LOCK_SIGN;
    }

    public String getPROMOTION_GRADE() {
        return PROMOTION_GRADE;
    }

    public void setPROMOTION_GRADE(String PROMOTION_GRADE) {
        this.PROMOTION_GRADE = PROMOTION_GRADE;
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

    public Double getPRICE() {
        return PRICE;
    }

    public void setPRICE(Double PRICE) {
        this.PRICE = PRICE;
    }

    public String getSUP_PRODUCE_DATE() {
        return SUP_PRODUCE_DATE;
    }

    public void setSUP_PRODUCE_DATE(String SUP_PRODUCE_DATE) {
        this.SUP_PRODUCE_DATE = SUP_PRODUCE_DATE;
    }

    public String getACTUAL_PRODUCTION_DATE() {
        return ACTUAL_PRODUCTION_DATE;
    }

    public void setACTUAL_PRODUCTION_DATE(String ACTUAL_PRODUCTION_DATE) {
        this.ACTUAL_PRODUCTION_DATE = ACTUAL_PRODUCTION_DATE;
    }

    public Long getZT_SIGN() {
        return ZT_SIGN;
    }

    public void setZT_SIGN(Long ZT_SIGN) {
        this.ZT_SIGN = ZT_SIGN;
    }

    public Long getPMT_SIGN() {
        return PMT_SIGN;
    }

    public void setPMT_SIGN(Long PMT_SIGN) {
        this.PMT_SIGN = PMT_SIGN;
    }

    public Long getIN_ORDER() {
        return IN_ORDER;
    }

    public void setIN_ORDER(Long IN_ORDER) {
        this.IN_ORDER = IN_ORDER;
    }

    public Double getQTY() {
        return QTY;
    }

    public void setQTY(Double QTY) {
        this.QTY = QTY;
    }

    public Double getTAX_RATE() {
        return TAX_RATE;
    }

    public void setTAX_RATE(Double TAX_RATE) {
        this.TAX_RATE = TAX_RATE;
    }

    public String getBATCH_ID() {
        return BATCH_ID;
    }

    public void setBATCH_ID(String BATCH_ID) {
        this.BATCH_ID = BATCH_ID;
    }

    public Long getSETTLEMENT_TYPE() {
        return SETTLEMENT_TYPE;
    }

    public void setSETTLEMENT_TYPE(Long SETTLEMENT_TYPE) {
        this.SETTLEMENT_TYPE = SETTLEMENT_TYPE;
    }

    public Long getLOGISTICS_TYPE() {
        return LOGISTICS_TYPE;
    }

    public void setLOGISTICS_TYPE(Long LOGISTICS_TYPE) {
        this.LOGISTICS_TYPE = LOGISTICS_TYPE;
    }

    public String getVIRTUAL_BATCH_ID() {
        return VIRTUAL_BATCH_ID;
    }

    public void setVIRTUAL_BATCH_ID(String VIRTUAL_BATCH_ID) {
        this.VIRTUAL_BATCH_ID = VIRTUAL_BATCH_ID;
    }

    public String getFIRST_BATCH_SERIES() {
        return FIRST_BATCH_SERIES;
    }

    public void setFIRST_BATCH_SERIES(String FIRST_BATCH_SERIES) {
        this.FIRST_BATCH_SERIES = FIRST_BATCH_SERIES;
    }

    public Date getFIRST_REC_DATE() {
        return FIRST_REC_DATE;
    }

    public void setFIRST_REC_DATE(Date FIRST_REC_DATE) {
        this.FIRST_REC_DATE = FIRST_REC_DATE;
    }

    public Long getFIRST_SUPPLY_UNIT_NUM_ID() {
        return FIRST_SUPPLY_UNIT_NUM_ID;
    }

    public void setFIRST_SUPPLY_UNIT_NUM_ID(Long FIRST_SUPPLY_UNIT_NUM_ID) {
        this.FIRST_SUPPLY_UNIT_NUM_ID = FIRST_SUPPLY_UNIT_NUM_ID;
    }

    public String getSUP_PROMOTION_GRADE() {
        return SUP_PROMOTION_GRADE;
    }

    public void setSUP_PROMOTION_GRADE(String SUP_PROMOTION_GRADE) {
        this.SUP_PROMOTION_GRADE = SUP_PROMOTION_GRADE;
    }

    public Long getSUPPLY_UNIT_NUM_ID() {
        return SUPPLY_UNIT_NUM_ID;
    }

    public void setSUPPLY_UNIT_NUM_ID(Long SUPPLY_UNIT_NUM_ID) {
        this.SUPPLY_UNIT_NUM_ID = SUPPLY_UNIT_NUM_ID;
    }

    public Double getSUP_PRICE() {
        return SUP_PRICE;
    }

    public void setSUP_PRICE(Double SUP_PRICE) {
        this.SUP_PRICE = SUP_PRICE;
    }

	public Double getPACKAGE_QTY() {
        return PACKAGE_QTY;
    }

    public void setPACKAGE_QTY(Double PACKAGE_QTY) {
        this.PACKAGE_QTY = PACKAGE_QTY;
    }

    public Long getCARRY_SIGN() {
        return CARRY_SIGN;
    }

    public void setCARRY_SIGN(Long CARRY_SIGN) {
        this.CARRY_SIGN = CARRY_SIGN;
    }

    public Long getPTY_NUM_1() {
        return PTY_NUM_1;
    }

    public void setPTY_NUM_1(Long PTY_NUM_1) {
        this.PTY_NUM_1 = PTY_NUM_1;
    }

    public Long getPTY_NUM_2() {
        return PTY_NUM_2;
    }

    public void setPTY_NUM_2(Long PTY_NUM_2) {
        this.PTY_NUM_2 = PTY_NUM_2;
    }

    public Long getPTY_NUM_3() {
        return PTY_NUM_3;
    }

    public void setPTY_NUM_3(Long PTY_NUM_3) {
        this.PTY_NUM_3 = PTY_NUM_3;
    }

    public Long getDEPART_NUM_ID() {
        return DEPART_NUM_ID;
    }

    public void setDEPART_NUM_ID(Long DEPART_NUM_ID) {
        this.DEPART_NUM_ID = DEPART_NUM_ID;
    }
}
