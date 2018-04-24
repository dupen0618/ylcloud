package com.ykcloud.soa.erp.api.wm.service;

import com.ykcloud.soa.erp.api.wm.request.ReceiptBudCreateRequest;
import com.ykcloud.soa.erp.api.wm.request.ReverseReceiptBusinessAccountProcessRequest;
import com.ykcloud.soa.erp.api.wm.request.ReverseReceiptCreateByContainerRequest;
import com.ykcloud.soa.erp.api.wm.request.ReverseReceiptDtlUpdateRequest;
import com.ykcloud.soa.erp.api.wm.request.ReverseReceiptFiAccountProcessRequest;
import com.ykcloud.soa.erp.api.wm.request.ReverseReceiptFinishRequest;
import com.ykcloud.soa.erp.api.wm.request.ReverseReceiptScanContainerRequest;
import com.ykcloud.soa.erp.api.wm.request.ReverseReceiptShipFinishRequest;
import com.ykcloud.soa.erp.api.wm.request.ShipBusinessAccountProcessRequest;
import com.ykcloud.soa.erp.api.wm.request.ShipFiAccountProcessRequest;
import com.ykcloud.soa.erp.api.wm.request.ShipForMaterialIssueBackGenerateRequest;
import com.ykcloud.soa.erp.api.wm.request.SoShipFinishRequest;
import com.ykcloud.soa.erp.api.wm.request.WmAllotWithShipRequest;
import com.ykcloud.soa.erp.api.wm.request.WmContainerHdrCreateRequest;
import com.ykcloud.soa.erp.api.wm.request.WmDataByBarcodeGetRequest;
import com.ykcloud.soa.erp.api.wm.request.WmDataGetDataByBarcodeAndSoNumIdRequest;
import com.ykcloud.soa.erp.api.wm.request.WmFinishShipContainerHdrRequest;
import com.ykcloud.soa.erp.api.wm.request.WmFinishSoPackingRequest;
import com.ykcloud.soa.erp.api.wm.request.WmQuerySoAndContainerRequest;
import com.ykcloud.soa.erp.api.wm.request.WmRfFinishOneStepRequest;
import com.ykcloud.soa.erp.api.wm.request.WmScanShipContainerRequest;
import com.ykcloud.soa.erp.api.wm.request.WmShipDtlWithNoBatchUpdateRequest;
import com.ykcloud.soa.erp.api.wm.request.WmShipFinishRequest;
import com.ykcloud.soa.erp.api.wm.request.WmShipGetRequest;
import com.ykcloud.soa.erp.api.wm.request.WmSoHdrGetRequest;
import com.ykcloud.soa.erp.api.wm.request.WmWlBcHdrGetRequest;
import com.ykcloud.soa.erp.api.wm.request.WmWlbcHdrCreateRequest;
import com.ykcloud.soa.erp.api.wm.request.WmfinishPackingRequest;
import com.ykcloud.soa.erp.api.wm.response.ReceiptBudCreateResponse;
import com.ykcloud.soa.erp.api.wm.response.ReverseReceiptBusinessAccountProcessResponse;
import com.ykcloud.soa.erp.api.wm.response.ReverseReceiptCreateByContainerRespone;
import com.ykcloud.soa.erp.api.wm.response.ReverseReceiptDtlUpdateReponse;
import com.ykcloud.soa.erp.api.wm.response.ReverseReceiptFiAccountProcessResponse;
import com.ykcloud.soa.erp.api.wm.response.ReverseReceiptFinishResponse;
import com.ykcloud.soa.erp.api.wm.response.ReverseReceiptScanContainerResponse;
import com.ykcloud.soa.erp.api.wm.response.ReverseReceiptShipFinishResponse;
import com.ykcloud.soa.erp.api.wm.response.ShipBusinessAccountProcessResponse;
import com.ykcloud.soa.erp.api.wm.response.ShipFiAccountProcessResponse;
import com.ykcloud.soa.erp.api.wm.response.ShipForMaterialIssueBackGenerateResponse;
import com.ykcloud.soa.erp.api.wm.response.SoShipFinishResponse;
import com.ykcloud.soa.erp.api.wm.response.WmAllotWithShipResponse;
import com.ykcloud.soa.erp.api.wm.response.WmContainerHdrCreateResponse;
import com.ykcloud.soa.erp.api.wm.response.WmDataByBarcodeGetResponse;
import com.ykcloud.soa.erp.api.wm.response.WmDataGetDataByBarcodeAndSoNumIdResponse;
import com.ykcloud.soa.erp.api.wm.response.WmFinishShipContainerHdrResponse;
import com.ykcloud.soa.erp.api.wm.response.WmFinishSoPackingResponse;
import com.ykcloud.soa.erp.api.wm.response.WmQuerySoAndContainerResponse;
import com.ykcloud.soa.erp.api.wm.response.WmRfFinishOneStepResponse;
import com.ykcloud.soa.erp.api.wm.response.WmScanShipContainerHdrResponse;
import com.ykcloud.soa.erp.api.wm.response.WmShipDtlWithNoBatchUpdateResponse;
import com.ykcloud.soa.erp.api.wm.response.WmShipFinishResponse;
import com.ykcloud.soa.erp.api.wm.response.WmShipGetResponse;
import com.ykcloud.soa.erp.api.wm.response.WmSoHdrGetResponse;
import com.ykcloud.soa.erp.api.wm.response.WmWlBcHdrGetResponse;
import com.ykcloud.soa.erp.api.wm.response.WmWlbcHdrCreateResponse;
import com.ykcloud.soa.erp.api.wm.response.WmfinishPackingResponse;


