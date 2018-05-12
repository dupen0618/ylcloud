package com.ykcloud.soa.erp.api.wm.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;

/**
 * 
 * @author gaoyun.shen
 *
 * @date 2018年5月11日 上午9:59:07
 * 
 * @Description 根据条码获取商品信息返回结果
 */
public class ProductByBarcodeForReceiptGetResponse extends MessagePack {
	private static final long serialVersionUID = 426826362514908939L;
	private Long itemNumId;
	private String itemName;
	private Double conversionQty;// 商品条码数量
	private Double qty;//// 托盘应商品已收数量
	private Double trayConfirmQty;// 托盘已收数量
	private Double receiptProductQty;// 订单商品应收数量
	private Double receiptProductConfirmQty;// 订单商品已收数量
	private Double receiptQty;// 订单应收数量
	private Double receiptConfirmQty;// 订单已收数量
	private String traySerlnoLable;//托盘标签

	public Long getItemNumId() {
		return itemNumId;
	}

	public void setItemNumId(Long itemNumId) {
		this.itemNumId = itemNumId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public Double getConversionQty() {
		return conversionQty;
	}

	public void setConversionQty(Double conversionQty) {
		this.conversionQty = conversionQty;
	}

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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getTraySerlnoLable()
	{
		return traySerlnoLable;
	}

	public void setTraySerlnoLable(String traySerlnoLable)
	{
		this.traySerlnoLable = traySerlnoLable;
	}
}
