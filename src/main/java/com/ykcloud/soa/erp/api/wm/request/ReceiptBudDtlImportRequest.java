
package com.ykcloud.soa.erp.api.wm.request;

import java.util.Date;
import java.util.List;

/**
 * @author 殷剑
 *
 */

import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;
import com.ykcloud.soa.erp.api.wm.model.ImportWmBlReceiptDtl;

public class ReceiptBudDtlImportRequest extends AbstractUserSessionRequest {

	/**
	 * 殷剑
	 */
	private static final long serialVersionUID = 6471780752714094363L;
	
	private Long unitId;	
	private String unitName;
	private Long settlementType;	
	private Long subUnitId;
	private String subUnitName;	
	private String itemid;
	private Double qty;
	private Double price;
	private Double taxRate;
	private Date produceDate;	
	private Long pmtSign;
	
	//导入数据
	List<ImportWmBlReceiptDtl> importWmBlReceiptDtls;

	public Long getUnitId() {
		return unitId;
	}

	public void setUnitId(Long unitId) {
		this.unitId = unitId;
	}

	public String getUnitName() {
		return unitName;
	}

	public void setUnitName(String unitName) {
		this.unitName = unitName;
	}

	public Long getSettlementType() {
		return settlementType;
	}

	public void setSettlementType(Long settlementType) {
		this.settlementType = settlementType;
	}

	public Long getSubUnitId() {
		return subUnitId;
	}

	public void setSubUnitId(Long subUnitId) {
		this.subUnitId = subUnitId;
	}

	public String getSubUnitName() {
		return subUnitName;
	}

	public void setSubUnitName(String subUnitName) {
		this.subUnitName = subUnitName;
	}
	
	public String getItemid() {
		return itemid;
	}

	public void setItemid(String itemid) {
		this.itemid = itemid;
	}

	public Double getQty() {
		return qty;
	}

	public void setQty(Double qty) {
		this.qty = qty;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Double getTaxRate() {
		return taxRate;
	}

	public void setTaxRate(Double taxRate) {
		this.taxRate = taxRate;
	}

	public Date getProduceDate() {
		return produceDate;
	}

	public void setProduceDate(Date produceDate) {
		this.produceDate = produceDate;
	}

	public Long getPmtSign() {
		return pmtSign;
	}

	public void setPmtSign(Long pmtSign) {
		this.pmtSign = pmtSign;
	}

	public List<ImportWmBlReceiptDtl> getImportWmBlReceiptDtls() {
		return importWmBlReceiptDtls;
	}

	public void setImportWmBlReceiptDtls(List<ImportWmBlReceiptDtl> importWmBlReceiptDtls) {
		this.importWmBlReceiptDtls = importWmBlReceiptDtls;
	}
	
}

