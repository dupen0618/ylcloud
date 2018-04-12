package com.ykcloud.soa.erp.api.wm.service;

import com.ykcloud.soa.erp.api.wm.request.ContainerFinishRequest;
import com.ykcloud.soa.erp.api.wm.request.ContainerRefreshRequest;
import com.ykcloud.soa.erp.api.wm.request.ItemBarcodeScanRequest;
import com.ykcloud.soa.erp.api.wm.request.ItemBarcodeStockCheckScanRequest;
import com.ykcloud.soa.erp.api.wm.request.ItemQtyStockCheckInputRequest;
import com.ykcloud.soa.erp.api.wm.request.OmitCheckProductListQueryRequest;
import com.ykcloud.soa.erp.api.wm.request.StockCheckCancelRequest;
import com.ykcloud.soa.erp.api.wm.request.StockCheckFinishRequest;
import com.ykcloud.soa.erp.api.wm.request.StockCheckFirstFinishRequest;
import com.ykcloud.soa.erp.api.wm.request.StockCheckPlanAuditRequest;
import com.ykcloud.soa.erp.api.wm.request.StockCheckProductAbandonRequest;
import com.ykcloud.soa.erp.api.wm.request.StockCheckSecondFinishRequest;
import com.ykcloud.soa.erp.api.wm.request.StockTakingConHDRCreateRequest;
import com.ykcloud.soa.erp.api.wm.request.StockTakingConHDRGetRequest;
import com.ykcloud.soa.erp.api.wm.request.StockTakingTaskHDRGetRequest;
import com.ykcloud.soa.erp.api.wm.response.ContainerFinishResponse;
import com.ykcloud.soa.erp.api.wm.response.ContainerRefreshResponse;
import com.ykcloud.soa.erp.api.wm.response.ItemBarcodeScanResponse;
import com.ykcloud.soa.erp.api.wm.response.OmitCheckProductListQueryResponse;
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

/**
 * @Description: 盘点服务
 * @author: henry.wang
 * @date: 2018/3/27 10:54
 **/
public interface WmStockCheckService {

    /**
     * 审核盘点计划
     *
     * @param request
     * @return
     */
    StockCheckPlanAuditResponse auditStockCheckPlan(StockCheckPlanAuditRequest request);

    /**
     * 查询盘点计划单表头信息
     *
     * @param request
     * @return
     */
    StockTakingTaskHDRGetResponse getStockTakingTaskHDR(StockTakingTaskHDRGetRequest request);

    /**
     * 查询盘点装箱单表头信息
     *
     * @param request
     * @return
     */
    StockTakingConHDRGetResponse getStockTakingConHDR(StockTakingConHDRGetRequest request);

    /**
     * 扫码商品条码返回商品信息
     *
     * @param request
     * @return
     */
    ItemBarcodeScanResponse scanItemBarcode(
        ItemBarcodeScanRequest request);

    /**
     * 扫码商品条码盘点
     *
     * @param request
     * @return
     */
    StockCheckResponse scanItemBarcodeStockCheck(
        ItemBarcodeStockCheckScanRequest request);

    /**
     * 输入商品数量盘点
     *
     * @param request
     * @return
     */
    StockCheckResponse inputItemQtyStockCheck(
        ItemQtyStockCheckInputRequest request);

    /**
     * 箱盘点完成
     *
     * @param request
     * @return
     */
    ContainerFinishResponse finishContainer(ContainerFinishRequest request);

    /**
     * 漏盘商品查询
     *
     * @param request
     * @return
     */
    OmitCheckProductListQueryResponse queryOmitCheckProductList(
        OmitCheckProductListQueryRequest request);

    /**
     * 生成盘点装箱单表头
     *
     * @param request
     * @return
     */
    StockTakingConHDRCreateResponse createStockTakingConHDR(StockTakingConHDRCreateRequest request);

    /**
     * 箱重盘
     *
     * @param request
     * @return
     */
    ContainerRefreshResponse refreshContainer(ContainerRefreshRequest request);

    /**
     * 弃盘审核
     *
     * @param request
     * @return
     */
    StockCheckProductAbandonResponse abandonStockCheckProduct(
        StockCheckProductAbandonRequest request);

    /**
     * 初盘完成
     *
     * @param request
     * @return
     */
    StockCheckFirstFinishResponse finishStockCheckFirst(
        StockCheckFirstFinishRequest request);

    /**
     * 复盘完成
     *
     * @param request
     * @return
     */
    StockCheckSecondFinishResponse finishStockCheckSecond(
        StockCheckSecondFinishRequest request);

    /**
     * 盘点完成
     *
     * @param request
     * @return
     */
    StockCheckFinishResponse finishStockCheck(
        StockCheckFinishRequest request);

    /**
     * 盘点作废
     *
     * @param request
     * @return
     */
    StockCheckCancelResponse cancelStockCheck(
        StockCheckCancelRequest request);
}
