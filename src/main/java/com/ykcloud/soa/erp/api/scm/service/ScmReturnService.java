package com.ykcloud.soa.erp.api.scm.service;


import com.ykcloud.soa.erp.api.scm.request.ApprovalReturnOrderByBuyerAuditRequest;
import com.ykcloud.soa.erp.api.scm.request.ApprovalReturnOrderByFinanceAutoAuditRequest;
import com.ykcloud.soa.erp.api.scm.request.ApprovalReturnOrderByFinanceHandAuditRequest;
import com.ykcloud.soa.erp.api.scm.request.ApprovalReturnOrderGenerateRequest;
import com.ykcloud.soa.erp.api.scm.request.QtyForReturnOrderCheckRequest;
import com.ykcloud.soa.erp.api.scm.request.ReturnApprovalActualQtyUpdateRequest;
import com.ykcloud.soa.erp.api.scm.request.ReturnApprovalOrderActualQtyUpdateRequest;
import com.ykcloud.soa.erp.api.scm.request.ReturnApprovalOrderAfterGeneateReturnSoUpdateRequest;
import com.ykcloud.soa.erp.api.scm.response.ApprovalReturnOrderByBuyerAuditResponse;
import com.ykcloud.soa.erp.api.scm.response.ApprovalReturnOrderByFinanceAutoAuditResponse;
import com.ykcloud.soa.erp.api.scm.response.ApprovalReturnOrderByFinanceHandAuditResponse;
import com.ykcloud.soa.erp.api.scm.response.ApprovalReturnOrderGenerateResponse;
import com.ykcloud.soa.erp.api.scm.request.ReturnProductGetRequest;
import com.ykcloud.soa.erp.api.scm.response.QtyForReturnOrderCheckResponse;
import com.ykcloud.soa.erp.api.scm.response.ReturnApprovalActualQtyUpdateResponse;
import com.ykcloud.soa.erp.api.scm.response.ReturnApprovalOrderAfterGeneateReturnSoUpdateResponse;
import com.ykcloud.soa.erp.api.scm.response.ReturnProductGetResponse;
import com.ykcloud.soa.erp.api.scm.response.ReturnApprovalOrderActualQtyUpdateResponse;

/**
 * @author fred.zhao
 * 根据退货申请产生退货审批单服务
 */
public interface ScmReturnService {
	
	/**
	 * 更新退货审批单单身so_num_id
	 * @author tz.x
	 * @date 2018年4月10日下午7:07:01
	 * @param 
	 * @return
	 */
	public ReturnApprovalOrderAfterGeneateReturnSoUpdateResponse updateReturnApprovalOrderAfterGeneateReturnSo(
			ReturnApprovalOrderAfterGeneateReturnSoUpdateRequest request);
	
    //退货申请单生成退货审批单
    public ApprovalReturnOrderGenerateResponse generateApprovalReturnOrder(ApprovalReturnOrderGenerateRequest request);
     //前台根据商品编号获取退货商品相关信息(价格）
	public ReturnProductGetResponse getReturnProduct(ReturnProductGetRequest request);

    /** 
    * @Description: 退供应商财务审核
    * @Author: fred.zhao
    * @Date: 2018/4/3 
    */ 
	public ApprovalReturnOrderByFinanceAutoAuditResponse auditApprovalReturnOrderByFinanceAuto(ApprovalReturnOrderByFinanceAutoAuditRequest request);

	/** 
	* @Description: 退供应商财务人工审核
	* @Author: fred.zhao
	* @Date: 2018/4/4 
	*/ 
	public ApprovalReturnOrderByFinanceHandAuditResponse auditApprovalReturnOrderByFinanceHand(ApprovalReturnOrderByFinanceHandAuditRequest request);

	/**
	* @Description: 退货审批单审核
	* @Author: fred.zhao
	* @Date: 2018/4/7
	*/
	public ApprovalReturnOrderByBuyerAuditResponse auditApprovalReturnOrderByBuyer(ApprovalReturnOrderByBuyerAuditRequest request);

    /**
    * @Description: 退货审批单数量检查
    * @Author: fred.zhao
    * @Date: 2018/4/12
    */
    public QtyForReturnOrderCheckResponse checkQtyForReturnOrder(QtyForReturnOrderCheckRequest request);
    
    
    /**
     * 更新退货审批单单身实退数量
     * @author shirong.chen
     * @date 2018年4月10日下午7:07:01
     * @param
     * @return
     * 
     **/
    public ReturnApprovalOrderActualQtyUpdateResponse updateReturnApprovalOrderActualQty(
    		ReturnApprovalOrderActualQtyUpdateRequest request);
    
    
    //退货so单回写退货申请单实际发货数量
    public ReturnApprovalActualQtyUpdateResponse updateReturnApprovalActualQty(ReturnApprovalActualQtyUpdateRequest request );
}
