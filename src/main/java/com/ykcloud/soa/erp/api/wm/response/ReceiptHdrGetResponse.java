package com.ykcloud.soa.erp.api.wm.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;

/**
*
@author hank.zhu
@date 2018年3月12日 下午8:00:15 新建
**/
public class ReceiptHdrGetResponse extends MessagePack {

	private static final long serialVersionUID = 1L;
	private String reservedNo; //验收单号
	private String traySerlno; //未完成收货的托盘
	private  String traySerlnoLablep;//托盘实物标签号
	public String getReservedNo() {
		return reservedNo;
	}
	public void setReservedNo(String reservedNo) {
		this.reservedNo = reservedNo;
	}
	public String getTraySerlno() {
		return traySerlno;
	}
	public void setTraySerlno(String traySerlno) {
		this.traySerlno = traySerlno;
	}
	public String getTraySerlnoLablep() {
		return traySerlnoLablep;
	}
	public void setTraySerlnoLablep(String traySerlnoLablep) {
		this.traySerlnoLablep = traySerlnoLablep;
	}
	
	
	

}
