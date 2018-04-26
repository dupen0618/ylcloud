package com.ykcloud.soa.erp.api.wm.service;

import com.ykcloud.soa.erp.api.wm.request.ShipBatchDtlAppointRequest;
import com.ykcloud.soa.erp.api.wm.request.ShipBatchDtlDataGetRequest;
import com.ykcloud.soa.erp.api.wm.request.ShipBatchDtlSeriesSelectRequest;
import com.ykcloud.soa.erp.api.wm.request.ShipBatchDtlStatusUpdateRequest;
import com.ykcloud.soa.erp.api.wm.request.ShipDtlStatusSelectRequest;
import com.ykcloud.soa.erp.api.wm.request.ShipHdrSeriesGetRequest;
import com.ykcloud.soa.erp.api.wm.request.ShipHdrStatusUpdateRequest;
import com.ykcloud.soa.erp.api.wm.response.ShipBatchDtlAppointResponse;
import com.ykcloud.soa.erp.api.wm.response.ShipBatchDtlDataGetResponse;
import com.ykcloud.soa.erp.api.wm.response.ShipBatchDtlSeriesSelectResponse;
import com.ykcloud.soa.erp.api.wm.response.ShipBatchDtlStatusUpdateResponse;
import com.ykcloud.soa.erp.api.wm.response.ShipDtlStatusSelectResponse;
import com.ykcloud.soa.erp.api.wm.response.ShipHdrSeriesGetResponse;
import com.ykcloud.soa.erp.api.wm.response.ShipHdrStatusUpdateResponse;

public interface WmBlShipBatchDtlService {

		//获取出库单明细数据
		public ShipBatchDtlDataGetResponse getShipBatchDtlData(ShipBatchDtlDataGetRequest request);
		
		//获取出库单行号
		public ShipBatchDtlSeriesSelectResponse selectShipBatchDtlSeries(ShipBatchDtlSeriesSelectRequest request);
		
		//通过行号修改状态
		public ShipBatchDtlStatusUpdateResponse updateShipBatchDtlStatus(ShipBatchDtlStatusUpdateRequest request);
		
		//选择指定出库单生成结算单
		public ShipBatchDtlAppointResponse AppointShipBatchDtlForBalance(ShipBatchDtlAppointRequest request);

		

		//结算单审核,改变出库表头的状态
		public ShipHdrStatusUpdateResponse updateShipHdrStatus(ShipHdrStatusUpdateRequest request);
		
		//结算单审核，得到出库表头的行号
		public ShipHdrSeriesGetResponse getShipHdrSeries(ShipHdrSeriesGetRequest request);

		//结算单审核查询出库明细表的状态
		public ShipDtlStatusSelectResponse selectShipDtlStatus (ShipDtlStatusSelectRequest request);

}
