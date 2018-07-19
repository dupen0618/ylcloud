package com.ykcloud.soa.erp.api.so.response;

import java.util.Date;
import com.gb.soa.omp.ccommon.api.response.MessagePack;

/**
 * 
 * @author gaoyun.shen
 *
 * @date 2018年7月19日 下午12:12:13
 * 
 * @Description  RF查询商品信息和销售统计返回参数
 */
public class ProductFullDetailAndSaleStatisticGetResponse extends MessagePack {
	private static final long serialVersionUID = 1L;
	
	private String itemName;
	private String productOriginName;
	private String itemid;
	private Long itemNumId;
	private String barcode;
	private String unitsName;
	private Double retailPrice;
	private Double price;
	private Double vipPrice;
	private String typeTempName;//typeTemp临时调价单类型(1DM促销,2临时调售价)
	private Date beginDay;
	private Date endDay;
	private Double physicQty;
	private Double onloadQty;
	private Double sellQtyToday;
	private Double sellQtyLastWeek;
	private Double sellQtyLastMonth;
	private Double sellQtyLastQuarter;
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getProductOriginName() {
		return productOriginName;
	}
	public void setProductOriginName(String productOriginName) {
		this.productOriginName = productOriginName;
	}
	public String getItemid() {
		return itemid;
	}
	public void setItemid(String itemid) {
		this.itemid = itemid;
	}
	public Long getItemNumId() {
		return itemNumId;
	}
	public void setItemNumId(Long itemNumId) {
		this.itemNumId = itemNumId;
	}
	public String getBarcode() {
		return barcode;
	}
	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}
	public String getUnitsName() {
		return unitsName;
	}
	public void setUnitsName(String unitsName) {
		this.unitsName = unitsName;
	}
	public Double getRetailPrice() {
		return retailPrice;
	}
	public void setRetailPrice(Double retailPrice) {
		this.retailPrice = retailPrice;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Double getVipPrice() {
		return vipPrice;
	}
	public void setVipPrice(Double vipPrice) {
		this.vipPrice = vipPrice;
	}
	public String getTypeTempName() {
		return typeTempName;
	}
	public void setTypeTempName(String typeTempName) {
		this.typeTempName = typeTempName;
	}
	public Date getBeginDay() {
		return beginDay;
	}
	public void setBeginDay(Date beginDay) {
		this.beginDay = beginDay;
	}
	public Date getEndDay() {
		return endDay;
	}
	public void setEndDay(Date endDay) {
		this.endDay = endDay;
	}
	public Double getPhysicQty() {
		return physicQty;
	}
	public void setPhysicQty(Double physicQty) {
		this.physicQty = physicQty;
	}
	public Double getOnloadQty() {
		return onloadQty;
	}
	public void setOnloadQty(Double onloadQty) {
		this.onloadQty = onloadQty;
	}
	public Double getSellQtyToday() {
		return sellQtyToday;
	}
	public void setSellQtyToday(Double sellQtyToday) {
		this.sellQtyToday = sellQtyToday;
	}
	public Double getSellQtyLastWeek() {
		return sellQtyLastWeek;
	}
	public void setSellQtyLastWeek(Double sellQtyLastWeek) {
		this.sellQtyLastWeek = sellQtyLastWeek;
	}
	public Double getSellQtyLastMonth() {
		return sellQtyLastMonth;
	}
	public void setSellQtyLastMonth(Double sellQtyLastMonth) {
		this.sellQtyLastMonth = sellQtyLastMonth;
	}
	public Double getSellQtyLastQuarter() {
		return sellQtyLastQuarter;
	}
	public void setSellQtyLastQuarter(Double sellQtyLastQuarter) {
		this.sellQtyLastQuarter = sellQtyLastQuarter;
	}
	
}
