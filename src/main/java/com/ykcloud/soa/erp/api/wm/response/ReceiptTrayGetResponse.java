package com.ykcloud.soa.erp.api.wm.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;

/**
*查询托盘响应类
@author hank.zhu
@date 2018年4月4日 上午11:42:49 新建
**/
public class ReceiptTrayGetResponse extends MessagePack {
	private static final long serialVersionUID = 6654462527542875913L;
	private String traySerlno;  //托盘号
	private String traySerlnoLabel;//托盘实物标签号
	private Double trayConfirmQty;//托盘已收数量
	private Double receiptQty;//订单应收数量
	private Double receiptConfirmQty;//订单已收数量
	public String getTraySerlno() {
		return traySerlno;
	}
	public void setTraySerlno(String traySerlno) {
		this.traySerlno = traySerlno;
	}
	public String getTraySerlnoLabel() {
		return traySerlnoLabel;
	}
	public void setTraySerlnoLabel(String traySerlnoLabel) {
		this.traySerlnoLabel = traySerlnoLabel;
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
