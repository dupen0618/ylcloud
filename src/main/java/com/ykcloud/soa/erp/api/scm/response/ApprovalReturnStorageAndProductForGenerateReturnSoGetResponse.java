package com.ykcloud.soa.erp.api.scm.response;

import java.util.List;

import com.gb.soa.omp.ccommon.api.response.MessagePack;
import com.ykcloud.soa.erp.api.scm.model.ApprovalReturnProduct;

/**
 * 根据锁库结果获取指定的退货审批单的仓库及商品出参
 * @author tz.x
 *
 * @date 2018年4月10日上午8:58:43
 */
public class ApprovalReturnStorageAndProductForGenerateReturnSoGetResponse extends MessagePack {

	private static final long serialVersionUID = -70558279745442924L;
	
	/**
	 * 退货申请单编号
	 */
	private String applyNumId;
	
	/**
	 * 结算方式
	 */
	private Long settlementType;
	
	/**
	 * 发货门店编号
	 */
	private Long subUnitNumId;
	
	/**
	 * 收获门店编号
	 */
	private Long custSubUnitNumId;
	
	/**
	 * 业务类型
	 */
	private Long typeNumId;
	
	/**
	 * 出货逻辑仓
	 */
	private Long storageNumId;
	
	/**
	 * 出库物理仓
	 */
	private Long physicalNumId;
	
	/**
	 * 收货逻辑仓
	 */
	private Long recStorageNumId;
	
	/**
	 * 收货物理仓
	 */
	private Long recPhysicalNumId;
	
	/**
	 * 退货商品列表
	 */
	private List<ApprovalReturnProduct> approvalReturnProductList;

	public List<ApprovalReturnProduct> getApprovalReturnProductList() {
		return approvalReturnProductList;
	}

	public void setApprovalReturnProductList(List<ApprovalReturnProduct> approvalReturnProductList) {
		this.approvalReturnProductList = approvalReturnProductList;
	}

	public String getApplyNumId() {
		return applyNumId;
	}

	public void setApplyNumId(String applyNumId) {
		this.applyNumId = applyNumId;
	}

	public Long getSettlementType() {
		return settlementType;
	}

	public void setSettlementType(Long settlementType) {
		this.settlementType = settlementType;
	}

	public Long getSubUnitNumId() {
		return subUnitNumId;
	}

	public void setSubUnitNumId(Long subUnitNumId) {
		this.subUnitNumId = subUnitNumId;
	}

	public Long getCustSubUnitNumId() {
		return custSubUnitNumId;
	}

	public void setCustSubUnitNumId(Long custSubUnitNumId) {
		this.custSubUnitNumId = custSubUnitNumId;
	}

	public Long getTypeNumId() {
		return typeNumId;
	}

	public void setTypeNumId(Long typeNumId) {
		this.typeNumId = typeNumId;
	}

	public Long getStorageNumId() {
		return storageNumId;
	}

	public void setStorageNumId(Long storageNumId) {
		this.storageNumId = storageNumId;
	}

	public Long getPhysicalNumId() {
		return physicalNumId;
	}

	public void setPhysicalNumId(Long physicalNumId) {
		this.physicalNumId = physicalNumId;
	}

	public Long getRecStorageNumId() {
		return recStorageNumId;
	}

	public void setRecStorageNumId(Long recStorageNumId) {
		this.recStorageNumId = recStorageNumId;
	}

	public Long getRecPhysicalNumId() {
		return recPhysicalNumId;
	}

	public void setRecPhysicalNumId(Long recPhysicalNumId) {
		this.recPhysicalNumId = recPhysicalNumId;
	}
	

}
