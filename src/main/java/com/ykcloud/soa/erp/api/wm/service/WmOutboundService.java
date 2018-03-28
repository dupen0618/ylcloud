package com.ykcloud.soa.erp.api.wm.service;

import com.ykcloud.soa.erp.api.wm.request.GoodsOutboundGetRequest;
import com.ykcloud.soa.erp.api.wm.response.GoodsOutboundGetResponse;

//入库服务
public interface WmOutboundService {

	//匹配订单号
	public GoodsOutboundGetResponse getSoNumId(GoodsOutboundGetRequest request);
	//获取商品信息带出客户门店
	public GoodsOutboundGetResponse getProductInfo(GoodsOutboundGetRequest request);
	//生成托盘，创建出库装箱单
	public GoodsOutboundGetResponse createShipContainerHdr(GoodsOutboundGetRequest request);
	//更新订单装箱数量、产生出库装箱单不到批次明细
	public GoodsOutboundGetResponse updateOrderPackingQty(GoodsOutboundGetRequest request);
	//封箱或者封托
	public GoodsOutboundGetResponse finishShipContainerHdr(GoodsOutboundGetRequest request);
	//播种完成
	public GoodsOutboundGetResponse finishPacking(GoodsOutboundGetRequest request);
}
