package com.ykcloud.soa.erp.api.prd.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;
import com.ykcloud.soa.erp.api.prd.model.BasicProduct;

/**
 * Created by yiako on 2018/3/10
 */
public class ProductByItemNumIdGetResponse extends MessagePack {

    private BasicProduct product;

    public BasicProduct getProduct() {
        return product;
    }

    public void setProduct(BasicProduct product) {
        this.product = product;
    }
}
