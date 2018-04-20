package com.ykcloud.soa.erp.api.fi.service;

import com.ykcloud.soa.erp.api.fi.request.VoucherAndAccSubjectRequest;
import com.ykcloud.soa.erp.api.fi.response.VoucherAndAccSubjectResponse;

/**
 * @Description: 入账凭证
 * @Author: ALi
 * @Date: 2018/4/19 18:25
 */
public interface FiVoucherAndAccSubjectService {
 public VoucherAndAccSubjectResponse  insertVoucherAndAccSubject(VoucherAndAccSubjectRequest request);
}
