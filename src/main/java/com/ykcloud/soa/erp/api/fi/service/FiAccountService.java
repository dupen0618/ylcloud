package com.ykcloud.soa.erp.api.fi.service;

import com.ykcloud.soa.erp.api.fi.request.WmReceiptFiBillUpdateRequest;
import com.ykcloud.soa.erp.api.fi.response.WmReceiptFiBillUpdateResponse;

/**
*财务帐处理服务类
@author hank.zhu
@date 2018年4月12日 上午7:09:13 新建
**/
public interface FiAccountService {
	/**
	 *@Description: 仓库收货,财务帐处理   ;在验收单验收复核完成后,业务帐处理完后,通过消息调用触发
	 *@Auther hank
	 *@Date 2018-4-12
	 *@param request{subUnitNumId,reservedNo,userNumId}
	 *@return response{}
	 */
	public WmReceiptFiBillUpdateResponse updateWmReceiptFiBill(WmReceiptFiBillUpdateRequest request);
}
