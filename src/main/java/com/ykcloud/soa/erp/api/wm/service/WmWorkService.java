package com.ykcloud.soa.erp.api.wm.service;
/**
 * 
 * @author fakir.jiang
 *
 */

import com.ykcloud.soa.erp.api.wm.request.OpenWorkConfirmRequest;
import com.ykcloud.soa.erp.api.wm.request.ProductInfoAndStockGetRequest;
import com.ykcloud.soa.erp.api.wm.request.ProductZMGetRequest;
import com.ykcloud.soa.erp.api.wm.request.WorkChangeConfirmRequest;
import com.ykcloud.soa.erp.api.wm.request.WorkConfirmAssembleRequest;
import com.ykcloud.soa.erp.api.wm.response.OpenWorkConfirmResponse;
import com.ykcloud.soa.erp.api.wm.response.ProductInfoAndStockGetResponse;
import com.ykcloud.soa.erp.api.wm.response.ProductZMGetResponse;
import com.ykcloud.soa.erp.api.wm.response.WorkChangeConfirmResponse;
import com.ykcloud.soa.erp.api.wm.response.WorkConfirmAssembleResponse;

public interface WmWorkService {
	//获取商品信息+商品库存信息
	public ProductInfoAndStockGetResponse getProductInfoAndStock(ProductInfoAndStockGetRequest request);

	//查询转码商品
	public ProductZMGetResponse getProductZM(ProductZMGetRequest request);

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
}
