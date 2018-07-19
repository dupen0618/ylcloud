package com.ykcloud.soa.erp.api.sync.request;

import javax.validation.constraints.NotNull;

import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;

public class VipPromotionSyncRequest extends AbstractUserSessionRequest {

	private static final long serialVersionUID = -7980598760188859502L;
		//如果重复导入1不报错，0要报错
		@NotNull(message = "重复导入跳过标识不能为空!")
		private Long skipSign;

		public Long getSkipSign() {
			return skipSign;
		}

		public void setSkipSign(Long skipSign) {
			this.skipSign = skipSign;
		}
}