public interface WmShipService {

		//后六位模糊查询波次号,只查出status=2的号
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
		
		//获取交接单号,并扫入该装箱
		public WmShipGetResponse createShipByContainer(WmShipGetRequest request);
		
		//扫装箱单
		public WmScanShipContainerHdrResponse scanShipContainer(WmScanShipContainerRequest request);
		
		//出库完成
		public WmShipFinishResponse finishShip(WmShipFinishRequest request);
        
		/** 
		* @Description: 行政领料退回，生成负的出库单
		* @Author: fred.zhao
		* @Date: 2018/4/12  
		*/ 
		public ShipForMaterialIssueBackGenerateResponse generateShipForMaterialIssueBack(ShipForMaterialIssueBackGenerateRequest request);

		//发送库存处理消息TCC,服务
		public ShipBusinessAccountProcessResponse processShipBusinessAccount(ShipBusinessAccountProcessRequest request);
		
		//发送财务处理消息TCC
		public ShipFiAccountProcessResponse processShipFiAccount(ShipFiAccountProcessRequest request);
		
		//so一键出库
		public SoShipFinishResponse finishSoShip(SoShipFinishRequest request);
		
		//产生验收单
		public ReceiptBudCreateResponse createReceiptBud(ReceiptBudCreateRequest request);
		/**
		 * 
		 * @description  反配、行政领料退库收货更新数量
		 * @author gaoyun.shen
		 * @date: 2018年4月18日 下午4:01:20
		 * @param 
		 * @return
		 */
		public ReverseReceiptDtlUpdateReponse updateReverseReceiptDtl(ReverseReceiptDtlUpdateRequest request);
		/**
		 * 
		 * @description 反配、行政领料退库收货完成
		 * @author gaoyun.shen
		 * @date: 2018年4月19日 下午5:50:18
		 * @param 
		 * @return
		 */
		public ReverseReceiptFinishResponse finishReverseShip(ReverseReceiptFinishRequest request);
		/**
		 * 
		 * @author Dan
		 * @date 2018年4月20日
		 * @description 出库反配产生验收单(通过反配托盘)
		 */
		public ReverseReceiptCreateByContainerRespone createReverseReceiptHdr(ReverseReceiptCreateByContainerRequest request);

		/**
		 * 
		 * @author Dan
		 * @date 2018年4月20日
		 * @description 装箱单关联验收单(将验收单号关联到containerHdr中的出库单号)
		 */
		public ReverseReceiptScanContainerResponse scanContainerForRecerseReceipt(ReverseReceiptScanContainerRequest request);
		
		/**
		 * 
		 * @author Dan
		 * @date 2018年4月20日
		 * @description 反配出库确认
		 */
		public ReverseReceiptShipFinishResponse finishReverseReceipt(ReverseReceiptShipFinishRequest request);
		
		/**
		 * 
		 * @author Dan
		 * @date 2018年4月20日
		 * @description 出库反配库存处理TCC服务
		 */
		public ReverseReceiptBusinessAccountProcessResponse reverseReceiptBusinessAccountProcess(ReverseReceiptBusinessAccountProcessRequest request);

		/**
		 * 
		 * @author Dan
		 * @date 2018年4月20日
		 * @description 出库反配财务账处理消息TCC
		 */
		public ReverseReceiptFiAccountProcessResponse reverseReceiptFiAccountProcess(ReverseReceiptFiAccountProcessRequest request);

		/**
		 * 
		 * @author Dan
		 * @date 2018年4月23日
		 * @description 产生分拨单
		 */
		public WmAllotWithShipResponse allotSoWithShip(WmAllotWithShipRequest request);
		
		/**
		 * 
		 * @author Dan
		 * @date 2018年4月24日
		 * @description RF一键出库
		 */
		public WmRfFinishOneStepResponse finishRfOneStep(WmRfFinishOneStepRequest request);
}
