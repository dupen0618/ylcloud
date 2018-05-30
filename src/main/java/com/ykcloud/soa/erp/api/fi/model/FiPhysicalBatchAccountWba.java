package com.ykcloud.soa.erp.api.fi.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author Hewei
 * @Date 2018/4/10 13:34
 */
public class FiPhysicalBatchAccountWba implements Serializable {
    private static final long serialVersionUID = -992418502169450128L;
    private String series;
    private Long tenantNumId;
    private Long subUnitNumId;
    private Long itemNumId;
    private Long divNumId;
    private String barcode;
    private String itemName;
    private Long productOriginNumId;
    private Double conversionQty;
    private Long conversionUnitNumId;
    private String conversionStyleDesc;
    private Long supplyUnitNumId;
    private Long physicalNumId;
    private Date orderDate;
    private Long typeNumId;
    private Long billTypeNumId;
    private String triggerBillid;
    private String triggerBillLine;
    private String assistLine;
    private String batchSeries;
    private String promotionGrade;
    private Date recDate;
    private Double amount;
    private Double price;
    private String supPromotionGrade;
    private String firstBatchSeries;
    private Date firstRecDate;
    private Long firstSupplyUnitNumId;
    private Double supPrice;
    private String supProduceDate;
    private Double reservedQty;
    private Double tradePrice;
    private Double batchPrice;
    private Long balanceFunction;
    private Long createUserId;
    private Long lastUpdateUserId;
    private Date createDtme;
    private Date lastUpdtme;
    private Long carrySign;
    private Long dataSign;
    private String itemid;
    private Long ptyNum1;
    private Long ptyNum2;
    private Long ptyNum3;
    private Long storageDeptNumId;
    private Long settlementType;
    private Double taxAmount;
    private Double costAmount;
	private Double taxRate;
	private Long departNumId;


