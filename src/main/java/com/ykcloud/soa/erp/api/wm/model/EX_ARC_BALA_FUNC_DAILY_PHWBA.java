package com.ykcloud.soa.erp.api.wm.model;

import java.util.Date;

/**
 * Created by yiako on 2018/4/4
 */
public class EX_ARC_BALA_FUNC_DAILY_PHWBA {

    private  Long series;

    private Long tenant_Num_Id;

    private String bill_Type_Num_Name;//业务类型描述

    private String bill_Type_Num_Id;//业务类型编号

    private Long type_Num_Id;//单据类型

    private Long balance_Function_Id;//库存流水类型编号

    private String balance_Function_Name;//库存流水类型描述

    private String bill_Dtl_Tablename;//单据明细表

    private Long expect_first_aval_qty_SIGN;//初期可用

    private Long expect_first_qty_SIGN;//初期数量

    private Double in_qty_SIGN;//进货数量

    private Double INSIDE_QTY_sign;//内部进货数量

    private Double allot_in_qty_SIGN;//拨入数量

    private Double work_in_qty_SIGN;//加工拨入数量

    private Double rise_qty_SIGN;//升溢数量

    private Double loss_qty_SIGN;//损耗数量

    private Double fresh_loss_qty_SIGN;//生鲜损耗数量

    private Double allot_out_qty_SIGN;//拨出数量

    private Double work_out_qty_SIGN;//加工拨出数量

    private Double turn_pmt_qty_SIGN;//转赠品数量

    private Double sell_qty_SIGN;//销售数量

    private Double online_sell_qty_SIGN;//其中线上数量

    private Double shop_sell_qty_SIGN;//其中门店数量

    private Double online_wait_packing_qty_SIGN;//线上待拣货数量

    private Double online_packing_qty_SIGN;//线上已拣货数量

    private Double online_ship_qty_SIGN;//线上已出库数量

    private Double online_cancel_qty_SIGN;//线上取消数量

    private Double online_wait_back_qty_SIGN;//线上待退货数量

    private Double online_back_qty_SIGN;//线上已退货数量

    private Double shop_back_qty_SIGN;//门店已退货数量

    private Double online_wait_work_qty_SIGN;//线上待加工数量

    private Double online_work_qty_SIGN;//线上已加工数量

    private Double in_sell_qty_SIGN;//内部销售数量

    private Double for_share_sell_qty_SIGN;//待分摊销售数量

    private Double final_qty_SIGN;//期末数量

    private Double final_aval_qty_SIGN;//期末可用

    private String gaCompareFieldName;//减库存的时候用于判断是否够的Qty字段

    private Long canbenegative;//是否可以扣减成负数,0 不可以，1 可以

    private String wbaQtyFieldName;//流水账中的数量字段 RESERVED_QTY

    private Long accountType;//账务处理类型 1增加模型，2 扣减模型

    private Date create_dtme;//创建时间(0:无变化 1：增加 2：扣减)

    public Long getSeries() {
        return series;
    }

    public void setSeries(Long series) {
        this.series = series;
    }

    public Long getTenant_Num_Id() {
        return tenant_Num_Id;
    }

    public void setTenant_Num_Id(Long tenant_Num_Id) {
        this.tenant_Num_Id = tenant_Num_Id;
    }

    public String getBill_Type_Num_Name() {
        return bill_Type_Num_Name;
    }

    public void setBill_Type_Num_Name(String bill_Type_Num_Name) {
        this.bill_Type_Num_Name = bill_Type_Num_Name;
    }

    public String getBill_Type_Num_Id() {
        return bill_Type_Num_Id;
    }

    public void setBill_Type_Num_Id(String bill_Type_Num_Id) {
        this.bill_Type_Num_Id = bill_Type_Num_Id;
    }

    public Long getType_Num_Id() {
        return type_Num_Id;
    }

    public void setType_Num_Id(Long type_Num_Id) {
        this.type_Num_Id = type_Num_Id;
    }

    public Long getBalance_Function_Id() {
        return balance_Function_Id;
    }

    public void setBalance_Function_Id(Long balance_Function_Id) {
        this.balance_Function_Id = balance_Function_Id;
    }

    public String getBalance_Function_Name() {
        return balance_Function_Name;
    }

    public void setBalance_Function_Name(String balance_Function_Name) {
        this.balance_Function_Name = balance_Function_Name;
    }

