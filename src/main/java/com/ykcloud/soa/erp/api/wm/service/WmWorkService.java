package com.ykcloud.soa.erp.api.wm.service;
/**
 * 
 * @author fakir.jiang
 *
 */

import com.ykcloud.soa.erp.api.wm.request.OpenWorkConfirmRequest;
import com.ykcloud.soa.erp.api.wm.request.OutOpenWorkConfirmRequest;
import com.ykcloud.soa.erp.api.wm.request.ProductInfoAndStockGetRequest;
import com.ykcloud.soa.erp.api.wm.request.WorkChangeConfirmRequest;
import com.ykcloud.soa.erp.api.wm.request.WorkConfirmAssembleRequest;
import com.ykcloud.soa.erp.api.wm.request.ProductChangeRequest;
import com.ykcloud.soa.erp.api.wm.response.OpenWorkConfirmResponse;
import com.ykcloud.soa.erp.api.wm.response.OutOpenWorkConfirmResponse;
import com.ykcloud.soa.erp.api.wm.response.ProductInfoAndStockGetResponse;
import com.ykcloud.soa.erp.api.wm.response.WorkChangeConfirmResponse;
import com.ykcloud.soa.erp.api.wm.response.WorkConfirmAssembleResponse;
import com.ykcloud.soa.erp.api.wm.response.ProductChangeGetResponse;

public interface WmWorkService {
	//获取商品信息+商品库存信息
	public ProductInfoAndStockGetResponse getProductInfoAndStock(ProductInfoAndStockGetRequest request);

	//查询转码商品
	public ProductChangeGetResponse getProductChange(ProductChangeRequest request);

	//拆解加工单入账
	public OpenWorkConfirmResponse confirmOpenWork(OpenWorkConfirmRequest request);
	
	/**
	 * 
	 * @Title: confirmWorkChange  
	 * @Description: 转码加工单入账
	 * @param @return
	 * @return WorkChangeConfirmResponse
	 */
	public WorkChangeConfirmResponse confirmWorkChange(WorkChangeConfirmRequest request);
	
	/**
	 * 
	 * @Title: confirmAssembleWork  
	 * @Description: 组装加工单入账
	 * @param @param request
	 * @param @return
	 * @return WorkConfirmAssembleResponse
	 */
	public WorkConfirmAssembleResponse confirmAssembleWork(WorkConfirmAssembleRequest request);

	//委外加工单入账
	public OutOpenWorkConfirmResponse confirmOutOpenWork(OutOpenWorkConfirmRequest request);
}
