package com.ykcloud.soa.erp.api.fi.service;

import com.ykcloud.soa.erp.api.fi.request.FiOnLoadProcessRequest;
import com.ykcloud.soa.erp.api.fi.response.FiOnLoadProcessResponse;

/**
 * @Author Hewei
 * @Date 2018/5/17 16:03
 */
public interface FiOnLoadProcessService {
    //商品成本月进销存出库在途处理
    FiOnLoadProcessResponse CostMonthShipOnLoadProcess(FiOnLoadProcessRequest request);

    //商品成本月进销存入库在途处理
    FiOnLoadProcessResponse CostMonthReceiptOnLoadProcess(FiOnLoadProcessRequest request);

    // 代销商品款出库在途处理
    FiOnLoadProcessResponse ConsignmentShipOnLoadProcess(FiOnLoadProcessRequest request);

    //代销商品款入库在途处理
    FiOnLoadProcessResponse ConsignmentReceiptOnLoadProcess(FiOnLoadProcessRequest request);
}
