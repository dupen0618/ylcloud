package com.ykcloud.soa.erp.api.scm.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
 /**
  * @author alfred  
  * @date 2018/5/14 23:09
  * @description ScmBlChangeCost,ScmBlChangeCostDtl,ScmBlChangeCostShop
  */
public class ScmBlChangeCostAll implements Serializable
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

    private Long RESERVED_NO;//调价单号

    private String RESERVED_ID;//调价业务单号

    private Long TYPE_NUM_ID;//调整类型

    private Long SUPPLY_UNIT_NUM_ID;//供应商

    private String REMARK;//备注

    private Date MAKE_DATE;//签订日期

    private Date BEGIN_DAY;//起始日期、生效日期

    private Date END_DAY;//截止日期

    private Long UP_COST_FLAG;//调整库存成本标志

    private Long STATUS_NUM_ID;//状态

    private Long DIV_NUM_ID;//商品部类

    private Long LATELY_COST_FLAG;//是否同时修改最近进货价

    private Long OPERAT_USER_ID;//制单人员

    private Long CHECK_USER_ID;//审核人员

    private Long CARRY_SIGN;//结转标识
    
    private Long ITEM_NUM_ID;//商品主键

    private BigDecimal ORD_COST;//原进价

    private BigDecimal NEW_COST;//新进价

    private BigDecimal PRICE_DIFF;//固定价差
    
    private Long SUB_UNIT_NUM_ID;//门店编码

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

    public Long getRESERVED_NO()
    {
        return RESERVED_NO;
    }

    public void setRESERVED_NO(Long RESERVED_NO)
    {
        this.RESERVED_NO = RESERVED_NO;
    }

    public String getRESERVED_ID()
    {
        return RESERVED_ID;
    }

    public void setRESERVED_ID(String RESERVED_ID)
    {
        this.RESERVED_ID = RESERVED_ID;
    }

    public Long getTYPE_NUM_ID()
    {
        return TYPE_NUM_ID;
    }

    public void setTYPE_NUM_ID(Long TYPE_NUM_ID)
    {
        this.TYPE_NUM_ID = TYPE_NUM_ID;
    }

    public Long getSUPPLY_UNIT_NUM_ID()
    {
        return SUPPLY_UNIT_NUM_ID;
    }

    public void setSUPPLY_UNIT_NUM_ID(Long SUPPLY_UNIT_NUM_ID)
    {
        this.SUPPLY_UNIT_NUM_ID = SUPPLY_UNIT_NUM_ID;
    }

    public String getREMARK()
    {
        return REMARK;
    }

    public void setREMARK(String REMARK)
    {
        this.REMARK = REMARK;
    }

    public Date getMAKE_DATE()
    {
        return MAKE_DATE;
    }

    public void setMAKE_DATE(Date MAKE_DATE)
    {
        this.MAKE_DATE = MAKE_DATE;
    }

    public Date getBEGIN_DAY()
    {
        return BEGIN_DAY;
    }

    public void setBEGIN_DAY(Date BEGIN_DAY)
    {
        this.BEGIN_DAY = BEGIN_DAY;
    }

    public Date getEND_DAY()
    {
        return END_DAY;
    }

    public void setEND_DAY(Date END_DAY)
    {
        this.END_DAY = END_DAY;
    }

    public Long getUP_COST_FLAG()
    {
        return UP_COST_FLAG;
    }

    public void setUP_COST_FLAG(Long UP_COST_FLAG)
    {
        this.UP_COST_FLAG = UP_COST_FLAG;
    }

    public Long getSTATUS_NUM_ID()
    {
        return STATUS_NUM_ID;
    }

    public void setSTATUS_NUM_ID(Long STATUS_NUM_ID)
    {
        this.STATUS_NUM_ID = STATUS_NUM_ID;
    }

    public Long getDIV_NUM_ID()
    {
        return DIV_NUM_ID;
    }

    public void setDIV_NUM_ID(Long DIV_NUM_ID)
    {
        this.DIV_NUM_ID = DIV_NUM_ID;
    }

    public Long getLATELY_COST_FLAG()
    {
        return LATELY_COST_FLAG;
    }

    public void setLATELY_COST_FLAG(Long LATELY_COST_FLAG)
    {
        this.LATELY_COST_FLAG = LATELY_COST_FLAG;
    }

    public Long getOPERAT_USER_ID()
    {
        return OPERAT_USER_ID;
    }

    public void setOPERAT_USER_ID(Long OPERAT_USER_ID)
    {
        this.OPERAT_USER_ID = OPERAT_USER_ID;
    }

    public Long getCHECK_USER_ID()
    {
        return CHECK_USER_ID;
    }

    public void setCHECK_USER_ID(Long CHECK_USER_ID)
    {
        this.CHECK_USER_ID = CHECK_USER_ID;
    }

    public Long getCARRY_SIGN()
    {
        return CARRY_SIGN;
    }

    public void setCARRY_SIGN(Long CARRY_SIGN)
    {
        this.CARRY_SIGN = CARRY_SIGN;
    }

    public Long getITEM_NUM_ID()
    {
        return ITEM_NUM_ID;
    }

    public void setITEM_NUM_ID(Long ITEM_NUM_ID)
    {
        this.ITEM_NUM_ID = ITEM_NUM_ID;
    }

    public BigDecimal getORD_COST()
    {
        return ORD_COST;
    }

    public void setORD_COST(BigDecimal ORD_COST)
    {
        this.ORD_COST = ORD_COST;
    }

    public BigDecimal getNEW_COST()
    {
        return NEW_COST;
    }

    public void setNEW_COST(BigDecimal NEW_COST)
    {
        this.NEW_COST = NEW_COST;
    }

    public BigDecimal getPRICE_DIFF()
    {
        return PRICE_DIFF;
    }

    public void setPRICE_DIFF(BigDecimal PRICE_DIFF)
    {
        this.PRICE_DIFF = PRICE_DIFF;
    }

    public Long getSUB_UNIT_NUM_ID()
    {
        return SUB_UNIT_NUM_ID;
    }

    public void setSUB_UNIT_NUM_ID(Long SUB_UNIT_NUM_ID)
    {
        this.SUB_UNIT_NUM_ID = SUB_UNIT_NUM_ID;
    }
}
