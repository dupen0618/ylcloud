package com.ykcloud.soa.erp.api.so.response;

import java.util.List;

import com.gb.soa.omp.ccommon.api.response.MessagePack;
import com.ykcloud.soa.erp.api.so.model.SoTmlForWmShip;

public class OtOTmlGetResponse extends MessagePack {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1730252690326914417L;

	private SoTmlForWmShip soTmlForWmShip;

	public SoTmlForWmShip getSoTmlForWmShip() {
		return soTmlForWmShip;
	}

	public void setSoTmlForWmShip(SoTmlForWmShip soTmlForWmShip) {
		this.soTmlForWmShip = soTmlForWmShip;
	}



}
