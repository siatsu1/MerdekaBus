package com.yusuf.merdekabus.Model.seat;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ResponseGetSeat {

	@SerializedName("Status")
	private int status;

	@SerializedName("msg")
	private String msg;

	@SerializedName("data_seat")
	private List<DataSeatItem> dataSeat;

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

	public void setDataSeat(List<DataSeatItem> dataSeat){
		this.dataSeat = dataSeat;
	}

	public List<DataSeatItem> getDataSeat(){
		return dataSeat;
	}
}