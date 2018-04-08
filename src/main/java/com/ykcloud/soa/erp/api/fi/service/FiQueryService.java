package com.ykcloud.soa.erp.api.fi.service;

import com.ykcloud.soa.erp.api.fi.request.ApBalanceForFinanceAuditApprovalReturnOrderGetRequest;
import com.ykcloud.soa.erp.api.fi.request.ConsignmentProductFinalAmountForFinanceAuditApprovalReturnOrderGetRequest;
import com.ykcloud.soa.erp.api.fi.request.LastMoveWeightingCostPriceGetRequest;
import com.ykcloud.soa.erp.api.fi.response.ApBalanceForFinanceAuditApprovalReturnOrderGetResponse;
import com.ykcloud.soa.erp.api.fi.response.ConsignmentProductFinalAmountForFinanceAuditApprovalReturnOrderGetResponse;
import com.ykcloud.soa.erp.api.fi.response.LastMoveWeightingCostPriceGetResponse;

/**
* @ClassName: FiCostQueryService.java
* @Description: 取最新移动加权成本服务
* @version: v1.0.0
* @author: fred.zhao
* @date: 2018年3月20日 上午10:02:30 
*/
public interface FiQueryService {
	//取最新移动加权成本服务
	public LastMoveWeightingCostPriceGetResponse getLastMoveWeightingCostPrice(LastMoveWeightingCostPriceGetRequest request);
    
	/** 
	* @Description: 获取门店别供应商应付账款、应付暂估、保证金、未扣费用
	* @Author: fred.zhao
	* @Date: 2018/4/7 
	*/ 
	public ApBalanceForFinanceAuditApprovalReturnOrderGetResponse getApBalanceForFinanceAuditApprovalReturnOrder
            (ApBalanceForFinanceAuditApprovalReturnOrderGetRequest request);
    
	/** 
	* @Description: 获取门店、供应别代销商品款期末余额
	* @Author: fred.zhao
	* @Date: 2018/4/7 
	*/ 
	public ConsignmentProductFinalAmountForFinanceAuditApprovalReturnOrderGetResponse getConsignmentProductFinalAmountForFinanceAuditApprovalReturnOrder
            (ConsignmentProductFinalAmountForFinanceAuditApprovalReturnOrderGetRequest request);
}
