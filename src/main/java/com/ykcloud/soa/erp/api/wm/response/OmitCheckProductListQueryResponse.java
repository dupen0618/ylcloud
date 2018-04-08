package com.ykcloud.soa.erp.api.wm.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;
import com.ykcloud.soa.erp.api.wm.model.ProductInfo;
import java.util.List;

/**
 * @Description: 漏盘商品查询的出参
 * @author: henry.wang
 * @date: 2018/4/8 15:24
 **/
public class OmitCheckProductListQueryResponse extends MessagePack {

    private static final long serialVersionUID = 1L;

    private List<ProductInfo> productInfos;

    public List<ProductInfo> getProductInfos() {
        return productInfos;
    }

    public void setProductInfos(List<ProductInfo> productInfos) {
        this.productInfos = productInfos;
    }
}
