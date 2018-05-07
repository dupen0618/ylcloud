package com.ykcloud.soa.erp.api.so.response;

import java.util.List;

import com.gb.soa.omp.ccommon.api.response.MessagePack;
import com.ykcloud.soa.erp.api.so.model.QtyForSoApply;

public class QtyForSoApplyCheckResponse extends MessagePack {
	private static final long serialVersionUID = 1L;
		private List<QtyForSoApply> qtyForSoApplys;

		public List<QtyForSoApply> getQtyForSoApplys() {
			return qtyForSoApplys;
		}

		public void setQtyForSoApplys(List<QtyForSoApply> qtyForSoApplys) {
			this.qtyForSoApplys = qtyForSoApplys;
		}
		
		
		
		
}
