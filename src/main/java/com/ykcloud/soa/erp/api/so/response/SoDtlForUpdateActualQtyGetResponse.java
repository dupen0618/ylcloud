package com.ykcloud.soa.erp.api.so.response;

import java.util.List;

import com.gb.soa.omp.ccommon.api.response.MessagePack;
import com.ykcloud.soa.erp.api.so.model.SoDtlForUpdateActualQty;

/**
 * 订单发货后回写审批单和申请单发货数量之前通过so单号查询要回写的审批单
 * @author tz.x
 *
 * @date 2018年4月19日上午9:52:58
 */
public class SoDtlForUpdateActualQtyGetResponse extends MessagePack {

	private static final long serialVersionUID = 4129434245323330644L;
	
	/**
	 * 审批单明细
	 */
	private List<SoDtlForUpdateActualQty> soDtlForUpdateActualQtyDetail;

	public List<SoDtlForUpdateActualQty> getSoDtlForUpdateActualQtyDetail() {
		return soDtlForUpdateActualQtyDetail;
	}

	public void setSoDtlForUpdateActualQtyDetail(List<SoDtlForUpdateActualQty> soDtlForUpdateActualQtyDetail) {
		this.soDtlForUpdateActualQtyDetail = soDtlForUpdateActualQtyDetail;
	}

	

}
