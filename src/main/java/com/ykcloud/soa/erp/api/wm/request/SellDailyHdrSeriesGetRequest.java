package com.ykcloud.soa.erp.api.wm.request;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

public class SellDailyHdrSeriesGetRequest extends AbstractRequest{

	private static final long serialVersionUID = -6699541639469883618L;

	private String reservedNo;

		public String getReservedNo() {
			return reservedNo;
		}

		public void setReservedNo(String reservedNo) {
			this.reservedNo = reservedNo;
		}
}
