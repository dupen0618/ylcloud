package com.ykcloud.soa.erp.api.wm.service;

import com.ykcloud.soa.erp.api.wm.request.ReceiptTrayGetRequest;
import com.ykcloud.soa.erp.api.wm.request.ReceiptTrayHdrCreateRequest;
import com.ykcloud.soa.erp.api.wm.request.ReceiptTrayHdrFinishRequest;
import com.ykcloud.soa.erp.api.wm.request.TraySerlnoLableUpdateRequest;
import com.ykcloud.soa.erp.api.wm.response.ReceiptTrayGetResponse;
import com.ykcloud.soa.erp.api.wm.response.ReceiptTrayHdrCreateResponse;
import com.ykcloud.soa.erp.api.wm.response.ReceiptTrayHdrFinishResponse;
import com.ykcloud.soa.erp.api.wm.response.TraySerlnoLableUpdateResponse;

public interface WmReceiptTrayService {
	/**
	 *@Description: 创建收货托盘
	 *@Auther hank
	 *@Date 2018-4-9
	 *@param request{subUnitNumId,reservedNo,traySerlnoLabel,userNumId}
	 *@return response{traySerlno,traySerlnoLable}
	 */
	public ReceiptTrayHdrCreateResponse createReceiptTrayHdr(ReceiptTrayHdrCreateRequest request);
	
	/**
	 *@Description: 创建收货托盘
	 *@Auther hank
	 *@Date 2018-4-9
	 *@param request{subUnitNumId,reservedNo,traySerlnoLabel,userNumId}
	 *@return response{traySerlno,traySerlnoLable}
	 */
	public ReceiptTrayHdrCreateResponse createReceiptTrayHdrWithNoTransaction(ReceiptTrayHdrCreateRequest request);

	// 托盘完成(封箱)
	public ReceiptTrayHdrFinishResponse finishReceiptTrayHdr(ReceiptTrayHdrFinishRequest request);

	// 查询托盘
	public ReceiptTrayGetResponse getReceiptTray(ReceiptTrayGetRequest request);
	
	/**
	 *@Description: 更新托盘实物周转箱编号
	 *@Auther hank
	 *@Date 2018-4-12
	 *@param request{subUnitNumId,reservedNo,traySerlno,traySerlnoLable,userNumId}
	 *@return response{code,message}
	 */
	public TraySerlnoLableUpdateResponse updateTraySerlnoLable(TraySerlnoLableUpdateRequest request); 
}
