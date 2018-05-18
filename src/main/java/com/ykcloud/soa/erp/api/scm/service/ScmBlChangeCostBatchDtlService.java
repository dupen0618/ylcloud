/**
 * 
 */
package com.ykcloud.soa.erp.api.scm.service;

import com.ykcloud.soa.erp.api.scm.request.ScmBlChangeCostBatchDtlRequest;
import com.ykcloud.soa.erp.api.scm.response.ScmBlChangeCostBatchDtlResponse;

/**
 * 供应商进价调整单表体（含批次）操作接口
 * @author 殷剑
 * @date 2018年3月11日 上午3:26:42 新建
 */
public interface ScmBlChangeCostBatchDtlService {
	    // 列出表中数据
		public ScmBlChangeCostBatchDtlResponse list(
				ScmBlChangeCostBatchDtlRequest request);
		
}
