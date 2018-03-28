package com.ykcloud.soa.erp.api.wm.service;

import com.ykcloud.soa.erp.api.wm.request.StockCheckPlanAuditRequest;
import com.ykcloud.soa.erp.api.wm.response.StockCheckPlanAuditResponse;

/**
 * @ClassName WmStockCheckService
 * @Description 盘点服务
 * @author henry.wang
 * @date 2018年3月27日 上午10:54:54
 */
public interface WmStockCheckService {

    /**
     * 审核盘点计划
     * 
     * @param request
     * @return
     */
    StockCheckPlanAuditResponse auditStockCheckPlan(StockCheckPlanAuditRequest request);
}
