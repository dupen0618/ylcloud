package com.ykcloud.soa.erp.api.scm.request;

import java.util.Date;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Range;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

/**
 * 获取商品补货参考数量的入参类
 * 
 * @author 14540
 *
 */
public class ProductDemandQtyGetRequest extends AbstractRequest {
	private static final long serialVersionUID = 5852241169860846754L;

	@NotNull(message = "门店编号不能为空！")
	private Long subUnitNumId;
	@Range(min = 1, max = 3)
	private Long logisticsType; // 不是必须
	@NotNull(message = "商品编号不能为空！")
	private Long itemNumId; // 商品编号

	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
	@NotNull(message = "日期不能为空！")
	private Date orderDate; // 日期，格式：yyyy-mm-dd

	@Range(min = 0, max = 1)
	private Long openQtyCacheSign; // 否，默认为1 在途数量是否用缓存表的数据，1：先查询缓存表，不存在先查询并写到缓存表，供下次使用，0：不用缓存表，查询后写到缓存表，供下次使用

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

	public Long getItemNumId() {
		return itemNumId;
	}

	public void setItemNumId(Long itemNumId) {
		this.itemNumId = itemNumId;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public Long getOpenQtyCacheSign() {
		return openQtyCacheSign;
	}

	public void setOpenQtyCacheSign(Long openQtyCacheSign) {
		this.openQtyCacheSign = openQtyCacheSign;
	}

}
