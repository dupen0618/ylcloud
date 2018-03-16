package com.ykcloud.soa.erp.api.wm.service;

import java.util.Date;

import com.ykcloud.soa.erp.api.scm.request.ProductDemandQtyGetRequest;
import com.ykcloud.soa.erp.api.scm.response.ProductDemandQtyGetResponse;
import com.ykcloud.soa.erp.api.wm.request.ShopProductLastReceiveDateGetRequest;
import com.ykcloud.soa.erp.api.wm.response.ShopProductLastReceiveDateGetResponse;

public interface WmReceiptService {
	
	public   ShopProductLastReceiveDateGetResponse   getShopProductLastReceiveDate(ShopProductLastReceiveDateGetRequest request);

}
