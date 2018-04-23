package com.ykcloud.soa.erp.api.so.service;

import com.ykcloud.soa.erp.api.so.request.DemandSaleStatisticGetRequest;
import com.ykcloud.soa.erp.api.so.request.DirectWayOpenDistDeliveryQtyGetRequest;
import com.ykcloud.soa.erp.api.so.request.DistributionOpenDistDeliveryQtyGetRequest;
import com.ykcloud.soa.erp.api.so.request.GroupSdApplyDtlGetRequest;
import com.ykcloud.soa.erp.api.so.request.ItemSaleInfoByItemNumIdAndOrderDateGetRequest;
import com.ykcloud.soa.erp.api.so.request.OpenBranchDeliveryQtyGetRequest;
import com.ykcloud.soa.erp.api.so.request.OrdSubUnitNumIdsForInTransitDepositGetRequest;
import com.ykcloud.soa.erp.api.so.request.ReturnApplyDtlGetRequest;
import com.ykcloud.soa.erp.api.so.request.ShopProductDailySellQtyGetRequest;
import com.ykcloud.soa.erp.api.so.request.SoBySoNumIdAndItemNumIdGetRequest;
import com.ykcloud.soa.erp.api.so.request.SoDtlQtyAndPackingQtyGetBySoNumIdAndItemIdRequest;
import com.ykcloud.soa.erp.api.so.request.SoDtlsForInTransitDepositGetRequest;
import com.ykcloud.soa.erp.api.so.request.SoHdrGetRequest;
import com.ykcloud.soa.erp.api.so.request.SoNumIdOneRequest;
import com.ykcloud.soa.erp.api.so.request.SoSettlementTypeGetRequest;
import com.ykcloud.soa.erp.api.so.request.SoStatusOfWlbcRequest;
import com.ykcloud.soa.erp.api.so.request.SupplyToReturnAmoutGetRequest;
import com.ykcloud.soa.erp.api.so.response.DemandSaleStatisticGetResponse;
import com.ykcloud.soa.erp.api.so.response.DirectWayOpenDistDeliveryQtyGetResponse;
import com.ykcloud.soa.erp.api.so.response.DistributionOpenDistDeliveryQtyGetResponse;
import com.ykcloud.soa.erp.api.so.response.GroupSdApplyDtlGetResponse;
import com.ykcloud.soa.erp.api.so.response.ItemSaleInfoByItemNumIdAndOrderDateGetResponse;
import com.ykcloud.soa.erp.api.so.response.OpenBranchDeliveryQtyGetResponse;
import com.ykcloud.soa.erp.api.so.response.OrdSubUnitNumIdsForInTransitDepositGetResponse;
import com.ykcloud.soa.erp.api.so.response.ReturnApplyDtlGetResponse;
import com.ykcloud.soa.erp.api.so.response.ShopProductDailySellQtyGetResponse;
import com.ykcloud.soa.erp.api.so.response.SoBySoNumIdAndItemNumIdGetResponse;
import com.ykcloud.soa.erp.api.so.response.SoDtlQtyAndPackingQtyGetBySoNumIdAndItemIdReponse;
import com.ykcloud.soa.erp.api.so.response.SoDtlsForInTransitDepositGetResponse;
import com.ykcloud.soa.erp.api.so.response.SoHdrGetResponse;
import com.ykcloud.soa.erp.api.so.response.SoNumIdOneResponse;
import com.ykcloud.soa.erp.api.so.response.SoSettlementTypeGetResonse;
import com.ykcloud.soa.erp.api.so.response.SoStatusOfWlbcResponse;
import com.ykcloud.soa.erp.api.so.response.SupplyToReturnAmoutGetResponse;
import com.ykcloud.soa.erp.api.wm.request.SoLockQtyByWlbcRequest;
import com.ykcloud.soa.erp.api.wm.response.SoLockQtyByWlbcResponse;


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
   
    
    
  //通过WLbc号与商品ID获取so_dtl随机一条，一半这边用limit
  	public SoNumIdOneResponse getSoNumIdOne(SoNumIdOneRequest request);
  	
  //通过soNumId,itemNumId获取该订单明细的需求数量已经已播数量(可以不传itemNumId)
  	public SoDtlQtyAndPackingQtyGetBySoNumIdAndItemIdReponse getSoDtlQtyAndPackingQtyBySoNumIdAndItemId(SoDtlQtyAndPackingQtyGetBySoNumIdAndItemIdRequest request);
  //根据订单号查询订单号头信息
  	public SoHdrGetResponse getSoHdrBySoNumId(SoHdrGetRequest request);
  	
  	
  	
  	/**
     * 通过订单号与商品号，查询订单明细
     * @param request
     * @return
     */
  	public SoBySoNumIdAndItemNumIdGetResponse getSoDtlBySoNumIdAndItemNumId(SoBySoNumIdAndItemNumIdGetRequest request);

    //获取退货申请单分组数据
    public GroupSdApplyDtlGetResponse getReturnApplyGroupList(GroupSdApplyDtlGetRequest request);
    //已审未退金额
    public SupplyToReturnAmoutGetResponse getSupplyToReturnAmout(SupplyToReturnAmoutGetRequest request);
    /** 
    * @Description: 获取退货申请单单身数据
    * @Author: fred.zhao
    * @Date: 2018/3/30 
    */ 
    ReturnApplyDtlGetResponse getReturnApplyDtlList(ReturnApplyDtlGetRequest request);
    //日销售门店商品销售数量及促销销售数量统计
    public ShopProductDailySellQtyGetResponse getShopProductDailySellQty(ShopProductDailySellQtyGetRequest request);
	//获取wlbc里所有订单的lockqty
    public SoLockQtyByWlbcResponse getSoLockQtyByWlbc(SoLockQtyByWlbcRequest request);

    //自动补货查询商品销售的相关信息
    public ItemSaleInfoByItemNumIdAndOrderDateGetResponse getItemSaleInfoByItemNumIdAndOrderDate(ItemSaleInfoByItemNumIdAndOrderDateGetRequest request);

    //check一个wlbc号下面所有的订单status是否为8(完全出库)
    public SoStatusOfWlbcResponse checkSoStatusOfWlbc(SoStatusOfWlbcRequest request);
    
    //根据sonumid获取该订单的销售方式，购销，代销，联销
    public SoSettlementTypeGetResonse getSoSettlementType(SoSettlementTypeGetRequest request);
    
	//直通分拨单在途入账,补货门店列表
	public OrdSubUnitNumIdsForInTransitDepositGetResponse getOrdSubUnitNumIdsForInTransitDeposit(
			OrdSubUnitNumIdsForInTransitDepositGetRequest request);
	
	//直通分拨单在途入账,明细列表
	public SoDtlsForInTransitDepositGetResponse getSoDtlsForInTransitDeposit(
			SoDtlsForInTransitDepositGetRequest request);


}
