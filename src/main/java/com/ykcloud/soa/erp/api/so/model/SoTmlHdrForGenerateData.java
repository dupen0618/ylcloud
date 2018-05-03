package com.ykcloud.soa.erp.api.so.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @Author: fred.zhao
 * @Description: 查询so小票单头model
 * @Date: Created in 12:02:2018/4/19
 */
public class SoTmlHdrForGenerateData implements Serializable{

    private static final long serialVersionUID = 1461473078873394382L;

    private String series;//序号

    private Long tenantNumId;//租户id

    private String tmlNumId;//终端订单号

    private String soNo;//业务单号，第三方小单号

    private String customerSoNo;//客户交易编号 第三方大单号

    private Long typeNumId;//订单类型类型

    private Long soFromType;//订单子类型

    private Date orderDate;//订单日期

    private Long stkNumId;//物流中心主键

    private Long logicalStorageId; //逻辑仓库

    private Long divNumId;//事业部主键

    private Long cortNumId;//公司

    private Long unitNumId;//客户单元

    private Long comNumId;//核算公司

    private Long subUnitNumId;//门店

    private Long custCortNumId;//客户公司

    private Long custUnitNumId;//客户单元

    private Long custComNumId;//事业部客户

    private Long custSubUnitNumId;//业务子单元

    private Long recvComNumId;//收货客户

    private Long recvBuilddingNumId;//收货实体

    private Long recvAdrNumId;//收货线路地址

    private String adrRemark;//自提收货地址

    private Long tranSimNumId;//快递方式

    private Long tranTypeNumId;//提货方式>1的会产生装箱出货单

    private Date shipTimeProclaim;//时间要求

    private String  enContEmpe1;//英文联络人一

    private String contEmpe1Postcode;//联络人一邮编

    private String contEmpe1Telephone;//联络人一电话

    private String contEmpe1Fax;//联络人一传真

    private String contEmpe1Adr;//联络人一地址

    private String enContEmpe1Adr;//英文联络人一地址

    private String contEmpe1Mail;//联络人一邮址

    private String vipNo;//VIP会员编号

    private Long vipType;//会员分类

    private Long statusNumId;//状态

    private Long prvNumId;//省份

    private Long cityNumId;//城市

    private Long cityAreaNumId;//县(区)

    private Long townNumId;//镇区

    private Long payUnitNumId;//付款客户单元

    private Long payCortNumId;//付款客户

    private Long recvStkNumId;//收货物流中心

    private String meetingSign;//会议标识(Y$N$A$F)

    private Date createDtme;//创建时间

    private Date lastUpdtme;//最后更新时间

    private Long createUserId;//用户

    private Long lastUpdateUserId;//更新用户

    private String cancelsign;//删除

    private String updatedata;//更新

    private String insertdata;//新增

    private Long policyOwnNumId;//POS小票政策制定公司

    private Long balanceSign;//结算标识 0未日结，1已日结，2已月结

    private Long tmlClientId;//POS机终端号

    private Long sourceTmlNumId;//退、换货引用原始订单号

    private Long settlementTypeId;//结算模式1：正常销售  2：花车销售

    private Long invStatusId;//0：库存未处理，1：库存已处理，2：全取消发货，3：取消红冲单

    private String senddata;//通讯

    private Double preight;//运费

    private Long exportToDrp;//库存发货/退货完成

    private Long soSign;//订单标识：0：正常；1：申请

    private Long userNumId;//O2O会员编号

    private Double surplusValue;//剩余价值

    private String handoverId;//班次

    private Long channelNumId;//来源渠道(POS线下90、线上91、微商城92、妈妈好APP93 的小票)

    private Long svFlag;//销售分摊标志，0未分摊，100已分摊

    private String remark;//备注

    private Long senddataToApp;//推送信息给APP：0未推送，1推送成功，-1推送失败

    private String pickUser;//退货取件人的名称

    private String PICK_TEL;//退货取件人的联系方式  pickTel

