package com.ykcloud.soa.erp.api.scm.request;


import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.gb.soa.omp.ccommon.api.annotation.ApiField;
import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;
/**
 * 
 * @author gaoyun.shen
 *
 * @date 2018年5月3日 下午12:12:09
 * 
 * @Description 上传基础数据到证照系统中间表请求类
 */
public class UploadBaseInfoTaskRequest extends AbstractUserSessionRequest {
	private static final long serialVersionUID = -3936899766322939348L;
	@ApiField(description = "定时器起始时间，不传就是默认当前时间前一天 yyyy-MM-dd")
	@JsonFormat
	private Date startDate;
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

}
