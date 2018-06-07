package com.ykcloud.soa.erp.api.fi.service;

import com.ykcloud.soa.erp.api.fi.request.AccountForAdjustCheckRequest;
import com.ykcloud.soa.erp.api.fi.response.AccountForAdjustCheckResponse;

/**
 * @Description: 代销商品款
 * @author: henry.wang
 * @date: 2018/6/6 14:50
 **/
public interface FiConsignmentProductAccountService {

    /**
     * @Description: 盘盈盘亏单中类型(3、4、5、6)，并且 wm_bl_stockadjust_hdr.if_costadjust=0 核销代销商品款。
     * @author: henry.wang
     * @date: 2018/6/6 15:32
     **/
    AccountForAdjustCheckResponse checkAccountForAdjust(AccountForAdjustCheckRequest request);
}
