package com.ykcloud.soa.erp.api.wm.service;

import com.ykcloud.soa.erp.api.wm.request.BusinessAmountForGenKxCountRequest;
import com.ykcloud.soa.erp.api.wm.response.BusinessAmountForGenKxCountResponse;

/**
 * @Description: 用于自动生成供应商扣项时统计业务发生额的服务
 * @author: henry.wang
 * @date: 2018/5/17 16:05
 **/
public interface WmCountBusinessAmountForFiVenderKxService {

    /**
     * 统计销售收入
     * @author henry.wang
     *
     * @param request
     * @return
     */
    BusinessAmountForGenKxCountResponse countSalesIncome(BusinessAmountForGenKxCountRequest request);

    /**
     * 统计销售成本
     * @author henry.wang
     *
     * @param request
     * @return
     */
    BusinessAmountForGenKxCountResponse countSalesCost(BusinessAmountForGenKxCountRequest request);

    /**
     * 统计验收成本
     * @author henry.wang
     *
     * @param request
     * @return
     */
    BusinessAmountForGenKxCountResponse countReceiptCost(BusinessAmountForGenKxCountRequest request);
}
