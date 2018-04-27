package com.ykcloud.soa.erp.api.so.service;

import com.ykcloud.soa.erp.api.so.request.CountByStatusNumIdGetRequest;
import com.ykcloud.soa.erp.api.so.request.SaleInfoBySeriesGetRequest;
import com.ykcloud.soa.erp.api.so.request.SaleInfoBySoTmlItemSellDailyGetRequest;
import com.ykcloud.soa.erp.api.so.request.SeriesByItemNumIdAndReservedNoGetRequest;
import com.ykcloud.soa.erp.api.so.request.StatusNumIdForSellDailyHdrUpdateRequest;
import com.ykcloud.soa.erp.api.so.request.StatusNumIdForSoTmlItemSellDailyUpdateRequest;
import com.ykcloud.soa.erp.api.so.request.SupplyNumIdBySubUnitNumIdGetRequest;
import com.ykcloud.soa.erp.api.so.response.CountByStatusNumIdGetResponse;
import com.ykcloud.soa.erp.api.so.response.SaleInfoBySeriesGetResponse;
import com.ykcloud.soa.erp.api.so.response.SaleInfoBySoTmlItemSellDailyGetResponse;
import com.ykcloud.soa.erp.api.so.response.SeriesByItemNumIdAndReservedNoGetResponse;
import com.ykcloud.soa.erp.api.so.response.StatusNumIdForSellDailyHdrUpdateResponse;
import com.ykcloud.soa.erp.api.so.response.StatusNumIdForSoTmlItemSellDailyUpdateResponse;
import com.ykcloud.soa.erp.api.so.response.SupplyNumIdBySubUnitNumIdGetResponse;

public interface SoSearchService {
	
	//根据查询财务中SD_BL_SO_TML_ITEM_SELLDAILY_HDR中的供应商
	public SupplyNumIdBySubUnitNumIdGetResponse getSupplyNumIdBySubUnitNumId(SupplyNumIdBySubUnitNumIdGetRequest request);

	//查询销售日报
	public SaleInfoBySoTmlItemSellDailyGetResponse getSaleInfoBySoTmlItemSellDaily(SaleInfoBySoTmlItemSellDailyGetRequest request);

	//根据行号查询销售日报单体
	public SaleInfoBySeriesGetResponse getSaleInfoBySeries(SaleInfoBySeriesGetRequest request);

	//查询行号
	public SeriesByItemNumIdAndReservedNoGetResponse getSeriesByItemNumIdAndReservedNo(SeriesByItemNumIdAndReservedNoGetRequest request);
	
	//查询销售日报单体中状态编号
	public CountByStatusNumIdGetResponse getCountByStatusNumId(CountByStatusNumIdGetRequest request);
	
	//修改销售日报表体的状态
	public StatusNumIdForSoTmlItemSellDailyUpdateResponse updateStatusNumIdForSoTmlItemSellDaily(StatusNumIdForSoTmlItemSellDailyUpdateRequest request);

	//修改销售日报表头的状态
	public StatusNumIdForSellDailyHdrUpdateResponse updateStatusNumIdForSellDailyHdr(StatusNumIdForSellDailyHdrUpdateRequest request);
}
