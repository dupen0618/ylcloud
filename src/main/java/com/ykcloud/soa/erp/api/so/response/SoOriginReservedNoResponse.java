package com.ykcloud.soa.erp.api.so.response;

import java.util.Date;

import com.gb.soa.omp.ccommon.api.response.MessagePack;

/**
 * 
 * @author gaoyun.shen
 *
 * @date 2018年4月19日 下午3:43:45
 * 
 * @Description 根据申请单号获取原出库单号返回结果
 */
public class SoOriginReservedNoResponse extends MessagePack {
	private static final long serialVersionUID = -5937496508958953807L;
	
	private Long statusNumId;

	private String originReservedNo;

	private Date originShipDate;

	public Long getStatusNumId() {
		return statusNumId;
	}

	public void setStatusNumId(Long statusNumId) {
		this.statusNumId = statusNumId;
	}

	public String getOriginReservedNo() {
		return originReservedNo;
	}

	public void setOriginReservedNo(String originReservedNo) {
		this.originReservedNo = originReservedNo;
	}

	public Date getOriginShipDate() {
		return originShipDate;
	}

	public void setOriginShipDate(Date originShipDate) {
		this.originShipDate = originShipDate;
	}
	

}
