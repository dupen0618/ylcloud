package com.ykcloud.soa.erp.api.wm.service;
import com.ykcloud.soa.erp.api.wm.request.ReceiptBatchDtlSeriesForRegenerateReceiptGetRequest;
import com.ykcloud.soa.erp.api.wm.request.ReceiptBatchDtlNotBalanceCountGetRequest;
import com.ykcloud.soa.erp.api.wm.request.ReciptListForGenerateBalanceGetRequest;
import com.ykcloud.soa.erp.api.wm.request.CiteQtyForAuditApprovalReturnOrderByBuyerWriteoffRequest;
import com.ykcloud.soa.erp.api.wm.request.CountDtlForReturnCiteDtlGetRequest;
import com.ykcloud.soa.erp.api.wm.request.DirectReceiptUpdateRequest;
import com.ykcloud.soa.erp.api.wm.request.MessageForDepositInTransitAndRegenerateDirectWaySoSendReuqest;
import com.ykcloud.soa.erp.api.wm.request.ProductByBarcodeForReceiptGetRequest;
import com.ykcloud.soa.erp.api.wm.request.SupBlanceDtlByReceiptBatchDtlSeriesGetRequest;
import com.ykcloud.soa.erp.api.wm.request.ReceiptHdrStatusNumIdUpdateRequest;
import com.ykcloud.soa.erp.api.wm.request.ReceiptDtlUpdateRequest;
import com.ykcloud.soa.erp.api.wm.request.ReceiptFinishRequest;
import com.ykcloud.soa.erp.api.wm.request.ReceiptForGenerateDirectWayDistributionSoGetRequest;
import com.ykcloud.soa.erp.api.wm.request.ReceiptGenerateRequest;
import com.ykcloud.soa.erp.api.wm.request.ReceiptHdrForCancelExpirePoGetRequest;
import com.ykcloud.soa.erp.api.wm.request.ReceiptHdrFuzzyGetRequest;
import com.ykcloud.soa.erp.api.wm.request.ReceiptProduceDateUpdateRequest;
import com.ykcloud.soa.erp.api.wm.request.ReceiptSupConfirmDateAndStatusNumIdByPoNumIdRequest;
import com.ykcloud.soa.erp.api.wm.request.ReturnCiteDtlByCiteProductDeleteRequest;
import com.ykcloud.soa.erp.api.wm.request.ReturnCiteDtlSaveRequest;
import com.ykcloud.soa.erp.api.wm.request.ReverseShipHdrFuzzyGetRequest;
import com.ykcloud.soa.erp.api.wm.request.ShopHaveInventoryMaxBatchPriceGetRequest;
import com.ykcloud.soa.erp.api.wm.request.ShopLastBatchPriceGetRequest;
import com.ykcloud.soa.erp.api.wm.request.ShopProductLastReceiveDateGetRequest;
import com.ykcloud.soa.erp.api.wm.request.ReceiptBatchDtlStatusNumIdUpdateRequest;
import com.ykcloud.soa.erp.api.wm.request.SupplyUnitNumIdForPurchaseSaleGetRequest;
import com.ykcloud.soa.erp.api.wm.request.UpdateReceiptAccountFinishRequest;
import com.ykcloud.soa.erp.api.wm.response.ReceiptBatchDtlSeriesForRegenerateReceiptGetResponse;
import com.ykcloud.soa.erp.api.wm.response.ReceiptBatchDtlNotBalanceCountGetResponse;
import com.ykcloud.soa.erp.api.wm.response.ReciptListForGenerateBalanceGetResponse;
import com.ykcloud.soa.erp.api.wm.response.CiteQtyForAuditApprovalReturnOrderByBuyerWriteoffResponse;
import com.ykcloud.soa.erp.api.wm.response.CountDtlForReturnCiteDtlGetResponse;
import com.ykcloud.soa.erp.api.wm.response.DirectReceiptUpdateResponse;
import com.ykcloud.soa.erp.api.wm.response.MessageForDepositInTransitAndRegenerateDirectWaySoSendRespnse;
import com.ykcloud.soa.erp.api.wm.response.ProductByBarcodeForReceiptGetResponse;
import com.ykcloud.soa.erp.api.wm.response.SupBlanceDtlByReceiptBatchDtlSeriesGetResponse;
import com.ykcloud.soa.erp.api.wm.response.ReceiptHdrStatusNumIdUpdateResponse;
import com.ykcloud.soa.erp.api.wm.response.ReceiptDtlUpdateResponse;
import com.ykcloud.soa.erp.api.wm.response.ReceiptFinishRsponse;
import com.ykcloud.soa.erp.api.wm.response.ReceiptForGenerateDirectWayDistributionSoGetResponse;
import com.ykcloud.soa.erp.api.wm.response.ReceiptGenerateResponse;
import com.ykcloud.soa.erp.api.wm.response.ReceiptHdrForCancelExpirePoGetResponse;
import com.ykcloud.soa.erp.api.wm.response.ReceiptHdrFuzzyGetResponse;
import com.ykcloud.soa.erp.api.wm.response.ReceiptProduceDateUpdateResponse;
import com.ykcloud.soa.erp.api.wm.response.ReceiptSupConfirmDateAndStatusNumIdByPoNumIdResponse;
import com.ykcloud.soa.erp.api.wm.response.ReturnCiteDtlByCiteProductDeleteResponse;
import com.ykcloud.soa.erp.api.wm.response.ReturnCiteDtlSaveResponse;
import com.ykcloud.soa.erp.api.wm.response.ReverseShipHdrFuzzyGetResponse;
import com.ykcloud.soa.erp.api.wm.response.ShopHaveInventoryMaxBatchPriceGetResponse;
import com.ykcloud.soa.erp.api.wm.response.ShopLastBatchPriceGetResponse;
import com.ykcloud.soa.erp.api.wm.response.ShopProductLastReceiveDateGetResponse;
import com.ykcloud.soa.erp.api.wm.response.ReceiptBatchDtlStatusNumIdUpdateResponse;
import com.ykcloud.soa.erp.api.wm.response.SupplyUnitNumIdForPurchaseSaleGetResponse;
import com.ykcloud.soa.erp.api.wm.response.UpdateReceiptAccountFinishResponse;

