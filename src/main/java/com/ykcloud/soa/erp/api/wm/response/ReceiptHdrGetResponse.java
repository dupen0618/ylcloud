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
	private Double trayConfirmQty;//托盘已收数量
	private Double receiptQty;//订单应收数量
	private Double receiptConfirmQty;//订单已收数量
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
	public Double getTrayConfirmQty() {
		return trayConfirmQty;
	}
	public void setTrayConfirmQty(Double trayConfirmQty) {
		this.trayConfirmQty = trayConfirmQty;
	}
	public Double getReceiptQty() {
		return receiptQty;
	}
	public void setReceiptQty(Double receiptQty) {
		this.receiptQty = receiptQty;
	}
	public Double getReceiptConfirmQty() {
		return receiptConfirmQty;
	}
	public void setReceiptConfirmQty(Double receiptConfirmQty) {
		this.receiptConfirmQty = receiptConfirmQty;
	}

}
