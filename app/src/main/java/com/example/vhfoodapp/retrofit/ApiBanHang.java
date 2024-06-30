package com.example.vhfoodapp.retrofit;

import com.example.vhfoodapp.model.LoaispModel;
import com.example.vhfoodapp.model.SanPhamMoiModel;

import io.reactivex.rxjava3.core.Observable;
import retrofit2.http.GET;

public interface ApiBanHang {
    @GET("getloaisp.php")
    Observable<LoaispModel> getLoaisp();
    @GET("getspmoi.php")
    Observable<SanPhamMoiModel> getSpMoi();
}