public interface WmReceiptService {
	
	/**
	 * 根据验收单号查询单据状态
	 * @author tz.x
	 * @date 2018年5月11日下午4:54:03
	 */
	public ReceiptHdrForCancelExpirePoGetResponse getReceiptHdrForCancelExpirePo(ReceiptHdrForCancelExpirePoGetRequest request);
	
	// 查询商品最后收货日期
	public ShopProductLastReceiveDateGetResponse getShopProductLastReceiveDate(
			ShopProductLastReceiveDateGetRequest request);

	// 为产生分拨单获取验收单信息
	public ReceiptForGenerateDirectWayDistributionSoGetResponse getReceiptForGenerateDirectWayDistributionSo(
			ReceiptForGenerateDirectWayDistributionSoGetRequest request);

	
	/**
	 * 取指定采购单的供应商确认日期及验收入库汇总单状态
	 * @author tz.x
	 * @date 2018年3月26日下午2:03:24
	 */
	public ReceiptSupConfirmDateAndStatusNumIdByPoNumIdResponse getReceiptSupConfirmDateAndStatusNumIdByPoNumId(
			ReceiptSupConfirmDateAndStatusNumIdByPoNumIdRequest request);

	
	/**
	 * 产生验收单
	 * @author tz.x
	 * @date 2018年3月27日上午11:47:52
	 */
	public ReceiptGenerateResponse generateReceipt(ReceiptGenerateRequest request);


    //查询门店最新批次库存价格，用于配送补货
	public ShopLastBatchPriceGetResponse getShopLastBatchPrice(ShopLastBatchPriceGetRequest request);
	/**
	 *@Description: 查询验收单 (6位模糊查询，直通到仓需判断订单状态是否为发货方已确认)
	 *@Auther hank
	 *@Date 2018-4-9
	 *@param request{subUnitNumId,reservedNo,userNumId}
	 *@return response{reservedNo,traySerlno,traySerlnoLable,trayConfirmQty,receiptQty,receiptConfirmQty}
	 */
	public ReceiptHdrFuzzyGetResponse getReceiptHdrFuzzy(ReceiptHdrFuzzyGetRequest request);


	//过期控制 证照控制
	public ReceiptProduceDateUpdateResponse updateReceiptProduceDate(ReceiptProduceDateUpdateRequest request);
	// 更新收货数量
	public ReceiptDtlUpdateResponse updateReceiptDtl(ReceiptDtlUpdateRequest request);
	
	public ReceiptDtlUpdateResponse updateReceiptDtlWithNoTransaction(ReceiptDtlUpdateRequest request);
	/**
	 * 一键收货
	 * @param request
	 * @return
	 */
	public DirectReceiptUpdateResponse updateDirectReceipt(DirectReceiptUpdateRequest request);
	/**
	 * 
	 * @description一键收货  不含TCC
	 * @author gaoyun.shen
	 * @date: 2018年4月27日 下午2:37:37
	 * @param 
	 * @return
	 */
	public DirectReceiptUpdateResponse updateDirectReceiptWithNoTransaction(DirectReceiptUpdateRequest request);
	//收货完成
	public ReceiptFinishRsponse finishReceipt(ReceiptFinishRequest request);

