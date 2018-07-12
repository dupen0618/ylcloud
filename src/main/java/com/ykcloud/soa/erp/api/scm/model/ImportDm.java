package com.ykcloud.soa.erp.api.scm.model;

import java.io.Serializable;
import java.util.Date;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.NotEmpty;
import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * DM促销导入明细
 * @author pengh
 */
public class ImportDm implements Serializable {
	
	private static final long serialVersionUID = 4088430661582883734L;
	
	@NotEmpty(message ="单据号不能为空！")
	private String reservedId;  
	
	@NotEmpty(message ="DM名称不能为空！")
	private String dmName;
	
	private String remark;
	
	@NotNull(message ="签订时间不能为空！")
	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
	private Date makeDate;
	
	@NotNull(message ="售价起始时间不能为空！")
	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
	private Date beginDayPrice;
	
	@NotNull(message ="售价截止时间不能为空！")
	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
	private Date endDayPrice;
	
	@NotNull(message ="进价起始时间不能为空！")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date beginDayCost;
    
    @NotNull(message ="进价截止时间不能为空！")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date endDayCost;
	
	@NotNull(message ="售价不能为空！")
    private Double price;
	
	@NotNull(message ="进价不能为空！")
    private Double cost;
	
	@NotNull(message ="商品简码不能为空！")
	private String itemid;
	
	@NotNull(message ="供应商简码不能为空！")
	private String supplyUnitId;
	
	@NotNull(message ="门店简码不能为空！")
	private String subUnitId;

    public String getReservedId() {
        return reservedId;
    }

    public void setReservedId(String reservedId) {
        this.reservedId = reservedId;
    }

    public String getDmName() {
        return dmName;
    }

    public void setDmName(String dmName) {
        this.dmName = dmName;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getMakeDate() {
        return makeDate;
    }

    public void setMakeDate(Date makeDate) {
        this.makeDate = makeDate;
    }

    public Date getBeginDayPrice() {
        return beginDayPrice;
    }

    public void setBeginDayPrice(Date beginDayPrice) {
        this.beginDayPrice = beginDayPrice;
    }

    public Date getEndDayPrice() {
        return endDayPrice;
    }

    public void setEndDayPrice(Date endDayPrice) {
        this.endDayPrice = endDayPrice;
    }

    public Date getBeginDayCost() {
        return beginDayCost;
    }

    public void setBeginDayCost(Date beginDayCost) {
        this.beginDayCost = beginDayCost;
    }

    public Date getEndDayCost() {
        return endDayCost;
    }

    public void setEndDayCost(Date endDayCost) {
        this.endDayCost = endDayCost;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public String getItemid() {
        return itemid;
    }

    public void setItemid(String itemid) {
        this.itemid = itemid;
    }

    public String getSupplyUnitId() {
        return supplyUnitId;
    }

    public void setSupplyUnitId(String supplyUnitId) {
        this.supplyUnitId = supplyUnitId;
    }

    public String getSubUnitId() {
        return subUnitId;
    }

    public void setSubUnitId(String subUnitId) {
        this.subUnitId = subUnitId;
    }


}
