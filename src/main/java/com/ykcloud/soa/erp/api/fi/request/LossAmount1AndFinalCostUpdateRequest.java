package com.ykcloud.soa.erp.api.fi.request;

import java.util.Date;

import javax.validation.constraints.NotNull;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

public class LossAmount1AndFinalCostUpdateRequest extends AbstractRequest {
	private static final long serialVersionUID = 1L;

	@NotNull(message = "门店编号不能为空！")
	private Long subUnitNumId;

	@NotNull(message = "商品编号不能为空！")
	private Long itemNumId;

	@NotNull(message = "物理仓库不能为空！")
	private Long physicalNumId;

	@NotNull(message = "损耗金额不能为空！")
	private Double losscost;

	@NotNull(message = "损耗类型不能为空！")
	private String lossType;

	@NotNull(message = "税额不能为空！")
	private Double taxAmount;

	@NotNull(message = "入账日期不能为空！")
	private Date recDate;

	private Long DIV_NUM_ID;

	private String BARCODE;

	private String ITEM_NAME;

	private Long PRODUCT_ORIGIN_NUM_ID;

	private Double CONVERSION_QTY;

	private Long CONVERSION_UNIT_NUM_ID;

	private String CONVERSION_STYLE_DESC;

	private String CANCELSIGN;

	@NotNull(message = "供应商不能为空！")
	private Long SUPPLY_UNIT_NUM_ID;

	@NotNull(message = "商品大类不能为空！")
	private Long PTY_NUM_1;

	@NotNull(message = "商品中类不能为空！")
	private Long PTY_NUM_2;

	@NotNull(message = "商品小类不能为空！")
	private Long PTY_NUM_3;

	@NotNull(message = "部门不能为空！")
	private Long DEPART_NUM_ID;

	@NotNull(message = "结算方式不能为空！")
	private Long SETTLEMENT_TYPE;

	// 业务单据号
	private String triggerBillid;

	// 业务单据行号
	private String triggerBillLine;

	// 业务单据具体类型
	private Long typeNumId;

	private Long isIndependentAccounting;

	public static interface lossTypeOption {
		/**
		 * 报损类型
		 */
		public String LOSS = "0";
		/**
		 * 报溢类型
		 */
		public String OVERFLOW = "1";
	}

	public Long getIsIndependentAccounting() {
		return isIndependentAccounting;
	}

	public void setIsIndependentAccounting(Long isIndependentAccounting) {
		this.isIndependentAccounting = isIndependentAccounting;
	}

	public Double getLosscost() {
		return losscost;
	}

	public void setLosscost(Double losscost) {
		this.losscost = losscost;
	}

	public Long getSubUnitNumId() {
		return subUnitNumId;
	}

	public void setSubUnitNumId(Long subUnitNumId) {
		this.subUnitNumId = subUnitNumId;
	}

	public Long getItemNumId() {
		return itemNumId;
	}

	public void setItemNumId(Long itemNumId) {
		this.itemNumId = itemNumId;
	}

	public Long getPhysicalNumId() {
		return physicalNumId;
	}

	public void setPhysicalNumId(Long physicalNumId) {
		this.physicalNumId = physicalNumId;
	}

	public String getLossType() {
		return lossType;
	}

	public void setLossType(String lossType) {
		this.lossType = lossType;
	}

	public Double getTaxAmount() {
		return taxAmount;
	}

	public void setTaxAmount(Double taxAmount) {
		this.taxAmount = taxAmount;
	}

	public Date getRecDate() {
		return recDate;
	}

	public void setRecDate(Date recDate) {
		this.recDate = recDate;
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

	public Long getCONVERSION_UNIT_NUM_ID() {
		return CONVERSION_UNIT_NUM_ID;
	}

	public void setCONVERSION_UNIT_NUM_ID(Long cONVERSION_UNIT_NUM_ID) {
		CONVERSION_UNIT_NUM_ID = cONVERSION_UNIT_NUM_ID;
	}

	public String getCONVERSION_STYLE_DESC() {
		return CONVERSION_STYLE_DESC;
	}

	public void setCONVERSION_STYLE_DESC(String cONVERSION_STYLE_DESC) {
		CONVERSION_STYLE_DESC = cONVERSION_STYLE_DESC;
	}

	public Long getSUPPLY_UNIT_NUM_ID() {
		return SUPPLY_UNIT_NUM_ID;
	}

	public void setSUPPLY_UNIT_NUM_ID(Long sUPPLY_UNIT_NUM_ID) {
		SUPPLY_UNIT_NUM_ID = sUPPLY_UNIT_NUM_ID;
	}

	public Long getPTY_NUM_1() {
		return PTY_NUM_1;
	}

	public void setPTY_NUM_1(Long pTY_NUM_1) {
		PTY_NUM_1 = pTY_NUM_1;
	}

	public Long getPTY_NUM_2() {
		return PTY_NUM_2;
	}

	public void setPTY_NUM_2(Long pTY_NUM_2) {
		PTY_NUM_2 = pTY_NUM_2;
	}

	public Long getPTY_NUM_3() {
		return PTY_NUM_3;
	}

	public void setPTY_NUM_3(Long pTY_NUM_3) {
		PTY_NUM_3 = pTY_NUM_3;
	}

	public Long getDEPART_NUM_ID() {
		return DEPART_NUM_ID;
	}

	public void setDEPART_NUM_ID(Long dEPART_NUM_ID) {
		DEPART_NUM_ID = dEPART_NUM_ID;
	}

	public Long getSETTLEMENT_TYPE() {
		return SETTLEMENT_TYPE;
	}

	public void setSETTLEMENT_TYPE(Long sETTLEMENT_TYPE) {
		SETTLEMENT_TYPE = sETTLEMENT_TYPE;
	}

	public String getCANCELSIGN() {
		return CANCELSIGN;
	}

	public void setCANCELSIGN(String cANCELSIGN) {
		CANCELSIGN = cANCELSIGN;
	}

	public String getTriggerBillid() {
		return triggerBillid;
	}

	public void setTriggerBillid(String triggerBillid) {
		this.triggerBillid = triggerBillid;
	}

	public String getTriggerBillLine() {
		return triggerBillLine;
	}

	public void setTriggerBillLine(String triggerBillLine) {
		this.triggerBillLine = triggerBillLine;
	}

	public Long getTypeNumId() {
		return typeNumId;
	}

	public void setTypeNumId(Long typeNumId) {
		this.typeNumId = typeNumId;
	}

}
