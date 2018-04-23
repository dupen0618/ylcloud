package com.ykcloud.soa.erp.api.wm.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;

/**
 * 
 * @author gaoyun.shen
 *
 * @date 2018年4月18日 下午7:31:14
 * 
 * @Description 返配、行政领料退库收货
 */
public class ReverseReceiptDtlUpdateReponse extends MessagePack {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6854173607495409910L;
	private Double qty;////托盘应商品已收数量
	private Double trayConfirmQty;//托盘已收数量
	private Double receiptProductQty;//订单商品应收数量
	private Double receiptProductConfirmQty;//订单商品已收数量
	private Double receiptQty;//订单应收数量
	private Double receiptConfirmQty;//订单已收数量
	public Double getQty() {
		return qty;
	}
	public void setQty(Double qty) {
		this.qty = qty;
	}
	public Double getTrayConfirmQty() {
		return trayConfirmQty;
	}
	public void setTrayConfirmQty(Double trayConfirmQty) {
		this.trayConfirmQty = trayConfirmQty;
	}
	public Double getReceiptProductQty() {
		return receiptProductQty;
	}
	public void setReceiptProductQty(Double receiptProductQty) {
		this.receiptProductQty = receiptProductQty;
	}
	public Double getReceiptProductConfirmQty() {
		return receiptProductConfirmQty;
	}
	public void setReceiptProductConfirmQty(Double receiptProductConfirmQty) {
		this.receiptProductConfirmQty = receiptProductConfirmQty;
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
