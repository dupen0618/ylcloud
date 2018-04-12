package com.ykcloud.soa.erp.api.so.service;

import com.ykcloud.soa.erp.api.so.request.LastSalesDateGetRequest;
import com.ykcloud.soa.erp.api.so.request.ProductInfoForSoApplyTransferBetweenShopGetRequest;
import com.ykcloud.soa.erp.api.so.request.ReturnApplyAuditRequest;
import com.ykcloud.soa.erp.api.so.request.ReturnApplyByAuthorConfirmRequest;
import com.ykcloud.soa.erp.api.so.response.LastSalesDateGetResponse;
import com.ykcloud.soa.erp.api.so.response.ProductInfoForSoApplyTransferBetweenShopGetResponse;
import com.ykcloud.soa.erp.api.so.response.ReturnApplyAuditResponse;
import com.ykcloud.soa.erp.api.so.response.ReturnApplyByAuthorConfirmResponse;

/**
 * TODO（描述类的职责）
 * @author zhiyu.long
 * @date 2018年1月29日 下午6:43:30
 * @version <b>1.0.0</b>
 */
public interface SoApplyService {
	
	/**
	 * 店间调拨商品查询
	 * @author tz.x
	 * @date 2018年4月11日下午7:13:32
	 * @param 
	 * @return
	 */
	public ProductInfoForSoApplyTransferBetweenShopGetResponse getProductInfoForSoApplyTransferBetweenShop(
			ProductInfoForSoApplyTransferBetweenShopGetRequest request);
	
	/**
	 * 获取当前店铺的上次日结日期
	 * 
	 * @param request
	 * @return
	 */
	//LastSalesDateGetResponse getLastSalesDate(LastSalesDateGetRequest request);
	/** 
	* @Description: 退货申请单制单确认
	* @Author: fred.zhao
	* @Date: 2018/4/4 
	*/ 
	ReturnApplyByAuthorConfirmResponse confirmReturnApplyByAuthor(ReturnApplyByAuthorConfirmRequest request);
    
	/** 
	* @Description: 退货申请主管审核
	* @Author: fred.zhao
	* @Date: 2018/4/11 
	*/ 
    public ReturnApplyAuditResponse auditReturnApply(ReturnApplyAuditRequest request);
	
}
