package com.ykcloud.soa.erp.api.wm.model;

import java.io.Serializable;
/**
 * 
 * @author gaoyun.shen
 *
 * @date 2018年6月5日 上午9:27:14
 * 
 * @Description  入库收货托盘明细实体
 */
public class ReceiptTrayInfo implements Serializable {

	private static final long serialVersionUID = -1236514966557130263L;
	
	private String reservedNo;
	private String traySerlnoLabel;
	private String traySerlno;
	private Long itemNumId;
	private String itemName;
	private Double qty;
	public String getReservedNo() {
		return reservedNo;
	}
	public void setReservedNo(String reservedNo) {
		this.reservedNo = reservedNo;
	}
	public String getTraySerlnoLabel() {
		return traySerlnoLabel;
	}
	public void setTraySerlnoLabel(String traySerlnoLabel) {
		this.traySerlnoLabel = traySerlnoLabel;
	}
	public String getTraySerlno() {
		return traySerlno;
	}
	public void setTraySerlno(String traySerlno) {
		this.traySerlno = traySerlno;
	}
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
	public Double getQty() {
		return qty;
	}
	public void setQty(Double qty) {
		this.qty = qty;
	}
	

}
