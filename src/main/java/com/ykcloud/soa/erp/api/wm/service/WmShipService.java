package com.ykcloud.soa.erp.api.wm.service;

import com.ykcloud.soa.erp.api.wm.request.WmContainerHdrCreateRequest;
import com.ykcloud.soa.erp.api.wm.request.WmDataByBarcodeGetRequest;
import com.ykcloud.soa.erp.api.wm.request.WmDataGetDataByBarcodeAndSoNumIdRequest;
import com.ykcloud.soa.erp.api.wm.request.WmFinishShipContainerHdrRequest;
import com.ykcloud.soa.erp.api.wm.request.WmFinishSoPackingRequest;
import com.ykcloud.soa.erp.api.wm.request.WmQuerySoAndContainerRequest;
import com.ykcloud.soa.erp.api.wm.request.WmScanShipContainerRequest;
import com.ykcloud.soa.erp.api.wm.request.WmShipDtlWithNoBatchUpdateRequest;
import com.ykcloud.soa.erp.api.wm.request.WmShipFinishRequest;
import com.ykcloud.soa.erp.api.wm.request.WmShipGetRequest;
import com.ykcloud.soa.erp.api.wm.request.WmSoHdrGetRequest;
import com.ykcloud.soa.erp.api.wm.request.WmWlBcHdrGetRequest;
import com.ykcloud.soa.erp.api.wm.request.WmWlbcHdrCreateRequest;
import com.ykcloud.soa.erp.api.wm.request.WmfinishPackingRequest;
import com.ykcloud.soa.erp.api.wm.response.WmContainerHdrCreateResponse;
import com.ykcloud.soa.erp.api.wm.response.WmDataByBarcodeGetResponse;
import com.ykcloud.soa.erp.api.wm.response.WmDataGetDataByBarcodeAndSoNumIdResponse;
import com.ykcloud.soa.erp.api.wm.response.WmFinishShipContainerHdrResponse;
import com.ykcloud.soa.erp.api.wm.response.WmFinishSoPackingResponse;
import com.ykcloud.soa.erp.api.wm.response.WmQuerySoAndContainerResponse;
import com.ykcloud.soa.erp.api.wm.response.WmScanShipContainerHdrResponse;
import com.ykcloud.soa.erp.api.wm.response.WmShipDtlWithNoBatchUpdateResponse;
import com.ykcloud.soa.erp.api.wm.response.WmShipFinishResponse;
import com.ykcloud.soa.erp.api.wm.response.WmShipGetResponse;
import com.ykcloud.soa.erp.api.wm.response.WmSoHdrGetResponse;
import com.ykcloud.soa.erp.api.wm.response.WmWlBcHdrGetResponse;
import com.ykcloud.soa.erp.api.wm.response.WmWlbcHdrCreateResponse;
import com.ykcloud.soa.erp.api.wm.response.WmfinishPackingResponse;


public interface WmShipService {

		//后六位模糊查询波次号
		public WmWlBcHdrGetResponse getWlbc(WmWlBcHdrGetRequest request);
		
		//扫描商品条码
		public WmDataByBarcodeGetResponse getWlbcProductByBarcode(WmDataByBarcodeGetRequest request);
		
		//创建出库托盘
		public WmContainerHdrCreateResponse createShipContainer(WmContainerHdrCreateRequest request);
		
		//查询出库装箱单(soNumId,containerSerlno)
		public WmQuerySoAndContainerResponse getShipContainer(WmQuerySoAndContainerRequest request);
		
		//播种动作更新订单数据
		public WmShipDtlWithNoBatchUpdateResponse  updateShipPacking(WmShipDtlWithNoBatchUpdateRequest request);
		
		//public void updateShipContainerDtlWithNoBatch(Long tenantNumId, Long dataSign, Long subUnitNumId, Date orderDate, Double bzNum, SoHdr soHdr, SoDtl soDtl,Long containerSerlno);
		
		//public void updateShipContainerLab(Long tenantNumId,Long dataSign,Long subUnitNumId,Date orderDate,Double bzNum,Long containerSerlno,Long solineId,Long cancelSign);
		
		//装箱完成
		public WmFinishShipContainerHdrResponse finishShipContainer(WmFinishShipContainerHdrRequest request);
		
		//播种完成
		public WmFinishSoPackingResponse finishWlbcPacking(WmFinishSoPackingRequest requst);
		
		//模糊查询订单号，如果该订单没有波次号，那么自动生成该波次
		public WmSoHdrGetResponse getShipSo(WmSoHdrGetRequest request);
		
		//装箱复核扫描条码获取订单信息
		public WmDataGetDataByBarcodeAndSoNumIdResponse getShipSoProductByBarcode(WmDataGetDataByBarcodeAndSoNumIdRequest request);
		
		//订单装箱完成
		public WmfinishPackingResponse finishSoPacking(WmfinishPackingRequest request);
		
		//创建波次单头
		public WmWlbcHdrCreateResponse createWlbc(WmWlbcHdrCreateRequest request);
		
		//获取交接单号
		public WmShipGetResponse createShipByContainer(WmShipGetRequest request);
		
		//扫装箱单产生交接单
		public WmScanShipContainerHdrResponse scanShipContainer(WmScanShipContainerRequest request);
		
		//出库完成
		public WmShipFinishResponse finishShip(WmShipFinishRequest request);
		
		//SO订单出库
}
