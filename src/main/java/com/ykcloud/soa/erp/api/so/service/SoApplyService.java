package com.ykcloud.soa.erp.api.so.service;

import com.ykcloud.soa.erp.api.so.request.LastSalesDateGetRequest;
import com.ykcloud.soa.erp.api.so.request.ProductInfoForSoApplyTransferBetweenShopGetRequest;
import com.ykcloud.soa.erp.api.so.request.ReturnApplyAfterGenerateReturnSoUpdateRequest;
import com.ykcloud.soa.erp.api.so.request.ReturnApplyAuditRequest;
import com.ykcloud.soa.erp.api.so.request.ReturnApplyByAuthorConfirmRequest;
import com.ykcloud.soa.erp.api.so.request.ShopTransferByAuthorConfirmRequest;
import com.ykcloud.soa.erp.api.so.request.ShopTransferByOperationCenterAuditRequest;
import com.ykcloud.soa.erp.api.so.request.SoReturnApplyAuditRequest;
import com.ykcloud.soa.erp.api.so.response.LastSalesDateGetResponse;
import com.ykcloud.soa.erp.api.so.response.ProductInfoForSoApplyTransferBetweenShopGetResponse;
import com.ykcloud.soa.erp.api.so.response.ReturnApplyAfterGenerateReturnSoUpdateResponse;
import com.ykcloud.soa.erp.api.so.response.ReturnApplyAuditResponse;
import com.ykcloud.soa.erp.api.so.response.ReturnApplyByAuthorConfirmResponse;
import com.ykcloud.soa.erp.api.so.response.ShopTransferByAuthorConfirmResponse;
import com.ykcloud.soa.erp.api.so.response.ShopTransferByOperationCenterAuditResponse;
import com.ykcloud.soa.erp.api.so.response.SoReturnApplyAuditResponse;

/**
 * TODO（描述类的职责）
 * @author zhiyu.long
 * @date 2018年1月29日 下午6:43:30
 * @version <b>1.0.0</b>
 */
public interface SoApplyService {
	
	/**
	 * 店间调拨收货门店确认
	 * @author tz.x
	 * @date 2018年4月16日上午9:02:37
	 * @param 
	 * @return
	 */
	public ShopTransferByOperationCenterAuditResponse confirmShopTransferByReceiver(ShopTransferByOperationCenterAuditRequest request);
	
	/**
	 * 店间调拨制单确认
	 * @author tz.x
	 * @date 2018年4月13日下午1:09:15
	 * @param 
	 * @return
	 */
	public ShopTransferByAuthorConfirmResponse confirmShopTransferByAuthor(ShopTransferByAuthorConfirmRequest request);
	
	/**
	 * 产生退货so回写退审批单后再回写退货申请单so_num_id及订单数量
	 * @author tz.x
	 * @date 2018年4月12日上午10:53:00
	 * @param 
	 * @return
	 */
	public ReturnApplyAfterGenerateReturnSoUpdateResponse updateReturnApplyAfterGenerateReturnSo(
			ReturnApplyAfterGenerateReturnSoUpdateRequest request);
	
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
    
    /** 
    * @Description: 领料退回审核
    * @Author: fred.zhao
    * @Date: 2018/4/12 
    */ 
	public SoReturnApplyAuditResponse auditSoReturnApply(SoReturnApplyAuditRequest request);
}
