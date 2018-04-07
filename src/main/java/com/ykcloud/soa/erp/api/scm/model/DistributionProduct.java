package com.ykcloud.soa.erp.api.scm.model;

import java.io.Serializable;
import java.util.Date;

public class DistributionProduct implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long itemNumId;// 商品编号

	private String itemName;// 商品名称

	private String barcode;// 条码

	private Long divNumId;// 部类

	private String divName;// 部类名称

	private Long basicUnitNumId;// 商品基本单位

	private String basicUnitName;// 商品基本单位名称

	private String styleDesc;// 销售规格

	private Long qualityDays;// 保质期天数

	private Long gpItemNumId;// 母商品

	private Long settlementType;// 结算方式1：购销，2：代销，3：联销

	private String settlementTypeName;// 结算方式名称

	private Long logisticsType;// 物流方式

	private String logisticsTypeName;// 物流方式名称

	private Long productOriginNumId;// 原产地

	private String productOriginName;// 原产地名称

	private Long storeType;// 储存方式1：常温 2：冷藏 3：冷冻

	private String storeTypeName;// 储存方式名称

	private Long storageNumId;// 直送、直同收货仓库，配送无意义为0

	private Double conversionQty;// 件装数

	private Long conversionUnitNumId;// 件装单位

	private String conversionUnitName;// 件装单位名称

	private String conversionStyleDesc;// 件装规格

	private Double salePrice;// 销售价格

	private Double minQty;// 最小配送数

	private Double stockQty;// 库存数

	private Double balanceCost;// 结存成本

	private Double availbleSaleDays;// 可销天数


	
}
