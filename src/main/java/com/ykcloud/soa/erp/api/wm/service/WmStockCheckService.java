package com.ykcloud.soa.erp.api.wm.service;

import com.ykcloud.soa.erp.api.wm.request.AccountForProduceStockProcessRequest;
import com.ykcloud.soa.erp.api.wm.request.ContainerFinishRequest;
import com.ykcloud.soa.erp.api.wm.request.ContainerProductDetailGetRequest;
import com.ykcloud.soa.erp.api.wm.request.ContainerRefreshRequest;
import com.ykcloud.soa.erp.api.wm.request.FirstSupplyUnitNumIdGetRequest;
import com.ykcloud.soa.erp.api.wm.request.ItemBarcodeScanRequest;
import com.ykcloud.soa.erp.api.wm.request.ItemBarcodeStockCheckScanRequest;
import com.ykcloud.soa.erp.api.wm.request.ItemQtyStockCheckInputRequest;
import com.ykcloud.soa.erp.api.wm.request.LossNumIdByGetLossDtlRequest;
import com.ykcloud.soa.erp.api.wm.request.LossNumIdByGetLossHdrRequest;
import com.ykcloud.soa.erp.api.wm.request.MyCheckContainerGetRequest;
import com.ykcloud.soa.erp.api.wm.request.OmitCheckProductListQueryRequest;
import com.ykcloud.soa.erp.api.wm.request.StockAdjustAccountProcessRequest;
import com.ykcloud.soa.erp.api.wm.request.StockAdjustAccountRequest;
import com.ykcloud.soa.erp.api.wm.request.StockAdjustCreateRequest;
import com.ykcloud.soa.erp.api.wm.request.StockAdjustHzAuditRequest;
import com.ykcloud.soa.erp.api.wm.request.StockCheckCancelRequest;
import com.ykcloud.soa.erp.api.wm.request.StockCheckFinishRequest;
import com.ykcloud.soa.erp.api.wm.request.StockCheckFirstFinishRequest;
import com.ykcloud.soa.erp.api.wm.request.StockCheckPlanAuditRequest;
import com.ykcloud.soa.erp.api.wm.request.StockCheckProductAbandonRequest;
import com.ykcloud.soa.erp.api.wm.request.StockCheckSecondFinishRequest;
import com.ykcloud.soa.erp.api.wm.request.StockTakingConHDRCreateRequest;
import com.ykcloud.soa.erp.api.wm.request.StockTakingConHDRGetRequest;
import com.ykcloud.soa.erp.api.wm.request.StockTakingTaskHDRGetRequest;
import com.ykcloud.soa.erp.api.wm.request.StockadjustBatchDtlsForCheckConsignmentProductAccountFindRequest;
import com.ykcloud.soa.erp.api.wm.request.StockadjustDtlGetRequest;
import com.ykcloud.soa.erp.api.wm.request.StockadjustHdrGetRequest;
import com.ykcloud.soa.erp.api.wm.request.TaskProListRefreshRequest;
import com.ykcloud.soa.erp.api.wm.request.UnConfirmStockAdjustGetRequest;
import com.ykcloud.soa.erp.api.wm.response.AccountForProduceStockProcessResponse;
import com.ykcloud.soa.erp.api.wm.response.ContainerFinishResponse;
import com.ykcloud.soa.erp.api.wm.response.ContainerProductDetailGetResponse;
import com.ykcloud.soa.erp.api.wm.response.ContainerRefreshResponse;
import com.ykcloud.soa.erp.api.wm.response.FirstSupplyUnitNumIdGetResponse;
import com.ykcloud.soa.erp.api.wm.response.ItemBarcodeScanResponse;
import com.ykcloud.soa.erp.api.wm.response.LossNumIdByGetLossDtlResponse;
import com.ykcloud.soa.erp.api.wm.response.LossNumIdByGetLossHdrResponse;
import com.ykcloud.soa.erp.api.wm.response.MyCheckContainerGetResponse;
import com.ykcloud.soa.erp.api.wm.response.OmitCheckProductListQueryResponse;
import com.ykcloud.soa.erp.api.wm.response.StockAdjustAccountProcessResponse;
import com.ykcloud.soa.erp.api.wm.response.StockAdjustAccountResponse;
import com.ykcloud.soa.erp.api.wm.response.StockAdjustCreateResponse;
import com.ykcloud.soa.erp.api.wm.response.StockAdjustHzAuditResponse;
import com.ykcloud.soa.erp.api.wm.response.StockCheckCancelResponse;
import com.ykcloud.soa.erp.api.wm.response.StockCheckFinishResponse;
import com.ykcloud.soa.erp.api.wm.response.StockCheckFirstFinishResponse;
import com.ykcloud.soa.erp.api.wm.response.StockCheckPlanAuditResponse;
import com.ykcloud.soa.erp.api.wm.response.StockCheckProductAbandonResponse;
import com.ykcloud.soa.erp.api.wm.response.StockCheckResponse;
import com.ykcloud.soa.erp.api.wm.response.StockCheckSecondFinishResponse;
import com.ykcloud.soa.erp.api.wm.response.StockTakingConHDRCreateResponse;
import com.ykcloud.soa.erp.api.wm.response.StockTakingConHDRGetResponse;
import com.ykcloud.soa.erp.api.wm.response.StockTakingTaskHDRGetResponse;
import com.ykcloud.soa.erp.api.wm.response.StockadjustBatchDtlsForCheckConsignmentProductAccountFindResponse;
import com.ykcloud.soa.erp.api.wm.response.StockadjustDtlGetResponse;
import com.ykcloud.soa.erp.api.wm.response.StockadjustHdrGetResponse;
import com.ykcloud.soa.erp.api.wm.response.TaskProListRefreshResponse;
import com.ykcloud.soa.erp.api.wm.response.UnConfirmStockAdjustGetResponse;

