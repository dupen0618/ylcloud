package com.ykcloud.soa.erp.api.wm.response;

import java.util.List;

import com.gb.soa.omp.ccommon.api.response.MessagePack;
import com.ykcloud.soa.erp.api.wm.model.WmSellDaily;

public class ShipBatchDtlAppointResponse extends MessagePack{

	private static final long serialVersionUID = 4117499397682485248L;
	private List<WmSellDaily>  wmSellDailies;

     public List<WmSellDaily> getWmSellDailies() {
         return wmSellDailies;
     }

     public void setWmSellDailies(List<WmSellDaily> wmSellDailies) {
         this.wmSellDailies = wmSellDailies;
     }
}