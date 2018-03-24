package com.ykcloud.soa.erp.api.wm.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;

/**
*
@author hank.zhu
@date 2018年3月13日 下午3:49:29 新建
**/
//创建入库装箱单头，出参类
public class ReceiptTrayHdrCreateResponse extends MessagePack {
	private static final long serialVersionUID = 4171963965175027903L;
	
    //装箱单号
	private Long traySerlno;
	
	//实际装箱单号
	private Long traySerlnoLabel;
	public Long getTraySerlno() {
		return traySerlno;
	}
	public void setTraySerlno(Long traySerlno) {
		this.traySerlno = traySerlno;
	}
	public Long getTraySerlnoLabel() {
		return traySerlnoLabel;
	}
	public void setTraySerlnoLabel(Long traySerlnoLabel) {
		this.traySerlnoLabel = traySerlnoLabel;
	}
	
}
