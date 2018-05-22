package com.ykcloud.soa.erp.api.wm.model;

import java.util.Date;

public class EX_ARC_BALA_FUNC_MONTH_PHWBA {

    private  Long SERIES;

    private Long TENANT_NUM_ID;

    private String BILL_TYPE_NUM_NAME="0";//业务类型描述

    private String BILL_TYPE_NUM_ID="0";//业务类型编号

    private Long TYPE_NUM_ID=0L;//单据类型

    private Long BALANCE_FUNCTION_ID=0L;//库存流水类型编号

    private String BALANCE_FUNCTION_NAME="0";//库存流水类型描述

    private String BILL_DTL_TABLENAME="0";//单据明细表

    private Long EXPECT_FIRST_QTY_SIGN;//初期数量

    private Long IN_QTY_SIGN;//进货数量

    private Long INSIDE_QTY_SIGN;//内部进货数量

    private Long ALLOT_IN_QTY_SIGN;//拨入数量

    private Long WORK_IN_QTY_SIGN;//加工拨入数量

    private Long RISE_QTY_SIGN;//升溢数量

    private Long LOSS_QTY_SIGN;//损耗数量

    private Long FRESH_LOSS_QTY_SIGN;//生鲜损耗数量

    private Long ALLOT_OUT_QTY_SIGN;//拨出数量

    private Long WORK_OUT_QTY_SIGN;//加工拨出数量

    private Long TURN_PMT_QTY_SIGN;//转赠品数量

    private Long SELL_QTY_SIGN;//销售数量

    private Long ONLINE_SELL_QTY_SIGN;//其中线上数量

    private Long SHOP_SELL_QTY_SIGN;//其中门店数量

    private Long ONLINE_PACKING_QTY_SIGN;//线上已拣货数量

    private Long ONLINE_SHIP_QTY_SIGN;//线上已出库数量

    private Long ONLINE_CANCEL_QTY_SIGN;//线上取消数量

    private Long ONLINE_BACK_QTY_SIGN;//线上已退货数量

    private Long SHOP_BACK_QTY_SIGN;//门店已退货数量

    private Long ONLINE_WORK_QTY_SIGN;//线上已加工数量

    private Long IN_SELL_QTY_SIGN;//内部销售数量

    private Long FOR_SHARE_SELL_QTY_SIGN;//待分摊销售数量

    private Long FINAL_QTY_SIGN;//期末数量

    private Long ONLOAD_QTY_SIGN;//在途数量

    private String GACOMPAREFIELDNAME="0";//减库存的时候用于判断是否够的Qty字段

    private Long CANBENEGATIVE=0L;//是否可以扣减成负数,0 不可以，1 可以

    private String WBAQTYFIELDNAME="0";//流水账中的数量字段 RESERVED_QTY

    private Long ACCOUNTTYPE=1L;//账务处理类型 1增加模型，2 扣减模型

    private Date CREATE_DTME;//创建时间(0:无变化 1：增加 2：扣减)

    private Long CHECK_LOSS_QTY_SIGN;//盘亏数量

    private Long CHECK_RISE_QTY_SIGN;//盘盈数量

    public Long getSERIES() {
        return SERIES;
    }

    public void setSERIES(Long SERIES) {
        this.SERIES = SERIES;
    }

    public Long getTENANT_NUM_ID() {
        return TENANT_NUM_ID;
    }

    public void setTENANT_NUM_ID(Long TENANT_NUM_ID) {
        this.TENANT_NUM_ID = TENANT_NUM_ID;
    }

    public String getBILL_TYPE_NUM_NAME() {
        return BILL_TYPE_NUM_NAME;
    }

    public void setBILL_TYPE_NUM_NAME(String BILL_TYPE_NUM_NAME) {
        this.BILL_TYPE_NUM_NAME = BILL_TYPE_NUM_NAME;
    }

    public String getBILL_TYPE_NUM_ID() {
        return BILL_TYPE_NUM_ID;
    }

    public void setBILL_TYPE_NUM_ID(String BILL_TYPE_NUM_ID) {
        this.BILL_TYPE_NUM_ID = BILL_TYPE_NUM_ID;
    }

    public Long getTYPE_NUM_ID() {
        return TYPE_NUM_ID;
    }

    public void setTYPE_NUM_ID(Long TYPE_NUM_ID) {
        this.TYPE_NUM_ID = TYPE_NUM_ID;
    }

    public Long getBALANCE_FUNCTION_ID() {
        return BALANCE_FUNCTION_ID;
    }

    public void setBALANCE_FUNCTION_ID(Long BALANCE_FUNCTION_ID) {
        this.BALANCE_FUNCTION_ID = BALANCE_FUNCTION_ID;
    }

    public String getBALANCE_FUNCTION_NAME() {
        return BALANCE_FUNCTION_NAME;
    }

    public void setBALANCE_FUNCTION_NAME(String BALANCE_FUNCTION_NAME) {
        this.BALANCE_FUNCTION_NAME = BALANCE_FUNCTION_NAME;
    }

