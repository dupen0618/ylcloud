package com.ykcloud.soa.erp.api.so.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @author:shenq
 * @description:销售小票明细Temp
 * @date :2018/4/25 - 9:35
 * @version:v1.0
 */
public class SoTmlDtlTempForGenerateData  {

 

    /**
     * 行号
     */
    private String series;

    /**
     * 租户ID
     */
    private Long tenantNumId;

    /**
     * 终端订单号
     */
    private Long tmlNumId;
    /**
     * 日期
     */
    private Date orderDate;

    /**
     * 门店编号
     */
    private Long subUnitNumId;

    /**
     * 结算方式
     * 1:购销 2：代销 3：联销
     */
    private Long settlementType;

    /**
     * 供应商
     */
    private Long supplyUnitNumId;

    /**
     * 事业部主键
     */
    private Long divNumId;

    /**
     * 商品主键
     */
    private Long itemNumId;

    /**
     * 零售价格
     */
    private Double retailPrice;

    /**
     * 标准价
     */
    private Double standardPrice;

    /**
     * 折后价格
     */
    private Double tradePrice;

    /**
     * 分摊价
     */
    private Double resolveTradePrice;

    /**
     * 数量
     */
    private Double qty;

    /**
     * 锁定数量
     */
    private Double lockQty;

    /**
     * 预约数量
     */
    private Double revatQty;

    /**
     * 预出库数量
     */
    private Double revat1Qty;

    /**
     * 预出库数量
     */
    private Double pickQty;

    /**
     * 发运数量
     */
    private Double shipQty;

    /**
     * 变更数量
     */
    private Double changeQty;

    /**
     * 取消数量
     */
    private Double cancelQty;

    /**
     * 本店发货量
     */
    private Double initShipQty;

    /**
     * 收货日期要求
     */
    private Date recvDate;

    /**
     * 指定锁库仓库
     */
    private String storageArray;

    /**
     * 库位属性
     */
    private Long locPtyNumId;

    /**
     * DRP系统订单表体行号
     */
    private Long drpStseries;

    /**
     * 条码
     */
    private String barCode;

    /**
     * 条码类型
     */
    private Long barcodeTypeNumId;

    /**
     * 组合降价数量
     */
    private Double pcyQty;

    /**
     * 缺货数量
     */
    private Double missQty;

    /**
     * 赠送
     * 0：正常品；1：赠送品
     */
    private Long pmtSign;

    /**
     * 买赠数量
     */
    private Double pcy1Qty;

    /**
     * 买赠金额
     */
    private Double pcy1Amount;

    /**
     * 组合降价后价格
     */
    private Double cx2TradePrice;

    /**
     * 创建时间
     */
    private Date createDtme;

    /**
     * 用户
     */
    private Long createUserId;

    /**
     * 更新用户
     */
    private Long lastUpdateUserId;

    /**
     * 最后更新时间
     */
    private Date lastUpdtme;

    /**
     * 删除
     */
    private String cancelSign;

    /**
     * 新增
     */
    private String insertData;

    /**
     * 更新
     */
    private String updateData;

    /**
     * 库存来源
     * 1店内现货，2无货后台共享
     */
    private String invFromType;

    /**
     * 快递方式
     */
    private Long tranSimNumId;

    /**
     * 提货方式
     * 1现场提货，2送货上门，3快递上门，
     * 4到店提货，5锁库店提货，6微店现场提货
     */
    private Long tranTypeNumId;

    /**
     * 时间要求
     */
    private Date shipTimeProclaim;

    /**
     * 退货/换换货时,引用原始订单明细中的序列号
     */
    private String sourceSeries;

    /**
     * 销售类型
     * 1、正常销售；2、联销；3、服务类
     */
    private Long salesTypeNumId;

    /**
     * 促销员编号
     */
    private Long salesEmpeNumId;

    /**
     * 截单数量
     */
    private Double stopQty;

    /**
     * 分摊金额
     */
    private Double resolveValue;

    /**
     * 截单已退货数量
     */
    private Double stopUseQty;

    /**
     * 截单退货标识
     * 0:非截单;1：截单标识
     */
    private Long stopSign;

    /**
     * 退货数量
     */
    private Double backQty;

    /**
     * 剩余价值
     */
    private Double surplusValue;

    /**
     * 退货关闭数量
     */
    private Double closeQty;

    /**
     * 其他折扣
     */
    private Double otherDiscount;

    /**
     * 标准折扣
     */
    private Double starndardDiscount;

    /**
     * 原始商品价格
     */
    private Double originalProductPrice;

    /**
     * 降价差价
     */
    private Double depreciatePrice;

    /**
     * 退货原因
     */
    private String returnReasons;

    /**
     * 门店发货复核数量
     */
    private Double scanQty;

    /**
     * 妈豆价值
     */
    private Double mbeanAmount;

    /**
     * 积分价值
     */
    private Double pointAmount;

    /**
     * 积分数
     */
    private Double pointQty;

