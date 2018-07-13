package com.ykcloud.soa.erp.api.scm.model;

import java.io.Serializable;
import java.util.Date;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.NotEmpty;
import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * 削价导入明细
 * @author pengh
 */
public class ImportPriceCut implements Serializable {
	
	private static final long serialVersionUID = 4088430661582883734L;
	
	@NotEmpty(message ="单据号不能为空！")
	private String reservedId;  
	
	private String remark;
	
	private String remark2;
	
	@NotNull(message ="新售价不能为空！")
	private Double newPrice;
	
	@NotNull(message ="商品简码不能为空！")
    private String itemid;
    
    @NotNull(message ="门店简码不能为空！")
    private String subUnitId;
	
	@NotNull(message ="签订时间不能为空！")
	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
	private Date makeDate;
	
	@NotNull(message ="起始时间不能为空！")
	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
	private Date beginDay;
	
	@NotNull(message ="截止时间不能为空！")
	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
	private Date endDay;
	
	@NotNull(message ="削价数量不能为空！")
	private Double askqty;

    public String getReservedId() {
        return reservedId;
    }

    public void setReservedId(String reservedId) {
        this.reservedId = reservedId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getRemark2() {
        return remark2;
    }

    public void setRemark2(String remark2) {
        this.remark2 = remark2;
    }

    public Double getNewPrice() {
        return newPrice;
    }

    public void setNewPrice(Double newPrice) {
        this.newPrice = newPrice;
    }

    public String getItemid() {
        return itemid;
    }

    public void setItemid(String itemid) {
        this.itemid = itemid;
    }

    public String getSubUnitId() {
        return subUnitId;
    }

    public void setSubUnitId(String subUnitId) {
        this.subUnitId = subUnitId;
    }

    public Date getMakeDate() {
        return makeDate;
    }

    public void setMakeDate(Date makeDate) {
        this.makeDate = makeDate;
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

    public Double getAskqty() {
        return askqty;
    }

    public void setAskqty(Double askqty) {
        this.askqty = askqty;
    }
	
	
	
	
	
	
	
}
