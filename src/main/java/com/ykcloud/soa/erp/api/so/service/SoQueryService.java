package com.ykcloud.soa.erp.api.so.service;

import com.ykcloud.soa.erp.api.so.request.DemandSaleStatisticGetRequest;
import com.ykcloud.soa.erp.api.so.request.DirectWayOpenDistDeliveryQtyGetRequest;
import com.ykcloud.soa.erp.api.so.request.DistributionOpenDistDeliveryQtyGetRequest;
import com.ykcloud.soa.erp.api.so.request.OpenBranchDeliveryQtyGetRequest;
import com.ykcloud.soa.erp.api.so.request.SoByWlbcNumIdAndItemNumIdGetRequest;
import com.ykcloud.soa.erp.api.so.request.SoHdrGetBySoNumIdRequest;
import com.ykcloud.soa.erp.api.so.request.SoHdrGetRequest;
import com.ykcloud.soa.erp.api.so.response.DemandSaleStatisticGetResponse;
import com.ykcloud.soa.erp.api.so.response.DirectWayOpenDistDeliveryQtyGetResponse;
import com.ykcloud.soa.erp.api.so.response.DistributionOpenDistDeliveryQtyGetResponse;
import com.ykcloud.soa.erp.api.so.response.OpenBranchDeliveryQtyGetResponse;
import com.ykcloud.soa.erp.api.so.response.SoByWlbcNumIdAndItemNumIdGetResponse;
import com.ykcloud.soa.erp.api.so.response.SoHdrGetBySoNumIdResponse;
import com.ykcloud.soa.erp.api.so.response.SoHdrGetResponse;

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
    
  //通过波次号与商品号，查询订单信息
  	public SoByWlbcNumIdAndItemNumIdGetResponse getSoDtlByWlbcAndItemNumId(SoByWlbcNumIdAndItemNumIdGetRequest request);

  	//根据模糊订单号查询订单号
  	public SoHdrGetResponse getSoHdrBySoNumId(SoHdrGetRequest request);
  	
  	//用订单好查询订单HDR
  	public SoHdrGetBySoNumIdResponse getSoHdrBySoNumId(SoHdrGetBySoNumIdRequest request);
  	
}
