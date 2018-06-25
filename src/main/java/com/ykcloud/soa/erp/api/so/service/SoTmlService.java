package com.ykcloud.soa.erp.api.so.service;
import com.ykcloud.soa.erp.api.so.request.ItemSellDailyDtlNotBalanceCountGetRequest;
import com.ykcloud.soa.erp.api.so.request.ItemSellDailyDtlSeriesForRegenerateItemSellDailyGetRequest;
import com.ykcloud.soa.erp.api.so.request.ItemSellDailyDtlStatusNumIdUpdateRequest;
import com.ykcloud.soa.erp.api.so.request.ItemSellDailyHdrAndDtlStatusNumIdUpdateRequest;
import com.ykcloud.soa.erp.api.so.request.ItemSellDailyListForGenerateBalanceGetRequest;
import com.ykcloud.soa.erp.api.so.request.LastSalePriceGetRequest;
import com.ykcloud.soa.erp.api.so.request.OtOtmlGetRequest;
import com.ykcloud.soa.erp.api.so.request.SupBlanceDtlByItemSellDailyDtlSeriesGetRequest;
import com.ykcloud.soa.erp.api.so.request.SupplyUnitNumIdForJointSaleGetRequest;
import com.ykcloud.soa.erp.api.so.request.TmlDailyGenerateRequest;
import com.ykcloud.soa.erp.api.so.request.TmlProductAmountAndPayAmountCompareRequest;
import com.ykcloud.soa.erp.api.so.request.VoucherNumIdUpdateRequest;
import com.ykcloud.soa.erp.api.so.response.ItemSellDailyDtlNotBalanceCountGetResponse;
import com.ykcloud.soa.erp.api.so.response.ItemSellDailyDtlSeriesForRegenerateItemSellDailyGetResponse;
import com.ykcloud.soa.erp.api.so.response.ItemSellDailyDtlStatusNumIdUpdateResponse;
import com.ykcloud.soa.erp.api.so.response.ItemSellDailyHdrAndDtlStatusNumIdUpdateResponse;
import com.ykcloud.soa.erp.api.so.response.ItemSellDailyListForGenerateBalanceGetResponse;
import com.ykcloud.soa.erp.api.so.response.LastSalePriceGetResponse;
import com.ykcloud.soa.erp.api.so.response.OtOTmlGetResponse;
import com.ykcloud.soa.erp.api.so.response.SupBlanceDtlByItemSellDailyDtlSeriesGetResponse;
import com.ykcloud.soa.erp.api.so.response.SupplyUnitNumIdForJointSaleGetResponse;
import com.ykcloud.soa.erp.api.so.response.TmlDailyGenerateResponse;
import com.ykcloud.soa.erp.api.so.response.TmlProductAmountAndPayAmountCompareRequestCompareResponse;
import com.ykcloud.soa.erp.api.so.response.VoucherNumIdUpdateResponse;
import com.ykcloud.soa.erp.api.so.request.SalesDailyGenerateRequest;
import com.ykcloud.soa.erp.api.so.request.SalesEndOfDayDtlGenerateRequest;
import com.ykcloud.soa.erp.api.so.response.SalesDailyGenerateResponse;
import com.ykcloud.soa.erp.api.so.response.SalesEndOfDayDtlGenerateResponse;

/**
 * @author:shenq
 * @description:销售出库日报Service
 * @date :2018/4/23 - 10:01
 * @version:v1.0
 */
public interface SoTmlService {
	
	/**
	 * 生成销售日期
	 * @author tz.x
	 * @date 2018年6月5日下午12:01:36
	 */
	public SalesEndOfDayDtlGenerateResponse generateSalesEndOfDay(SalesEndOfDayDtlGenerateRequest request);



    /**
     * 根据销售小票生成销售出库日报
     * @author shenq
     * @param request
     * @return
     */
    public SalesDailyGenerateResponse generateSalesDaily(SalesDailyGenerateRequest request);


    public ItemSellDailyListForGenerateBalanceGetResponse getItemSellDailyListForGenerateBalance(ItemSellDailyListForGenerateBalanceGetRequest request);

    public ItemSellDailyDtlStatusNumIdUpdateResponse updateItemSellDailyDtlStatusNumId(ItemSellDailyDtlStatusNumIdUpdateRequest request);

    public ItemSellDailyHdrAndDtlStatusNumIdUpdateResponse updateItemSellDailyHdrAndDtlStatusNumId(ItemSellDailyHdrAndDtlStatusNumIdUpdateRequest request);

    public SupBlanceDtlByItemSellDailyDtlSeriesGetResponse getSupBlanceDtlByItemSellDailyDtlSeries(SupBlanceDtlByItemSellDailyDtlSeriesGetRequest request);
    
    public ItemSellDailyDtlSeriesForRegenerateItemSellDailyGetResponse getItemSellDailyDtlSeriesForRegenerateItemSellDaily(ItemSellDailyDtlSeriesForRegenerateItemSellDailyGetRequest request);
    
    public SupplyUnitNumIdForJointSaleGetResponse getSupplyUnitNumIdForJointSale(SupplyUnitNumIdForJointSaleGetRequest request);
    
    public SalesDailyGenerateResponse getItemSellDaily(SalesDailyGenerateRequest request);

    //生成小票
    public TmlDailyGenerateResponse generateTmlDaily(TmlDailyGenerateRequest request);
    
    //查询oto发货小票信息
    public OtOTmlGetResponse getOtOTmlList(OtOtmlGetRequest request);
    
    //回写凭证单号
    public VoucherNumIdUpdateResponse updateVoucherNumId(VoucherNumIdUpdateRequest request);
    
    //比较价格
    public TmlProductAmountAndPayAmountCompareRequestCompareResponse compareTmlProductAmountAndPayAmount(TmlProductAmountAndPayAmountCompareRequest request);

    /***
     * 计算商品最后一次售价（计算七天內最底价,若七天内无销售计算最近一次售价）
     * @param request
     * @author pengh
     * @return
     */
    public LastSalePriceGetResponse getLastSalePrice(LastSalePriceGetRequest request);
  

}
