package com.ykcloud.soa.erp.api.scm.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.gb.soa.omp.ccommon.api.request.AbstractRequest;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by yiako on 2018/3/15
 */
public class HandReplenishProductGetRequest extends AbstractRequest {
    private static final long serialVersionUID = 1L;

    @NotNull(message = "门店编号不能为空")
    private Long subUnitNumId;

    private Long supplyUnitNumId;//供应商编号

    private Long settlementType;//结算方式1：购销，2：代销，3：联销,用于3.21.3	供应商自下联营订单时控制

    private Long logisticsType;//物流方式

    private String  barcode;//商品编号、商品条码二选一

    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @NotNull(message = "日期不能为空")
    private Date orderDate;//日期，格式：yyyy-mm-dd

    private Long supplyContractCheckSign;//1:要检查合同0：不检查合同

    @Range(min = 0, max = 1)
    private Long openQtyCacheSign; // 否，默认为1 在途数量是否用缓存表的数据，1：先查询缓存表，不存在先查询并写到缓存表，供下次使用，0：不用缓存表，查询后写到缓存表，供下次使用

    private String action;//补货：repment 自动补货 auto_repment
    
    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getSubUnitNumId() {
        return subUnitNumId;
    }

    public void setSubUnitNumId(Long subUnitNumId) {
        this.subUnitNumId = subUnitNumId;
    }

    public Long getSupplyUnitNumId() {
        return supplyUnitNumId;
    }

    public void setSupplyUnitNumId(Long supplyUnitNumId) {
        this.supplyUnitNumId = supplyUnitNumId;
    }

    public Long getSettlementType() {
        return settlementType;
    }

    public void setSettlementType(Long settlementType) {
        this.settlementType = settlementType;
    }

    public Long getLogisticsType() {
        return logisticsType;
    }

    public void setLogisticsType(Long logisticsType) {
        this.logisticsType = logisticsType;
    }


    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Long getSupplyContractCheckSign() {
        return supplyContractCheckSign;
    }

    public void setSupplyContractCheckSign(Long supplyContractCheckSign) {
        this.supplyContractCheckSign = supplyContractCheckSign;
    }

    public Long getOpenQtyCacheSign() {
        return openQtyCacheSign;
    }

    public void setOpenQtyCacheSign(Long openQtyCacheSign) {
        this.openQtyCacheSign = openQtyCacheSign;
    }

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}
    
    
}
