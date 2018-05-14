package com.ykcloud.soa.erp.api.so.request;

import java.util.Date;
import java.util.List;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;
import com.ykcloud.soa.erp.api.so.model.ImportShopTransferDtl;

/**
 * 店间调拨批量导入
 * @author tz.x
 * @date 2018年5月14日下午2:34:30
 */
public class ShopTransferDtlImportRequest extends AbstractUserSessionRequest {

	private static final long serialVersionUID = 1225427189445833246L;
	
	@NotNull(message = "订货门店编号不能为空！")
	private Long subUnitNumId;

	@NotNull(message = "订单日期不能为空！")
	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
	private Date orderDate;

	@NotNull(message = "审批单号不能为空！")
	private String applyNumId;
	
	@NotEmpty(message = "导入明细不能为空！")
	private List<ImportShopTransferDtl> importShopTransferDtls;

	public Long getSubUnitNumId() {
		return subUnitNumId;
	}

	public void setSubUnitNumId(Long subUnitNumId) {
		this.subUnitNumId = subUnitNumId;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public String getApplyNumId() {
		return applyNumId;
	}

	public void setApplyNumId(String applyNumId) {
		this.applyNumId = applyNumId;
	}

	public List<ImportShopTransferDtl> getImportShopTransferDtls() {
		return importShopTransferDtls;
	}

	public void setImportShopTransferDtls(List<ImportShopTransferDtl> importShopTransferDtls) {
		this.importShopTransferDtls = importShopTransferDtls;
	}

}
