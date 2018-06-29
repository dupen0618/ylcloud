package com.ykcloud.soa.erp.api.fi.service;

import com.ykcloud.soa.erp.api.fi.request.FiMonthlySettlementRequest;
import com.ykcloud.soa.erp.api.fi.request.ReceiptInAccountRequest;
import com.ykcloud.soa.erp.api.fi.response.FiMonthlySettlementResponse;
import com.ykcloud.soa.erp.api.fi.response.ReceiptInAccountResponse;

/**
 * @Author Hewei
 * @Date 2018/4/10 11:30
 */
public interface FiBillInAccountService {
    //通用入账
    ReceiptInAccountResponse setReceiptInAccountService(ReceiptInAccountRequest request);
    //批次月进销，月结
    FiMonthlySettlementResponse buildBatchMonthSalesMonthlySettlementRecord(FiMonthlySettlementRequest request);
    //商品成本月，月结
    FiMonthlySettlementResponse buildItemMonthSalesMonthlySettlementRecord(FiMonthlySettlementRequest request);
    //发出商品，月结
    FiMonthlySettlementResponse buildSendProductSalesMonthlySettlementRecord(FiMonthlySettlementRequest request);
    //发出商品代销商品款，月结
    FiMonthlySettlementResponse buildSendProductConsignmentSalesMonthlySettlementRecord(FiMonthlySettlementRequest request);
    //代销商品款，月结
    FiMonthlySettlementResponse buildConsignmentSalesMonthlySettlementRecord(FiMonthlySettlementRequest request);
}
