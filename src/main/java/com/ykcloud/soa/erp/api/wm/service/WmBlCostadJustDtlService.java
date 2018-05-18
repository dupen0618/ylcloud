/**
 * 
 */
package com.ykcloud.soa.erp.api.wm.service;

import java.util.List;

import com.ykcloud.soa.erp.api.fi.model.AdjustPriceForApi;
import com.ykcloud.soa.erp.api.wm.request.WmBlCostadJustDtlRequest;
import com.ykcloud.soa.erp.api.wm.response.WmBlCostadJustDtlResponse;

/**
 * @author 殷剑
 *
 */
public interface WmBlCostadJustDtlService {
	/**
     * @author 殷剑
     * @date 2018/5/10 11:28
     * @description
     */
	public WmBlCostadJustDtlResponse listBatchPriceAdjst(WmBlCostadJustDtlRequest request);
	/**
     * @author 殷剑
     * @date 2018/5/10 11:28
     * @description
     */
	public List<AdjustPriceForApi> listBatchPriceAdjst();
}
