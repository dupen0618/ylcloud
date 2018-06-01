package com.ykcloud.soa.erp.api.wm.service;

import com.ykcloud.soa.erp.api.wm.request.*;
import com.ykcloud.soa.erp.api.wm.response.*;
import com.ykcloud.soa.erp.api.wm.response.LossWorkconfirmResponse;
import com.ykcloud.soa.erp.api.wm.response.OpenWorkConfirmResponse;
import com.ykcloud.soa.erp.api.wm.response.OutOpenWorkConfirmResponse;
import com.ykcloud.soa.erp.api.wm.response.ProductInfoAndStockGetResponse;
import com.ykcloud.soa.erp.api.wm.response.WorkChangeConfirmResponse;
import com.ykcloud.soa.erp.api.wm.response.WorkConfirmAssembleResponse;
import com.ykcloud.soa.erp.api.wm.response.WorkLossCreateResponse;
import com.ykcloud.soa.erp.api.wm.response.ProductChangeGetResponse;

public interface WmWorkService {
	//获取商品信息+商品库存信息
	public ProductInfoAndStockGetResponse getProductInfoAndStock(ProductInfoAndStockGetRequest request);

	//查询转码商品
	public ProductChangeGetResponse getProductChange(ProductChangeRequest request);

	//拆解加工单入账
	public OpenWorkConfirmResponse confirmOpenWork(OpenWorkConfirmRequest request);

	/**
	 * @param @return
	 * @return WorkChangeConfirmResponse
	 * @Title: confirmWorkChange
	 * @Description: 转码加工单入账
	 */
	public WorkChangeConfirmResponse confirmWorkChange(WorkChangeConfirmRequest request);

	/**
	 * @param @param  request
	 * @param @return
	 * @return WorkConfirmAssembleResponse
	 * @Title: confirmAssembleWork
	 * @Description: 组装加工单入账
	 */
	public WorkConfirmAssembleResponse confirmAssembleWork(WorkConfirmAssembleRequest request);

	//委外加工单入账
	public OutOpenWorkConfirmResponse confirmOutOpenWork(OutOpenWorkConfirmRequest request);

	//生成报损单（内部方法）
	public WorkLossCreateResponse createWorkLossByWorkNumID(WorkLossCreateRequest request);

	//查询BOM加工的成品
	public WorkProductAndBomIDGetResponse getWorkProductAndBomID(WorkProductAndBomIDGetRequest request);

	
	//损溢单入账
	public LossWorkconfirmResponse confirmqueWorkLoss(LossWorkconfirmRequest request);


	//溢出转码入账
	public WorkLossChangeConfirmResponse confirmWorkLossChange(WorkLossChangeConfirmRequest request);
	
	//加工预入单
	public WorkVirtualConfirmResponse confirmVirtualWork(WorkVirtualConfirmRequest request);

	/**
	 * 以销定入商品日结处理
	 *
	 * @param request
	 * @return
	 * @author henry.wang
	 */
	SellDetermineInventoryByResponse bySellDetermineInventory(SellDetermineInventoryByRequest request);

	/**
	 * 
	 * @Description:根据损溢单号获取损溢单表头
	 * @param request
	 * @return
	 * @author: Andy
	 * @time: 2018年6月1日
	 */
	public LossNumIdByGetLossHdrResponse getlossHdrByLossNumId(LossNumIdByGetLossHdrRequest request);

	
	/**
	 * 
	 * @Description:根据损溢单号获取损溢单表体
	 * @param tenantNumId
	 * @param subUnitNumId
	 * @param dataSign
	 * @param lossNumId
	 * @return
	 * @author: Andy
	 * @time: 2018年6月1日
	 */
	public LossNumIdByGetLossDtlResponse getlossDtlByLossNumId(LossNumIdByGetLossDtlRequest request);

}
