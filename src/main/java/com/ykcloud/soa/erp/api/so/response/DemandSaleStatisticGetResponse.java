package com.ykcloud.soa.erp.api.so.response;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.gb.soa.omp.ccommon.api.response.MessagePack;

/**
 * 查询销售状态的出参类
 * 
 * @author 14540
 *
 */
public class DemandSaleStatisticGetResponse extends MessagePack {
	private static final long serialVersionUID = 1L;

	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
	private Date lastSaleDate; // 最近销售日期,格式yyyy-mm-dd

	private Double monthSaleQty; // 月销售量

	private Double lastWeekSaleQty; // 上周销量

	private Double dailySaleQty; // 日销量

	private Double thisWeekSaleQty; // 本周销量

	private Double lastWeekDailySaleQty; // 上周日均销量

	private Double lastMonthSaleQty; // 上月销量

	private Double thisMonthSaleQty; // 本月销量

	private Double backWardOneWeekSaleQty;// 倒推第一周的销量

	private Double backWardTwoWeekSaleQty;// 倒推第二周的销量

	private Double backWardThreeWeekSaleQty;// 倒推第三周的销量

	private Double backWardFourWeekSaleQty;// 倒推第四周的销量

	public Date getLastSaleDate() {
		return lastSaleDate;
	}

	public void setLastSaleDate(Date lastSaleDate) {
		this.lastSaleDate = lastSaleDate;
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

	public Double getThisWeekSaleQty() {
		return thisWeekSaleQty;
	}

	public void setThisWeekSaleQty(Double thisWeekSaleQty) {
		this.thisWeekSaleQty = thisWeekSaleQty;
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

	public Double getBackWardOneWeekSaleQty() {
		return backWardOneWeekSaleQty;
	}

	public void setBackWardOneWeekSaleQty(Double backWardOneWeekSaleQty) {
		this.backWardOneWeekSaleQty = backWardOneWeekSaleQty;
	}

	public Double getBackWardTwoWeekSaleQty() {
		return backWardTwoWeekSaleQty;
	}

	public void setBackWardTwoWeekSaleQty(Double backWardTwoWeekSaleQty) {
		this.backWardTwoWeekSaleQty = backWardTwoWeekSaleQty;
	}

	public Double getBackWardThreeWeekSaleQty() {
		return backWardThreeWeekSaleQty;
	}

	public void setBackWardThreeWeekSaleQty(Double backWardThreeWeekSaleQty) {
		this.backWardThreeWeekSaleQty = backWardThreeWeekSaleQty;
	}

	public Double getBackWardFourWeekSaleQty() {
		return backWardFourWeekSaleQty;
	}

	public void setBackWardFourWeekSaleQty(Double backWardFourWeekSaleQty) {
		this.backWardFourWeekSaleQty = backWardFourWeekSaleQty;
	}

}
