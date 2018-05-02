package com.ykcloud.soa.erp.api.wm.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;
import com.ykcloud.soa.erp.api.wm.model.ProductInfo;
import java.util.List;

/**
 * @Description: 输入数量/RF盘点的出参
 * @author: henry.wang
 * @date: 2018/4/4 10:23
 **/
public class StockCheckResponse extends MessagePack {

    private static final long serialVersionUID = 1L;

    private List<ProductInfo> productInfos;

    public List<ProductInfo> getProductInfos() {
        return productInfos;
    }

    public void setProductInfos(List<ProductInfo> productInfos) {
        this.productInfos = productInfos;
    }
}
