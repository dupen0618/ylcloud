package com.ykcloud.soa.erp.api.wm.service;

import com.ykcloud.soa.erp.api.scm.request.ReceiptGenerateRequest;
import com.ykcloud.soa.erp.api.scm.response.ReceiptGenerateResponse;
import com.ykcloud.soa.erp.api.wm.request.ReceiptForGenerateDirectWayDistributionSoGetRequest;
import com.ykcloud.soa.erp.api.wm.request.ReceiptSupConfirmDateAndStatusNumIdByPoNumIdRequest;
import com.ykcloud.soa.erp.api.wm.request.ShopProductLastReceiveDateGetRequest;
import com.ykcloud.soa.erp.api.wm.response.ReceiptForGenerateDirectWayDistributionSoGetResponse;
import com.ykcloud.soa.erp.api.wm.response.ReceiptSupConfirmDateAndStatusNumIdByPoNumIdResponse;
import com.ykcloud.soa.erp.api.wm.response.ShopProductLastReceiveDateGetResponse;

public interface WmReceiptService {
	//查询商品最后收货日期
	public ShopProductLastReceiveDateGetResponse getShopProductLastReceiveDate(ShopProductLastReceiveDateGetRequest request);

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

}
