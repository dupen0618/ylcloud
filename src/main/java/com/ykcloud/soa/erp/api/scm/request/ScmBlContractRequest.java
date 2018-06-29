package com.ykcloud.soa.erp.api.scm.request;

import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;
import com.ykcloud.soa.erp.api.scm.model.ScmBlContract;

import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

/**
 * @Author Hewei
 * @Date 2018/6/22 13:48
 */
public class ScmBlContractRequest extends AbstractUserSessionRequest {

    @NotNull(message = "合同数据不能为空!")
    private List<ScmBlContract> scmBlContractList;

    public List<ScmBlContract> getScmBlContractList() {
        return scmBlContractList;
    }

    public void setScmBlContractList(List<ScmBlContract> scmBlContractList) {
        this.scmBlContractList = scmBlContractList;
    }

    public static void main(String[] args) {
        ScmBlContract scmBlContract=new ScmBlContract();
        scmBlContract.setReservedId("0");
        scmBlContract.setTypeNumId(0l);
        scmBlContract.setContractName("0");
        scmBlContract.setEnContractName("0");
        scmBlContract.setSettlementType(1l);
        scmBlContract.setPayTypeId(1l);
        scmBlContract.setSupplyUnitNumId(1l);
        scmBlContract.setMakeDate(new Date());
        scmBlContract.setBeginDay(new Date());
        scmBlContract.setEndDay(new Date());
        scmBlContract.setDelayDay(1l);
        scmBlContract.setOrganizationCode("0");
        scmBlContract.setBankPrvNumId(0l);
        scmBlContract.setBankCityNumId(0l);
        scmBlContract.setBillingBank(0l);
        scmBlContract.setBillingBankAccount("0");
        scmBlContract.setEarnestMoney(0l);
        scmBlContract.setLegalPerson("0");
        scmBlContract.setLegalPersonId("0");
        scmBlContract.setBehfPostcode("0");
        scmBlContract.setBehfTelephone("0");
        scmBlContract.setBehfFax("0");
        scmBlContract.setBehfAdr("0");
        scmBlContract.setBehfMail("0");
        scmBlContract.setBehfCity(0l);
        scmBlContract.setContEmpe1("0");
        scmBlContract.setEnContEmpe1("0");
        scmBlContract.setContEmpe1Postcode("0");
        scmBlContract.setContEmpe1Telephone("0");
        scmBlContract.setContEmpe1Fax("0");
        scmBlContract.setPrvNumId(0l);
        scmBlContract.setCityNumId(0l);
        scmBlContract.setCityAreaNumId(0l);
        scmBlContract.setTownNumId(0l);
        scmBlContract.setContEmpe1Adr("0");
        scmBlContract.setEnContEmpe1Adr("0");
        scmBlContract.setContEmpe1Mail("0");
        scmBlContract.setTaxAccount("0");
        scmBlContract.setFirstDeliveryDate(new Date());
        scmBlContract.setTrydays(0l);
        scmBlContract.setTrysaleqty(0l);
        scmBlContract.setTrysalevalue(0l);
        scmBlContract.setUnitUrl("0");
        scmBlContract.setUnitMail("0");
        scmBlContract.setUnitScope("0");
        scmBlContract.setUnitBusinessNature("0");
        scmBlContract.setRegisteredCapital(0l);
        scmBlContract.setResellerLevel("0");
        scmBlContract.setSanitationInspectionCertificates("0");
        scmBlContract.setQualityControlCertificates("0");
        scmBlContract.setTradeDiscount(0l);
        scmBlContract.setPaymentDiscount(0l);
        scmBlContract.setTaxpayerType(0l);
        scmBlContract.setEntryTime(0l);
        scmBlContract.setTradingCertificates("0");
        scmBlContract.setPaymentDays(0l);
        scmBlContract.setIncomeTypeNumId(0l);

    }
}
