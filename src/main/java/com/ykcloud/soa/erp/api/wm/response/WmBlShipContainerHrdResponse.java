package com.ykcloud.soa.erp.api.wm.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;

import java.security.MessageDigest;

 /**
  * @author alfred
  * @date 2018/5/4 18:47
  * @description
  */
public class WmBlShipContainerHrdResponse extends MessagePack
{
    private static final long serialVersionUID = 1L;
    //托盘号
    private String containerSerlno;
    //托盘标识
    private String soNumId;
    //客户名称
    private String custSubUnitName;


    public void setContainerSerlno(String containerSerlno)
    {
        this.containerSerlno = containerSerlno;
    }

    public String getSoNumId()
    {
        return soNumId;
    }

    public void setSoNumId(String soNumId)
    {
        this.soNumId = soNumId;
    }

    public String getCustSubUnitName()
    {
        return custSubUnitName;
    }

    public void setCustSubUnitName(String custSubUnitName)
    {
        this.custSubUnitName = custSubUnitName;
    }
}
