
package com.ykcloud.soa.erp.api.scm.service;

import com.ykcloud.soa.erp.api.scm.request.ApprovalDtlAndApplyDtlForGenerateDistributionUpdateRequest;
import com.ykcloud.soa.erp.api.scm.request.ApprovalDtlsForGenerateDistributionSoGetRequest;
import com.ykcloud.soa.erp.api.scm.request.ApprovalHdrForGenerateDistributionSoGetRequest;
import com.ykcloud.soa.erp.api.scm.request.ApprovalOrderActualQtyUpdateRequest;
import com.ykcloud.soa.erp.api.scm.request.ApprovalReturnStorageAndProductForGenerateReturnSoGetRequest;
import com.ykcloud.soa.erp.api.scm.request.ApprovalStatusNumIdAndSoNumIdUpdateRequest;
import com.ykcloud.soa.erp.api.scm.request.DistributionApprovalOrderByBuyerAuditRequest;
import com.ykcloud.soa.erp.api.scm.request.DistributionProductInfoGetRequest;
import com.ykcloud.soa.erp.api.scm.request.InventoryForDistributionApprovalLockRequest;
import com.ykcloud.soa.erp.api.scm.request.QtyForDistributionApprovalOrderCheckRequest;
import com.ykcloud.soa.erp.api.scm.request.QtyForSoApplyCheckRequest;
import com.ykcloud.soa.erp.api.scm.response.ApprovalDtlAndApplyDtlForGenerateDistributionUpdateResponse;
import com.ykcloud.soa.erp.api.scm.response.ApprovalDtlsForGenerateDistributionSoGetResponse;
import com.ykcloud.soa.erp.api.scm.response.ApprovalHdrForGenerateDistributionSoGetResponse;
import com.ykcloud.soa.erp.api.scm.response.ApprovalOrderActualQtyUpdateResponse;
import com.ykcloud.soa.erp.api.scm.response.ApprovalReturnStorageAndProductForGenerateReturnSoGetResponse;
import com.ykcloud.soa.erp.api.scm.response.ApprovalStatusNumIdAndSoNumIdUpdateResponse;
import com.ykcloud.soa.erp.api.scm.response.DistributionApprovalOrderByBuyerAuditResponse;
import com.ykcloud.soa.erp.api.scm.response.DistributionProductInfoGetResponse;
import com.ykcloud.soa.erp.api.scm.response.InventoryForDistributionApprovalLockResponse;
import com.ykcloud.soa.erp.api.scm.response.QtyForDistributionApprovalOrderCheckResponse;
import com.ykcloud.soa.erp.api.scm.response.QtyForSoApplyCheckResponse;


public interface ScmDistributionService {
	
	/**
	 * 订单发货后回写配送审批单和配送申请单发货数量(配送)
	 * @author tz.x
	 * @date 2018年4月19日上午9:32:42
	 * @param 
	 * @return
	 */
	public ApprovalOrderActualQtyUpdateResponse updateApprovalOrderActualQty(ApprovalOrderActualQtyUpdateRequest request);
	
	/**
	 * 回写配送申请单身和补货单
	 * @author tz.x
	 * @date 2018年4月14日上午9:08:28
	 * @param 
	 * @return
	 */
	public ApprovalDtlAndApplyDtlForGenerateDistributionUpdateResponse updateApprovalHdrAndApplyDtlForGenerateDistributionSo(ApprovalDtlAndApplyDtlForGenerateDistributionUpdateRequest request);
	
	/**
	 * 根据锁库结果获取指定的退货审批单的仓库及商品
	 * @author tz.x
	 * @date 2018年4月10日上午9:27:06
	 * @param 
	 * @return
	 */
	public ApprovalReturnStorageAndProductForGenerateReturnSoGetResponse getApprovalReturnStorageAndProductForGenerateReturnSo(
			ApprovalReturnStorageAndProductForGenerateReturnSoGetRequest request);
	
	/**
	 * 配送生成so后更新配送审批单状态并回填审批单单身so_num_id
	 * @author tz.x
	 * @date 2018年4月8日上午11:05:40
	 * @param 
	 * @return
	 */
	public ApprovalStatusNumIdAndSoNumIdUpdateResponse updateApprovalStatusNumIdAndSoNumId(ApprovalStatusNumIdAndSoNumIdUpdateRequest request);
	
	//已审核配送审批单锁库
	public InventoryForDistributionApprovalLockResponse lockInventoryForDistributionApproval(
			InventoryForDistributionApprovalLockRequest request);

	//为产生配送分拨单，获取So单头纬度信息
	public ApprovalHdrForGenerateDistributionSoGetResponse getApprovalHdrForGenerateDistributionSo(
			ApprovalHdrForGenerateDistributionSoGetRequest request);
	
	//为产生配送分拨单，获取配送单身
	public ApprovalDtlsForGenerateDistributionSoGetResponse getApprovalDtlsForGenerateDistributionSo(
			ApprovalDtlsForGenerateDistributionSoGetRequest request);
    
	/** 
	* @Description: 配送单审核
	* @Author: fred.zhao
	* @Date: 2018/4/7 
	*/ 
    public DistributionApprovalOrderByBuyerAuditResponse auditDistributionApprovalOrderByBuyer(DistributionApprovalOrderByBuyerAuditRequest request);

    
	//获取配送商品属性
	public DistributionProductInfoGetResponse getDistributionProductInfo(DistributionProductInfoGetRequest request);
	
	/** 
	* @Description: 配送数量检查
	* @Author: fred.zhao
	* @Date: 2018/4/11 
	*/ 
    public QtyForDistributionApprovalOrderCheckResponse checkQtyForDistributionApprovalOrder(QtyForDistributionApprovalOrderCheckRequest request);

    //数量检查(店间调拨、仓间调拨、加工领料、行政领料)
    public QtyForSoApplyCheckResponse checkQtyForSoApply(QtyForSoApplyCheckRequest request);


}




  




