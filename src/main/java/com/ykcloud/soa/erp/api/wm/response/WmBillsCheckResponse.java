package com.ykcloud.soa.erp.api.wm.response;

import java.util.List;
import java.util.Map;

import com.gb.soa.omp.ccommon.api.response.MessagePack;
import com.ykcloud.soa.erp.api.wm.model.ProblemBill;

public class WmBillsCheckResponse extends MessagePack {
	private static final long serialVersionUID = 1L;

	private List<ProblemBill> problemBills;

	public List<ProblemBill> getProblemBills() {
		return problemBills;
	}

	public void setProblemBills(List<ProblemBill> problemBills) {
		this.problemBills = problemBills;
	}
	
}
