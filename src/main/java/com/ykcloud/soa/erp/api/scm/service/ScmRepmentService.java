package com.ykcloud.soa.erp.api.scm.service;

import com.ykcloud.soa.erp.api.scm.request.HandRepmentProductGetRequest;
import com.ykcloud.soa.erp.api.scm.response.HandRepmentProductGetResponse;

/***
*
@author hank.zhu
@date 2018年3月9日 下午4:07:43 新建
*/
public interface ScmRepmentService {
	public HandRepmentProductGetResponse getHandRepmentProduct(HandRepmentProductGetRequest request);
}
