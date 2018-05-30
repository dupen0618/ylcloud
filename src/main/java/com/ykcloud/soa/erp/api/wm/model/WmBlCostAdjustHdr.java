package com.ykcloud.soa.erp.api.wm.model;

import java.io.Serializable;
import java.util.Date;

public class WmBlCostAdjustHdr implements Serializable
{
    private String SERIES;//行号

    private Long RESERVED_NO;//汇总调整单号

    private Long TENANT_NUM_ID;//租户

    private Long SUB_UNIT_NUM_ID;//门店

    private Long DIV_NUM_ID;//商品中心（部门）

    private Date JUST_DATE;// 调整日期

    private Long STATUS_NUM_ID;// 状态 标识，1：未确认，2：已确认，3：驳回，4：作废，5：系统超时作废

    private Long SO_FROM_TYPE;//来源

    private Long TYPE_NUM_ID;//1：指定批次调价，2:调价，3:只调低价格，4:固定价格调价

    private Long IF_FRESH;//是否生鲜(0：非生鲜，1：生鲜)

    private Date ACCOUNT_DATE;//记账日期

    private String REMARK;//备注

    private Long CREATE_USER_ID;//创建人

    private Long LAST_UPDATE_USER_ID;//更新人

    private Date CREATE_DTME;//创建时间

    private Date LAST_UPDTME;//更新时间

    private Long CARRY_SIGN;//结转标识

    private Long DATA_SIGN;//生产或测试标识

    private Long IF_COSTADJUST;//是否产生供应商金额调整单(0：不产生，1：产生)

    private Long SUPPLY_UNIT_NUM_ID;

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

    public Long getDIV_NUM_ID()
    {
        return DIV_NUM_ID;
    }

    public void setDIV_NUM_ID(Long DIV_NUM_ID)
    {
        this.DIV_NUM_ID = DIV_NUM_ID;
    }

    public Date getJUST_DATE()
    {
        return JUST_DATE;
    }

    public void setJUST_DATE(Date JUST_DATE)
    {
        this.JUST_DATE = JUST_DATE;
    }

    public Long getSTATUS_NUM_ID()
    {
        return STATUS_NUM_ID;
    }

    public void setSTATUS_NUM_ID(Long STATUS_NUM_ID)
    {
        this.STATUS_NUM_ID = STATUS_NUM_ID;
    }

    public Long getSO_FROM_TYPE()
    {
        return SO_FROM_TYPE;
    }

    public void setSO_FROM_TYPE(Long SO_FROM_TYPE)
    {
        this.SO_FROM_TYPE = SO_FROM_TYPE;
    }

    public Long getTYPE_NUM_ID()
    {
        return TYPE_NUM_ID;
    }

    public void setTYPE_NUM_ID(Long TYPE_NUM_ID)
    {
        this.TYPE_NUM_ID = TYPE_NUM_ID;
    }

    public Long getIF_FRESH()
    {
        return IF_FRESH;
    }

    public void setIF_FRESH(Long IF_FRESH)
    {
        this.IF_FRESH = IF_FRESH;
    }

    public Date getACCOUNT_DATE()
    {
        return ACCOUNT_DATE;
    }

    public void setACCOUNT_DATE(Date ACCOUNT_DATE)
    {
        this.ACCOUNT_DATE = ACCOUNT_DATE;
    }

    public String getREMARK()
    {
        return REMARK;
    }

    public void setREMARK(String REMARK)
    {
        this.REMARK = REMARK;
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

    public Long getIF_COSTADJUST()
    {
        return IF_COSTADJUST;
    }

    public void setIF_COSTADJUST(Long IF_COSTADJUST)
    {
        this.IF_COSTADJUST = IF_COSTADJUST;
    }

    public Long getSUPPLY_UNIT_NUM_ID() {
        return SUPPLY_UNIT_NUM_ID;
    }

    public void setSUPPLY_UNIT_NUM_ID(Long SUPPLY_UNIT_NUM_ID) {
        this.SUPPLY_UNIT_NUM_ID = SUPPLY_UNIT_NUM_ID;
    }
}
