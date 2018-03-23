package com.ykcloud.soa.erp.api.scm.response;

import java.util.Date;

import com.gb.soa.omp.ccommon.api.response.MessagePack;

/**
 * 获取商品补货参考数量的出参类
 * 
 * @author 14540
 *
 */
public class ProductDemandQtyGetResponse extends MessagePack {

	private Date lastSaleDate; // 最近销售日期

	private Date lastReceiveDate; // 最近收货日期

	private Double monthSaleQty; // 月销售量

	private Double lastWeekSaleQty; // 上周销售量

	private Double thisWeekSaleQty; // 本周销量

	private Double dailySaleQty; // 日销售量

	private Double lastWeekDailySaleQty;// 上周日均销售量

	private Double lastMonthSaleQty;// 上月销量

	private Double thisMonthSaleQty;// 本月销量

	private Double backwardOneWeekSaleQty; // 倒推一周的销量

	private Double backwardTwoWeekSaleQty; // 倒推二周的销量

	private Double backwardThreeWeekSaleQty; // 倒推三周的销量

	private Double backwardFourWeekSaleQty; // 倒推四周的销量

	private Double openApplyQty; // 在途补货数量

	private Double openOrderQty; // 在途订货数量

	private Double openRationQty; // 在途配送数量

	private Double openDistDeliveryQty; // 仓库配送数

	private Double openBranchDeliveryQty; // 分仓在途数


	private Double returnQty; // 待退数

	public Date getLastSaleDate() {
		return lastSaleDate;
	}

	public void setLastSaleDate(Date lastSaleDate) {
		this.lastSaleDate = lastSaleDate;
	}

	public Date getLastReceiveDate() {
		return lastReceiveDate;
	}

	public void setLastReceiveDate(Date lastReceiveDate) {
		this.lastReceiveDate = lastReceiveDate;
	}

	public Double getMonthSaleQty() {
		return monthSaleQty;
	}

	public void setMonthSaleQty(Double monthSaleQty) {
		this.monthSaleQty = monthSaleQty;
	}

	public Double getLastWeekSaleQty() {
		return lastWeekSaleQty;
	}

	public void setLastWeekSaleQty(Double lastWeekSaleQty) {
		this.lastWeekSaleQty = lastWeekSaleQty;
	}

	public Double getDailySaleQty() {
		return dailySaleQty;
	}

	public void setDailySaleQty(Double dailySaleQty) {
		this.dailySaleQty = dailySaleQty;
	}

	public Double getLastWeekDailySaleQty() {
		return lastWeekDailySaleQty;
	}

	public void setLastWeekDailySaleQty(Double lastWeekDailySaleQty) {
		this.lastWeekDailySaleQty = lastWeekDailySaleQty;
	}

	public Double getLastMonthSaleQty() {
		return lastMonthSaleQty;
	}

	public void setLastMonthSaleQty(Double lastMonthSaleQty) {
		this.lastMonthSaleQty = lastMonthSaleQty;
	}

	public Double getThisMonthSaleQty() {
		return thisMonthSaleQty;
	}

	public void setThisMonthSaleQty(Double thisMonthSaleQty) {
		this.thisMonthSaleQty = thisMonthSaleQty;
	}

	public Double getBackwardOneWeekSaleQty() {
		return backwardOneWeekSaleQty;
	}

	public void setBackwardOneWeekSaleQty(Double backwardOneWeekSaleQty) {
		this.backwardOneWeekSaleQty = backwardOneWeekSaleQty;
	}

	public Double getBackwardTwoWeekSaleQty() {
		return backwardTwoWeekSaleQty;
	}

	public void setBackwardTwoWeekSaleQty(Double backwardTwoWeekSaleQty) {
		this.backwardTwoWeekSaleQty = backwardTwoWeekSaleQty;
	}

	public Double getBackwardThreeWeekSaleQty() {
		return backwardThreeWeekSaleQty;
	}

	public void setBackwardThreeWeekSaleQty(Double backwardThreeWeekSaleQty) {
		this.backwardThreeWeekSaleQty = backwardThreeWeekSaleQty;
	}

	public Double getBackwardFourWeekSaleQty() {
		return backwardFourWeekSaleQty;
	}

	public void setBackwardFourWeekSaleQty(Double backwardFourWeekSaleQty) {
		this.backwardFourWeekSaleQty = backwardFourWeekSaleQty;
	}

	public Double getOpenApplyQty() {
		return openApplyQty;
	}

	public void setOpenApplyQty(Double openApplyQty) {
		this.openApplyQty = openApplyQty;
	}

	public Double getOpenOrderQty() {
		return openOrderQty;
	}

	public void setOpenOrderQty(Double openOrderQty) {
		this.openOrderQty = openOrderQty;
	}

	public Double getOpenRationQty() {
		return openRationQty;
	}

	public void setOpenRationQty(Double openRationQty) {
		this.openRationQty = openRationQty;
	}

	public Double getOpenDistDeliveryQty() {
		return openDistDeliveryQty;
	}

	public void setOpenDistDeliveryQty(Double openDistDeliveryQty) {
		this.openDistDeliveryQty = openDistDeliveryQty;
	}

	public Double getOpenBranchDeliveryQty() {
		return openBranchDeliveryQty;
	}

	public void setOpenBranchDeliveryQty(Double openBranchDeliveryQty) {
		this.openBranchDeliveryQty = openBranchDeliveryQty;
	}

	public Double getReturnQty() {
		return returnQty;
	}

	public void setReturnQty(Double returnQty) {
		this.returnQty = returnQty;
	}

	public Double getThisWeekSaleQty() {
		return thisWeekSaleQty;
	}

	public void setThisWeekSaleQty(Double thisWeekSaleQty) {
		this.thisWeekSaleQty = thisWeekSaleQty;
	}

}