    public String getBill_Dtl_Tablename() {
        return bill_Dtl_Tablename;
    }

    public void setBill_Dtl_Tablename(String bill_Dtl_Tablename) {
        this.bill_Dtl_Tablename = bill_Dtl_Tablename;
    }

    public Long getExpect_first_aval_qty_SIGN() {
        return expect_first_aval_qty_SIGN;
    }

    public void setExpect_first_aval_qty_SIGN(Long expect_first_aval_qty_SIGN) {
        this.expect_first_aval_qty_SIGN = expect_first_aval_qty_SIGN;
    }

    public Long getExpect_first_qty_SIGN() {
        return expect_first_qty_SIGN;
    }

    public void setExpect_first_qty_SIGN(Long expect_first_qty_SIGN) {
        this.expect_first_qty_SIGN = expect_first_qty_SIGN;
    }

    public Double getIn_qty_SIGN() {
        return in_qty_SIGN;
    }

    public void setIn_qty_SIGN(Double in_qty_SIGN) {
        this.in_qty_SIGN = in_qty_SIGN;
    }

    public Double getINSIDE_QTY_sign() {
        return INSIDE_QTY_sign;
    }

    public void setINSIDE_QTY_sign(Double INSIDE_QTY_sign) {
        this.INSIDE_QTY_sign = INSIDE_QTY_sign;
    }

    public Double getAllot_in_qty_SIGN() {
        return allot_in_qty_SIGN;
    }

    public void setAllot_in_qty_SIGN(Double allot_in_qty_SIGN) {
        this.allot_in_qty_SIGN = allot_in_qty_SIGN;
    }

    public Double getWork_in_qty_SIGN() {
        return work_in_qty_SIGN;
    }

    public void setWork_in_qty_SIGN(Double work_in_qty_SIGN) {
        this.work_in_qty_SIGN = work_in_qty_SIGN;
    }

    public Double getRise_qty_SIGN() {
        return rise_qty_SIGN;
    }

    public void setRise_qty_SIGN(Double rise_qty_SIGN) {
        this.rise_qty_SIGN = rise_qty_SIGN;
    }

    public Double getLoss_qty_SIGN() {
        return loss_qty_SIGN;
    }

    public void setLoss_qty_SIGN(Double loss_qty_SIGN) {
        this.loss_qty_SIGN = loss_qty_SIGN;
    }

    public Double getFresh_loss_qty_SIGN() {
        return fresh_loss_qty_SIGN;
    }

    public void setFresh_loss_qty_SIGN(Double fresh_loss_qty_SIGN) {
        this.fresh_loss_qty_SIGN = fresh_loss_qty_SIGN;
    }

    public Double getAllot_out_qty_SIGN() {
        return allot_out_qty_SIGN;
    }

    public void setAllot_out_qty_SIGN(Double allot_out_qty_SIGN) {
        this.allot_out_qty_SIGN = allot_out_qty_SIGN;
    }

    public Double getWork_out_qty_SIGN() {
        return work_out_qty_SIGN;
    }

    public void setWork_out_qty_SIGN(Double work_out_qty_SIGN) {
        this.work_out_qty_SIGN = work_out_qty_SIGN;
    }

    public Double getTurn_pmt_qty_SIGN() {
        return turn_pmt_qty_SIGN;
    }

    public void setTurn_pmt_qty_SIGN(Double turn_pmt_qty_SIGN) {
        this.turn_pmt_qty_SIGN = turn_pmt_qty_SIGN;
    }

    public Double getSell_qty_SIGN() {
        return sell_qty_SIGN;
    }

    public void setSell_qty_SIGN(Double sell_qty_SIGN) {
        this.sell_qty_SIGN = sell_qty_SIGN;
    }

    public Double getOnline_sell_qty_SIGN() {
        return online_sell_qty_SIGN;
    }

    public void setOnline_sell_qty_SIGN(Double online_sell_qty_SIGN) {
        this.online_sell_qty_SIGN = online_sell_qty_SIGN;
    }

    public Double getShop_sell_qty_SIGN() {
        return shop_sell_qty_SIGN;
    }

    public void setShop_sell_qty_SIGN(Double shop_sell_qty_SIGN) {
        this.shop_sell_qty_SIGN = shop_sell_qty_SIGN;
    }

    public Double getOnline_wait_packing_qty_SIGN() {
        return online_wait_packing_qty_SIGN;
    }

