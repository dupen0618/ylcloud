package com.ykcloud.soa.erp.api.wm.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;

/**
*创建收货托盘响应类
@author hank.zhu
@date 2018年3月13日 下午3:49:29 新建
*/
public class ReceiptTrayHdrCreateResponse extends MessagePack {
	private static final long serialVersionUID = 4171963965175027903L;
	
    //收货托盘号
	private String traySerlno;
	
	//收货托盘实物标签号
	private String traySerlnoLabel;

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

	
}
