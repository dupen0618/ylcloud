package com.ykcloud.soa.erp.api.wm.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;

public class LossNumIdByGetLossHdrResponse extends MessagePack {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String LOSS_NUM_ID;// 损溢单号
	private Long STATUS_NUM_ID;// 状态
	private Long TYPE_NUM_ID;// 业务类型

	public String getLOSS_NUM_ID() {
		return LOSS_NUM_ID;
	}

	public void setLOSS_NUM_ID(String lOSS_NUM_ID) {
		LOSS_NUM_ID = lOSS_NUM_ID;
	}

	public Long getSTATUS_NUM_ID() {
		return STATUS_NUM_ID;
	}

	public void setSTATUS_NUM_ID(Long sTATUS_NUM_ID) {
		STATUS_NUM_ID = sTATUS_NUM_ID;
	}

	public Long getTYPE_NUM_ID() {
		return TYPE_NUM_ID;
	}

	public void setTYPE_NUM_ID(Long tYPE_NUM_ID) {
		TYPE_NUM_ID = tYPE_NUM_ID;
	}

}
