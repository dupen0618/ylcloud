package com.ykcloud.soa.erp.api.wm.service;

import com.ykcloud.soa.erp.api.wm.request.*;
import com.ykcloud.soa.erp.api.wm.response.AffectRowsResponse;
import com.ykcloud.soa.erp.api.wm.response.WmBillInAccountResponse;
import com.ykcloud.soa.erp.api.wm.response.WmReceiptInAccountResponse;

/**
 * @Author Hewei
 * @Date 2018/3/26 18:51
 */
public interface WmBillInAccountService {
    //可用验收入库单
    AffectRowsResponse getCheckoutByReservedNo(UsableInventoryByReservedNoGetRequest checkoutGetByReservedNo);
    //可用库存销售订单(流水)
    AffectRowsResponse getSalesOrderBySoNumId(UsableInventoryByReservedNoGetRequest request);
    //可用库存出库装箱单
    AffectRowsResponse getWarehousePackingbySoNumId(UsableInventoryByReservedNoGetRequest request);
    //可用库存出库单
    AffectRowsResponse LibraryOutByReservedNo(UsableInventoryByReservedNoGetRequest request);
    //可用库存盘盈盘亏单
    AffectRowsResponse inventoryProfitAndLossesByReservedNo(UsableInventoryByReservedNoGetRequest request);
    //可用库存加工单
    AffectRowsResponse materialProcessingFromGetByWorkNumId(UsableInventoryByReservedNoGetRequest request);
    //可用库存成品
    AffectRowsResponse finishedProductsProcessingFromGetByWorkNumId(UsableInventoryByReservedNoGetRequest request);
    //可用库存损益单
    AffectRowsResponse profitAndLossGetByWorkNumId(UsableInventoryByReservedNoGetRequest request);
    //物理财务验收入库流水
    WmBillInAccountResponse getVerifyPhysicsByReservedNo(PhysicsWarehousepackingGetRequest request);
    //物理财务出库流水
    WmBillInAccountResponse getPhysicsSalesOrderByReservedNo(PhysicsWarehousepackingGetRequest request);
    //物理财务盘盈盘亏单
    WmBillInAccountResponse getWmBlStockadjustByReservedNo(PhysicsWarehousepackingGetRequest request);
    //物理财务移库单(出库)
    WmBillInAccountResponse getWmBlMoveOutByMoveNumId(PhysicsWarehousepackingGetRequest request);
    //物理财务移库单(入库)
    WmBillInAccountResponse getWmBlMoveTurnIntoByMoveNumId(PhysicsWarehousepackingGetRequest request);
    //物理财务加工单(原料)
    WmBillInAccountResponse getWmBlWorkRawDtlByWorkNumId(PhysicsWarehousepackingGetRequest request);
    //物理财务加工单(成品)
    WmBillInAccountResponse getWmBlWorkProDtlByWorkNumId(PhysicsWarehousepackingGetRequest request);
    //物理财务物理损溢单
    WmBillInAccountResponse getWmBlLossHdrByLossNumId(PhysicsWarehousepackingGetRequest request);
    //物理仓日进销存
    WmBillInAccountResponse ReceiptInAccountPhysicalDailyGAService(WmBillInAccountRequest wmBillInAccountRequest);
    //物理仓月进销存
    WmBillInAccountResponse ReceiptInAccountPhysicalMonthGAService(WmBillInAccountRequest wmBillInAccountRequest);
    //财务库存处理-(批次库存日月进销存+商品成本)
    public WmReceiptInAccountResponse setReceiptInAccountService(WmReceiptInAccountRequest request);
}
