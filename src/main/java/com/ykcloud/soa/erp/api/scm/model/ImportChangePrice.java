package com.ykcloud.soa.erp.api.scm.model;

import java.io.Serializable;
import java.util.Date;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.NotEmpty;
import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * 售价调整导入明细
 * @author pengh
 */
public class ImportChangePrice implements Serializable {
	
	private static final long serialVersionUID = 4088430661582883734L;
	
	@NotEmpty(message ="单据号不能为空！")
	private String reservedId;  
	
	@NotEmpty(message ="调价主题不能为空！")
	private String remark;
	
	@NotNull(message ="调整类型不能为空！")
	private Long typeNumId;
	
	@NotNull(message ="签订时间不能为空！")
	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
	private Date makeDate;
	
	@NotNull(message ="起始时间不能为空！")
	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
	private Date beginDay;
	
	@NotNull(message ="截止时间不能为空！")
	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
	private Date endDay;
	
	@NotNull(message ="新零售价不能为空！")
    private Double price;
	
	@NotNull(message ="商品简码不能为空！")
	private String itemid;
	
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
     public Long getTypeNumId() {
        return typeNumId;
    }
    public void setTypeNumId(Long typeNumId) {
        this.typeNumId = typeNumId;
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
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
    public String getItemid() {
        return itemid;
    }
    public void setItemid(String itemid) {
        this.itemid = itemid;
    }
    
    
}