/**
 * @Description: 盘点服务
 * @author: henry.wang
 * @date: 2018/3/27 10:54
 **/
public interface WmStockCheckService {

    /**
     * 审核盘点计划
     *
     * @author henry.wang
     * @param request
     * @return
     */
    StockCheckPlanAuditResponse auditStockCheckPlan(StockCheckPlanAuditRequest request);

    /**
     * 查询盘点计划单表头信息
     *
     * @author henry.wang
     * @param request
     * @return
     */
    StockTakingTaskHDRGetResponse getStockTakingTaskHDR(StockTakingTaskHDRGetRequest request);

    /**
     * 查询盘点装箱单表头信息
     *
     * @author henry.wang
     * @param request
     * @return
     */
    StockTakingConHDRGetResponse getStockTakingConHDR(StockTakingConHDRGetRequest request);

    /**
     * 扫码商品条码返回商品信息
     *
     * @author henry.wang
     * @param request
     * @return
     */
    ItemBarcodeScanResponse scanItemBarcode(
        ItemBarcodeScanRequest request);

    /**
     * 扫码商品条码盘点
     *
     * @author henry.wang
     * @param request
     * @return
     */
    StockCheckResponse scanItemBarcodeStockCheck(
        ItemBarcodeStockCheckScanRequest request);

    /**
     * 输入商品数量盘点
     *
     * @author henry.wang
     * @param request
     * @return
     */
    StockCheckResponse inputItemQtyStockCheck(
        ItemQtyStockCheckInputRequest request);

    /**
     * 箱盘点完成
     *
     * @author henry.wang
     * @param request
     * @return
     */
    ContainerFinishResponse finishContainer(ContainerFinishRequest request);

    /**
     * 漏盘商品查询
     *
     * @author henry.wang
     * @param request
     * @return
     */
    OmitCheckProductListQueryResponse queryOmitCheckProductList(
        OmitCheckProductListQueryRequest request);

    /**
     * 生成盘点装箱单表头
     *
     * @author henry.wang
     * @param request
     * @return
     */
    StockTakingConHDRCreateResponse createStockTakingConHDR(StockTakingConHDRCreateRequest request);

    /**
     * 箱重盘
     *
     * @author henry.wang
     * @param request
     * @return
     */
    ContainerRefreshResponse refreshContainer(ContainerRefreshRequest request);

    /**
     * 弃盘审核
     *
     * @author henry.wang
     * @param request
     * @return
     */
    StockCheckProductAbandonResponse abandonStockCheckProduct(
        StockCheckProductAbandonRequest request);

