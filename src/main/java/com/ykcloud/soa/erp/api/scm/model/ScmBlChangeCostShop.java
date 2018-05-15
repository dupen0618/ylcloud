package com.ykcloud.soa.erp.api.scm.model;


import java.io.Serializable;
import java.util.Date;

/**
  * @author alfred
  * @date 2018/5/14 20:55
  * @description
  */

public class ScmBlChangeCostShop implements Serializable
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
    private Long SUB_UNIT_NUM_ID;//门店编码
    private Long CARRY_SIGN;//结转标识

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

    public Long getSUB_UNIT_NUM_ID()
    {
        return SUB_UNIT_NUM_ID;
    }

    public void setSUB_UNIT_NUM_ID(Long SUB_UNIT_NUM_ID)
    {
        this.SUB_UNIT_NUM_ID = SUB_UNIT_NUM_ID;
    }

    public Long getCARRY_SIGN()
    {
        return CARRY_SIGN;
    }

    public void setCARRY_SIGN(Long CARRY_SIGN)
    {
        this.CARRY_SIGN = CARRY_SIGN;
    }
}
