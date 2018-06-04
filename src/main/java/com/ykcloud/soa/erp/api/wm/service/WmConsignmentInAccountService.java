package com.ykcloud.soa.erp.api.wm.service;

import com.ykcloud.soa.erp.api.wm.request.*;
import com.ykcloud.soa.erp.api.wm.response.*;

/**
 * @Author Hewei
 * @Date 2018/4/18 9:51
 */
public interface WmConsignmentInAccountService {
    //验收入库单
    InAccountByReceiptResponse setInAccountByReceipt(InAccountByReceiptRequest request);
    //出库单
    InAccountByShipResponse setInAccountByShip(InAccountByShipRequest request);
    //盘盈盘亏单
    InAccountByStockAdjustResponse setInAccountByStockAdjust(InAccountByStockAdjustRequest request);
    //移库单
    InAccountByDepartMoveResponse setInAccountByDepartMove(InAccountByDepartMoveRequest request);
    //加工单-原料单
    InAccountByWorkRawResponse setInAccountByWorkRaw(InAccountByWorkRawRequest request);
    //加工单-成品单
    InAccountByWorkProResponse setInAccountByWorkPro(InAccountByWorkProRequest request);
    //损溢单
    InAccountByLossResponse setInAccountByLoss(InAccountByLossRequest request);
    //结算单
    InAccountByBalanceResponse setInAccountByBalance(InAccountByBalanceRequest request);

}