    public String getBILL_DTL_TABLENAME() {
        return BILL_DTL_TABLENAME;
    }

    public void setBILL_DTL_TABLENAME(String BILL_DTL_TABLENAME) {
        this.BILL_DTL_TABLENAME = BILL_DTL_TABLENAME;
    }

    public Long getEXPECT_FIRST_QTY_SIGN() {
        return EXPECT_FIRST_QTY_SIGN;
    }

    public void setEXPECT_FIRST_QTY_SIGN(Long EXPECT_FIRST_QTY_SIGN) {
        this.EXPECT_FIRST_QTY_SIGN = EXPECT_FIRST_QTY_SIGN;
    }

    public Long getIN_QTY_SIGN() {
        return IN_QTY_SIGN;
    }

    public void setIN_QTY_SIGN(Long IN_QTY_SIGN) {
        this.IN_QTY_SIGN = IN_QTY_SIGN;
    }

    public Long getINSIDE_QTY_SIGN() {
        return INSIDE_QTY_SIGN;
    }

    public void setINSIDE_QTY_SIGN(Long INSIDE_QTY_SIGN) {
        this.INSIDE_QTY_SIGN = INSIDE_QTY_SIGN;
    }

    public Long getALLOT_IN_QTY_SIGN() {
        return ALLOT_IN_QTY_SIGN;
    }

    public void setALLOT_IN_QTY_SIGN(Long ALLOT_IN_QTY_SIGN) {
        this.ALLOT_IN_QTY_SIGN = ALLOT_IN_QTY_SIGN;
    }

    public Long getWORK_IN_QTY_SIGN() {
        return WORK_IN_QTY_SIGN;
    }

    public void setWORK_IN_QTY_SIGN(Long WORK_IN_QTY_SIGN) {
        this.WORK_IN_QTY_SIGN = WORK_IN_QTY_SIGN;
    }

    public Long getRISE_QTY_SIGN() {
        return RISE_QTY_SIGN;
    }

    public void setRISE_QTY_SIGN(Long RISE_QTY_SIGN) {
        this.RISE_QTY_SIGN = RISE_QTY_SIGN;
    }

    public Long getLOSS_QTY_SIGN() {
        return LOSS_QTY_SIGN;
    }

    public void setLOSS_QTY_SIGN(Long LOSS_QTY_SIGN) {
        this.LOSS_QTY_SIGN = LOSS_QTY_SIGN;
    }

    public Long getFRESH_LOSS_QTY_SIGN() {
        return FRESH_LOSS_QTY_SIGN;
    }

    public void setFRESH_LOSS_QTY_SIGN(Long FRESH_LOSS_QTY_SIGN) {
        this.FRESH_LOSS_QTY_SIGN = FRESH_LOSS_QTY_SIGN;
    }

    public Long getALLOT_OUT_QTY_SIGN() {
        return ALLOT_OUT_QTY_SIGN;
    }

    public void setALLOT_OUT_QTY_SIGN(Long ALLOT_OUT_QTY_SIGN) {
        this.ALLOT_OUT_QTY_SIGN = ALLOT_OUT_QTY_SIGN;
    }

    public Long getWORK_OUT_QTY_SIGN() {
        return WORK_OUT_QTY_SIGN;
    }

    public void setWORK_OUT_QTY_SIGN(Long WORK_OUT_QTY_SIGN) {
        this.WORK_OUT_QTY_SIGN = WORK_OUT_QTY_SIGN;
    }

    public Long getTURN_PMT_QTY_SIGN() {
        return TURN_PMT_QTY_SIGN;
    }

    public void setTURN_PMT_QTY_SIGN(Long TURN_PMT_QTY_SIGN) {
        this.TURN_PMT_QTY_SIGN = TURN_PMT_QTY_SIGN;
    }

    public Long getSELL_QTY_SIGN() {
        return SELL_QTY_SIGN;
    }

    public void setSELL_QTY_SIGN(Long SELL_QTY_SIGN) {
        this.SELL_QTY_SIGN = SELL_QTY_SIGN;
    }

    public Long getONLINE_SELL_QTY_SIGN() {
        return ONLINE_SELL_QTY_SIGN;
    }

    public void setONLINE_SELL_QTY_SIGN(Long ONLINE_SELL_QTY_SIGN) {
        this.ONLINE_SELL_QTY_SIGN = ONLINE_SELL_QTY_SIGN;
    }

    public Long getSHOP_SELL_QTY_SIGN() {
        return SHOP_SELL_QTY_SIGN;
    }

    public void setSHOP_SELL_QTY_SIGN(Long SHOP_SELL_QTY_SIGN) {
        this.SHOP_SELL_QTY_SIGN = SHOP_SELL_QTY_SIGN;
    }

    public Long getONLINE_PACKING_QTY_SIGN() {
        return ONLINE_PACKING_QTY_SIGN;
    }

    public void setONLINE_PACKING_QTY_SIGN(Long ONLINE_PACKING_QTY_SIGN) {
        this.ONLINE_PACKING_QTY_SIGN = ONLINE_PACKING_QTY_SIGN;
    }

