package com.ykcloud.soa.erp.api.wm.service;

import com.ykcloud.soa.erp.api.wm.request.*;
import com.ykcloud.soa.erp.api.wm.response.*;

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
    //移库单
    public InAccountByDepartMoveResponse setInAccountByDepartMove(InAccountByDepartMoveRequest request);
    //加工单-原料单
    public InAccountByWorkRawResponse setInAccountByWorkRaw(InAccountByWorkRawRequest request);
    //加工单-成品单
    public InAccountByWorkProResponse setInAccountByWorkPro(InAccountByWorkProRequest request);
    //损溢单
    public InAccountByLossResponse setInAccountByLoss(InAccountByLossRequest request);
    //结算单
    public InAccountByBalanceResponse setInAccountByBalance(InAccountByBalanceRequest request);


}
