package com.ykcloud.soa.erp.api.wm.service;
import com.ykcloud.soa.erp.api.wm.request.DirectReceiptUpdateRequest;
import com.ykcloud.soa.erp.api.wm.request.ReceiptDtlUpdateRequest;
import com.ykcloud.soa.erp.api.wm.request.ReceiptFinishRequest;
import com.ykcloud.soa.erp.api.wm.request.ReceiptForGenerateDirectWayDistributionSoGetRequest;
import com.ykcloud.soa.erp.api.wm.request.ReceiptGenerateRequest;
import com.ykcloud.soa.erp.api.wm.request.ReceiptHdrGetRequest;
import com.ykcloud.soa.erp.api.wm.request.ReceiptProduceDateUpdateRequest;
import com.ykcloud.soa.erp.api.wm.request.ReceiptSupConfirmDateAndStatusNumIdByPoNumIdRequest;
import com.ykcloud.soa.erp.api.wm.request.ShopHaveInventoryMaxBatchPriceGetRequest;
import com.ykcloud.soa.erp.api.wm.request.ShopLastBatchPriceGetRequest;
import com.ykcloud.soa.erp.api.wm.request.ShopProductLastReceiveDateGetRequest;
import com.ykcloud.soa.erp.api.wm.request.UpdateReceiptAccountFinishRequest;
import com.ykcloud.soa.erp.api.wm.response.DirectReceiptUpdateResponse;
import com.ykcloud.soa.erp.api.wm.response.ReceiptDtlUpdateResponse;
import com.ykcloud.soa.erp.api.wm.response.ReceiptFinishRsponse;
import com.ykcloud.soa.erp.api.wm.response.ReceiptForGenerateDirectWayDistributionSoGetResponse;
import com.ykcloud.soa.erp.api.wm.response.ReceiptGenerateResponse;
import com.ykcloud.soa.erp.api.wm.response.ReceiptHdrGetResponse;
import com.ykcloud.soa.erp.api.wm.response.ReceiptProduceDateUpdateResponse;
import com.ykcloud.soa.erp.api.wm.response.ReceiptSupConfirmDateAndStatusNumIdByPoNumIdResponse;
import com.ykcloud.soa.erp.api.wm.response.ShopHaveInventoryMaxBatchPriceGetResponse;
import com.ykcloud.soa.erp.api.wm.response.ShopLastBatchPriceGetResponse;
import com.ykcloud.soa.erp.api.wm.response.ShopProductLastReceiveDateGetResponse;
import com.ykcloud.soa.erp.api.wm.response.UpdateReceiptAccountFinishResponse;

public interface WmReceiptService {
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
	 * @param 
	 * @return
	 */
	public ReceiptSupConfirmDateAndStatusNumIdByPoNumIdResponse getReceiptSupConfirmDateAndStatusNumIdByPoNumId(
			ReceiptSupConfirmDateAndStatusNumIdByPoNumIdRequest request);

	
	/**
	 * 产生验收单
	 * @author tz.x
	 * @date 2018年3月27日上午11:47:52
	 * @param 
	 * @return
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
	public ReceiptHdrGetResponse getReceiptHdr(ReceiptHdrGetRequest request);

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
	//收货完成
	public ReceiptFinishRsponse finishReceipt(ReceiptFinishRequest request);

    //取门店有库存最高批次价格，用于直送、直通供应商退货
	public ShopHaveInventoryMaxBatchPriceGetResponse getShopHaveInventoryMaxBatchPrice(ShopHaveInventoryMaxBatchPriceGetRequest request);
	
	/**
	 * @Description:收货完成收尾:1.更新采购履行数量,更新采购单完成;2.产生内部差异单3.更新验收单完成
	 * @Auther hank
	 * @Date 2018-4-16
	 * @param subUnitNumId,reservedNo,userNumId,internalSign
	 * @return void
	 */	
	public UpdateReceiptAccountFinishResponse finishUpdateReceiptAccount(UpdateReceiptAccountFinishRequest request);
}
