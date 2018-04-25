package com.ykcloud.soa.erp.api.wm.service;

import com.ykcloud.soa.erp.api.wm.request.ShipBatchDtlAppointRequest;
import com.ykcloud.soa.erp.api.wm.request.ShipBatchDtlDataGetRequest;
import com.ykcloud.soa.erp.api.wm.request.ShipBatchDtlSeriesSelectRequest;
import com.ykcloud.soa.erp.api.wm.request.ShipBatchDtlStatusUpdateRequest;
import com.ykcloud.soa.erp.api.wm.response.ShipBatchDtlAppointResponse;
import com.ykcloud.soa.erp.api.wm.response.ShipBatchDtlDataGetResponse;
import com.ykcloud.soa.erp.api.wm.response.ShipBatchDtlSeriesSelectResponse;
import com.ykcloud.soa.erp.api.wm.response.ShipBatchDtlStatusUpdateResponse;

public interface WmBlShipBatchdalService {

		//获取出库单明细数据
		public ShipBatchDtlDataGetResponse getShipBatchDtlData(ShipBatchDtlDataGetRequest request);
		
		//获取出库单行号
		public ShipBatchDtlSeriesSelectResponse selectShipBatchDtlSeries(ShipBatchDtlSeriesSelectRequest request);
		
		//通过行号修改状态
		public ShipBatchDtlStatusUpdateResponse updateShipBatchDtlStatus(ShipBatchDtlStatusUpdateRequest request);
		
		//选择指定出库单生成结算单
		public ShipBatchDtlAppointResponse AppointShipBatchDtl(ShipBatchDtlAppointRequest request);

}
