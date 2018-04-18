package com.ykcloud.soa.erp.api.wm.response;


import com.gb.soa.omp.ccommon.api.response.MessagePack;

public class LossStatusUpdateResponse extends MessagePack  {

	private static final long serialVersionUID = -8413791295079250391L;
   
	private  Integer  sum;//修改行数

		public Integer getSum() {
			return sum;
		}

		public void setSum(Integer sum) {
			this.sum = sum;
		}

}
