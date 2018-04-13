package com.ykcloud.soa.erp.api.wm.service;


import com.ykcloud.soa.erp.api.wm.request.ReceiptForFiGetRequest;
import com.ykcloud.soa.erp.api.wm.request.ReceiptStatusUpdateRequest;
import com.ykcloud.soa.erp.api.wm.response.ReceiptForFiGetResponse;
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

}
