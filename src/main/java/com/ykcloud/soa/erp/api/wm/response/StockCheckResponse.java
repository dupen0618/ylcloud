package com.ykcloud.soa.erp.api.wm.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;
import com.ykcloud.soa.erp.api.wm.model.ProductInfo;

/**
 * @Description: 输入数量/RF盘点的出参
 * @author: henry.wang
 * @date: 2018/4/4 10:23
 **/
public class StockCheckResponse extends MessagePack {

    private static final long serialVersionUID = 1L;

    private ProductInfo productInfo;

    public ProductInfo getProductInfo() {
        return productInfo;
    }

    public void setProductInfo(ProductInfo productInfo) {
        this.productInfo = productInfo;
    }
}
