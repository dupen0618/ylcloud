package com.ykcloud.soa.erp.api.wm.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;

public class WmContainerHdrCreateResponse extends MessagePack {
	private static final long serialVersionUID = 1L;

	//托盘号
	private String containerSerlno;
	
	//托盘标识
	private String contianerLabserlno;
	

	public String getContainerSerlno() {
		return containerSerlno;
	}

	public void setContainerSerlno(String containerSerlno) {
		this.containerSerlno = containerSerlno;
	}

	public String getContianerLabserlno() {
		return contianerLabserlno;
	}

	public void setContianerLabserlno(String contianerLabserlno) {
		this.contianerLabserlno = contianerLabserlno;
	}
	
	
	

}
