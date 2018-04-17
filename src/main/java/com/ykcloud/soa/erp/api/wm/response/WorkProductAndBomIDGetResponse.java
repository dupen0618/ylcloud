package com.ykcloud.soa.erp.api.wm.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;
import com.ykcloud.soa.erp.api.wm.model.ProductAndBom;

/**
 * fakir
 * 2018/4/17
 */
public class WorkProductAndBomIDGetResponse extends MessagePack {

    private static final long serialVersionUID = 1L;

    private ProductAndBom productAndBom;

    public ProductAndBom getProductAndBom() {
        return productAndBom;
    }

    public void setProductAndBom(ProductAndBom productAndBom) {
        this.productAndBom = productAndBom;
    }
}
