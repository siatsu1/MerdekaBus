package com.yusuf.merdekabus.Model.jadwal;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ResponseJadwal{

	@SerializedName("Status")
	private int status;

	@SerializedName("msg")
	private String msg;

	@SerializedName("data_bus")
	private List<DataBusItem> dataBus;

	public void setStatus(int status){
		this.status = status;
	}

	public int getStatus(){
		return status;
	}

	public void setMsg(String msg){
		this.msg = msg;
	}

	public String getMsg(){
		return msg;
	}

	public void setDataBus(List<DataBusItem> dataBus){
		this.dataBus = dataBus;
	}

	public List<DataBusItem> getDataBus(){
		return dataBus;
	}
}