package com.ykcloud.soa.erp.api.so.model;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class FiBlSupBalance implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String SERIES;   //行号
	
	private Long TENANT_NUM_ID; //租户
	
	private Long SUB_UNIT_NUM_ID; //门店编号
	
	private String RESERVED_NO; //单号
	
	private Long TYPE_NUM_ID;    //业务类型
	
	private Date OPERAT_DATE;   //业务日期
	
	private Long ITEM_NUM_ID;   //商品编号
	
	private Long DIV_NUM_ID;     //商品中心
	
	private String BARCODE;   //商品条码
	
	private String ITEM_NAME;  //商品品名
	
	private Long PRODUCT_ORIGIN_NUM_ID; //原产地编号
	
	private Double CONVERSION_QTY;   //件装单位
	
	private String CONVERSION_STYLE_DESC; //件装规格
	
	private Double PRICE;          //结算价格
	
	private Double AMOUNT;        //结算金额
	
	private String BATCH_SERIES;  //批次行号
	
	private Long BATCH_PROMOTION_GRADE; //批次促销档期
	
	private Long BATCH_SUPPLY_UNIT_NUM_ID; //批次供应商
	
	private Double BATCH_PO_PRICE;    //批次采购价格
	
	private Double TAX_RATE;       // 税率
	
    private Double TAX_AMOUNT;   //税金

    private Long CARRY_SIGN;    //结转标识

    private Long DATA_SIGN;     //生产或测试标识

    private String ITEMID;     //商品商家编码

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

	public Long getSUB_UNIT_NUM_ID() {
		return SUB_UNIT_NUM_ID;
	}

	public void setSUB_UNIT_NUM_ID(Long sUB_UNIT_NUM_ID) {
		SUB_UNIT_NUM_ID = sUB_UNIT_NUM_ID;
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
	//@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
	public void setOPERAT_DATE(Date oPERAT_DATE) {
		OPERAT_DATE = oPERAT_DATE;
	}

	public Long getITEM_NUM_ID() {
		return ITEM_NUM_ID;
	}

	public void setITEM_NUM_ID(Long iTEM_NUM_ID) {
		ITEM_NUM_ID = iTEM_NUM_ID;
	}

	public Long getDIV_NUM_ID() {
		return DIV_NUM_ID;
	}

	public void setDIV_NUM_ID(Long dIV_NUM_ID) {
		DIV_NUM_ID = dIV_NUM_ID;
	}

	public String getBARCODE() {
		return BARCODE;
	}

	public void setBARCODE(String bARCODE) {
		BARCODE = bARCODE;
	}

	public String getITEM_NAME() {
		return ITEM_NAME;
	}

	public void setITEM_NAME(String iTEM_NAME) {
		ITEM_NAME = iTEM_NAME;
	}

	public Long getPRODUCT_ORIGIN_NUM_ID() {
		return PRODUCT_ORIGIN_NUM_ID;
	}

	public void setPRODUCT_ORIGIN_NUM_ID(Long pRODUCT_ORIGIN_NUM_ID) {
		PRODUCT_ORIGIN_NUM_ID = pRODUCT_ORIGIN_NUM_ID;
	}

	public Double getCONVERSION_QTY() {
		return CONVERSION_QTY;
	}

	public void setCONVERSION_QTY(Double cONVERSION_QTY) {
		CONVERSION_QTY = cONVERSION_QTY;
	}

	public String getCONVERSION_STYLE_DESC() {
		return CONVERSION_STYLE_DESC;
	}

	public void setCONVERSION_STYLE_DESC(String cONVERSION_STYLE_DESC) {
		CONVERSION_STYLE_DESC = cONVERSION_STYLE_DESC;
	}

	public Double getPRICE() {
		return PRICE;
	}

	public void setPRICE(Double pRICE) {
		PRICE = pRICE;
	}

	public Double getAMOUNT() {
		return AMOUNT;
	}

	public void setAMOUNT(Double aMOUNT) {
		AMOUNT = aMOUNT;
	}

	public String getBATCH_SERIES() {
		return BATCH_SERIES;
	}

	public void setBATCH_SERIES(String bATCH_SERIES) {
		BATCH_SERIES = bATCH_SERIES;
	}

	public Long getBATCH_PROMOTION_GRADE() {
		return BATCH_PROMOTION_GRADE;
	}

	public void setBATCH_PROMOTION_GRADE(Long bATCH_PROMOTION_GRADE) {
		BATCH_PROMOTION_GRADE = bATCH_PROMOTION_GRADE;
	}

	public Long getBATCH_SUPPLY_UNIT_NUM_ID() {
		return BATCH_SUPPLY_UNIT_NUM_ID;
	}

	public void setBATCH_SUPPLY_UNIT_NUM_ID(Long bATCH_SUPPLY_UNIT_NUM_ID) {
		BATCH_SUPPLY_UNIT_NUM_ID = bATCH_SUPPLY_UNIT_NUM_ID;
	}

	public Double getBATCH_PO_PRICE() {
		return BATCH_PO_PRICE;
	}

	public void setBATCH_PO_PRICE(Double bATCH_PO_PRICE) {
		BATCH_PO_PRICE = bATCH_PO_PRICE;
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

	public Long getDATA_SIGN() {
		return DATA_SIGN;
	}

	public void setDATA_SIGN(Long dATA_SIGN) {
		DATA_SIGN = dATA_SIGN;
	}

	public String getITEMID() {
		return ITEMID;
	}

	public void setITEMID(String iTEMID) {
		ITEMID = iTEMID;
	}
	 
	 





}
