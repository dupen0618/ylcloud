package com.ykcloud.soa.erp.api.so.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;

/**
 * 产生退货so回写退审批单后再回写退货申请单so_num_id及订单数量 出参
 * @author tz.x
 *
 * @date 2018年4月12日上午10:44:41
 */
public class ReturnApplyAfterGenerateReturnSoUpdateResponse extends MessagePack {

	private static final long serialVersionUID = -4579046072148015093L;
	
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