    private Date PICK_TIME;//退货取件人预计到达时间  pickTime

    private String SHIPTRANNO;//退货快递单号  shiptranno

    private Long RETURN_TYPE;//退还方式1：退回本店 2：原路返回3：指定退货点4：截单退货  returnType

    private Long PARENT_TML_NUM_ID;//父终端订单号  parentTmlNumId

    private Long tradeTypeId;//发货方式：1款到发货，2是货到付款（快递方式表新增一个字段，是不是货到付款，必须由支持的快递方式锁库和发货）

    private Long fcsign;//是否指定快递方式，0不指定，1指定

    private String infocomefromid;//信息来源Id  ：渠道是淘宝分销，信息来源可能是分销下的很多店，方便报表结算

    private Long isgiftorder;//是否赠品订单

    private Long orderformflag;//订单标记(01:积分中心订单(赠品),02:旗舰店订单)--参考现有逻辑，跟锁库有关。

    private Long stateRemark;//电商状态最新编号

    private Long sfddy;//是否活动订单，0非活动,1活动 （1异步锁库，0同步锁库，不成功直接返回结果，1如果锁库不成功，返回CRM锁库状态）

    private Long dataSign;//0: 正式  1：测试

    private Long ecShopNumId;//电商门店

    private Long isCod;//是否COD订单

    private Long ecCpsShopNumId;//CPS门店

    private Long couponNumId;//couponNumId  团购单号

    private Long offUpSign;//离线订单上传标识

    private Double freight;//运费


    public Double getFreight() {
        return freight;
    }

