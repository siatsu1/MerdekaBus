package com.yusuf.merdekabus.API;

import com.yusuf.merdekabus.Model.History.ResponseHistory;
import com.yusuf.merdekabus.Model.Login.Login;
import com.yusuf.merdekabus.Model.Register.Register;
import com.yusuf.merdekabus.Model.jadwal.ResponseJadwal;
import com.yusuf.merdekabus.Model.kota.Kota;
import com.yusuf.merdekabus.Model.seat.ResponseGetSeat;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface ApiInterface {

    @GET("getkotaasal.php")
    Call<Kota> getKotaAsal();

    @GET("getkotatujuan.php")
    Call<Kota> getKotaTujuan();

    @FormUrlEncoded
    @POST("getJadwal.php")
    Call<ResponseJadwal> getJadwal(
           @Field("kota_asal") String kota_asal,
            @Field("kota_tujuan") String kota_tujuan
    );

    @FormUrlEncoded
    @POST("getSeat.php")
    Call<ResponseGetSeat> getBookedSeat(
            @Field("id_bus") String id_bus,
            @Field("tanggal") String tanggal
    );

    @FormUrlEncoded
    @POST("insertSeat.php")
    Call<ResponseGetSeat> insertseat(
            @Field("id_bus") String id_bus,
            @Field("id_user") String id_user,
            @Field("no_kursi") String no_kursi,
            @Field("tanggal") String tanggal
    );

    @FormUrlEncoded
    @POST("login.php")
    Call<Login> loginResponse(
            @Field("username") String username,
            @Field("password") String password
    );

    @FormUrlEncoded
    @POST("register.php")
    Call<Register> registerResponse(
            @Field("username") String username,
            @Field("name") String name,
            @Field("password") String password
    );

    @FormUrlEncoded
    @POST("tampil_detail.php")
    Call<ResponseHistory> tampildetail(
            @Field("id_user") String id_user
    );
}
