package com.ykcloud.soa.erp.api.wm.service;

import com.ykcloud.soa.erp.api.wm.request.StockCheckPlanAuditRequest;
import com.ykcloud.soa.erp.api.wm.request.StockTakingConHDRGetRequest;
import com.ykcloud.soa.erp.api.wm.request.StockTakingTaskHDRGetRequest;
import com.ykcloud.soa.erp.api.wm.response.StockCheckPlanAuditResponse;
import com.ykcloud.soa.erp.api.wm.response.StockTakingConHDRGetResponse;
import com.ykcloud.soa.erp.api.wm.response.StockTakingTaskHDRGetResponse;

/**
 * @Description: 盘点服务
 * @author: henry.wang
 * @date: 2018/3/27 10:54
 **/
public interface WmStockCheckService {

    /**
     * 审核盘点计划
     *
     * @param request
     * @return
     */
    StockCheckPlanAuditResponse auditStockCheckPlan(StockCheckPlanAuditRequest request);

    /**
     * 查询盘点计划单表头信息
     *
     * @param request
     * @return
     */
    StockTakingTaskHDRGetResponse getStockTakingTaskHDR(StockTakingTaskHDRGetRequest request);

    /**
     * 查询盘点装箱单表头信息
     *
     * @param request
     * @return
     */
    StockTakingConHDRGetResponse getStockTakingConHDR(StockTakingConHDRGetRequest request);
}