    public void setFreight(Double freight) {
        this.freight = freight;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public Long getTenantNumId() {
        return tenantNumId;
    }

    public void setTenantNumId(Long tenantNumId) {
        this.tenantNumId = tenantNumId;
    }

    public String getTmlNumId() {
        return tmlNumId;
    }

    public void setTmlNumId(String tmlNumId) {
        this.tmlNumId = tmlNumId;
    }

    public String getSoNo() {
        return soNo;
    }

    public void setSoNo(String soNo) {
        this.soNo = soNo;
    }

    public String getCustomerSoNo() {
        return customerSoNo;
    }

    public void setCustomerSoNo(String customerSoNo) {
        this.customerSoNo = customerSoNo;
    }

    public Long getTypeNumId() {
        return typeNumId;
    }

    public void setTypeNumId(Long typeNumId) {
        this.typeNumId = typeNumId;
    }

    public Long getSoFromType() {
        return soFromType;
    }

    public void setSoFromType(Long soFromType) {
        this.soFromType = soFromType;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Long getStkNumId() {
        return stkNumId;
    }

    public void setStkNumId(Long stkNumId) {
        this.stkNumId = stkNumId;
    }

    public Long getLogicalStorageId() {
        return logicalStorageId;
    }

    public void setLogicalStorageId(Long logicalStorageId) {
        this.logicalStorageId = logicalStorageId;
    }

    public Long getDivNumId() {
        return divNumId;
    }

    public void setDivNumId(Long divNumId) {
        this.divNumId = divNumId;
    }

    public Long getCortNumId() {
        return cortNumId;
    }

    public void setCortNumId(Long cortNumId) {
        this.cortNumId = cortNumId;
    }

    public Long getUnitNumId() {
        return unitNumId;
    }

    public void setUnitNumId(Long unitNumId) {
        this.unitNumId = unitNumId;
    }

    public Long getComNumId() {
        return comNumId;
    }

    public void setComNumId(Long comNumId) {
        this.comNumId = comNumId;
    }

    public Long getSubUnitNumId() {
        return subUnitNumId;
    }

    public void setSubUnitNumId(Long subUnitNumId) {
        this.subUnitNumId = subUnitNumId;
    }

    public Long getCustCortNumId() {
        return custCortNumId;
    }

    public void setCustCortNumId(Long custCortNumId) {
        this.custCortNumId = custCortNumId;
    }

    public Long getCustUnitNumId() {
        return custUnitNumId;
    }

    public void setCustUnitNumId(Long custUnitNumId) {
        this.custUnitNumId = custUnitNumId;
    }

    public Long getCustComNumId() {
        return custComNumId;
    }

    public void setCustComNumId(Long custComNumId) {
        this.custComNumId = custComNumId;
    }

    public Long getCustSubUnitNumId() {
        return custSubUnitNumId;
    }

    public void setCustSubUnitNumId(Long custSubUnitNumId) {
        this.custSubUnitNumId = custSubUnitNumId;
    }

    public Long getRecvComNumId() {
        return recvComNumId;
    }

    public void setRecvComNumId(Long recvComNumId) {
        this.recvComNumId = recvComNumId;
    }

    public Long getRecvBuilddingNumId() {
        return recvBuilddingNumId;
    }

    public void setRecvBuilddingNumId(Long recvBuilddingNumId) {
        this.recvBuilddingNumId = recvBuilddingNumId;
    }

    public Long getRecvAdrNumId() {
        return recvAdrNumId;
    }

    public void setRecvAdrNumId(Long recvAdrNumId) {
        this.recvAdrNumId = recvAdrNumId;
    }

    public String getAdrRemark() {
        return adrRemark;
    }

    public void setAdrRemark(String adrRemark) {
        this.adrRemark = adrRemark;
    }

    public Long getTranSimNumId() {
        return tranSimNumId;
    }

    public void setTranSimNumId(Long tranSimNumId) {
        this.tranSimNumId = tranSimNumId;
    }

    public Long getTranTypeNumId() {
        return tranTypeNumId;
    }

    public void setTranTypeNumId(Long tranTypeNumId) {
        this.tranTypeNumId = tranTypeNumId;
    }

    public Date getShipTimeProclaim() {
        return shipTimeProclaim;
    }

    public void setShipTimeProclaim(Date shipTimeProclaim) {
        this.shipTimeProclaim = shipTimeProclaim;
    }

    public String getEnContEmpe1() {
        return enContEmpe1;
    }

    public void setEnContEmpe1(String enContEmpe1) {
        this.enContEmpe1 = enContEmpe1;
    }

    public String getContEmpe1Postcode() {
        return contEmpe1Postcode;
    }

    public void setContEmpe1Postcode(String contEmpe1Postcode) {
        this.contEmpe1Postcode = contEmpe1Postcode;
    }

    public String getContEmpe1Telephone() {
        return contEmpe1Telephone;
    }

    public void setContEmpe1Telephone(String contEmpe1Telephone) {
        this.contEmpe1Telephone = contEmpe1Telephone;
    }

    public String getContEmpe1Fax() {
        return contEmpe1Fax;
    }

    public void setContEmpe1Fax(String contEmpe1Fax) {
        this.contEmpe1Fax = contEmpe1Fax;
    }

    public String getContEmpe1Adr() {
        return contEmpe1Adr;
    }

    public void setContEmpe1Adr(String contEmpe1Adr) {
        this.contEmpe1Adr = contEmpe1Adr;
    }

    public String getEnContEmpe1Adr() {
        return enContEmpe1Adr;
    }

    public void setEnContEmpe1Adr(String enContEmpe1Adr) {
        this.enContEmpe1Adr = enContEmpe1Adr;
    }

    public String getContEmpe1Mail() {
        return contEmpe1Mail;
    }

    public void setContEmpe1Mail(String contEmpe1Mail) {
        this.contEmpe1Mail = contEmpe1Mail;
    }

    public String getVipNo() {
        return vipNo;
    }

    public void setVipNo(String vipNo) {
        this.vipNo = vipNo;
    }

    public Long getVipType() {
        return vipType;
    }

    public void setVipType(Long vipType) {
        this.vipType = vipType;
    }

    public Long getStatusNumId() {
        return statusNumId;
    }

    public void setStatusNumId(Long statusNumId) {
        this.statusNumId = statusNumId;
    }

    public Long getPrvNumId() {
        return prvNumId;
    }

    public void setPrvNumId(Long prvNumId) {
        this.prvNumId = prvNumId;
    }

    public Long getCityNumId() {
        return cityNumId;
    }

    public void setCityNumId(Long cityNumId) {
        this.cityNumId = cityNumId;
    }

    public Long getCityAreaNumId() {
        return cityAreaNumId;
    }

    public void setCityAreaNumId(Long cityAreaNumId) {
        this.cityAreaNumId = cityAreaNumId;
    }

    public Long getTownNumId() {
        return townNumId;
    }

    public void setTownNumId(Long townNumId) {
        this.townNumId = townNumId;
    }

    public Long getPayUnitNumId() {
        return payUnitNumId;
    }

    public void setPayUnitNumId(Long payUnitNumId) {
        this.payUnitNumId = payUnitNumId;
    }

    public Long getPayCortNumId() {
        return payCortNumId;
    }

    public void setPayCortNumId(Long payCortNumId) {
        this.payCortNumId = payCortNumId;
    }

    public Long getRecvStkNumId() {
        return recvStkNumId;
    }

    public void setRecvStkNumId(Long recvStkNumId) {
        this.recvStkNumId = recvStkNumId;
    }

    public String getMeetingSign() {
        return meetingSign;
    }

    public void setMeetingSign(String meetingSign) {
        this.meetingSign = meetingSign;
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

    public String getCancelsign() {
        return cancelsign;
    }

    public void setCancelsign(String cancelsign) {
        this.cancelsign = cancelsign;
    }

    public String getUpdatedata() {
        return updatedata;
    }

    public void setUpdatedata(String updatedata) {
        this.updatedata = updatedata;
    }

    public String getInsertdata() {
        return insertdata;
    }

    public void setInsertdata(String insertdata) {
        this.insertdata = insertdata;
    }

    public Long getPolicyOwnNumId() {
        return policyOwnNumId;
    }

    public void setPolicyOwnNumId(Long policyOwnNumId) {
        this.policyOwnNumId = policyOwnNumId;
    }

    public Long getBalanceSign() {
        return balanceSign;
    }

    public void setBalanceSign(Long balanceSign) {
        this.balanceSign = balanceSign;
    }

    public Long getTmlClientId() {
        return tmlClientId;
    }

    public void setTmlClientId(Long tmlClientId) {
        this.tmlClientId = tmlClientId;
    }

    public Long getSourceTmlNumId() {
        return sourceTmlNumId;
    }

    public void setSourceTmlNumId(Long sourceTmlNumId) {
        this.sourceTmlNumId = sourceTmlNumId;
    }

    public Long getSettlementTypeId() {
        return settlementTypeId;
    }

    public void setSettlementTypeId(Long settlementTypeId) {
        this.settlementTypeId = settlementTypeId;
    }

    public Long getInvStatusId() {
        return invStatusId;
    }

    public void setInvStatusId(Long invStatusId) {
        this.invStatusId = invStatusId;
    }

    public String getSenddata() {
        return senddata;
    }

    public void setSenddata(String senddata) {
        this.senddata = senddata;
    }

    public Double getPreight() {
        return preight;
    }

    public void setPreight(Double preight) {
        this.preight = preight;
    }

    public Long getExportToDrp() {
        return exportToDrp;
    }

    public void setExportToDrp(Long exportToDrp) {
        this.exportToDrp = exportToDrp;
    }

    public Long getSoSign() {
        return soSign;
    }

    public void setSoSign(Long soSign) {
        this.soSign = soSign;
    }

    public Long getUserNumId() {
        return userNumId;
    }

    public void setUserNumId(Long userNumId) {
        this.userNumId = userNumId;
    }

    public Double getSurplusValue() {
        return surplusValue;
    }

    public void setSurplusValue(Double surplusValue) {
        this.surplusValue = surplusValue;
    }

    public String getHandoverId() {
        return handoverId;
    }

    public void setHandoverId(String handoverId) {
        this.handoverId = handoverId;
    }

    public Long getChannelNumId() {
        return channelNumId;
    }

    public void setChannelNumId(Long channelNumId) {
        this.channelNumId = channelNumId;
    }

    public Long getSvFlag() {
        return svFlag;
    }

    public void setSvFlag(Long svFlag) {
        this.svFlag = svFlag;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Long getSenddataToApp() {
        return senddataToApp;
    }

    public void setSenddataToApp(Long senddataToApp) {
        this.senddataToApp = senddataToApp;
    }

    public String getPickUser() {
        return pickUser;
    }

    public void setPickUser(String pickUser) {
        this.pickUser = pickUser;
    }

    public String getPICK_TEL() {
        return PICK_TEL;
    }

    public void setPICK_TEL(String PICK_TEL) {
        this.PICK_TEL = PICK_TEL;
    }

    public Date getPICK_TIME() {
        return PICK_TIME;
    }

    public void setPICK_TIME(Date PICK_TIME) {
        this.PICK_TIME = PICK_TIME;
    }

    public String getSHIPTRANNO() {
        return SHIPTRANNO;
    }

    public void setSHIPTRANNO(String SHIPTRANNO) {
        this.SHIPTRANNO = SHIPTRANNO;
    }

    public Long getRETURN_TYPE() {
        return RETURN_TYPE;
    }

    public void setRETURN_TYPE(Long RETURN_TYPE) {
        this.RETURN_TYPE = RETURN_TYPE;
    }

    public Long getPARENT_TML_NUM_ID() {
        return PARENT_TML_NUM_ID;
    }

    public void setPARENT_TML_NUM_ID(Long PARENT_TML_NUM_ID) {
        this.PARENT_TML_NUM_ID = PARENT_TML_NUM_ID;
    }

    public Long getTradeTypeId() {
        return tradeTypeId;
    }

    public void setTradeTypeId(Long tradeTypeId) {
        this.tradeTypeId = tradeTypeId;
    }

    public Long getFcsign() {
        return fcsign;
    }

    public void setFcsign(Long fcsign) {
        this.fcsign = fcsign;
    }

    public String getInfocomefromid() {
        return infocomefromid;
    }

    public void setInfocomefromid(String infocomefromid) {
        this.infocomefromid = infocomefromid;
    }

    public Long getIsgiftorder() {
        return isgiftorder;
    }

    public void setIsgiftorder(Long isgiftorder) {
        this.isgiftorder = isgiftorder;
    }

    public Long getOrderformflag() {
        return orderformflag;
    }

    public void setOrderformflag(Long orderformflag) {
        this.orderformflag = orderformflag;
    }

    public Long getStateRemark() {
        return stateRemark;
    }

    public void setStateRemark(Long stateRemark) {
        this.stateRemark = stateRemark;
    }

    public Long getSfddy() {
        return sfddy;
    }

    public void setSfddy(Long sfddy) {
        this.sfddy = sfddy;
    }

    public Long getDataSign() {
        return dataSign;
    }

    public void setDataSign(Long dataSign) {
        this.dataSign = dataSign;
    }

    public Long getEcShopNumId() {
        return ecShopNumId;
    }

    public void setEcShopNumId(Long ecShopNumId) {
        this.ecShopNumId = ecShopNumId;
    }

    public Long getIsCod() {
        return isCod;
    }

    public void setIsCod(Long isCod) {
        this.isCod = isCod;
    }

    public Long getEcCpsShopNumId() {
        return ecCpsShopNumId;
    }

    public void setEcCpsShopNumId(Long ecCpsShopNumId) {
        this.ecCpsShopNumId = ecCpsShopNumId;
    }

    public Long getCouponNumId() {
        return couponNumId;
    }

    public void setCouponNumId(Long couponNumId) {
        this.couponNumId = couponNumId;
    }

    public Long getOffUpSign() {
        return offUpSign;
    }

    public void setOffUpSign(Long offUpSign) {
        this.offUpSign = offUpSign;
    }
}
