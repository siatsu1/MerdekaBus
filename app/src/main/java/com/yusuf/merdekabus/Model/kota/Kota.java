package com.yusuf.merdekabus.Model.kota;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Kota{

	@SerializedName("msg")
	private String msg;

	@SerializedName("data_kota")
	private List<DataKotaItem> dataKota;

	public void setMsg(String msg){
		this.msg = msg;
	}

	public String getMsg(){
		return msg;
	}

	public void setDataKota(List<DataKotaItem> dataKota){
		this.dataKota = dataKota;
	}

	public List<DataKotaItem> getDataKota(){
		return dataKota;
	}
}