package com.ykcloud.soa.erp.api.fi.service;

import com.ykcloud.soa.erp.api.fi.request.GenerateSupplierRequest;
import com.ykcloud.soa.erp.api.fi.response.GenerateSupplierResponse;

/**
 * @author alfred.liu
 * @date 2018/5/24 17:01
 * @description 生成加工费的供应商往来
 */

public interface FiBlDealingsService {
    GenerateSupplierResponse generateDealingByWorkAmount(GenerateSupplierRequest request);
}
