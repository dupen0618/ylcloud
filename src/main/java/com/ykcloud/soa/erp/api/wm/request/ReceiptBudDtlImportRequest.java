
package com.ykcloud.soa.erp.api.wm.request;

import java.util.Date;
import java.util.List;

/**
 * @author 殷剑
 *
 */

import javax.validation.constraints.NotNull;

import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;
import com.ykcloud.soa.erp.api.wm.model.ImportWmBlReceiptDtl;

public class ReceiptBudDtlImportRequest extends AbstractUserSessionRequest {

	/**
	 * 殷剑
	 */
	private static final long serialVersionUID = 6471780752714094363L;
	
	private Long unit_id;	
	private String unit_name;
	private Long settlement_type;	
	private Long sub_unit_id;
	private String sub_unit_name;	
	private Long itemid;
	private Double qty;
	private Double price;
	private Double tax_rate;
	private Date produce_date;	
	private Long pmt_sign;
	
	//导入数据
	List<ImportWmBlReceiptDtl> importWmBlReceiptDtls;

	public Long getUnit_id() {
		return unit_id;
	}

	public void setUnit_id(Long unit_id) {
		this.unit_id = unit_id;
	}

	public String getUnit_name() {
		return unit_name;
	}

	public void setUnit_name(String unit_name) {
		this.unit_name = unit_name;
	}

	public Long getSettlement_type() {
		return settlement_type;
	}

	public void setSettlement_type(Long settlement_type) {
		this.settlement_type = settlement_type;
	}

	public Long getSub_unit_id() {
		return sub_unit_id;
	}

	public void setSub_unit_id(Long sub_unit_id) {
		this.sub_unit_id = sub_unit_id;
	}

	public String getSub_unit_name() {
		return sub_unit_name;
	}

	public void setSub_unit_name(String sub_unit_name) {
		this.sub_unit_name = sub_unit_name;
	}

	public Long getItemid() {
		return itemid;
	}

	public void setItemid(Long itemid) {
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

	public Double getTax_rate() {
		return tax_rate;
	}

	public void setTax_rate(Double tax_rate) {
		this.tax_rate = tax_rate;
	}

	public Date getProduce_date() {
		return produce_date;
	}

	public void setProduce_date(Date produce_date) {
		this.produce_date = produce_date;
	}

	public Long getPmt_sign() {
		return pmt_sign;
	}

	public void setPmt_sign(Long pmt_sign) {
		this.pmt_sign = pmt_sign;
	}

	public List<ImportWmBlReceiptDtl> getImportWmBlReceiptDtls() {
		return importWmBlReceiptDtls;
	}

	public void setImportWmBlReceiptDtls(List<ImportWmBlReceiptDtl> importWmBlReceiptDtls) {
		this.importWmBlReceiptDtls = importWmBlReceiptDtls;
	}
	
}

