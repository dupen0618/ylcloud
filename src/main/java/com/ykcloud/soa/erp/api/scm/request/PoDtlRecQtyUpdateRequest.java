package com.ykcloud.soa.erp.api.scm.request;

import java.util.Date;
import java.util.List;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;
import com.ykcloud.soa.erp.api.scm.model.PoDtlRecQtyAndSeries;

/**
*
@author hank.zhu
@date 2018年4月3日 下午2:51:48 新建
**/
public class PoDtlRecQtyUpdateRequest extends AbstractRequest {
	private static final long serialVersionUID = -8656263074440464318L;
	private Long subUnitNumId;//门店编号
	private String poNumId;//采购单号
	private Date orderDate;//采购单订单日期
	private List<PoDtlRecQtyAndSeries> RecQtyAndSeriesList;//覆行数量数据
	public Long getSubUnitNumId() {
		return subUnitNumId;
	}
	public void setSubUnitNumId(Long subUnitNumId) {
		this.subUnitNumId = subUnitNumId;
	}
	public String getPoNumId() {
		return poNumId;
	}
	public void setPoNumId(String poNumId) {
		this.poNumId = poNumId;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public List<PoDtlRecQtyAndSeries> getRecQtyAndSeriesList() {
		return RecQtyAndSeriesList;
	}
	public void setRecQtyAndSeriesList(List<PoDtlRecQtyAndSeries> recQtyAndSeriesList) {
		RecQtyAndSeriesList = recQtyAndSeriesList;
	}
	
	

}
