package com.ykcloud.soa.erp.api.wm.model;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by yiako on 2018/3/27
 */
public class ScmAccInvOwnStkTsc implements Serializable {
	private static final long serialVersionUID = 1L;
	static SimpleDateFormat dateFormater = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	/** 行号 */
	private String series = "0";

	/** 租户ID */
	private Long tenantNumId = 0L;
	/** 交易单号 */
	private String reservedNo = "0";
	/** 物流中心主键 */
	private Long stkNumId = 0L;
	/** 事业部主键 */
	private Long divNumId = 0L;
	/** 汇总公司 */
	private Long ownNumId = 0L;
	/** 核算公司 */
	private Long recvOwnNumId = 0L;
	/** 物料主键 */
	private Long itemNumId = 0L;
	/** 交易数量 */
	private Double reservedQty = 0.00;
	/** 逻辑仓库 */
	private Long storageNumId = 0L;
	/** 库存属性(标记0:正常品、1:赠送品、2:促销品、3:残次品) */
	private Long locPtyNumId = 0L;
	/**
	 * 交易方式0:在途,1:收货入库,2:锁定,3:预约，4：预出库，5:生成拣货，6：取消预出库，7：取消生成拣货，9:盘盈,10:移入,11:移出,
	 * 12:短拣,13:短发,14:发运交接,15:发货扫回,16:盘亏,17：取消锁库，18：取消预约
	 */
	private Long balanceFunction = 0L;
	/** 创建时间 */
	private Date createDtme = new Date();
	/** 最后更新时间 */
	private Date lastUpdtme = new Date();
	/** 用户 */
	private Long createUserId = 0L;
	/** 更新用户 */
	private Long lastUpdateUserId = 0L;
	/** 操作类型1 新增 2 删除 */
	private Long actionType = 1L;
	/** 行号 */
	private String soLine = "0";
	/** 门店编号 */
	private Long subUnitNumId = 0L;
	/** 发起交易单号 */
	private String triggerBillid = "0";
	/** 发起交易单行号 */
	private String triggerBillLine = "0";
	/** 0: 正式 1：测试 */
	private Long dataSign = 0L;
	/** 系统来源:0,中台;1,OMS;2,WMS */
	private Long systemFlag = 0L;

	private String remark;

	private String billTypeNumId;


	private Long PTY_NUM_1;

	private Long PTY_NUM_2;

	private Long PTY_NUM_3;

	private Long DEPART_NUM_ID;

	private Long SETTLEMENT_TYPE;

	private Long STORE_TYPE;

	private String ITEMID;

	private Date ORDER_DATE;

	private Long TypeNumId;

	public Long getSETTLEMENT_TYPE() {
		return SETTLEMENT_TYPE;
	}

	public void setSETTLEMENT_TYPE(Long SETTLEMENT_TYPE) {
		this.SETTLEMENT_TYPE = SETTLEMENT_TYPE;
	}

	public static SimpleDateFormat getDateFormater() {
		return dateFormater;
	}

	public static void setDateFormater(SimpleDateFormat dateFormater) {
		ScmAccInvOwnStkTsc.dateFormater = dateFormater;
	}

	public String getSeries() {
		return series;
	}

	public void setSeries(String series) {
		this.series = series;
	}

	public String getReservedNo() {
		return reservedNo;
	}

	public void setReservedNo(String reservedNo) {
		this.reservedNo = reservedNo;
	}

	public Long getStkNumId() {
		return stkNumId;
	}

	public void setStkNumId(Long stkNumId) {
		this.stkNumId = stkNumId;
	}

	public Long getDivNumId() {
		return divNumId;
	}

	public void setDivNumId(Long divNumId) {
		this.divNumId = divNumId;
	}

	public Long getOwnNumId() {
		return ownNumId;
	}

	public void setOwnNumId(Long ownNumId) {
		this.ownNumId = ownNumId;
	}

	public Long getRecvOwnNumId() {
		return recvOwnNumId;
	}

	public void setRecvOwnNumId(Long recvOwnNumId) {
		this.recvOwnNumId = recvOwnNumId;
	}

	public Long getItemNumId() {
		return itemNumId;
	}

	public void setItemNumId(Long itemNumId) {
		this.itemNumId = itemNumId;
	}

	public Double getReservedQty() {
		return reservedQty;
	}

	public void setReservedQty(Double reservedQty) {
		this.reservedQty = reservedQty;
	}

