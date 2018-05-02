package com.ykcloud.soa.erp.api.wm.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;
import com.ykcloud.soa.erp.api.wm.model.ProductInfo;
import java.util.List;

/**
 * @Description: 扫码商品条码返回商品信息的出参
 * @author: henry.wang
 * @date: 2018/4/9 9:44
 **/
public class ItemBarcodeScanResponse extends MessagePack {

    private static final long serialVersionUID = 1L;

    private List<ProductInfo> productInfos;

    public List<ProductInfo> getProductInfos() {
        return productInfos;
    }

    public void setProductInfos(List<ProductInfo> productInfos) {
        this.productInfos = productInfos;
    }
}
