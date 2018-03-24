package com.ykcloud.soa.erp.api.wm.service;

import com.ykcloud.soa.erp.api.wm.request.ReceiptDtlUpdateRequest;
import com.ykcloud.soa.erp.api.wm.request.ReceiptHdrGetRequest;
import com.ykcloud.soa.erp.api.wm.request.ReceiptProduceDateUpdateRequest;
import com.ykcloud.soa.erp.api.wm.request.ReceiptTrayHdrCreateRequest;
import com.ykcloud.soa.erp.api.wm.response.ReceiptDtlUpdateResponse;
import com.ykcloud.soa.erp.api.wm.response.ReceiptHdrGetResponse;
import com.ykcloud.soa.erp.api.wm.response.ReceiptProduceDateUpdateResponse;
import com.ykcloud.soa.erp.api.wm.response.ReceiptTrayHdrCreateResponse;

/**
*
@author hank.zhu
@date 2018年3月12日 下午7:51:29 新建
**/
public interface WmRecieptService {
	//查询验收单6位模糊查询，判断订单状态是否为发货方已确认。
	public ReceiptHdrGetResponse getReceiptHdr(ReceiptHdrGetRequest request);
	
	//创建入库装箱单
	public ReceiptTrayHdrCreateResponse createReceiptTrayHdr(ReceiptTrayHdrCreateRequest request);
	
	//过期控制  证照控制
	public ReceiptProduceDateUpdateResponse updateReceiptProduceDate(ReceiptProduceDateUpdateRequest request);
	
	//更新收货数量
	public ReceiptDtlUpdateResponse updateReceiptDtl (ReceiptDtlUpdateRequest request);

}
