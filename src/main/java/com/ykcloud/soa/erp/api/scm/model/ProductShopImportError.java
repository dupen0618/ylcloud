package com.ykcloud.soa.erp.api.scm.model;
/**
 * 
 * @author gaoyun.shen
 *
 * @date 2018年6月23日 上午9:56:31
 * 
 * @Description
 */
public class ProductShopImportError {
	private String itemid;// 商品商家编码
	private String subUnitId;// 适用机构
	private String importError;// 导入错误信息

	public String getItemid() {
		return itemid;
	}

	public void setItemid(String itemid) {
		this.itemid = itemid;
	}


	public String getSubUnitId() {
		return subUnitId;
	}

	public void setSubUnitId(String subUnitId) {
		this.subUnitId = subUnitId;
	}

	public String getImportError() {
		return importError;
	}

	public void setImportError(String importError) {
		this.importError = importError;
	}
}
