package com.ykcloud.soa.erp.api.so.model;

import java.io.Serializable;

public class GroupNumIdAndItemNumId implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long groupNumId; // 组号

	private Long itemNumId; // 商品编号

	public Long getGroupNumId() {
		return groupNumId;
	}

	public void setGroupNumId(Long groupNumId) {
		this.groupNumId = groupNumId;
	}

	public Long getItemNumId() {
		return itemNumId;
	}

	public void setItemNumId(Long itemNumId) {
		this.itemNumId = itemNumId;
	}
}
