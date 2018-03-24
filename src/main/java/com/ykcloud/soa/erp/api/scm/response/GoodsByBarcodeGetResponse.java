package com.ykcloud.soa.erp.api.scm.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;

/***
 * 通过条形码获取商品信息相应参数
 * @author bi.cai
 * @date 2018年01月11日 下午10:46:39
 */
public class GoodsByBarcodeGetResponse extends MessagePack {

	private static final long serialVersionUID = -3621634900229807547L;
	
	//商品id
	private Long itemNumId;
	
	//条形码
	private String barcode;
	
	//商品名称
	private String itemName;
	
	//原价
	private Double retailPrice;
	
	//销售价
	private Double standardPrice;
	
	//折后单价
	private Double tradePrice;
	
	//会员价
	private Double vipPrice;
	
	//数量
	private Double qty;
	
	//折让金额 retailPrice*qty-standardPrice*qty
	private Double deductAmount;
	
	//结算金额
	private Double tradeAmount;
	
	//条码类型
	private Long barcodeTypeNumId;
	
	//经营类型 1-买断 2代销 3-联营
	private Long sellTypeNumId;
	
	//事业部
	private Long divNumId;
	
	//库存属性
	private Long locPtyNumId=1l;
	
	//销售单位
	private String unitsName;
	
	//来源单号
	private Long reservedNo;
	
	//临时调价单类型  501-永久调价,502-临时变价,503-DM调价,504-普惠会员价,505-等级会员
	private Long priceType;
	

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

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	
	public Double getRetailPrice() {
		return retailPrice;
	}

	public void setRetailPrice(Double retailPrice) {
		this.retailPrice = retailPrice;
	}

	public Double getStandardPrice() {
		return standardPrice;
	}

	public void setStandardPrice(Double standardPrice) {
		this.standardPrice = standardPrice;
	}

	public Double getVipPrice() {
		return vipPrice;
	}

	public void setVipPrice(Double vipPrice) {
		this.vipPrice = vipPrice;
	}

	public Double getQty() {
		return qty;
	}

	public void setQty(Double qty) {
		this.qty = qty;
	}

	public Double getDeductAmount() {
		return deductAmount;
	}

	public void setDeductAmount(Double deductAmount) {
		this.deductAmount = deductAmount;
	}

	public Double getTradeAmount() {
		return tradeAmount;
	}

	public void setTradeAmount(Double tradeAmount) {
		this.tradeAmount = tradeAmount;
	}

	public Long getBarcodeTypeNumId() {
		return barcodeTypeNumId;
	}

	public void setBarcodeTypeNumId(Long barcodeTypeNumId) {
		this.barcodeTypeNumId = barcodeTypeNumId;
	}

	public Long getSellTypeNumId() {
		return sellTypeNumId;
	}

	public void setSellTypeNumId(Long sellTypeNumId) {
		this.sellTypeNumId = sellTypeNumId;
	}

	public Long getDivNumId() {
		return divNumId;
	}

	public void setDivNumId(Long divNumId) {
		this.divNumId = divNumId;
	}

	public Long getLocPtyNumId() {
		return locPtyNumId;
	}

	public void setLocPtyNumId(Long locPtyNumId) {
		this.locPtyNumId = locPtyNumId;
	}

	public String getUnitsName() {
		return unitsName;
	}

	public void setUnitsName(String unitsName) {
		this.unitsName = unitsName;
	}

	public Double getTradePrice() {
		return tradePrice;
	}

	public void setTradePrice(Double tradePrice) {
		this.tradePrice = tradePrice;
	}

	public Long getReservedNo() {
		return reservedNo;
	}

	public void setReservedNo(Long reservedNo) {
		this.reservedNo = reservedNo;
	}

	public Long getPriceType() {
		return priceType;
	}

	public void setPriceType(Long priceType) {
		this.priceType = priceType;
	}
}
