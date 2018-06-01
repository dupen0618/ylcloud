package com.ykcloud.soa.erp.api.so.model;

/**
 * @Author: fred.zhao
 * @Description: 出库单
 * @Date: Created in 20:51:2018/5/28
 */
public class SoTmlForWmShip {
	
	private Long channelNumId;
	
    private Long pmtSign;

    private Double retailPrice;
    
    private Double retailAmount;

    private Long gpItemNumId;//父子商品标识

    private Double deductAmount;// 优惠金额

    private Double efAmount;// 运费金额

    private Double malingAmount;// 抹零金额

    private Double resolveValue;// 分摊价格

    private Long barcodeTypeNumId;//组合商品标识

    private Double conversionRate;//转换率
    
    private Long groupItemNumId; //组合商品编号
    
    private Double qty;
        
    
    

    public Double getRetailAmount() {
		return retailAmount;
	}

	public void setRetailAmount(Double retailAmount) {
		this.retailAmount = retailAmount;
	}

	public Double getQty() {
		return qty;
	}

	public void setQty(Double qty) {
		this.qty = qty;
	}

	public Long getGroupItemNumId() {
		return groupItemNumId;
	}

	public void setGroupItemNumId(Long groupItemNumId) {
		this.groupItemNumId = groupItemNumId;
	}

	public Long getChannelNumId() {
		return channelNumId;
	}

	public void setChannelNumId(Long channelNumId) {
		this.channelNumId = channelNumId;
	}


	public Double getConversionRate() {
        return conversionRate;
    }

    public void setConversionRate(Double conversionRate) {
        this.conversionRate = conversionRate;
    }

    public Long getBarcodeTypeNumId() {
        return barcodeTypeNumId;
    }

    public void setBarcodeTypeNumId(Long barcodeTypeNumId) {
        this.barcodeTypeNumId = barcodeTypeNumId;
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

    public Double getMalingAmount() {
        return malingAmount;
    }

    public void setMalingAmount(Double malingAmount) {
        this.malingAmount = malingAmount;
    }

    public Double getResolveValue() {
        return resolveValue;
    }

    public void setResolveValue(Double resolveValue) {
        this.resolveValue = resolveValue;
    }

    public Long getGpItemNumId() {
        return gpItemNumId;
    }

    public void setGpItemNumId(Long gpItemNumId) {
        this.gpItemNumId = gpItemNumId;
    }

    public Long getPmtSign() {
        return pmtSign;
    }

    public void setPmtSign(Long pmtSign) {
        this.pmtSign = pmtSign;
    }

    public Double getRetailPrice() {
        return retailPrice;
    }

    public void setRetailPrice(Double retailPrice) {
        this.retailPrice = retailPrice;
    }
}
