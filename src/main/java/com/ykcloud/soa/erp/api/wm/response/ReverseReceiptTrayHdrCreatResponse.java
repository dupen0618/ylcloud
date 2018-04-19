package com.ykcloud.soa.erp.api.wm.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;

/**
*
@author hank.zhu
@date 2018年4月19日 下午4:23:01 新建
**/
public class ReverseReceiptTrayHdrCreatResponse extends MessagePack {
	private static final long serialVersionUID = -3472757841303125392L;
	private String traySerlno;//托盘号
	private String traySerlnoLable;//托盘实物标签
	public String getTraySerlno() {
		return traySerlno;
	}
	public void setTraySerlno(String traySerlno) {
		this.traySerlno = traySerlno;
	}
	public String getTraySerlnoLable() {
		return traySerlnoLable;
	}
	public void setTraySerlnoLable(String traySerlnoLable) {
		this.traySerlnoLable = traySerlnoLable;
	}
}
