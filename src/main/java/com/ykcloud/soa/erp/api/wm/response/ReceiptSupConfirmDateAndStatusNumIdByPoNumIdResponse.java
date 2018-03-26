package com.ykcloud.soa.erp.api.wm.response;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.gb.soa.omp.ccommon.api.response.MessagePack;

/**
 *  取指定采购单的供应商确认日期及验收入库汇总单状态出参
 * @author tz.x
 *
 * @date 2018年3月26日下午2:02:13
 */
public class ReceiptSupConfirmDateAndStatusNumIdByPoNumIdResponse extends MessagePack {

	private static final long serialVersionUID = -5574356360681484382L;
	
	/**
	 * 供应商确认日期，格式：yyyy-mm-dd
	 */
	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
	private Date supConfirmDate;
	
	/**
	 * 验收入库汇总单状态0:未产生验收单1：创建，2：供应商确认，3：验收中，4：验收完成中，5：验收完成(待结算），
	 * 6：结算中，7：结算完成，8：驳回，9：作废，10：系统超时作废，
	 */
	private Long statusNumId;

	public Date getSupConfirmDate() {
		return supConfirmDate;
	}

	public void setSupConfirmDate(Date supConfirmDate) {
		this.supConfirmDate = supConfirmDate;
	}

	public Long getStatusNumId() {
		return statusNumId;
	}

	public void setStatusNumId(Long statusNumId) {
		this.statusNumId = statusNumId;
	}

}