    //取门店有库存最高批次价格，用于直送、直通供应商退货
	public ShopHaveInventoryMaxBatchPriceGetResponse getShopHaveInventoryMaxBatchPrice(ShopHaveInventoryMaxBatchPriceGetRequest request);
	
	/**
	 * @Description:收货完成收尾:1.更新采购履行数量,更新采购单完成;2.产生内部差异单3.更新验收单完成
	 * @Auther hank
	 * @Date 2018-4-16
	 * @param request{subUnitNumId,reservedNo,userNumId,internalSign}
	 * @return response{code,message}
	 */	
	public UpdateReceiptAccountFinishResponse finishUpdateReceiptAccount(UpdateReceiptAccountFinishRequest request);
	
	/**
	 *@Description: 6位模糊查询负出库单 
	 *@Auther hank
	 *@Date 2018-4-19
	 *@param request{subUnitNumId,reservedNo}
	 *@return response{code,message,reservedNo,traySerlno,traySerlnoLable}
	 */
	public ReverseShipHdrFuzzyGetResponse getReverseShipHdrFuzzy(ReverseShipHdrFuzzyGetRequest request);

	//保存验收单/负出库单到单号引用表中
	public ReturnCiteDtlSaveResponse saveReturnCiteDtl(ReturnCiteDtlSaveRequest request);

	//从单号引用表中删除验收单和负出库单
	public ReturnCiteDtlByCiteProductDeleteResponse deleteReturnCiteDtlByCiteProduct(ReturnCiteDtlByCiteProductDeleteRequest request);

	//退供应商引用负出库单和验收单核销
	public CiteQtyForAuditApprovalReturnOrderByBuyerWriteoffResponse writeoffCiteQtyForAuditApprovalReturnOrderByBuyer(CiteQtyForAuditApprovalReturnOrderByBuyerWriteoffRequest request);
	
	//发送补货在途数量入账及短收重新产生直通分拨单消息
	public MessageForDepositInTransitAndRegenerateDirectWaySoSendRespnse sendMessageForDepositInTransitAndRegenerateDirectWaySo(
		MessageForDepositInTransitAndRegenerateDirectWaySoSendReuqest request);	

	//查询引用明细表体
	public CountDtlForReturnCiteDtlGetResponse getCountDtlForReturnCiteDtl(CountDtlForReturnCiteDtlGetRequest request);

	/**
	 * 
	 * @description 验收入库根据条码获取商品信息
	 * @author gaoyun.shen
	 * @date: 2018年5月11日 下午2:39:20
	 * @param 
	 * @return
	 */
	public ProductByBarcodeForReceiptGetResponse getProductByBarcode(ProductByBarcodeForReceiptGetRequest  productByBarcodeGetRequest);

	//验收入库获取可结算数据
	public ReciptListForGenerateBalanceGetResponse getReciptListForGenerateBalance(ReciptListForGenerateBalanceGetRequest request);
    //修改验收入库批次表体状态
	public ReceiptBatchDtlStatusNumIdUpdateResponse updateReceiptBatchDtlStatusNumId(ReceiptBatchDtlStatusNumIdUpdateRequest request);
	//修改验收入库表头状态
	public ReceiptHdrStatusNumIdUpdateResponse updateReceiptHdrStatusNumId(ReceiptHdrStatusNumIdUpdateRequest request);
    //根据验收入库批次行号
	public SupBlanceDtlByReceiptBatchDtlSeriesGetResponse getSupBlanceDtlByReceiptBatchDtlSeries(SupBlanceDtlByReceiptBatchDtlSeriesGetRequest request);
	//查询行号等信息
	public ReceiptBatchDtlSeriesForRegenerateReceiptGetResponse getReceiptBatchDtlSeriesForRegenerateReceipt(ReceiptBatchDtlSeriesForRegenerateReceiptGetRequest request);
	//查询没有结算的数量
	public ReceiptBatchDtlNotBalanceCountGetResponse getReceiptBatchDtlNotBalanceCount(ReceiptBatchDtlNotBalanceCountGetRequest request);
	//购销没有结算的供应商
	public SupplyUnitNumIdForPurchaseSaleGetResponse getSupplyUnitNumIdForPurchaseSale(SupplyUnitNumIdForPurchaseSaleGetRequest request);
}
