/**
 * 
 */
package com.ykcloud.soa.erp.api.scm.response;

import java.util.List;
//import com.ykcloud.soa.erp.scm.entity.SCM_BL_CHANGE_COST_BATCH_DTL;

import com.gb.soa.omp.ccommon.api.response.MessagePack;
import com.ykcloud.soa.erp.api.scm.model.ScmBlChangeCostBatchDtl;

/**
 * @author 殷剑
 *
 */
public class ScmBlChangeCostBatchDtlResponse extends MessagePack {

	private static final long serialVersionUID = 675028068170855942L;
	
	List<ScmBlChangeCostBatchDtl> list;

	public List<ScmBlChangeCostBatchDtl> getList() {
		return list;
	}

	public void setList(List<ScmBlChangeCostBatchDtl> list) {
		this.list = list;
	}
	
}