	/************发出商品新增字段***************/
	private Long unitNumId;
	private Long custSubUnitNumId;
	private Long custUnitNumId;
	private Long accountMonth;
	private Long currency;
	private String billTypeNumName;
	private String balanceFunctionName;
	private Long reservedNo;
	private Double reservedAmount;
	private Double reservedTaxAmount;
	private String cancelsign;
	/************发出商品新增字段***************/


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
	public Long getSubUnitNumId() {
		return subUnitNumId;
	}
	public void setSubUnitNumId(Long subUnitNumId) {
		this.subUnitNumId = subUnitNumId;
	}
	public Long getItemNumId() {
		return itemNumId;
	}
	public void setItemNumId(Long itemNumId) {
		this.itemNumId = itemNumId;
	}
	public Long getDivNumId() {
		return divNumId;
	}
	public void setDivNumId(Long divNumId) {
		this.divNumId = divNumId;
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
	public Long getConversionUnitNumId() {
		return conversionUnitNumId;
	}
	public void setConversionUnitNumId(Long conversionUnitNumId) {
		this.conversionUnitNumId = conversionUnitNumId;
	}
	public String getConversionStyleDesc() {
		return conversionStyleDesc;
	}
	public void setConversionStyleDesc(String conversionStyleDesc) {
		this.conversionStyleDesc = conversionStyleDesc;
	}
	public Long getSupplyUnitNumId() {
		return supplyUnitNumId;
	}
	public void setSupplyUnitNumId(Long supplyUnitNumId) {
		this.supplyUnitNumId = supplyUnitNumId;
	}
	public Long getPhysicalNumId() {
		return physicalNumId;
	}
	public void setPhysicalNumId(Long physicalNumId) {
		this.physicalNumId = physicalNumId;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public Long getTypeNumId() {
		return typeNumId;
	}
	public void setTypeNumId(Long typeNumId) {
		this.typeNumId = typeNumId;
	}
	public Long getBillTypeNumId() {
		return billTypeNumId;
	}
	public void setBillTypeNumId(Long billTypeNumId) {
		this.billTypeNumId = billTypeNumId;
	}
	public String getTriggerBillid() {
		return triggerBillid;
	}
	public void setTriggerBillid(String triggerBillid) {
		this.triggerBillid = triggerBillid;
	}
	public String getTriggerBillLine() {
		return triggerBillLine;
	}
	public void setTriggerBillLine(String triggerBillLine) {
		this.triggerBillLine = triggerBillLine;
	}
	public String getAssistLine() {
		return assistLine;
	}
	public void setAssistLine(String assistLine) {
		this.assistLine = assistLine;
	}
	public String getBatchSeries() {
		return batchSeries;
	}
	public void setBatchSeries(String batchSeries) {
		this.batchSeries = batchSeries;
	}
	public String getPromotionGrade() {
		return promotionGrade;
	}
	public void setPromotionGrade(String promotionGrade) {
		this.promotionGrade = promotionGrade;
	}
	public Date getRecDate() {
		return recDate;
	}
	public void setRecDate(Date recDate) {
		this.recDate = recDate;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getSupPromotionGrade() {
		return supPromotionGrade;
	}
	public void setSupPromotionGrade(String supPromotionGrade) {
		this.supPromotionGrade = supPromotionGrade;
	}
	public String getFirstBatchSeries() {
		return firstBatchSeries;
	}
	public void setFirstBatchSeries(String firstBatchSeries) {
		this.firstBatchSeries = firstBatchSeries;
	}
	public Date getFirstRecDate() {
		return firstRecDate;
	}
	public void setFirstRecDate(Date firstRecDate) {
		this.firstRecDate = firstRecDate;
	}
	public Long getFirstSupplyUnitNumId() {
		return firstSupplyUnitNumId;
	}
	public void setFirstSupplyUnitNumId(Long firstSupplyUnitNumId) {
		this.firstSupplyUnitNumId = firstSupplyUnitNumId;
	}
	public Double getSupPrice() {
		return supPrice;
	}
	public void setSupPrice(Double supPrice) {
		this.supPrice = supPrice;
	}
	public String getSupProduceDate() {
		return supProduceDate;
	}
	public void setSupProduceDate(String supProduceDate) {
		this.supProduceDate = supProduceDate;
	}
	public Double getReservedQty() {
		return reservedQty;
	}
	public void setReservedQty(Double reservedQty) {
		this.reservedQty = reservedQty;
	}
	public Double getTradePrice() {
		return tradePrice;
	}
	public void setTradePrice(Double tradePrice) {
		this.tradePrice = tradePrice;
	}
	public Double getBatchPrice() {
		return batchPrice;
	}
	public void setBatchPrice(Double batchPrice) {
		this.batchPrice = batchPrice;
	}
	public Long getBalanceFunction() {
		return balanceFunction;
	}
	public void setBalanceFunction(Long balanceFunction) {
		this.balanceFunction = balanceFunction;
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
	public Long getCarrySign() {
		return carrySign;
	}
	public void setCarrySign(Long carrySign) {
		this.carrySign = carrySign;
	}
	public Long getDataSign() {
		return dataSign;
	}
	public void setDataSign(Long dataSign) {
		this.dataSign = dataSign;
	}
	public String getItemid() {
		return itemid;
	}
	public void setItemid(String itemid) {
		this.itemid = itemid;
	}

	public Long getPtyNum1() {
		return ptyNum1;
	}

	public void setPtyNum1(Long ptyNum1) {
		this.ptyNum1 = ptyNum1;
	}

	public Long getPtyNum2() {
		return ptyNum2;
	}

	public void setPtyNum2(Long ptyNum2) {
		this.ptyNum2 = ptyNum2;
	}

	public Long getPtyNum3() {
		return ptyNum3;
	}

	public void setPtyNum3(Long ptyNum3) {
		this.ptyNum3 = ptyNum3;
	}

	public Long getSettlementType() {
		return settlementType;
	}

	public void setSettlementType(Long settlementType) {
		this.settlementType = settlementType;
	}

	public Long getStorageDeptNumId() {
		return storageDeptNumId;
	}

	public void setStorageDeptNumId(Long storageDeptNumId) {
		this.storageDeptNumId = storageDeptNumId;
	}

	public Double getTaxAmount() {
		return taxAmount;
	}

	public void setTaxAmount(Double taxAmount) {
		this.taxAmount = taxAmount;
	}

	public Double getCostAmount() {
		return costAmount;
	}

	public void setCostAmount(Double costAmount) {
		this.costAmount = costAmount;
	}

    public void setTaxRate(Double taxRate) {
        this.taxRate = taxRate;
    }

    public Double getTaxRate() {
        return taxRate;
    }

    public void setDepartNumId(Long departNumId) {
        this.departNumId = departNumId;
    }

    public Long getDepartNumId() {
        return departNumId;
    }

	public Long getUnitNumId() {
		return unitNumId;
	}

	public void setUnitNumId(Long unitNumId) {
		this.unitNumId = unitNumId;
	}

	public Long getCustSubUnitNumId() {
		return custSubUnitNumId;
	}

	public void setCustSubUnitNumId(Long custSubUnitNumId) {
		this.custSubUnitNumId = custSubUnitNumId;
	}

	public Long getCustUnitNumId() {
		return custUnitNumId;
	}

	public void setCustUnitNumId(Long custUnitNumId) {
		this.custUnitNumId = custUnitNumId;
	}

	public Long getAccountMonth() {
		return accountMonth;
	}

	public void setAccountMonth(Long accountMonth) {
		this.accountMonth = accountMonth;
	}

	public Long getCurrency() {
		return currency;
	}

	public void setCurrency(Long currency) {
		this.currency = currency;
	}

	public String getBillTypeNumName() {
		return billTypeNumName;
	}

	public void setBillTypeNumName(String billTypeNumName) {
		this.billTypeNumName = billTypeNumName;
	}

	public String getBalanceFunctionName() {
		return balanceFunctionName;
	}

	public void setBalanceFunctionName(String balanceFunctionName) {
		this.balanceFunctionName = balanceFunctionName;
	}

	public Long getReservedNo() {
		return reservedNo;
	}

	public void setReservedNo(Long reservedNo) {
		this.reservedNo = reservedNo;
	}

	public Double getReservedAmount() {
		return reservedAmount;
	}

	public void setReservedAmount(Double reservedAmount) {
		this.reservedAmount = reservedAmount;
	}

	public Double getReservedTaxAmount() {
		return reservedTaxAmount;
	}

	public void setReservedTaxAmount(Double reservedTaxAmount) {
		this.reservedTaxAmount = reservedTaxAmount;
	}

	public String getCancelsign() {
		return cancelsign;
	}

	public void setCancelsign(String cancelsign) {
		this.cancelsign = cancelsign;
	}
}
