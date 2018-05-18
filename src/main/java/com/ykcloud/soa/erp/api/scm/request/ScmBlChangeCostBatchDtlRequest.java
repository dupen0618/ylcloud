/**
 * 
 */
package com.ykcloud.soa.erp.api.scm.request;

/**
 * @author hankz
 *
 */

import java.util.Date;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

/**
*每日产生门店、商品类别补货参考数量 方法请求类
@author 殷剑
@date 2018年5月11日 上午3:49:17 新建
**/
public class ScmBlChangeCostBatchDtlRequest extends AbstractRequest {
	private static final long serialVersionUID = 1L;
	
	@NotNull(message="门店编号不能为空！")
	private Long subUnitNumId;
	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
	@NotNull(message="订单日期不能为空！")
	private Date makeDate;

	public Long getSubUnitNumId() {
		return subUnitNumId;
	}

	public void setSubUnitNumId(Long subUnitNumId) {
		this.subUnitNumId = subUnitNumId;
	}
	
	public Date getMakeDate() {
		return makeDate;
	}

	public void setMakeDate(Date makeDate) {
		this.makeDate = makeDate;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}

