package com.ykcloud.soa.erp.api.so.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @Author: fred.zhao
 * @Description: so小票单单身model
 * @Date: Created in 17:26:2018/4/19
 */
public class SoTmlDtlForGenerateData implements Serializable{

    private static final long serialVersionUID = -1969443663040307569L;
    private String series;//序号

    private Long tenantNumId;//租户id

    private String tmlNumId;//终端订单号

    private Long subUnitNumId;//门店编号

    private Long divNumId;//事业部主键

    private Long itemNumId;//商品主键

    private Long gpItemNumId;//父商品编号

    private Double retailPrice;//零售价格

    private Double standardPrice;//标准价

    private Double tradePrice;//折后价格

    private Double resolveTradePrice;//分摊价

    private Double qty;//数量

    private Double lockQty;//锁定数量

    private Double revatQty;//预约数量

    private Double revat1Qty;//预出库数量

    private Double pickQty;//拣货数量

    private Double shipQty;//发运数量

    private Double cancelQty;//取消数量

    private Double initShipQty;//本店发货量


    private Double locPtyNumId;//库位属性


    private String barcode;//条码

    private Double pcyQty;//组合降价数量

    private Double missQty;//缺货数量

    private Long pmtSign;//赠送(0：正常品；1：赠送品)

    private Double pcy1Qty;//买赠数量

    private Double pcy1Amount;//买赠金额

    private Double changeQty;//

    private Date recvDate;//收货日期要求

    private Double cx2TradePrice;//组合降价后价格

    private Date createDtme;//创建时间

    private Date lastUpdtme;//最后更新时间

    private Long createUserId;//用户

    private Long lastUpdateUserId;//更新用户

    private String cancelsign;//删除

    private String insertData;//新增

    private String updatedata;//更新

    private Long barcodeTypeNumId;

    private String invFromType;//库存来源：1店内现货，2无货后台共享

    private Long tranSimNumId;//快递方式

    private Long tranTypeNumId;//提货方式：1现场提货，2送货上门，3快递上门，4到店提货，5锁库店提货，6微店现场提货

    private Date shipTimeProclaim;//时间要求

    private Long sourceSeries;//退货/换换货时，引用原始订单明细中的序列号

    private Long salesTypeNumId;//销售类型(1、正常销售；2、联销；3、服务类)

    private Long salesEmpeNumId;//促销员编号

    private Double stopQty;//截单数量

    private Double resolveValue;//分摊金额

    private Double stopUseQty;//截单已退货数量

    private Double stopSign;//截单退货标识 0:非截单； 1：截单标识；

    private Double backQty;//退货数量

    private String itemName;//商品名称

    private String simItemName;//商品简称

    private Long productOriginNumId;//产地

    private Double conversionQty;//件装数

    private Long conversiongUnitNumId;//件装单位

    private Double packageQty;//件数

    private Double conversionRate;//子母转换比率

    private Double starndardDiscount;//标准折扣

    private Double shopCouponAmount;//门店优惠券

    private Double platCouponAmount;//平台优惠券

    private Double discountAmount;//整单折扣金额

    private Double efAmount;//快递费

    private Double istAmount;//安装费

    private Long  discountType;//折扣类型（1、贵宾卡，2、店庆，3、样品）

    private Long dataSign;//0: 正式  1：测试

    private Long  carrySign;//结转标识

    private Long supplyUnitNumId;//默认供应商，为分组准备

    private Long settlementType;//结算方式,为分组准备

    private Long logisticsType;//送货方式

    private Double otherDiscount;//其他优惠

    private Double deductAmount; //

    private Double custInvoicePrice;//


    private Long sendStorageNumId;//

    private Long stkNumId;

    private Long locType;

    private Double malingAmount;

    private Double fAmount;

    private Double tradeAmount;

    private Long itemid;
    
    private Date orderDate;
    
    private Double taxRate;
    

    public Double getTaxRate() {
		return taxRate;
	}

