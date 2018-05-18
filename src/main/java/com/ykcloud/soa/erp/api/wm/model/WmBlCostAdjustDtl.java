package com.ykcloud.soa.erp.api.wm.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class WmBlCostAdjustDtl implements Serializable
{
    private String SERIES;//行号

    private Long RESERVED_NO;//汇总调整单号

    private Long TENANT_NUM_ID;//租户

    private Long SUB_UNIT_NUM_ID;//门店

    private Date JUST_DATE;// 调整日期

    private Long PHYSICAL_NUM_ID;//物理仓库

    private Long ITEM_NUM_ID;//商品

    private Long DIV_NUM_ID;//商品中心（部门）

    private Long CLASSIFY_NUM_ID;//商品归集码

    private String BARCODE;//商品条码

    private String ITEM_NAME;//商品品名

    private Long PRODUCT_ORIGIN_NUM_ID;//产地

    private Double CONVERSION_QTY;//件装数

    private Long CONVERSION_UNIT_NUM_ID;//件装单位

    private String CONVERSION_STYLE_DESC;//件装规格

    private Long PMT_MATERIAL;//赠品辅料

    private Double PACKAGE_QTY;//件数

    private BigDecimal ADJUST_PRICE;//调整价 调整后

    private Long LOC_NUM_ID;//库位

    private BigDecimal COST_PRICE;//成本价 调整前

    private String BATCH_SERIES;//批次行号

    private String BATCH_PROMOTION_GRADE;//批次促销档期

    private Long BATCH_SUPPLY_UNIT_NUM_ID;//批次供应商

    private BigDecimal BATCH_PO_PRICE;//批次采购价格

    private Long CREATE_USER_ID;//创建人

    private Long LAST_UPDATE_USER_ID;//更新人

    private Date CREATE_DTME;//创建时间

    private Date LAST_UPDTME;//更新时间

    private Long CARRY_SIGN;//结转标识

    private Long DATA_SIGN;//生产或测试标识

    public String getSERIES()
    {
        return SERIES;
    }

    public void setSERIES(String SERIES)
    {
        this.SERIES = SERIES;
    }

    public Long getRESERVED_NO()
    {
        return RESERVED_NO;
    }

    public void setRESERVED_NO(Long RESERVED_NO)
    {
        this.RESERVED_NO = RESERVED_NO;
    }

    public Long getTENANT_NUM_ID()
    {
        return TENANT_NUM_ID;
    }

    public void setTENANT_NUM_ID(Long TENANT_NUM_ID)
    {
        this.TENANT_NUM_ID = TENANT_NUM_ID;
    }

    public Long getSUB_UNIT_NUM_ID()
    {
        return SUB_UNIT_NUM_ID;
    }

    public void setSUB_UNIT_NUM_ID(Long SUB_UNIT_NUM_ID)
    {
        this.SUB_UNIT_NUM_ID = SUB_UNIT_NUM_ID;
    }

    public Date getJUST_DATE()
    {
        return JUST_DATE;
    }

    public void setJUST_DATE(Date JUST_DATE)
    {
        this.JUST_DATE = JUST_DATE;
    }

    public Long getPHYSICAL_NUM_ID()
    {
        return PHYSICAL_NUM_ID;
    }

    public void setPHYSICAL_NUM_ID(Long PHYSICAL_NUM_ID)
    {
        this.PHYSICAL_NUM_ID = PHYSICAL_NUM_ID;
    }

    public Long getITEM_NUM_ID()
    {
        return ITEM_NUM_ID;
    }

    public void setITEM_NUM_ID(Long ITEM_NUM_ID)
    {
        this.ITEM_NUM_ID = ITEM_NUM_ID;
    }

    public Long getDIV_NUM_ID()
    {
        return DIV_NUM_ID;
    }

    public void setDIV_NUM_ID(Long DIV_NUM_ID)
    {
        this.DIV_NUM_ID = DIV_NUM_ID;
    }

    public Long getCLASSIFY_NUM_ID()
    {
        return CLASSIFY_NUM_ID;
    }

    public void setCLASSIFY_NUM_ID(Long CLASSIFY_NUM_ID)
    {
        this.CLASSIFY_NUM_ID = CLASSIFY_NUM_ID;
    }

    public String getBARCODE()
    {
        return BARCODE;
    }

    public void setBARCODE(String BARCODE)
    {
        this.BARCODE = BARCODE;
    }

    public String getITEM_NAME()
    {
        return ITEM_NAME;
    }

    public void setITEM_NAME(String ITEM_NAME)
    {
        this.ITEM_NAME = ITEM_NAME;
    }

    public Long getPRODUCT_ORIGIN_NUM_ID()
    {
        return PRODUCT_ORIGIN_NUM_ID;
    }

    public void setPRODUCT_ORIGIN_NUM_ID(Long PRODUCT_ORIGIN_NUM_ID)
    {
        this.PRODUCT_ORIGIN_NUM_ID = PRODUCT_ORIGIN_NUM_ID;
    }

    public Double getCONVERSION_QTY()
    {
        return CONVERSION_QTY;
    }

    public void setCONVERSION_QTY(Double CONVERSION_QTY)
    {
        this.CONVERSION_QTY = CONVERSION_QTY;
    }

    public Long getCONVERSION_UNIT_NUM_ID()
    {
        return CONVERSION_UNIT_NUM_ID;
    }

    public void setCONVERSION_UNIT_NUM_ID(Long CONVERSION_UNIT_NUM_ID)
    {
        this.CONVERSION_UNIT_NUM_ID = CONVERSION_UNIT_NUM_ID;
    }

    public String getCONVERSION_STYLE_DESC()
    {
        return CONVERSION_STYLE_DESC;
    }

    public void setCONVERSION_STYLE_DESC(String CONVERSION_STYLE_DESC)
    {
        this.CONVERSION_STYLE_DESC = CONVERSION_STYLE_DESC;
    }

    public Long getPMT_MATERIAL()
    {
        return PMT_MATERIAL;
    }

    public void setPMT_MATERIAL(Long PMT_MATERIAL)
    {
        this.PMT_MATERIAL = PMT_MATERIAL;
    }

    public Double getPACKAGE_QTY()
    {
        return PACKAGE_QTY;
    }

    public void setPACKAGE_QTY(Double PACKAGE_QTY)
    {
        this.PACKAGE_QTY = PACKAGE_QTY;
    }

    public BigDecimal getADJUST_PRICE()
    {
        return ADJUST_PRICE;
    }

    public void setADJUST_PRICE(BigDecimal ADJUST_PRICE)
    {
        this.ADJUST_PRICE = ADJUST_PRICE;
    }

    public Long getLOC_NUM_ID()
    {
        return LOC_NUM_ID;
    }

    public void setLOC_NUM_ID(Long LOC_NUM_ID)
    {
        this.LOC_NUM_ID = LOC_NUM_ID;
    }

    public BigDecimal getCOST_PRICE()
    {
        return COST_PRICE;
    }

    public void setCOST_PRICE(BigDecimal COST_PRICE)
    {
        this.COST_PRICE = COST_PRICE;
    }

    public String getBATCH_SERIES()
    {
        return BATCH_SERIES;
    }

    public void setBATCH_SERIES(String BATCH_SERIES)
    {
        this.BATCH_SERIES = BATCH_SERIES;
    }

    public String getBATCH_PROMOTION_GRADE()
    {
        return BATCH_PROMOTION_GRADE;
    }

    public void setBATCH_PROMOTION_GRADE(String BATCH_PROMOTION_GRADE)
    {
        this.BATCH_PROMOTION_GRADE = BATCH_PROMOTION_GRADE;
    }

    public Long getBATCH_SUPPLY_UNIT_NUM_ID()
    {
        return BATCH_SUPPLY_UNIT_NUM_ID;
    }

    public void setBATCH_SUPPLY_UNIT_NUM_ID(Long BATCH_SUPPLY_UNIT_NUM_ID)
    {
        this.BATCH_SUPPLY_UNIT_NUM_ID = BATCH_SUPPLY_UNIT_NUM_ID;
    }

    public BigDecimal getBATCH_PO_PRICE()
    {
        return BATCH_PO_PRICE;
    }

    public void setBATCH_PO_PRICE(BigDecimal BATCH_PO_PRICE)
    {
        this.BATCH_PO_PRICE = BATCH_PO_PRICE;
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

    public Long getCARRY_SIGN()
    {
        return CARRY_SIGN;
    }

    public void setCARRY_SIGN(Long CARRY_SIGN)
    {
        this.CARRY_SIGN = CARRY_SIGN;
    }

    public Long getDATA_SIGN()
    {
        return DATA_SIGN;
    }

    public void setDATA_SIGN(Long DATA_SIGN)
    {
        this.DATA_SIGN = DATA_SIGN;
    }
}