    /**
     * 初盘完成
     *
     * @author henry.wang
     * @param request
     * @return
     */
    StockCheckFirstFinishResponse finishStockCheckFirst(
        StockCheckFirstFinishRequest request);

    /**
     * 复盘完成
     *
     * @author henry.wang
     * @param request
     * @return
     */
    StockCheckSecondFinishResponse finishStockCheckSecond(
        StockCheckSecondFinishRequest request);

    /**
     * 盘点完成
     *
     * @author henry.wang
     * @param request
     * @return
     */
    StockCheckFinishResponse finishStockCheck(
        StockCheckFinishRequest request);

    /**
     * 盘点作废
     *
     * @author henry.wang
     * @param request
     * @return
     */
    StockCheckCancelResponse cancelStockCheck(
        StockCheckCancelRequest request);

    /**
     * 生成盘盈盘亏单
     *
     * @author henry.wang
     * @param request
     * @return
     */
    StockAdjustCreateResponse createStockAdjust(
        StockAdjustCreateRequest request);

    /**
     * 查询箱明细
     *
     * @author henry.wang
     * @param request
     * @return
     */
    ContainerProductDetailGetResponse getContainerProductDetail(
        ContainerProductDetailGetRequest request);

    /**
     * 盘盈盘亏单入账
     *
     * @author henry.wang
     * @param request
     * @return
     */
    StockAdjustAccountResponse accountStockAdjust(
        StockAdjustAccountRequest request);

    /**
     * 普通盘点入账消息处理
     *
     * @author henry.wang
     * @param request
     * @return
     */
    StockAdjustAccountProcessResponse processStockAdjustAccount(
        StockAdjustAccountProcessRequest request);

    /**
     * 生产盘点入账消息处理
     *
     * @author henry.wang
     * @param request
     * @return
     */
    AccountForProduceStockProcessResponse processAccountForProduceStock(
        AccountForProduceStockProcessRequest request);

    /**
     * 查询当前人盘点的货架列表
     *
     * @author henry.wang
     * @param request
     * @return
     */
    MyCheckContainerGetResponse getMyCheckContainer(MyCheckContainerGetRequest request);

    /**
     * @Description: 刷新商品清单
     * @author: henry.wang
     * @date: 2018/7/3 20:11
     **/
    TaskProListRefreshResponse refreshTaskProList(TaskProListRefreshRequest request);

    /**
     * 库存汇总调整生成盈亏单
     * @param request
     * @return
     */
    StockAdjustHzAuditResponse auditStockAdjustHz(StockAdjustHzAuditRequest request);

    /**
     * 查询指定日期之前的所有未入账的盈亏单
     *
     * @author henry.wang
     * @param request
     * @return
     */
    UnConfirmStockAdjustGetResponse getUnConfirmStockAdjust(UnConfirmStockAdjustGetRequest request);
    
    
    /**
	 * 
	 * @Description:根据盘点单号获取盘点单表头
	 * @param request
	 * @return
	 * @author: Andy
	 * @time: 2018年6月1日
	 */
	public StockadjustHdrGetResponse getStockadjustHdrByReservedNo(StockadjustHdrGetRequest request);

	
	/**
	 * 
	 * @Description:根据盘点单号获取盘点单表体
	 * @return
	 * @author: Andy
	 * @time: 2018年6月1日
	 */
	public StockadjustDtlGetResponse getStockadjustDtlByReservedNo(StockadjustDtlGetRequest request);

	/**
	 * @Description: 查询盈亏单带批次代销商品明细，用于核销代销商品款
	 * @author: henry.wang
	 * @date: 2018/6/6 20:34
	 **/
    StockadjustBatchDtlsForCheckConsignmentProductAccountFindResponse findStockadjustBatchDtlsForCheckConsignmentProductAccount(
        StockadjustBatchDtlsForCheckConsignmentProductAccountFindRequest request);
    
    /**
     * 
     * @Description:根据单号获取批次表首次供应商
     * @param request
     * @return
     * @author: Andy
     * @time: 2018年6月27日
     */
    public FirstSupplyUnitNumIdGetResponse getFirstSupplyUnitNumIdByReservedNo(FirstSupplyUnitNumIdGetRequest request);
}
