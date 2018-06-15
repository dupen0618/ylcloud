package com.ykcloud.soa.erp.api.fi.service;

import com.ykcloud.soa.erp.api.fi.request.ConsignmentProductAccountAdjustRequest;
import com.ykcloud.soa.erp.api.fi.request.ConsignmentProductAccountForFixedAdjustRequest;
import com.ykcloud.soa.erp.api.fi.request.FiInAccountByReceiptRequest;
import com.ykcloud.soa.erp.api.fi.request.FiMonthlySettlementRequest;
import com.ykcloud.soa.erp.api.fi.response.ConsignmentProductAccountAdjustResponse;
import com.ykcloud.soa.erp.api.fi.response.ConsignmentProductAccountForFixedAdjustResponse;
import com.ykcloud.soa.erp.api.fi.response.FiInAccountByReceiptResponse;
import com.ykcloud.soa.erp.api.fi.response.FiMonthlySettlementResponse;

/**
 * @Author Hewei
 * @Date 2018/4/18 13:53
 */
public interface FiConsignmentInAccountService {

    /**
     * 代销商品款调整
     *
     * @author tz.x
     * @date 2018年5月17日下午6:54:30
     */
    public ConsignmentProductAccountAdjustResponse adjustConsignmentProductAccount(ConsignmentProductAccountAdjustRequest request);

    FiInAccountByReceiptResponse getConsignmentInAccount(FiInAccountByReceiptRequest request);

    FiMonthlySettlementResponse buildMonthlySettlementRecord(FiMonthlySettlementRequest request);

}