    public Long getONLINE_SHIP_QTY_SIGN() {
        return ONLINE_SHIP_QTY_SIGN;
    }

    public void setONLINE_SHIP_QTY_SIGN(Long ONLINE_SHIP_QTY_SIGN) {
        this.ONLINE_SHIP_QTY_SIGN = ONLINE_SHIP_QTY_SIGN;
    }

    public Long getONLINE_CANCEL_QTY_SIGN() {
        return ONLINE_CANCEL_QTY_SIGN;
    }

    public void setONLINE_CANCEL_QTY_SIGN(Long ONLINE_CANCEL_QTY_SIGN) {
        this.ONLINE_CANCEL_QTY_SIGN = ONLINE_CANCEL_QTY_SIGN;
    }

    public Long getONLINE_BACK_QTY_SIGN() {
        return ONLINE_BACK_QTY_SIGN;
    }

    public void setONLINE_BACK_QTY_SIGN(Long ONLINE_BACK_QTY_SIGN) {
        this.ONLINE_BACK_QTY_SIGN = ONLINE_BACK_QTY_SIGN;
    }

    public Long getSHOP_BACK_QTY_SIGN() {
        return SHOP_BACK_QTY_SIGN;
    }

    public void setSHOP_BACK_QTY_SIGN(Long SHOP_BACK_QTY_SIGN) {
        this.SHOP_BACK_QTY_SIGN = SHOP_BACK_QTY_SIGN;
    }

    public Long getONLINE_WORK_QTY_SIGN() {
        return ONLINE_WORK_QTY_SIGN;
    }

    public void setONLINE_WORK_QTY_SIGN(Long ONLINE_WORK_QTY_SIGN) {
        this.ONLINE_WORK_QTY_SIGN = ONLINE_WORK_QTY_SIGN;
    }

    public Long getIN_SELL_QTY_SIGN() {
        return IN_SELL_QTY_SIGN;
    }

    public void setIN_SELL_QTY_SIGN(Long IN_SELL_QTY_SIGN) {
        this.IN_SELL_QTY_SIGN = IN_SELL_QTY_SIGN;
    }

    public Long getFOR_SHARE_SELL_QTY_SIGN() {
        return FOR_SHARE_SELL_QTY_SIGN;
    }

    public void setFOR_SHARE_SELL_QTY_SIGN(Long FOR_SHARE_SELL_QTY_SIGN) {
        this.FOR_SHARE_SELL_QTY_SIGN = FOR_SHARE_SELL_QTY_SIGN;
    }

    public Long getFINAL_QTY_SIGN() {
        return FINAL_QTY_SIGN;
    }

    public void setFINAL_QTY_SIGN(Long FINAL_QTY_SIGN) {
        this.FINAL_QTY_SIGN = FINAL_QTY_SIGN;
    }

    public Long getONLOAD_QTY_SIGN() {
        return ONLOAD_QTY_SIGN;
    }

    public void setONLOAD_QTY_SIGN(Long ONLOAD_QTY_SIGN) {
        this.ONLOAD_QTY_SIGN = ONLOAD_QTY_SIGN;
    }

    public String getGACOMPAREFIELDNAME() {
        return GACOMPAREFIELDNAME;
    }

    public void setGACOMPAREFIELDNAME(String GACOMPAREFIELDNAME) {
        this.GACOMPAREFIELDNAME = GACOMPAREFIELDNAME;
    }

    public Long getCANBENEGATIVE() {
        return CANBENEGATIVE;
    }

    public void setCANBENEGATIVE(Long CANBENEGATIVE) {
        this.CANBENEGATIVE = CANBENEGATIVE;
    }

    public String getWBAQTYFIELDNAME() {
        return WBAQTYFIELDNAME;
    }

    public void setWBAQTYFIELDNAME(String WBAQTYFIELDNAME) {
        this.WBAQTYFIELDNAME = WBAQTYFIELDNAME;
    }

    public Long getACCOUNTTYPE() {
        return ACCOUNTTYPE;
    }

    public void setACCOUNTTYPE(Long ACCOUNTTYPE) {
        this.ACCOUNTTYPE = ACCOUNTTYPE;
    }

    public Date getCREATE_DTME() {
        return CREATE_DTME;
    }

    public void setCREATE_DTME(Date CREATE_DTME) {
        this.CREATE_DTME = CREATE_DTME;
    }

    public Long getCHECK_LOSS_QTY_SIGN() {
        return CHECK_LOSS_QTY_SIGN;
    }

    public void setCHECK_LOSS_QTY_SIGN(Long CHECK_LOSS_QTY_SIGN) {
        this.CHECK_LOSS_QTY_SIGN = CHECK_LOSS_QTY_SIGN;
    }

    public Long getCHECK_RISE_QTY_SIGN() {
        return CHECK_RISE_QTY_SIGN;
    }

    public void setCHECK_RISE_QTY_SIGN(Long CHECK_RISE_QTY_SIGN) {
        this.CHECK_RISE_QTY_SIGN = CHECK_RISE_QTY_SIGN;
    }
}
