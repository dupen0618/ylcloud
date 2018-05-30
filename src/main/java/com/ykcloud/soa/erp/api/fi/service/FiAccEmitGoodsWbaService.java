package com.ykcloud.soa.erp.api.fi.service;

import com.ykcloud.soa.erp.api.fi.request.FiAccEmitGoodsRequest;
import com.ykcloud.soa.erp.api.fi.response.FiAccEmitGoodsResponse;

/**
 * @Author Hewei
 * @Date 2018/5/29 19:04
 */
public interface FiAccEmitGoodsWbaService {
    FiAccEmitGoodsResponse setSendProductInAccount(FiAccEmitGoodsRequest request);
}
