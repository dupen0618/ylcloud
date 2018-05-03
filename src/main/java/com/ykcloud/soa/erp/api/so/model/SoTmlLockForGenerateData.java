package com.ykcloud.soa.erp.api.so.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author: fred.zhao
 * @Description:
 * @Date: Created in 10:55:2018/4/21
 */
public class SoTmlLockForGenerateData implements Serializable {

    private static final long serialVersionUID = -3585390576048328829L;

    private String series;//序号

    private Long tenantNumId;//租户id

    private Long dataSign;

    private String tmlLine;

    private String tmlNumId;

    private Long storageNumId;

    private String soLine;

    private Long soNumId;


    private String itemNumId;//

    private Double qty;

    private Date createDtme;

    private Date lastUpdtme;

    private String insertdata;

    private String cancelsign;

    private Long createUserId;//

    private Long lastUpdateUserId;//

    private String storageLine;//

    private String visitantCard;

    private Double futureQty;

    private Long shardId;

    private Date orderDate;

    private Long subUnitNumId;

    private String itemid;

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

    public Long getDataSign() {
        return dataSign;
    }

    public void setDataSign(Long dataSign) {
        this.dataSign = dataSign;
    }

    public String getTmlLine() {
        return tmlLine;
    }

    public void setTmlLine(String tmlLine) {
        this.tmlLine = tmlLine;
    }

    public String getTmlNumId() {
        return tmlNumId;
    }

    public void setTmlNumId(String tmlNumId) {
        this.tmlNumId = tmlNumId;
    }

    public Long getStorageNumId() {
        return storageNumId;
    }

    public void setStorageNumId(Long storageNumId) {
        this.storageNumId = storageNumId;
    }

    public String getSoLine() {
        return soLine;
    }

    public void setSoLine(String soLine) {
        this.soLine = soLine;
    }

    public Long getSoNumId() {
        return soNumId;
    }

    public void setSoNumId(Long soNumId) {
        this.soNumId = soNumId;
    }

    public String getItemNumId() {
        return itemNumId;
    }

    public void setItemNumId(String itemNumId) {
        this.itemNumId = itemNumId;
    }

    public Double getQty() {
        return qty;
    }

    public void setQty(Double qty) {
        this.qty = qty;
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

    

    public String getInsertdata() {
		return insertdata;
	}

	public void setInsertdata(String insertdata) {
		this.insertdata = insertdata;
	}

	public String getCancelsign() {
		return cancelsign;
	}

	public void setCancelsign(String cancelsign) {
		this.cancelsign = cancelsign;
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

    public String getStorageLine() {
        return storageLine;
    }

    public void setStorageLine(String storageLine) {
        this.storageLine = storageLine;
    }

    public String getVisitantCard() {
        return visitantCard;
    }

    public void setVisitantCard(String visitantCard) {
        this.visitantCard = visitantCard;
    }

    public Double getFutureQty() {
        return futureQty;
    }

    public void setFutureQty(Double futureQty) {
        this.futureQty = futureQty;
    }

    public Long getShardId() {
        return shardId;
    }

    public void setShardId(Long shardId) {
        this.shardId = shardId;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Long getSubUnitNumId() {
        return subUnitNumId;
    }

    public void setSubUnitNumId(Long subUnitNumId) {
        this.subUnitNumId = subUnitNumId;
    }

    public String getItemid() {
        return itemid;
    }

    public void setItemid(String itemid) {
        this.itemid = itemid;
    }
}
