package com.ykcloud.soa.erp.api.wm.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;
import com.ykcloud.soa.erp.api.wm.model.ProductInfo;
import java.util.List;

/**
 * @Description: 查询箱明细的出参
 * @author: henry.wang
 * @date: 2018/4/15 10:18
 **/
public class ContainerProductDetailGetResponse extends MessagePack {

    private static final long serialVersionUID = 1L;

    private Double containerSumQty;

    private List<ProductInfo> productInfos;

    public Double getContainerSumQty() {
        return containerSumQty;
    }

    public void setContainerSumQty(Double containerSumQty) {
        this.containerSumQty = containerSumQty;
    }

    public List<ProductInfo> getProductInfos() {
        return productInfos;
    }

    public void setProductInfos(List<ProductInfo> productInfos) {
        this.productInfos = productInfos;
    }
}
