package com.ykcloud.soa.erp.api.wm.model;

import java.io.Serializable;

/**
 * @Author: fred.zhao
 * @Description:
 * @Date: Created in 15:49:2018/4/16
 */
public class MaterialIssueBackDtl implements Serializable{


    private static final long serialVersionUID = -2305750048515780399L;

    private String series;//序号

    private String  applyNumId;//申请单号

    private Long itemNumId;//商品编号

    private Long divNumId;//商品种类

    private String barcode;//条码

    private String itemName;//商品名称

    private Double lockQty;//锁库数量

    private Double stockQty;//库存数量

    private Long productOriginNumId;//产地

    private Double conversionQty;//件装数

    private Long conversionUnitNumId;//件装单位

    private String conversionStyleDesc;//件装规格

    private Double packageQty;//件数

    private Double qty;//数量

    private Double pmtQty;//赠品数量

    private Long pmtMaterial;//赠品辅料

    private Double tradePrice;//价格

    private Double tradeAmount;//金额

    private Double taxRate;//税率

    private Double taxAmount;//税额

    private Double orderQty;//生成订单数量

    private Long returnReasonId;//退货原因

    private String returnDesc;//退货描述
}
