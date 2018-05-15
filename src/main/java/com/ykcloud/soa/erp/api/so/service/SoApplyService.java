package com.ykcloud.soa.erp.api.so.service;

import com.ykcloud.soa.erp.api.scm.request.ShopTransferOrderActualQtyUpdateRequest;
import com.ykcloud.soa.erp.api.so.request.ActualQtyForReturnUpdateRequest;
import com.ykcloud.soa.erp.api.so.request.ProductInfoForSoApplyGetRequest;
import com.ykcloud.soa.erp.api.so.request.ProductInfoForSoApplySubcontractSplitGetRequest;
import com.ykcloud.soa.erp.api.so.request.ProductInfoForSoApplyTransferBetweenShopGetRequest;
import com.ykcloud.soa.erp.api.so.request.QtyForSoApplyCheckRequest;
import com.ykcloud.soa.erp.api.so.request.ReturnApplyAfterGenerateReturnSoUpdateRequest;
import com.ykcloud.soa.erp.api.so.request.ReturnApplyAuditRequest;
import com.ykcloud.soa.erp.api.so.request.ReturnApplyBatchAuditRequest;
import com.ykcloud.soa.erp.api.so.request.ReturnApplyByAuthorConfirmRequest;
import com.ykcloud.soa.erp.api.so.request.ReturnApplyDtlImportRequest;
import com.ykcloud.soa.erp.api.so.request.ShopTransferByAuthorConfirmRequest;
import com.ykcloud.soa.erp.api.so.request.ShopTransferByOperationCenterAuditRequest;
import com.ykcloud.soa.erp.api.so.request.ShopTransferByReceiverConfirmRequest;
import com.ykcloud.soa.erp.api.so.request.ShopTransferDtlImportRequest;
import com.ykcloud.soa.erp.api.so.request.ShopTransferRejectAuditRequest;
import com.ykcloud.soa.erp.api.so.request.SoApplyActualQtyUpdateGetRequest;
import com.ykcloud.soa.erp.api.so.request.SoApplyByAuthorConfirmRequest;
import com.ykcloud.soa.erp.api.so.request.SoApplyDtlImportRequest;
import com.ykcloud.soa.erp.api.so.request.SoOriginReservedNoRequest;
import com.ykcloud.soa.erp.api.so.request.MaterialIssueBackAuditRequest;
import com.ykcloud.soa.erp.api.so.response.ActualQtyForReturnUpdateResponse;
import com.ykcloud.soa.erp.api.so.response.ProductInfoForSoApplyGetResponse;
import com.ykcloud.soa.erp.api.so.response.ProductInfoForSoApplySubcontractSplitGetResponse;
import com.ykcloud.soa.erp.api.so.response.ProductInfoForSoApplyTransferBetweenShopGetResponse;
import com.ykcloud.soa.erp.api.so.response.QtyForSoApplyCheckResponse;
import com.ykcloud.soa.erp.api.so.response.ReturnApplyAfterGenerateReturnSoUpdateResponse;
import com.ykcloud.soa.erp.api.so.response.ReturnApplyAuditResponse;
import com.ykcloud.soa.erp.api.so.response.ReturnApplyBatchAuditResponse;
import com.ykcloud.soa.erp.api.so.response.ReturnApplyByAuthorConfirmResponse;
import com.ykcloud.soa.erp.api.so.response.ReturnApplyDtlImportResponse;
import com.ykcloud.soa.erp.api.so.response.ShopTransferByAuthorConfirmResponse;
import com.ykcloud.soa.erp.api.so.response.ShopTransferByOperationCenterAuditResponse;
import com.ykcloud.soa.erp.api.so.response.ShopTransferByReceiverConfirmResponse;
import com.ykcloud.soa.erp.api.so.response.ShopTransferDtlImportResponse;
import com.ykcloud.soa.erp.api.so.response.ShopTransferOrderActualQtyUpdateResponse;
import com.ykcloud.soa.erp.api.so.response.ShopTransferRejectAuditResponse;
import com.ykcloud.soa.erp.api.so.response.SoApplyActualQtyUpdateGetResponse;
import com.ykcloud.soa.erp.api.so.response.SoApplyByAuthorConfirmResponse;
import com.ykcloud.soa.erp.api.so.response.SoApplyDtlImportResponse;
import com.ykcloud.soa.erp.api.so.response.SoOriginReservedNoResponse;
import com.ykcloud.soa.erp.api.so.response.MaterialIssueBackAuditResponse;

