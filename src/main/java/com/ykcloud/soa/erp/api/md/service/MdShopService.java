package com.ykcloud.soa.erp.api.md.service;

import com.ykcloud.soa.erp.api.md.request.DirectWayFirstReceiptStorageNumIdGetRequest;
import com.ykcloud.soa.erp.api.md.request.FinalDistributionStorageNumIdGetRequest;
import com.ykcloud.soa.erp.api.md.request.HeadSubUnitNumIdGetRequest;
import com.ykcloud.soa.erp.api.md.request.ShopStorageListFroReplenishGetRequest;
import com.ykcloud.soa.erp.api.md.request.UnitNumIdBySubUnitNumIdGetRequest;
import com.ykcloud.soa.erp.api.md.response.DirectWayFirstReceiptStorageNumIdGetResponse;
import com.ykcloud.soa.erp.api.md.response.FinalDistributionStorageNumIdGetResponse;
import com.ykcloud.soa.erp.api.md.response.HeadSubUnitNumIdGetRequestRespone;
import com.ykcloud.soa.erp.api.md.response.ShopStorageListFroReplenishGetResponse;
import com.ykcloud.soa.erp.api.md.response.UnitNumIdBySubUnitNumIdGetResponse;

/**
 * 
* @ClassName: MdShopService.java
* @Description: 与门店、仓库相关相关服务类
* @version: v1.0.0
* @author: fred.zhao
* @date: 2018年3月9日 下午3:08:07
 */
public interface MdShopService {
	//获取总部门店编号
    public HeadSubUnitNumIdGetRequestRespone getHeadSubUnitNumId(HeadSubUnitNumIdGetRequest request);
    
    //获取门店直通商品首次收货仓
    public DirectWayFirstReceiptStorageNumIdGetResponse getDirectWayFirstReceiptStorageNumId(DirectWayFirstReceiptStorageNumIdGetRequest request);
    
    //获取门店最终收货仓
    public FinalDistributionStorageNumIdGetResponse getFinalDistributionStorageNumId(FinalDistributionStorageNumIdGetRequest request);
    
    //获取门店下参与补货的仓库列表
    public ShopStorageListFroReplenishGetResponse getShopStorageListFroReplenish(ShopStorageListFroReplenishGetRequest request);
    
   //获取门店的业务单元编号
    public UnitNumIdBySubUnitNumIdGetResponse getUnitNumIdBySubUnitNumId(UnitNumIdBySubUnitNumIdGetRequest request);
}
