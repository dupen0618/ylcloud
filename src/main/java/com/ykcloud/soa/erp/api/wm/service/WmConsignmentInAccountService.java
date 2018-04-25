package com.ykcloud.soa.erp.api.wm.service;

import com.ykcloud.soa.erp.api.wm.request.InAccountByReceiptRequest;
import com.ykcloud.soa.erp.api.wm.request.InAccountByShipRequest;
import com.ykcloud.soa.erp.api.wm.request.InAccountByStockAdjustRequest;
import com.ykcloud.soa.erp.api.wm.response.InAccountByReceiptResponse;
import com.ykcloud.soa.erp.api.wm.response.InAccountByShipResponse;
import com.ykcloud.soa.erp.api.wm.response.InAccountByStockAdjustResponse;

/**
 * @Author Hewei
 * @Date 2018/4/18 9:51
 */
public interface WmConsignmentInAccountService {
    //验收入库单
    public InAccountByReceiptResponse setInAccountByReceipt(InAccountByReceiptRequest request);
    //出库单
    public InAccountByShipResponse setInAccountByShip(InAccountByShipRequest request);
    //盘盈盘亏单
    public InAccountByStockAdjustResponse setInAccountByStockAdjust(InAccountByStockAdjustRequest request);

}