	public Long getStorageNumId() {
		return storageNumId;
	}

	public void setStorageNumId(Long storageNumId) {
		this.storageNumId = storageNumId;
	}

	public Long getLocPtyNumId() {
		return locPtyNumId;
	}

	public void setLocPtyNumId(Long locPtyNumId) {
		this.locPtyNumId = locPtyNumId;
	}

	public Long getBalanceFunction() {
		return balanceFunction;
	}

	public void setBalanceFunction(Long balanceFunction) {
		this.balanceFunction = balanceFunction;
	}

	public Date getCreateDtme() {
		return createDtme;
	}

	public void setCreateDtme(Date createDtme) {
		this.createDtme = createDtme;
	}

	public Date getLastUpdtme() {
		return lastUpdtme;
	}

	public void setLastUpdtme(Date lastUpdtme) {
		this.lastUpdtme = lastUpdtme;
	}

	public Long getCreateUserId() {
		return createUserId;
	}

	public void setCreateUserId(Long createUserId) {
		this.createUserId = createUserId;
	}

	public Long getLastUpdateUserId() {
		return lastUpdateUserId;
	}

	public void setLastUpdateUserId(Long lastUpdateUserId) {
		this.lastUpdateUserId = lastUpdateUserId;
	}

	public Long getActionType() {
		return actionType;
	}

	public void setActionType(Long actionType) {
		this.actionType = actionType;
	}

	public String getSoLine() {
		return soLine;
	}

	public void setSoLine(String soLine) {
		this.soLine = soLine;
	}

	public Long getSubUnitNumId() {
		return subUnitNumId;
	}

	public void setSubUnitNumId(Long subUnitNumId) {
		this.subUnitNumId = subUnitNumId;
	}

	public String getTriggerBillid() {
		return triggerBillid;
	}

	public void setTriggerBillid(String triggerBillid) {
		this.triggerBillid = triggerBillid;
	}

	public String getTriggerBillLine() {
		return triggerBillLine;
	}

	public void setTriggerBillLine(String triggerBillLine) {
		this.triggerBillLine = triggerBillLine;
	}

	public Long getSystemFlag() {
		return systemFlag;
	}

	public void setSystemFlag(Long systemFlag) {
		this.systemFlag = systemFlag;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getBillTypeNumId() {
		return billTypeNumId;
	}

	public void setBillTypeNumId(String billTypeNumId) {
		this.billTypeNumId = billTypeNumId;
	}

	public Long getTenantNumId() {
		return tenantNumId;
	}

	public void setTenantNumId(Long tenantNumId) {
		this.tenantNumId = tenantNumId;
	}

	public Long getDataSign() {
		return dataSign;
	}

	public void setDataSign(Long dataSign) {
		this.dataSign = dataSign;
	}

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}


	public Long getPTY_NUM_1() {
		return PTY_NUM_1;
	}

	public void setPTY_NUM_1(Long PTY_NUM_1) {
		this.PTY_NUM_1 = PTY_NUM_1;
	}

	public Long getPTY_NUM_2() {
		return PTY_NUM_2;
	}

	public void setPTY_NUM_2(Long PTY_NUM_2) {
		this.PTY_NUM_2 = PTY_NUM_2;
	}

	public Long getPTY_NUM_3() {
		return PTY_NUM_3;
	}

	public void setPTY_NUM_3(Long PTY_NUM_3) {
		this.PTY_NUM_3 = PTY_NUM_3;
	}

	public Long getDEPART_NUM_ID() {
		return DEPART_NUM_ID;
	}

	public void setDEPART_NUM_ID(Long DEPART_NUM_ID) {
		this.DEPART_NUM_ID = DEPART_NUM_ID;
	}

	public Long getSTORE_TYPE() {
		return STORE_TYPE;
	}

	public void setSTORE_TYPE(Long STORE_TYPE) {
		this.STORE_TYPE = STORE_TYPE;
	}

	public String getITEMID() {
		return ITEMID;
	}

	public void setITEMID(String ITEMID) {
		this.ITEMID = ITEMID;
	}

	public Date getORDER_DATE() {
		return ORDER_DATE;
	}

	public void setORDER_DATE(Date oRDER_DATE) {
		ORDER_DATE = oRDER_DATE;
	}

	public Long getTypeNumId() {
		return TypeNumId;
	}

	public void setTypeNumId(Long typeNumId) {
		TypeNumId = typeNumId;
	}
}
