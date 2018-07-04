package com.ykcloud.soa.erp.api.fi.service;

import com.ykcloud.soa.erp.api.fi.request.PayTypeCreateRequest;
import com.ykcloud.soa.erp.api.fi.response.PayTypeCreateResponse;

public interface FiPayTypeService {

    PayTypeCreateResponse createPayType(PayTypeCreateRequest request);
}
