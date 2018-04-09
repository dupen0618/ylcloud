package com.ykcloud.soa.erp.api.so.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;

/**
 * 退供应商退总仓产生so出参
 * @author tz.x
 *
 * @date 2018年4月8日下午6:42:25
 */
public class ApprovalReturnSoGenerateResponse extends MessagePack {

	private static final long serialVersionUID = 4587617345132036408L;
	
	/**
	 * So单编号
	 */
	private String soNumId;

	public String getSoNumId() {
		return soNumId;
	}

	public void setSoNumId(String soNumId) {
		this.soNumId = soNumId;
	}

}
