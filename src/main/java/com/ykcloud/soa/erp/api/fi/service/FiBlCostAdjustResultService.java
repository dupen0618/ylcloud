package com.ykcloud.soa.erp.api.fi.service;

import com.ykcloud.soa.erp.api.fi.request.FiBlCostAdjustResultRequest;
import com.ykcloud.soa.erp.api.fi.response.FiBlCostAdjustResultResponse;

/**
 * 代销发出商品成本调整
 *
 * @author Sealin
 * Created on 2018-06-20
 */
public interface FiBlCostAdjustResultService {
    /**
     * 新增代销商品发出成本调整结果
     * @param Request
     * @return
     */
    FiBlCostAdjustResultResponse addAdjustResult(FiBlCostAdjustResultRequest Request);
}
