package com.ykcloud.soa.erp.api.scm.response;

import java.util.List;

import com.gb.soa.omp.ccommon.api.response.MessagePack;
import com.ykcloud.soa.erp.api.scm.model.ReturnProduct;

//前台根据商品编号获取退货商品相关信息(价格）的出参类
public class ReturnProductGetResponse extends MessagePack {

	private static final long serialVersionUID = -1378416580563875396L;

	private List<ReturnProduct> returnProducts;

	public List<ReturnProduct> getReturnProducts() {
		return returnProducts;
	}

	public void setReturnProducts(List<ReturnProduct> returnProducts) {
		this.returnProducts = returnProducts;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
