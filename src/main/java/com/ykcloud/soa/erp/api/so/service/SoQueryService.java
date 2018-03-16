package com.ykcloud.soa.erp.api.so.service;

import com.ykcloud.soa.erp.api.scm.request.ProductDemandQtyGetRequest;
import com.ykcloud.soa.erp.api.so.request.DemandSaleStatisticGetRequest;
import com.ykcloud.soa.erp.api.so.request.DirectWayOpenDistDeliveryQtyGetRequest;
import com.ykcloud.soa.erp.api.so.request.DistributionOpenDistDeliveryQtyGetRequest;
import com.ykcloud.soa.erp.api.so.request.OpenBranchDeliveryQtyGetRequest;
import com.ykcloud.soa.erp.api.so.response.DemandSaleStatisticGetResponse;
import com.ykcloud.soa.erp.api.so.response.DirectWayOpenDistDeliveryQtyGetResponse;
import com.ykcloud.soa.erp.api.so.response.DistributionOpenDistDeliveryQtyGetResponse;
import com.ykcloud.soa.erp.api.so.response.OpenBranchDeliveryQtyGetResponse;

//查询分仓在途数的接口,以及查询销售的信息
public interface SoQueryService {
	//从数据库中查询在途分仓数
	public OpenBranchDeliveryQtyGetResponse   getOpenBranchDeliveryQty(OpenBranchDeliveryQtyGetRequest request);
	//仓库配送数量    直通方式
    public DirectWayOpenDistDeliveryQtyGetResponse getDirectWayOpenDistDeliveryQty(DirectWayOpenDistDeliveryQtyGetRequest request);
	//仓库配送数量  配送方式
    public DistributionOpenDistDeliveryQtyGetResponse getDistributionOpenDistDeliveryQty(DistributionOpenDistDeliveryQtyGetRequest request);
    //获得商品销售方面的信息
    public DemandSaleStatisticGetResponse getDemandSaleStatistic(DemandSaleStatisticGetRequest request);
}
