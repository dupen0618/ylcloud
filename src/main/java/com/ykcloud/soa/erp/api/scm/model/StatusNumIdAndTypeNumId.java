package com.ykcloud.soa.erp.api.scm.model;

//从 scm_bl_apply_hdr表中查询status_num_id 和 type_num_id封装类
public class StatusNumIdAndTypeNumId {

	private Long statusNumId; // 状态id

	private Long typeNumId; // 类型

	public Long getStatusNumId() {
		return statusNumId;
	}

	public void setStatusNumId(Long statusNumId) {
		this.statusNumId = statusNumId;
	}

	public Long getTypeNumId() {
		return typeNumId;
	}

	public void setTypeNumId(Long typeNumId) {
		this.typeNumId = typeNumId;
	}

	
}
