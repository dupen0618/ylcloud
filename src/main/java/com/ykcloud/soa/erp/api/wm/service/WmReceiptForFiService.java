package com.ykcloud.soa.erp.api.wm.service;


import com.ykcloud.soa.erp.api.wm.request.BalanceDtlByDeductionSelectRequest;
import com.ykcloud.soa.erp.api.wm.request.LoseDtlDataGetRequest;
import com.ykcloud.soa.erp.api.wm.request.LossDtlByBalanceSelectRequest;
import com.ykcloud.soa.erp.api.wm.request.LossSeriesGetRequest;
import com.ykcloud.soa.erp.api.wm.request.LossStatusUpdateRequest;
import com.ykcloud.soa.erp.api.wm.request.ReceiptForFiGetRequest;
import com.ykcloud.soa.erp.api.wm.request.ReceiptSeriesGetRequest;
import com.ykcloud.soa.erp.api.wm.request.ReceiptStatusUpdateRequest;
import com.ykcloud.soa.erp.api.wm.request.StockadJustDataGetRequest;
import com.ykcloud.soa.erp.api.wm.request.StockadJustSelectRequest;
import com.ykcloud.soa.erp.api.wm.request.StockadJustSeriesGetRequest;
import com.ykcloud.soa.erp.api.wm.request.StockadJustStatusGetRequest;
import com.ykcloud.soa.erp.api.wm.response.BalanceDtlByDeductionSelectResponse;
import com.ykcloud.soa.erp.api.wm.response.LossDtlByBalanceSelectResponse;
import com.ykcloud.soa.erp.api.wm.response.LossDtlDataGetResponse;
import com.ykcloud.soa.erp.api.wm.response.LossSeriesGetResponse;
import com.ykcloud.soa.erp.api.wm.response.LossStatusUpdateResponse;
import com.ykcloud.soa.erp.api.wm.response.ReceiptForFiGetResponse;
import com.ykcloud.soa.erp.api.wm.response.ReceiptSeriesGetResponse;
import com.ykcloud.soa.erp.api.wm.response.ReceiptStatusUpdateResponse;
import com.ykcloud.soa.erp.api.wm.response.StockadJustDataGetResponse;
import com.ykcloud.soa.erp.api.wm.response.StockadJustSelectResponse;
import com.ykcloud.soa.erp.api.wm.response.StockadJustSeriesGetResponse;
import com.ykcloud.soa.erp.api.wm.response.StockadJustStatusGetResponse;

/**
 * @Description:
 * @author Song
 * @Date 2018年4月8日 下午4:50:36
 */
public interface WmReceiptForFiService {

	//验收入库获取数据，供财务调用接口()
	public ReceiptForFiGetResponse getReceiptForBalance(ReceiptForFiGetRequest request);
	
	//取结算数据，插入数据之后原表中商品状态改变
	public ReceiptStatusUpdateResponse updateStatusForBalance(ReceiptStatusUpdateRequest request);

	//得到验收入库的行号
	public ReceiptSeriesGetResponse getBalanceDtlByReceipt(ReceiptSeriesGetRequest request);
	
	//选择指定验收入库单明细项目生成结算明细
	public BalanceDtlByDeductionSelectResponse selectBalanceDtlByDeduction(BalanceDtlByDeductionSelectRequest request);
	
	
	//损益单获取数据
	public LossDtlDataGetResponse getLoseDtlData(LoseDtlDataGetRequest request);
	
	//改变损益单结算后的状态
	public LossStatusUpdateResponse updateLossStatus(LossStatusUpdateRequest request);
	
	//得到损益单行号
	public LossSeriesGetResponse getLossSeries(LossSeriesGetRequest request);
	
	//选择指定损益单明细生成结算单
	public LossDtlByBalanceSelectResponse selectLossDtlByBalance(LossDtlByBalanceSelectRequest request);
	
	
	//盈亏单获取数据
	public StockadJustDataGetResponse getStockadJustData(StockadJustDataGetRequest request);
	
	//改变盈亏单结算后的状态
	public StockadJustStatusGetResponse getStockadJustStatus(StockadJustStatusGetRequest request);
	
	//获得盈亏单行号
	public StockadJustSeriesGetResponse getStockadJustSeries(StockadJustSeriesGetRequest request);
	
	//选择指定的盈亏单明细生成结算单
	public StockadJustSelectResponse selectStockadJust(StockadJustSelectRequest request);
	
}