    public void setOnline_wait_packing_qty_SIGN(Double online_wait_packing_qty_SIGN) {
        this.online_wait_packing_qty_SIGN = online_wait_packing_qty_SIGN;
    }

    public Double getOnline_packing_qty_SIGN() {
        return online_packing_qty_SIGN;
    }

    public void setOnline_packing_qty_SIGN(Double online_packing_qty_SIGN) {
        this.online_packing_qty_SIGN = online_packing_qty_SIGN;
    }

    public Double getOnline_ship_qty_SIGN() {
        return online_ship_qty_SIGN;
    }

    public void setOnline_ship_qty_SIGN(Double online_ship_qty_SIGN) {
        this.online_ship_qty_SIGN = online_ship_qty_SIGN;
    }

    public Double getOnline_cancel_qty_SIGN() {
        return online_cancel_qty_SIGN;
    }

    public void setOnline_cancel_qty_SIGN(Double online_cancel_qty_SIGN) {
        this.online_cancel_qty_SIGN = online_cancel_qty_SIGN;
    }

    public Double getOnline_wait_back_qty_SIGN() {
        return online_wait_back_qty_SIGN;
    }

    public void setOnline_wait_back_qty_SIGN(Double online_wait_back_qty_SIGN) {
        this.online_wait_back_qty_SIGN = online_wait_back_qty_SIGN;
    }

    public Double getOnline_back_qty_SIGN() {
        return online_back_qty_SIGN;
    }

    public void setOnline_back_qty_SIGN(Double online_back_qty_SIGN) {
        this.online_back_qty_SIGN = online_back_qty_SIGN;
    }

    public Double getShop_back_qty_SIGN() {
        return shop_back_qty_SIGN;
    }

    public void setShop_back_qty_SIGN(Double shop_back_qty_SIGN) {
        this.shop_back_qty_SIGN = shop_back_qty_SIGN;
    }

    public Double getOnline_wait_work_qty_SIGN() {
        return online_wait_work_qty_SIGN;
    }

    public void setOnline_wait_work_qty_SIGN(Double online_wait_work_qty_SIGN) {
        this.online_wait_work_qty_SIGN = online_wait_work_qty_SIGN;
    }

    public Double getOnline_work_qty_SIGN() {
        return online_work_qty_SIGN;
    }

    public void setOnline_work_qty_SIGN(Double online_work_qty_SIGN) {
        this.online_work_qty_SIGN = online_work_qty_SIGN;
    }

    public Double getIn_sell_qty_SIGN() {
        return in_sell_qty_SIGN;
    }

    public void setIn_sell_qty_SIGN(Double in_sell_qty_SIGN) {
        this.in_sell_qty_SIGN = in_sell_qty_SIGN;
    }

    public Double getFor_share_sell_qty_SIGN() {
        return for_share_sell_qty_SIGN;
    }

    public void setFor_share_sell_qty_SIGN(Double for_share_sell_qty_SIGN) {
        this.for_share_sell_qty_SIGN = for_share_sell_qty_SIGN;
    }

    public Double getFinal_qty_SIGN() {
        return final_qty_SIGN;
    }

    public void setFinal_qty_SIGN(Double final_qty_SIGN) {
        this.final_qty_SIGN = final_qty_SIGN;
    }

    public Double getFinal_aval_qty_SIGN() {
        return final_aval_qty_SIGN;
    }

    public void setFinal_aval_qty_SIGN(Double final_aval_qty_SIGN) {
        this.final_aval_qty_SIGN = final_aval_qty_SIGN;
    }

    public Long getCanbenegative() {
        return canbenegative;
    }

    public void setCanbenegative(Long canbenegative) {
        this.canbenegative = canbenegative;
    }

    public String getGaCompareFieldName() {
        return gaCompareFieldName;
    }

    public void setGaCompareFieldName(String gaCompareFieldName) {
        this.gaCompareFieldName = gaCompareFieldName;
    }

    public String getWbaQtyFieldName() {
        return wbaQtyFieldName;
    }

    public void setWbaQtyFieldName(String wbaQtyFieldName) {
        this.wbaQtyFieldName = wbaQtyFieldName;
    }

    public Long getAccountType() {
        return accountType;
    }

    public void setAccountType(Long accountType) {
        this.accountType = accountType;
    }

    public Date getCreate_dtme() {
        return create_dtme;
    }

    public void setCreate_dtme(Date create_dtme) {
        this.create_dtme = create_dtme;
    }
}
