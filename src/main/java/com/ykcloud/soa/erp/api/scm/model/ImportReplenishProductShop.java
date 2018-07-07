package com.ykcloud.soa.erp.api.scm.model;

import java.io.Serializable;

import org.hibernate.validator.constraints.NotEmpty;

public class ImportReplenishProductShop implements Serializable {

	/**
	 * 导入自动补货参数
	 */
	private static final long serialVersionUID = 1L;

	@NotEmpty(message="机构编码不能为空!")
	private String subUnitId;

	@NotEmpty(message="商品编码不能为空!")
	private String itemId;

	// 补货公式编码
	@NotEmpty(message="补货公式编码不能为空!")
	private Long functionId;

	// 正常日均销量，非ＤＭ售价促销期间刷新
	@NotEmpty(message="正常日均销量不能为空!")
	private Long ndms;

	// 正常平滑系数，通常情况，历史日均销量占７分，当日销量占３分，即配置成0.3。
	@NotEmpty(message="正常平滑系数不能为空!")
	private Long nsf;

	// 促销日均销量，ＤＭ售价促销期间刷新。
	@NotEmpty(message="促销日均销量不能为空!")
	private Long pdms;

	// 促销平滑系数，通常情况，历史日均销量占３分，当日销量占７分，即配置成0.7。
	@NotEmpty(message="促销平滑系数不能为空!")
	private Double psf;

	// DMS最大倍数：该设置，是为了控制，如果当日销量超过昨日日均销量的多少倍时则不刷新DMS。
	@NotEmpty(message="DMS最大倍数不能为空!")
	private Double dmsMax;

	// 安全库存天数：该项参数，为了防止供应商因某些原因无法供货而准备的几天的销量库存，以便商场或配送中心在这几天内通过其他途径解决库存问题。
	@NotEmpty(message="安全库存天数不能为空!")
	private Double safeStockDay;

	// 该项参数，默认值为1。通常情况是1，而在年节、促销、价格优势囤货等时可能会按大于日均销量（如1.2倍、1.5倍等）进行计算补货库存，该项值的修改由人工来控制，如在年节前修改成1.5，在年节快要结束前后在修改成1。
	@NotEmpty(message="该项参数不能为空!")
	private Double cov;

	// 排面库存数量：该项参数，是为了保证卖场排面库存，保证卖场商品比较饱满。通常是按照包装的几分之几来设定，如安排食杂类商品，排面量要求是包装的二分之一等。
	@NotEmpty(message="排面库存数量不能为空!")
	private Double shelfStockQty;

	// DMS计算的库存基数（低于这个库存DMS将不刷新）
	@NotEmpty(message="DMS计算的库存基数不能为空!")
	private Double dmsStockBase;

	// 备注
	private String remark;

	public String getSubUnitId() {
		return subUnitId;
	}

	public void setSubUnitId(String subUnitId) {
		this.subUnitId = subUnitId;
	}

	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public Long getFunctionId() {
		return functionId;
	}

	public void setFunctionId(Long functionId) {
		this.functionId = functionId;
	}

	public Long getNdms() {
		return ndms;
	}

	public void setNdms(Long ndms) {
		this.ndms = ndms;
	}

	public Long getNsf() {
		return nsf;
	}

	public void setNsf(Long nsf) {
		this.nsf = nsf;
	}

	public Long getPdms() {
		return pdms;
	}

	public void setPdms(Long pdms) {
		this.pdms = pdms;
	}

	public Double getPsf() {
		return psf;
	}

	public void setPsf(Double psf) {
		this.psf = psf;
	}

	public Double getDmsMax() {
		return dmsMax;
	}

	public void setDmsMax(Double dmsMax) {
		this.dmsMax = dmsMax;
	}

	public Double getSafeStockDay() {
		return safeStockDay;
	}

	public void setSafeStockDay(Double safeStockDay) {
		this.safeStockDay = safeStockDay;
	}

	public Double getCov() {
		return cov;
	}

	public void setCov(Double cov) {
		this.cov = cov;
	}

	public Double getShelfStockQty() {
		return shelfStockQty;
	}

	public void setShelfStockQty(Double shelfStockQty) {
		this.shelfStockQty = shelfStockQty;
	}

	public Double getDmsStockBase() {
		return dmsStockBase;
	}

	public void setDmsStockBase(Double dmsStockBase) {
		this.dmsStockBase = dmsStockBase;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}