    /**
     * 门店优惠券
     */
    private Double shopCouponAmount;

    /**
     * 平台优惠券
     */
    private Double platCouponAmount;

    /**
     * 整单折扣金额
     */
    private Double discountAmount;

    /**
     * 商品优惠金额
     */
    private Double deductAmount;

    /**
     * 快递费
     */
    private Double efAmount;

    /**
     * 安装费
     */
    private Double istAmount;

    /**
     * 折扣类型
     * 1、贵宾卡，2、店庆，3、样品
     */
    private Long discountType;

    /**
     * 数据状态
     * 0: 正式  1：测试
     */
    private Long dataSign;

    /**
     * 结转标识
     */
    private Long carrySign;

    /**
     * 消费者开票价
     */
    private Double custInvoicePrice;

    /**
     * 财务开票价
     */
    private Double fiTradePrice;

    /**
     * MC积分价值
     */
    private Double mcPointAmount;

    /**
     * 现金券价值金额
     */
    private Double cashCouponAmount;

    /**
     * 抵用券金额
     */
    private Double voucherAmount;

    /**
     * 退货收货逻辑仓
     */
    private Long recvStorageNumId;

    /**
     * 原单商品发货逻辑仓
     */
    private Long sendStorageNumId;

    /**
     * 分片号
     */
    private Long shardId;

    /**
     * 物流中心主键
     */
    private Long stkNumId;

    /**
     * 快递类型
     */
    private Long locType;

    /**
     * 销售抹零
     */
    private Double malingAmount;

    /**
     * 应付金额=折后金额-销售抹零
     */
    private Double fAmount;

    /**
     * 折后金额
     */
    private Double tradeAmount;

    /**
     * 商品名称
     */
    private String itemName;

    /**
     * 子商品名称
     */
    private String simItemName;

    /**
     * 产地
     */
    private Long productOriginNumId;

    /**
     * 件装数
     */
    private Double conversionQty;

    /**
     * 件装单位
     */
    private String conversionUnitNumId;

    /**
     * 件装规格
     */
    private String conversionStyleDesc;

    /**
     * 件数
     */
    private Double packageQty;

    /**
     * 子母换算比率
     */
    private Double conversionRate;    

    /**
     * 商品商家编码
     */
    private String itemId;
    
    /**
     * 父商品编号
     */
    private Long gpItemNumId;
    
    /**
     * 销售税率
     */
    private Double taxRate;
    
    

    public Double getTaxRate() {
		return taxRate;
	}

	public void setTaxRate(Double taxRate) {
		this.taxRate = taxRate;
	}

	public Long getGpItemNumId() {
		return gpItemNumId;
	}

