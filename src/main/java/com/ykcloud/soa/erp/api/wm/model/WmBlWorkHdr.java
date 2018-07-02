package com.ykcloud.soa.erp.api.wm.model;

import java.io.Serializable;
import java.util.Date;

public class WmBlWorkHdr implements Serializable {
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
    private String WORK_NUM_ID;
    private String TML_NUM_ID;
    private String TML_LINE;
    private Long SUB_UNIT_NUM_ID;
    private Date WORK_DATE;
    private Long ENTRUST_UNIT_NUM_ID;
    private Long STATUS_NUM_ID;
    private Long SO_FROM_TYPE;
    private Long WORK_EMPE_NUM_ID;
    private Double WORK_COST;
    private Long DIV_NUM_ID;
    private Long TYPE_NUM_ID;
    private Long INOROUT;
    private Long WORK_METHOD;
    private Long PRO_ITEM_NUM_ID;
    private String BARCODE;
    private String ITEM_NAME;
    private Long PRODUCT_ORIGIN_NUM_ID;
    private Double CONVERSION_QTY;
    private Long CONVERSION_UNIT_NUM_ID;
    private String CONVERSION_STYLE_DESC;
    private Double PACKAGE_QTY;
    private Double QTY;
    private Double LOSS_RAT;
    private Long RAW_STORAGE_NUM_ID;
    private Long RAW_PHYSICAL_NUM_ID;
    private Long PRO_STORAGE_NUM_ID;
    private Long PRO_PHYSICAL_NUM_ID;
    private Long RECV_ADR_NUM_ID;
    private Date DELIVERY_DATE;
    private Double WORK_AMOUNT;
    private String REMARK;
    private Long CARRY_SIGN;
    private String BOM_NUM_ID;
    private Long VOUCHER_NUM_ID;
    private Long CROSS_SUB_COMPANY_SIGN;
    private Long DEPART_NUM_ID;
    private Long CLASSIFY_NUM_ID;
    private Date recDate;
    private Double workTaxRate;
    private Double workTaxAmount;

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

    public String getWORK_NUM_ID() {
        return WORK_NUM_ID;
    }

    public void setWORK_NUM_ID(String WORK_NUM_ID) {
        this.WORK_NUM_ID = WORK_NUM_ID;
    }

    public String getTML_NUM_ID() {
        return TML_NUM_ID;
    }

    public void setTML_NUM_ID(String TML_NUM_ID) {
        this.TML_NUM_ID = TML_NUM_ID;
    }

    public String getTML_LINE() {
        return TML_LINE;
    }

