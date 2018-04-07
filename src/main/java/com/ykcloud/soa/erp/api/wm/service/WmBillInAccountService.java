package com.ykcloud.soa.erp.api.wm.service;

import com.ykcloud.soa.erp.api.wm.request.*;
import com.ykcloud.soa.erp.api.wm.response.AffectRowsResponse;
import com.ykcloud.soa.erp.api.wm.response.WmBillInAccountResponse;

import java.lang.reflect.InvocationTargetException;

/**
 * @Author Hewei
 * @Date 2018/3/26 18:51
 */
public interface WmBillInAccountService {
    //可用库存
    WmBillInAccountResponse setReceiptInAccountTSCService(WmBillInAccountRequest wmBillInAccountRequest);

    //物理仓
    WmBillInAccountResponse setReceiptInAccountPhysicalWBAService(WmBillInAccountRequest wmBillInAccountRequest);

    WmBillInAccountResponse ReceiptInAccountPhysicalWBAService(WmBillInAccountRequest wmBillInAccountRequest);
    //可用验收入库单
    AffectRowsResponse getCheckoutByReservedNo(CheckoutGetByReservedNo checkoutGetByReservedNo);
    //可用库存销售订单(流水)
    AffectRowsResponse getSalesOrderBySoNumId(SalesOrderBySoNumIdGetRequest request) throws InvocationTargetException, IllegalAccessException;
    //可用库存出库装箱单
    AffectRowsResponse getWarehousePackingbySoNumId(WarehousepackingGetRequest request) throws InvocationTargetException, IllegalAccessException;
    //可用库存出库单
    AffectRowsResponse LibraryOutByReservedNo(LibraryOutByReservedNoRequest request);
    //可用库存盘盈盘亏单
    AffectRowsResponse inventoryProfitAndLossesByReservedNo(InventoryProfitAndLossesByReservedNoRequest request);
    //可用库存加工单
    AffectRowsResponse materialProcessingFromGetByWorkNumId(MaterialProcessingFromGetByWorkNumIdRequest request);
    //可用库存成品
    AffectRowsResponse finishedProductsProcessingFromGetByWorkNumId(FinishedProductsProcessingFromGetByWorkNumIdRequest request);
    //可用库存损益单
    AffectRowsResponse profitAndLossGetByWorkNumId(ProfitAndLossGetByWorkNumIdRequest request);
    //物理验收入库流水
    WmBillInAccountResponse getVerifyPhysicsByReservedNo(VerifyPhysicsGetByReservedNoRequest request);
    //物理出库流水
    WmBillInAccountResponse getPhysicsSalesOrderByReservedNo(PhysicsWarehousepackingGetRequest request);
    //盘盈盘亏单
    WmBillInAccountResponse getWmBlStockadjustByReservedNo(PhysicsWarehousepackingGetRequest request);
    //物理移库单(出库)
    WmBillInAccountResponse getWmBlMoveOutByMoveNumId(PhysicsWarehousepackingGetRequest request);
    //物理移库单(入库)
    WmBillInAccountResponse getWmBlMoveTurnIntoByMoveNumId(PhysicsWarehousepackingGetRequest request);
    //加工单(原料)
    WmBillInAccountResponse getWmBlWorkRawDtlByWorkNumId(PhysicsWarehousepackingGetRequest request);
    //加工单(成品)
    WmBillInAccountResponse getWmBlWorkProDtlByWorkNumId(PhysicsWarehousepackingGetRequest request);
    //物理损溢单
    WmBillInAccountResponse getWmBlLossHdrByLossNumId(PhysicsWarehousepackingGetRequest request);
    //物理仓日进销存
    WmBillInAccountResponse ReceiptInAccountPhysicalDailyGAService(WmBillInAccountRequest wmBillInAccountRequest);
    //物理仓月进销存
    WmBillInAccountResponse ReceiptInAccountPhysicalMonthGAService(WmBillInAccountRequest wmBillInAccountRequest);


}
