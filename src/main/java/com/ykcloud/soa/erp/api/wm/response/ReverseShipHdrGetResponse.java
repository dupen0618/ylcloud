package com.ykcloud.soa.erp.api.wm.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;

/**
*查询负出库单,6位模糊查询
@author hank.zhu
@date 2018年4月19日 下午4:39:51 新建
**/
public class ReverseShipHdrGetResponse extends MessagePack {
	private static final long serialVersionUID = 9123492729930562580L;
	private String reservedNo;//验收单号
	private String traySerlno;//未完成收货托盘
	private String traySerlnolable;//未完成托盘实物标签
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
	public String getTraySerlnolable() {
		return traySerlnolable;
	}
	public void setTraySerlnolable(String traySerlnolable) {
		this.traySerlnolable = traySerlnolable;
	}
	

}