	public void setTaxRate(Double taxRate) {
		this.taxRate = taxRate;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public Long getItemid() {
        return itemid;
    }

    public void setItemid(Long itemid) {
        this.itemid = itemid;
    }

    public Double getTradeAmount() {
        return tradeAmount;
    }

    public void setTradeAmount(Double tradeAmount) {
        this.tradeAmount = tradeAmount;
    }

    public Double getfAmount() {
        return fAmount;
    }

    public void setfAmount(Double fAmount) {
        this.fAmount = fAmount;
    }

    public Double getMalingAmount() {
        return malingAmount;
    }

    public void setMalingAmount(Double malingAmount) {
        this.malingAmount = malingAmount;
    }

    public Long getLocType() {
        return locType;
    }

    public void setLocType(Long locType) {
        this.locType = locType;
    }

    public Long getStkNumId() {
        return stkNumId;
    }

    public void setStkNumId(Long stkNumId) {
        this.stkNumId = stkNumId;
    }

    public Long getSendStorageNumId() {
        return sendStorageNumId;
    }

    public void setSendStorageNumId(Long sendStorageNumId) {
        this.sendStorageNumId = sendStorageNumId;
    }


    public Double getCustInvoicePrice() {
        return custInvoicePrice;
    }

    public void setCustInvoicePrice(Double custInvoicePrice) {
        this.custInvoicePrice = custInvoicePrice;
    }

    public Double getDeductAmount() {
        return deductAmount;
    }

    public void setDeductAmount(Double deductAmount) {
        this.deductAmount = deductAmount;
    }

    public Double getOtherDiscount() {
        return otherDiscount;
    }

    public void setOtherDiscount(Double otherDiscount) {
        this.otherDiscount = otherDiscount;
    }

   

    public Long getBarcodeTypeNumId() {
		return barcodeTypeNumId;
	}

	public void setBarcodeTypeNumId(Long barcodeTypeNumId) {
		this.barcodeTypeNumId = barcodeTypeNumId;
	}

	public Date getRecvDate() {
        return recvDate;
    }

    public void setRecvDate(Date recvDate) {
        this.recvDate = recvDate;
    }

    public Double getChangeQty() {
        return changeQty;
    }

    public void setChangeQty(Double changeQty) {
        this.changeQty = changeQty;
    }

    public Long getSubUnitNumId() {
        return subUnitNumId;
    }

    public void setSubUnitNumId(Long subUnitNumId) {
        this.subUnitNumId = subUnitNumId;
    }

    public Long getLogisticsType() {
        return logisticsType;
    }

    public void setLogisticsType(Long logisticsType) {
        this.logisticsType = logisticsType;
    }

    public Long getSettlementType() {
        return settlementType;
    }

    public void setSettlementType(Long settlementType) {
        this.settlementType = settlementType;
    }

    public Long getSupplyUnitNumId() {
        return supplyUnitNumId;
    }

    public void setSupplyUnitNumId(Long supplyUnitNumId) {
        this.supplyUnitNumId = supplyUnitNumId;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public Long getTenantNumId() {
        return tenantNumId;
    }

    public void setTenantNumId(Long tenantNumId) {
        this.tenantNumId = tenantNumId;
    }

    public String getTmlNumId() {
        return tmlNumId;
    }

    public void setTmlNumId(String tmlNumId) {
        this.tmlNumId = tmlNumId;
    }

    public Long getDivNumId() {
        return divNumId;
    }

    public void setDivNumId(Long divNumId) {
        this.divNumId = divNumId;
    }

    public Long getItemNumId() {
        return itemNumId;
    }

    public void setItemNumId(Long itemNumId) {
        this.itemNumId = itemNumId;
    }

    public Long getGpItemNumId() {
        return gpItemNumId;
    }

    public void setGpItemNumId(Long gpItemNumId) {
        this.gpItemNumId = gpItemNumId;
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

    public Double getTradePrice() {
        return tradePrice;
    }

    public void setTradePrice(Double tradePrice) {
        this.tradePrice = tradePrice;
    }

    public Double getResolveTradePrice() {
        return resolveTradePrice;
    }

    public void setResolveTradePrice(Double resolveTradePrice) {
        this.resolveTradePrice = resolveTradePrice;
    }

    public Double getQty() {
        return qty;
    }

    public void setQty(Double qty) {
        this.qty = qty;
    }

    public Double getLockQty() {
        return lockQty;
    }

    public void setLockQty(Double lockQty) {
        this.lockQty = lockQty;
    }

    public Double getRevatQty() {
        return revatQty;
    }

    public void setRevatQty(Double revatQty) {
        this.revatQty = revatQty;
    }

    public Double getRevat1Qty() {
        return revat1Qty;
    }

    public void setRevat1Qty(Double revat1Qty) {
        this.revat1Qty = revat1Qty;
    }

    public Double getPickQty() {
        return pickQty;
    }

    public void setPickQty(Double pickQty) {
        this.pickQty = pickQty;
    }

    public Double getShipQty() {
        return shipQty;
    }

    public void setShipQty(Double shipQty) {
        this.shipQty = shipQty;
    }

    public Double getCancelQty() {
        return cancelQty;
    }

    public void setCancelQty(Double cancelQty) {
        this.cancelQty = cancelQty;
    }

    public Double getInitShipQty() {
        return initShipQty;
    }

    public void setInitShipQty(Double initShipQty) {
        this.initShipQty = initShipQty;
    }


    public Double getLocPtyNumId() {
        return locPtyNumId;
    }

    public void setLocPtyNumId(Double locPtyNumId) {
        this.locPtyNumId = locPtyNumId;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public Double getPcyQty() {
        return pcyQty;
    }

    public void setPcyQty(Double pcyQty) {
        this.pcyQty = pcyQty;
    }

    public Double getMissQty() {
        return missQty;
    }

    public void setMissQty(Double missQty) {
        this.missQty = missQty;
    }

    public Long getPmtSign() {
        return pmtSign;
    }

    public void setPmtSign(Long pmtSign) {
        this.pmtSign = pmtSign;
    }

    public Double getPcy1Qty() {
        return pcy1Qty;
    }

    public void setPcy1Qty(Double pcy1Qty) {
        this.pcy1Qty = pcy1Qty;
    }

    public Double getPcy1Amount() {
        return pcy1Amount;
    }

    public void setPcy1Amount(Double pcy1Amount) {
        this.pcy1Amount = pcy1Amount;
    }

    public Double getCx2TradePrice() {
        return cx2TradePrice;
    }

    public void setCx2TradePrice(Double cx2TradePrice) {
        this.cx2TradePrice = cx2TradePrice;
    }

    public Date getCreateDtme() {
        return createDtme;
    }

    public void setCreateDtme(Date createDtme) {
        this.createDtme = createDtme;
    }

    

    public Date getLastUpdtme() {
		return lastUpdtme;
	}

	public void setLastUpdtme(Date lastUpdtme) {
		this.lastUpdtme = lastUpdtme;
	}

	public Long getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(Long createUserId) {
        this.createUserId = createUserId;
    }

    public Long getLastUpdateUserId() {
        return lastUpdateUserId;
    }

    public void setLastUpdateUserId(Long lastUpdateUserId) {
        this.lastUpdateUserId = lastUpdateUserId;
    }

    public String getCancelsign() {
        return cancelsign;
    }

    public void setCancelsign(String cancelsign) {
        this.cancelsign = cancelsign;
    }

    public String getInsertData() {
        return insertData;
    }

    public void setInsertData(String insertData) {
        this.insertData = insertData;
    }

    public String getUpdatedata() {
        return updatedata;
    }

    public void setUpdatedata(String updatedata) {
        this.updatedata = updatedata;
    }

    public String getInvFromType() {
        return invFromType;
    }

    public void setInvFromType(String invFromType) {
        this.invFromType = invFromType;
    }

    public Long getTranSimNumId() {
        return tranSimNumId;
    }

    public void setTranSimNumId(Long tranSimNumId) {
        this.tranSimNumId = tranSimNumId;
    }

    public Long getTranTypeNumId() {
        return tranTypeNumId;
    }

    public void setTranTypeNumId(Long tranTypeNumId) {
        this.tranTypeNumId = tranTypeNumId;
    }

    public Date getShipTimeProclaim() {
        return shipTimeProclaim;
    }

    public void setShipTimeProclaim(Date shipTimeProclaim) {
        this.shipTimeProclaim = shipTimeProclaim;
    }

    public Long getSourceSeries() {
        return sourceSeries;
    }

    public void setSourceSeries(Long sourceSeries) {
        this.sourceSeries = sourceSeries;
    }

    public Long getSalesTypeNumId() {
        return salesTypeNumId;
    }

    public void setSalesTypeNumId(Long salesTypeNumId) {
        this.salesTypeNumId = salesTypeNumId;
    }

    public Long getSalesEmpeNumId() {
        return salesEmpeNumId;
    }

    public void setSalesEmpeNumId(Long salesEmpeNumId) {
        this.salesEmpeNumId = salesEmpeNumId;
    }

    public Double getStopQty() {
        return stopQty;
    }

    public void setStopQty(Double stopQty) {
        this.stopQty = stopQty;
    }

    public Double getResolveValue() {
        return resolveValue;
    }

    public void setResolveValue(Double resolveValue) {
        this.resolveValue = resolveValue;
    }

    public Double getStopUseQty() {
        return stopUseQty;
    }

    public void setStopUseQty(Double stopUseQty) {
        this.stopUseQty = stopUseQty;
    }

    public Double getStopSign() {
        return stopSign;
    }

    public void setStopSign(Double stopSign) {
        this.stopSign = stopSign;
    }

    public Double getBackQty() {
        return backQty;
    }

    public void setBackQty(Double backQty) {
        this.backQty = backQty;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getSimItemName() {
        return simItemName;
    }

    public void setSimItemName(String simItemName) {
        this.simItemName = simItemName;
    }

    public Long getProductOriginNumId() {
        return productOriginNumId;
    }

    public void setProductOriginNumId(Long productOriginNumId) {
        this.productOriginNumId = productOriginNumId;
    }

    public Double getConversionQty() {
        return conversionQty;
    }

    public void setConversionQty(Double conversionQty) {
        this.conversionQty = conversionQty;
    }

    public Long getConversiongUnitNumId() {
        return conversiongUnitNumId;
    }

    public void setConversiongUnitNumId(Long conversiongUnitNumId) {
        this.conversiongUnitNumId = conversiongUnitNumId;
    }

    public Double getPackageQty() {
        return packageQty;
    }

    public void setPackageQty(Double packageQty) {
        this.packageQty = packageQty;
    }

    public Double getConversionRate() {
        return conversionRate;
    }

    public void setConversionRate(Double conversionRate) {
        this.conversionRate = conversionRate;
    }

    public Double getStarndardDiscount() {
        return starndardDiscount;
    }

    public void setStarndardDiscount(Double starndardDiscount) {
        this.starndardDiscount = starndardDiscount;
    }


    public Double getShopCouponAmount() {
        return shopCouponAmount;
    }

    public void setShopCouponAmount(Double shopCouponAmount) {
        this.shopCouponAmount = shopCouponAmount;
    }

    public Double getPlatCouponAmount() {
        return platCouponAmount;
    }

    public void setPlatCouponAmount(Double platCouponAmount) {
        this.platCouponAmount = platCouponAmount;
    }

    public Double getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(Double discountAmount) {
        this.discountAmount = discountAmount;
    }

    public Double getEfAmount() {
        return efAmount;
    }

    public void setEfAmount(Double efAmount) {
        this.efAmount = efAmount;
    }

    public Double getIstAmount() {
        return istAmount;
    }

    public void setIstAmount(Double istAmount) {
        this.istAmount = istAmount;
    }

    public Long getDiscountType() {
        return discountType;
    }

    public void setDiscountType(Long discountType) {
        this.discountType = discountType;
    }

    public Long getDataSign() {
        return dataSign;
    }

    public void setDataSign(Long dataSign) {
        this.dataSign = dataSign;
    }

    public Long getCarrySign() {
        return carrySign;
    }

    public void setCarrySign(Long carrySign) {
        this.carrySign = carrySign;
    }
}
