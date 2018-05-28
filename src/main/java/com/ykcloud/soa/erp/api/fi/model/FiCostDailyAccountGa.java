package com.ykcloud.soa.erp.api.fi.model;


import java.util.Date;

/**
 * @Author 殷剑
 * @Date 2018/4/16 11:08
 */
public class FiCostDailyAccountGa{
	// 行号
	private String SERIES;
//    private Long SUB_UNIT_NUM_ID;
//    private Long ITEM_NUM_ID;
//    private Long DIV_NUM_ID;
//    private String BARCODE;
//    private String ITEM_NAME;
//    private Long PRODUCT_ORIGIN_NUM_ID;
//    private Double CONVERSION_QTY;
//    private Long CONVERSION_UNIT_NUM_ID;
//    private String CONVERSION_STYLE_DESC;
//    private Long SUPPLY_UNIT_NUM_ID;
//    private Long PHYSICAL_NUM_ID;
//    private Date ORDER_DATE;
//    private Double IN_TAX_RATE;
//    private Double OUT_TAX_RATE;
//    private Double SALE_GROSS_PROFIT;
//    private Double EXPECT_FIRST_QTY;
//    private Double EXPECT_FIRST_AMOUNT1;
//    private Double IN_QTY;
//    private Double IN_AMOUNT1;
//    private Double IN_AMOUNT2;
//    private Double IN_TAX_AMOUNT1;
//    private Double IN_TAX_AMOUNT2;
//    private Double RETURN_AMOUNT;
//    private Double RETURN_TAX_AMOUNT;
//    private Double RETURN_COST;
//    private Double INSIDE_QTY;
//    private Double INSIDE_AMOUNT1;
//    private Double INSIDE_AMOUNT2;
//    private Double INSIDE_TAX_AMOUNT1;
//    private Double ALLOT_IN_QTY;
//    private Double ALLOT_IN_AMOUNT1;
//    private Double ALLOT_IN_AMOUNT2;
//    private Double ALLOT_IN_TAX_AMOUNT1;
//    private Double ALLOT_IN_TAX_AMOUNT2;
//    private Double WORK_IN_QTY;
//    private Double WORK_IN_AMOUNT1;
//    private Double WORK_IN_AMOUNT2;
//    private Double WORK_IN_TAX_AMOUNT1;
//    private Double WORK_IN_TAX_AMOUNT2;
//    private Double RISE_QTY;
//    private Double RISE_AMOUNT1;
//    private Double RISE_AMOUNT2;
//    private Double RISE_TAX_AMOUNT1;
//    private Double RISE_TAX_AMOUNT2;
//    private Double LOSS_QTY;
//    private Double LOSS_AMOUNT1;
//    private Double LOSS_AMOUNT2;
//    private Double LOSS_TAX_AMOUNT1;
//    private Double LOSS_TAX_AMOUNT2;
//    private Double CHECK_RISE_QTY;
//    private Double CHECK_RISE_AMOUNT1;
//    private Double CHECK_RISE_AMOUNT2;
//    private Double CHECK_RISE_TAX_AMOUNT1;
//    private Double CHECK_RISE_TAX_AMOUNT2;
//    private Double CHECK_LOSS_QTY;
//    private Double CHECK_LOSS_AMOUNT1;
//    private Double CHECK_LOSS_AMOUNT2;
//    private Double CHECK_LOSS_TAX_AMOUNT1;
//    private Double CHECK_LOSS_TAX_AMOUNT2;
//    private Double FRESH_LOSS_QTY;
//    private Double FRESH_LOSS_AMOUNT1;
//    private Double FRESH_LOSS_AMOUNT2;
//    private Double FRESH_LOSS_TAX_AMOUNT1;
//    private Double FRESH_LOSS_TAX_AMOUNT2;
//    private Double ALLOT_OUT_QTY;
//    private Double ALLOT_OUT_AMOUNT1;
//    private Double ALLOT_OUT_AMOUNT2;
//    private Double ALLOT_OUT_TAX_AMOUNT1;
//    private Double ALLOT_OUT_TAX_AMOUNT2;
//    private Double WORK_OUT_QTY;
//    private Double WORK_OUT_AMOUNT1;
//    private Double WORK_OUT_AMOUNT2;
//    private Double WORK_OUT_TAX_AMOUNT1;
//    private Double WORK_OUT_TAX_AMOUNT2;
//    private Double TURN_PMT_QTY;
//    private Double TURN_PMT_AMOUNT1;
//    private Double TURN_PMT_AMOUNT2;
//    private Double TURN_PMT_TAX_AMOUNT1;
//    private Double TURN_PMT_TAX_AMOUNT2;
//    private Double SELL_QTY;
//    private Double SELL_AMOUNT;
//    private Double SELL_TAX_AMOUNT;
//    private Double SELL_COST1;
//    private Double SELL_COST2;
//    private Double SHOP_SELL_QTY;
//    private Double SHOP_SELL_AMOUNT;
//    private Double SHOP_BACK_QTY;
//    private Double SHOP_BACK_AMOUNT;
//    private Double ONLINE_SELL_QTY;
//    private Double ONLINE_SELL_AMOUNT;
//    private Double ONLINE_BACK_QTY;
//    private Double ONLINE_BACK_AMOUNT;
//    private Double ONLINE_CANCEL_QTY;
//    private Double ONLINE_CANCEL_AMOUNT;
//    private Double IN_SELL_QTY;
//    private Double IN_SELL_AMOUNT;
//    private Double IN_SELL_TAX_AMOUNT;
//    private Double IN_SELL_COST1;
//    private Double IN_SELL_COST2;
//    private Double OTHER_NO_TAX_COST;
//    private Double OTHER_COST;
//    private Double FOR_SHARE_SELL_QTY;
//    private Double FOR_SHARE_SELL_AMOUNT;
//    private Double FOR_SHARE_SELL_TAX_AMOUNT;
//    private Double FOR_SHARE_SELL_COST1;
//    private Double FOR_SHARE_SELL_COST2;
//    private Double NO_SELL_FINAL_COST;
//    private Double ONLOAD_QTY;
//    private Double ONLOAD_TAX_AMOUNT;
//    private Double ONLOAD_COST1;
//    private Double ONLOAD_COST2;
//    private Double FINAL_QTY;
//    private Double FINAL_COST;
//    private Long CARRY_SIGN;
//    private Long PTY_NUM_1;
//    private Long PTY_NUM_2;
//    private Long PTY_NUM_3;
//    private Long DEPART_NUM_ID;
//    private Long SETTLEMENT_TYPE;

	private Double ADJUSTAMOUNT;//调整金额

	public String getSERIES() {
		return SERIES;
	}

	public void setSERIES(String sERIES) {
		SERIES = sERIES;
	}

	public Double getADJUSTAMOUNT() {
		return ADJUSTAMOUNT;
	}

	public void setADJUSTAMOUNT(Double aDJUSTAMOUNT) {
		ADJUSTAMOUNT = aDJUSTAMOUNT;
	}
	
}