/**
 * TODO（描述类的职责）
 * @author zhiyu.long
 * @date 2018年1月29日 下午6:43:30
 * @version <b>1.0.0</b>
 */
public interface SoApplyService {
	
	/**
	 * 店间调拨批量导入excel
	 * @author tz.x
	 * @date 2018年5月14日下午2:40:23
	 */
	public ShopTransferDtlImportResponse importShopTransferDtl(ShopTransferDtlImportRequest request);
	
	/**
	 * 店间调拨回写实际发货数量
	 * @author tz.x
	 * @date 2018年4月23日下午6:57:39
	 * @param 
	 * @return
	 */
	public ShopTransferOrderActualQtyUpdateResponse updateShopTransferOrderActualQty(ShopTransferOrderActualQtyUpdateRequest request);
	
	/**
	 * 店间调拨驳回
	 * @author tz.x
	 * @date 2018年4月18日下午2:11:37
	 * @param 
	 * @return
	 */
	public ShopTransferRejectAuditResponse rejectShopTransferAudit(ShopTransferRejectAuditRequest request);
	
	/**
	 * 店间调拨营运中心确认
	 * @author tz.x
	 * @date 2018年4月17日下午1:55:22
	 * @param 
	 * @return
	 */
	public ShopTransferByOperationCenterAuditResponse auditShopTransferByOperationCenter(ShopTransferByOperationCenterAuditRequest request);
	
	/**
	 * 店间调拨收货门店确认
	 * @author tz.x
	 * @date 2018年4月16日上午9:02:37
	 * @param 
	 * @return
	 */
	public ShopTransferByReceiverConfirmResponse confirmShopTransferByReceiver(ShopTransferByReceiverConfirmRequest request);
	
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
	public MaterialIssueBackAuditResponse auditMaterialIssueBack(MaterialIssueBackAuditRequest request);

    //店内调拨、行政领料商品查询
	public ProductInfoForSoApplyGetResponse getProductInfoForSoApply(ProductInfoForSoApplyGetRequest request);

	//委外分解领料商品查询
	public ProductInfoForSoApplySubcontractSplitGetResponse  getProductInfoForSoApplySubcontractSplit(ProductInfoForSoApplySubcontractSplitGetRequest request);

	//制单确认（仓间调拨、委外分解领用、政领料领用）
	public SoApplyByAuthorConfirmResponse confirmSoApplyByAuthor(SoApplyByAuthorConfirmRequest request);
	/**
	 * 
	 * @description
	 * @author gaoyun.shen
	 * @date: 2018年4月19日 下午3:48:53
	 * @param   根据申请单号获取原出库单号
	 * @return 
	 */
	public SoOriginReservedNoResponse getOriginReservedNoByApplyNumId(SoOriginReservedNoRequest request);
	
	//数量检查(店间调拨、仓间调拨、加工领料、行政领料)
    public QtyForSoApplyCheckResponse checkQtyForSoApply(QtyForSoApplyCheckRequest request);

    //更改实际退货数量
    public ActualQtyForReturnUpdateResponse updateActualQty(ActualQtyForReturnUpdateRequest request);

    //更改订单申请单中的实际收退货数量
    public SoApplyActualQtyUpdateGetResponse updateSoApplyActualQty(SoApplyActualQtyUpdateGetRequest request);

    //退货申请主管批量审核
    public ReturnApplyBatchAuditResponse batchAuditReturnApply(ReturnApplyBatchAuditRequest request);

    //店内调拨、行政领料、委外拆解领料商品EXCEL导入
    public SoApplyDtlImportResponse importSoApplyDtl(SoApplyDtlImportRequest request);

    //退货申请单EXCEL商品批量导入
    public ReturnApplyDtlImportResponse importReturnApplyDtl(ReturnApplyDtlImportRequest request);
}
