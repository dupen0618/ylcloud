package com.ykcloud.soa.erp.api.wm.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;
import com.ykcloud.soa.erp.api.wm.model.ProductAndCost;

import java.util.List;

public class ProductAndCostGetResponse extends MessagePack {

    private static final long serialVersionUID = 9155991764512554665L;

    private List<ProductAndCost> productAndCosts;

    public List<ProductAndCost> getProductAndCosts() {
        return productAndCosts;
    }

    public void setProductAndCosts(List<ProductAndCost> productAndCosts) {
        this.productAndCosts = productAndCosts;
    }
}
