package com.ykcloud.soa.erp.api.scm.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;

/**
 * 查询生鲜的出参类
 * 
 * @author 14540
 * 
 */

public class ProductFdcSignBySupplyNumIdAndPtyNum3GetResponse extends MessagePack {
	private static final long serialVersionUID = 7601749578834540994L;
	private Long fdcSign; // 生鲜标识 1:生鲜 0非生鲜

	public Long getFdcSign() {
		return fdcSign;
	}

	public void setFdcSign(Long fdcSign) {
		this.fdcSign = fdcSign;
	}

}
