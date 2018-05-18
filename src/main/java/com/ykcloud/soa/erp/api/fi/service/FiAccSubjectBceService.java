package com.ykcloud.soa.erp.api.fi.service;

import com.ykcloud.soa.erp.api.fi.request.AccSubjectBceGeneratRequest;
import com.ykcloud.soa.erp.api.fi.response.AccSubjectBceGeneratResponse;

/**
 * @Author:ALi
 * @Description: 入账凭证
 * @Date:
 */
public interface FiAccSubjectBceService {
    public AccSubjectBceGeneratResponse generateAccSubjectBce(AccSubjectBceGeneratRequest request);
}
