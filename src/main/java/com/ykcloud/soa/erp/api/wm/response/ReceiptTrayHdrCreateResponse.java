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
	private String traySerlno;
	
	//实际装箱单号
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
