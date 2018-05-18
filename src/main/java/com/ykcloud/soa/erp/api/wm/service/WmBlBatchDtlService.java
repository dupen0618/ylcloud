/**
 * 
 */
package com.ykcloud.soa.erp.api.wm.service;

import com.ykcloud.soa.erp.api.wm.request.WmBlBatchDtlQuest;
import com.ykcloud.soa.erp.api.wm.response.WmBLBatchDTLAllotResponse;

/**
 * 
 * @author 殷剑
 *
 */
public interface WmBlBatchDtlService {
	//根据进价调整标的要求调整Price字段中的价格
    WmBLBatchDTLAllotResponse updatePrice(WmBlBatchDtlQuest request);
}
