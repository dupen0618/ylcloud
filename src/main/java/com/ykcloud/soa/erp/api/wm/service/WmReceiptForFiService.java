package com.ykcloud.soa.erp.api.wm.service;


import com.ykcloud.soa.erp.api.wm.request.BalanceDtlByDeductionSelectRequest;
import com.ykcloud.soa.erp.api.wm.request.ReceiptForFiGetRequest;
import com.ykcloud.soa.erp.api.wm.request.ReceiptSeriesGetRequest;
import com.ykcloud.soa.erp.api.wm.request.ReceiptStatusUpdateRequest;
import com.ykcloud.soa.erp.api.wm.response.BalanceDtlByDeductionSelectResponse;
import com.ykcloud.soa.erp.api.wm.response.ReceiptForFiGetResponse;
import com.ykcloud.soa.erp.api.wm.response.ReceiptSeriesGetResponse;
import com.ykcloud.soa.erp.api.wm.response.ReceiptStatusUpdateResponse;

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
	
}
