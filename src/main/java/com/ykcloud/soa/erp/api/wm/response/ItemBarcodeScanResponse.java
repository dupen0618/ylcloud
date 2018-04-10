package com.ykcloud.soa.erp.api.wm.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;
import com.ykcloud.soa.erp.api.wm.model.ProductInfo;

/**
 * @Description: 扫码商品条码返回商品信息的出参
 * @author: henry.wang
 * @date: 2018/4/9 9:44
 **/
public class ItemBarcodeScanResponse extends MessagePack {

    private static final long serialVersionUID = 1L;

    private ProductInfo productInfo;

    public ProductInfo getProductInfo() {
        return productInfo;
    }

    public void setProductInfo(ProductInfo productInfo) {
        this.productInfo = productInfo;
    }
}