    public void setTML_LINE(String TML_LINE) {
        this.TML_LINE = TML_LINE;
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

    public Long getENTRUST_UNIT_NUM_ID() {
        return ENTRUST_UNIT_NUM_ID;
    }

    public void setENTRUST_UNIT_NUM_ID(Long ENTRUST_UNIT_NUM_ID) {
        this.ENTRUST_UNIT_NUM_ID = ENTRUST_UNIT_NUM_ID;
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

    public Long getWORK_EMPE_NUM_ID() {
        return WORK_EMPE_NUM_ID;
    }

    public void setWORK_EMPE_NUM_ID(Long WORK_EMPE_NUM_ID) {
        this.WORK_EMPE_NUM_ID = WORK_EMPE_NUM_ID;
    }

    public Double getWORK_COST() {
        return WORK_COST;
    }

    public void setWORK_COST(Double WORK_COST) {
        this.WORK_COST = WORK_COST;
    }

    public Long getDIV_NUM_ID() {
        return DIV_NUM_ID;
    }

    public void setDIV_NUM_ID(Long DIV_NUM_ID) {
        this.DIV_NUM_ID = DIV_NUM_ID;
    }

    public Long getTYPE_NUM_ID() {
        return TYPE_NUM_ID;
    }

    public void setTYPE_NUM_ID(Long TYPE_NUM_ID) {
        this.TYPE_NUM_ID = TYPE_NUM_ID;
    }

    public Long getINOROUT() {
        return INOROUT;
    }

    public void setINOROUT(Long INOROUT) {
        this.INOROUT = INOROUT;
    }

    public Long getWORK_METHOD() {
        return WORK_METHOD;
    }

    public void setWORK_METHOD(Long WORK_METHOD) {
        this.WORK_METHOD = WORK_METHOD;
    }

    public Long getPRO_ITEM_NUM_ID() {
        return PRO_ITEM_NUM_ID;
    }

    public void setPRO_ITEM_NUM_ID(Long PRO_ITEM_NUM_ID) {
        this.PRO_ITEM_NUM_ID = PRO_ITEM_NUM_ID;
    }

    public String getBARCODE() {
        return BARCODE;
    }

    public void setBARCODE(String BARCODE) {
        this.BARCODE = BARCODE;
    }

    public String getITEM_NAME() {
        return ITEM_NAME;
    }

    public void setITEM_NAME(String ITEM_NAME) {
        this.ITEM_NAME = ITEM_NAME;
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

    public Double getPACKAGE_QTY() {
        return PACKAGE_QTY;
    }

    public void setPACKAGE_QTY(Double PACKAGE_QTY) {
        this.PACKAGE_QTY = PACKAGE_QTY;
    }

    public Double getQTY() {
        return QTY;
    }

    public void setQTY(Double QTY) {
        this.QTY = QTY;
    }

    public Double getLOSS_RAT() {
        return LOSS_RAT;
    }

    public void setLOSS_RAT(Double LOSS_RAT) {
        this.LOSS_RAT = LOSS_RAT;
    }

    public Long getRAW_STORAGE_NUM_ID() {
        return RAW_STORAGE_NUM_ID;
    }

    public void setRAW_STORAGE_NUM_ID(Long RAW_STORAGE_NUM_ID) {
        this.RAW_STORAGE_NUM_ID = RAW_STORAGE_NUM_ID;
    }

    public Long getRAW_PHYSICAL_NUM_ID() {
        return RAW_PHYSICAL_NUM_ID;
    }

    public void setRAW_PHYSICAL_NUM_ID(Long RAW_PHYSICAL_NUM_ID) {
        this.RAW_PHYSICAL_NUM_ID = RAW_PHYSICAL_NUM_ID;
    }

    public Long getPRO_STORAGE_NUM_ID() {
        return PRO_STORAGE_NUM_ID;
    }

    public void setPRO_STORAGE_NUM_ID(Long PRO_STORAGE_NUM_ID) {
        this.PRO_STORAGE_NUM_ID = PRO_STORAGE_NUM_ID;
    }

    public Long getPRO_PHYSICAL_NUM_ID() {
        return PRO_PHYSICAL_NUM_ID;
    }

    public void setPRO_PHYSICAL_NUM_ID(Long PRO_PHYSICAL_NUM_ID) {
        this.PRO_PHYSICAL_NUM_ID = PRO_PHYSICAL_NUM_ID;
    }

    public Long getRECV_ADR_NUM_ID() {
        return RECV_ADR_NUM_ID;
    }

    public void setRECV_ADR_NUM_ID(Long RECV_ADR_NUM_ID) {
        this.RECV_ADR_NUM_ID = RECV_ADR_NUM_ID;
    }

    public Date getDELIVERY_DATE() {
        return DELIVERY_DATE;
    }

    public void setDELIVERY_DATE(Date DELIVERY_DATE) {
        this.DELIVERY_DATE = DELIVERY_DATE;
    }

    public Double getWORK_AMOUNT() {
        return WORK_AMOUNT;
    }

    public void setWORK_AMOUNT(Double WORK_AMOUNT) {
        this.WORK_AMOUNT = WORK_AMOUNT;
    }

    public String getREMARK() {
        return REMARK;
    }

    public void setREMARK(String REMARK) {
        this.REMARK = REMARK;
    }

    public Long getCARRY_SIGN() {
        return CARRY_SIGN;
    }

    public void setCARRY_SIGN(Long CARRY_SIGN) {
        this.CARRY_SIGN = CARRY_SIGN;
    }

    public String getBOM_NUM_ID() {
        return BOM_NUM_ID;
    }

    public void setBOM_NUM_ID(String BOM_NUM_ID) {
        this.BOM_NUM_ID = BOM_NUM_ID;
    }

    public Long getVOUCHER_NUM_ID() {
        return VOUCHER_NUM_ID;
    }

    public void setVOUCHER_NUM_ID(Long VOUCHER_NUM_ID) {
        this.VOUCHER_NUM_ID = VOUCHER_NUM_ID;
    }

    public Long getCROSS_SUB_COMPANY_SIGN() {
        return CROSS_SUB_COMPANY_SIGN;
    }

    public void setCROSS_SUB_COMPANY_SIGN(Long CROSS_SUB_COMPANY_SIGN) {
        this.CROSS_SUB_COMPANY_SIGN = CROSS_SUB_COMPANY_SIGN;
    }

    public Long getDEPART_NUM_ID() {
        return DEPART_NUM_ID;
    }

    public void setDEPART_NUM_ID(Long DEPART_NUM_ID) {
        this.DEPART_NUM_ID = DEPART_NUM_ID;
    }

    public Long getCLASSIFY_NUM_ID() {
        return CLASSIFY_NUM_ID;
    }

    public void setCLASSIFY_NUM_ID(Long CLASSIFY_NUM_ID) {
        this.CLASSIFY_NUM_ID = CLASSIFY_NUM_ID;
    }

    public Date getRecDate() {
        return recDate;
    }

    public void setRecDate(Date recDate) {
        this.recDate = recDate;
    }

    public Double getWorkTaxRate() {
        return workTaxRate;
    }

    public void setWorkTaxRate(Double workTaxRate) {
        this.workTaxRate = workTaxRate;
    }

    public Double getWorkTaxAmount() {
        return workTaxAmount;
    }

    public void setWorkTaxAmount(Double workTaxAmount) {
        this.workTaxAmount = workTaxAmount;
    }
}