	public void setGpItemNumId(Long gpItemNumId) {
		this.gpItemNumId = gpItemNumId;
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

    public Long getTmlNumId() {
        return tmlNumId;
    }

    public void setTmlNumId(Long tmlNumId) {
        this.tmlNumId = tmlNumId;
    }

    public Long getSubUnitNumId() {
        return subUnitNumId;
    }

    public void setSubUnitNumId(Long subUnitNumId) {
        this.subUnitNumId = subUnitNumId;
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

    public Double getChangeQty() {
        return changeQty;
    }

    public void setChangeQty(Double changeQty) {
        this.changeQty = changeQty;
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

    public Date getRecvDate() {
        return recvDate;
    }

    public void setRecvDate(Date recvDate) {
        this.recvDate = recvDate;
    }

    public String getStorageArray() {
        return storageArray;
    }

    public void setStorageArray(String storageArray) {
        this.storageArray = storageArray;
    }

    public Long getLocPtyNumId() {
        return locPtyNumId;
    }

    public void setLocPtyNumId(Long locPtyNumId) {
        this.locPtyNumId = locPtyNumId;
    }

    public Long getDrpStseries() {
        return drpStseries;
    }

    public void setDrpStseries(Long drpStseries) {
        this.drpStseries = drpStseries;
    }

    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    public Long getBarcodeTypeNumId() {
        return barcodeTypeNumId;
    }

    public void setBarcodeTypeNumId(Long barcodeTypeNumId) {
        this.barcodeTypeNumId = barcodeTypeNumId;
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

    public Date getLastUpdtme() {
        return lastUpdtme;
    }

    public void setLastUpdtme(Date lastUpdtme) {
        this.lastUpdtme = lastUpdtme;
    }

    public String getCancelSign() {
        return cancelSign;
    }

    public void setCancelSign(String cancelSign) {
        this.cancelSign = cancelSign;
    }

    public String getInsertData() {
        return insertData;
    }

    public void setInsertData(String insertData) {
        this.insertData = insertData;
    }

    public String getUpdateData() {
        return updateData;
    }

    public void setUpdateData(String updateData) {
        this.updateData = updateData;
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

    public String getSourceSeries() {
        return sourceSeries;
    }

    public void setSourceSeries(String sourceSeries) {
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

    public Long getStopSign() {
        return stopSign;
    }

    public void setStopSign(Long stopSign) {
        this.stopSign = stopSign;
    }

    public Double getBackQty() {
        return backQty;
    }

    public void setBackQty(Double backQty) {
        this.backQty = backQty;
    }

    public Double getSurplusValue() {
        return surplusValue;
    }

    public void setSurplusValue(Double surplusValue) {
        this.surplusValue = surplusValue;
    }

    public Double getCloseQty() {
        return closeQty;
    }

    public void setCloseQty(Double closeQty) {
        this.closeQty = closeQty;
    }

    public Double getOtherDiscount() {
        return otherDiscount;
    }

    public void setOtherDiscount(Double otherDiscount) {
        this.otherDiscount = otherDiscount;
    }

    public Double getStarndardDiscount() {
        return starndardDiscount;
    }

    public void setStarndardDiscount(Double starndardDiscount) {
        this.starndardDiscount = starndardDiscount;
    }

    public Double getOriginalProductPrice() {
        return originalProductPrice;
    }

    public void setOriginalProductPrice(Double originalProductPrice) {
        this.originalProductPrice = originalProductPrice;
    }

    public Double getDepreciatePrice() {
        return depreciatePrice;
    }

    public void setDepreciatePrice(Double depreciatePrice) {
        this.depreciatePrice = depreciatePrice;
    }

    public String getReturnReasons() {
        return returnReasons;
    }

    public void setReturnReasons(String returnReasons) {
        this.returnReasons = returnReasons;
    }

    public Double getScanQty() {
        return scanQty;
    }

    public void setScanQty(Double scanQty) {
        this.scanQty = scanQty;
    }

    public Double getMbeanAmount() {
        return mbeanAmount;
    }

    public void setMbeanAmount(Double mbeanAmount) {
        this.mbeanAmount = mbeanAmount;
    }

    public Double getPointAmount() {
        return pointAmount;
    }

    public void setPointAmount(Double pointAmount) {
        this.pointAmount = pointAmount;
    }

    public Double getPointQty() {
        return pointQty;
    }

    public void setPointQty(Double pointQty) {
        this.pointQty = pointQty;
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

    public Double getDeductAmount() {
        return deductAmount;
    }

    public void setDeductAmount(Double deductAmount) {
        this.deductAmount = deductAmount;
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

    public Double getCustInvoicePrice() {
        return custInvoicePrice;
    }

    public void setCustInvoicePrice(Double custInvoicePrice) {
        this.custInvoicePrice = custInvoicePrice;
    }

    public Double getFiTradePrice() {
        return fiTradePrice;
    }

    public void setFiTradePrice(Double fiTradePrice) {
        this.fiTradePrice = fiTradePrice;
    }

    public Double getMcPointAmount() {
        return mcPointAmount;
    }

    public void setMcPointAmount(Double mcPointAmount) {
        this.mcPointAmount = mcPointAmount;
    }

    public Double getCashCouponAmount() {
        return cashCouponAmount;
    }

    public void setCashCouponAmount(Double cashCouponAmount) {
        this.cashCouponAmount = cashCouponAmount;
    }

    public Double getVoucherAmount() {
        return voucherAmount;
    }

    public void setVoucherAmount(Double voucherAmount) {
        this.voucherAmount = voucherAmount;
    }

    public Long getRecvStorageNumId() {
        return recvStorageNumId;
    }

    public void setRecvStorageNumId(Long recvStorageNumId) {
        this.recvStorageNumId = recvStorageNumId;
    }

    public Long getSendStorageNumId() {
        return sendStorageNumId;
    }

    public void setSendStorageNumId(Long sendStorageNumId) {
        this.sendStorageNumId = sendStorageNumId;
    }

    public Long getShardId() {
        return shardId;
    }

    public void setShardId(Long shardId) {
        this.shardId = shardId;
    }

    public Long getStkNumId() {
        return stkNumId;
    }

    public void setStkNumId(Long stkNumId) {
        this.stkNumId = stkNumId;
    }

    public Long getLocType() {
        return locType;
    }

    public void setLocType(Long locType) {
        this.locType = locType;
    }

    public Double getMalingAmount() {
        return malingAmount;
    }

    public void setMalingAmount(Double malingAmount) {
        this.malingAmount = malingAmount;
    }

    public Double getfAmount() {
        return fAmount;
    }

    public void setfAmount(Double fAmount) {
        this.fAmount = fAmount;
    }

    public Double getTradeAmount() {
        return tradeAmount;
    }

    public void setTradeAmount(Double tradeAmount) {
        this.tradeAmount = tradeAmount;
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

    public String getConversionUnitNumId() {
        return conversionUnitNumId;
    }

    public void setConversionUnitNumId(String conversionUnitNumId) {
        this.conversionUnitNumId = conversionUnitNumId;
    }

    public String getConversionStyleDesc() {
        return conversionStyleDesc;
    }

    public void setConversionStyleDesc(String conversionStyleDesc) {
        this.conversionStyleDesc = conversionStyleDesc;
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

	public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
    
    
}
