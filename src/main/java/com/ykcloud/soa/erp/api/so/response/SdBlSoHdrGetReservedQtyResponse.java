package com.ykcloud.soa.erp.api.so.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by yiako on 2018/4/9
 */
public class SdBlSoHdrGetReservedQtyResponse extends MessagePack {

	private static final long serialVersionUID = 1L;
	private String data;

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
}
