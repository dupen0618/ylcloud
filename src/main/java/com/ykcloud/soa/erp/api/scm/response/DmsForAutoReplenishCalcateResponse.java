package com.ykcloud.soa.erp.api.scm.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;

//计算ndms和pdms日销售量的出参类
public class DmsForAutoReplenishCalcateResponse extends MessagePack {

	private Double pdms; // 促销日销量 -1:说明今天是正常价销售

	private Double ndms; // 正常日销售量 -1:说明今天是促销价销售

	public Double getPdms() {
		return pdms;
	}

	public void setPdms(Double pdms) {
		this.pdms = pdms;
	}

	public Double getNdms() {
		return ndms;
	}

	public void setNdms(Double ndms) {
		this.ndms = ndms;
	}

}
