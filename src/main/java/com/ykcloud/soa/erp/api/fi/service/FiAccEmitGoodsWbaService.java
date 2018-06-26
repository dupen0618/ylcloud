package com.ykcloud.soa.erp.api.fi.service;

import com.ykcloud.soa.erp.api.fi.request.FiAccEmitGenerateSupplyRequest;
import com.ykcloud.soa.erp.api.fi.request.FiAccEmitGoodsRequest;
import com.ykcloud.soa.erp.api.fi.response.FiAccEmitGoodsResponse;

/**
 * @Author Hewei
 * @Date 2018/5/29 19:04
 */
public interface FiAccEmitGoodsWbaService {
    FiAccEmitGoodsResponse setSendProductInAccount(FiAccEmitGoodsRequest request);

    /**
     * 门店调整库存金额时,生成总部的发出商品调整单
     *
     * @author Sealin
     */
    FiAccEmitGoodsResponse generateSupplyEmitCostAdjust(FiAccEmitGenerateSupplyRequest request);
}
