package com.example.vhfoodapp.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;
import android.widget.ViewFlipper;

import com.bumptech.glide.Glide;
import com.example.vhfoodapp.R;
import com.example.vhfoodapp.adapter.LoaispAdapter;
import com.example.vhfoodapp.adapter.SanPhamMoiAdapter;
import com.example.vhfoodapp.model.LoaiSp;
import com.example.vhfoodapp.model.SanPhamMoi;
import com.example.vhfoodapp.model.SanPhamMoiModel;
import com.example.vhfoodapp.retrofit.ApiBanHang;
import com.example.vhfoodapp.retrofit.RetrofitClient;
import com.example.vhfoodapp.utils.Utils;
import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.schedulers.Schedulers;

public class MainActivity extends AppCompatActivity {
    Toolbar toolbar;
    ViewFlipper viewFlipper;
    RecyclerView recyclerViewManHinhChinh;
    NavigationView navigationView;
    ListView listViewManHinhChinh;
    DrawerLayout drawerLayout;
    LoaispAdapter loaispAdapter;
    List<LoaiSp> mangloaisp;
    private Object LoaispAdapter;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    ApiBanHang apiBanHang;
    List<SanPhamMoi> mangSpMoi;
    SanPhamMoiAdapter spAdater;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        apiBanHang = RetrofitClient.getInstance(Utils.BASE_URL).create(ApiBanHang.class);

        AnhXa();
        ActionBar();

        if (isConnected(this)){

            ActionViewFlipper();
            getLoaiSanPham();
            getSpMoi();
        }else {
            Toast.makeText(getApplicationContext(), "KHÔNG KẾT NỐI INTERNET", Toast.LENGTH_LONG).show();

        }
    }

    private void getSpMoi() {
        compositeDisposable.add(apiBanHang.getSpMoi()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(
                    sanPhamMoiModel -> {
                        if (sanPhamMoiModel.isSucces()){
                            mangSpMoi = sanPhamMoiModel.getResult();
                            spAdater = new SanPhamMoiAdapter(getApplicationContext(), mangSpMoi);
                            recyclerViewManHinhChinh.setAdapter(spAdater);
                        }
                    },
                    throwable -> {
                        Toast.makeText(getApplicationContext(), "Không kết nối được với sever"+throwable.getMessage(), Toast.LENGTH_LONG).show();
                    }
            ));
    }

    private void getLoaiSanPham() {

        compositeDisposable.add(apiBanHang.getLoaisp()
        .subscribeOn(Schedulers.io())
        .observeOn(AndroidSchedulers.mainThread())
        .subscribe(
                loaispModel -> {
                    if (loaispModel.isSuccess()){
                        mangloaisp = loaispModel.getResult();
                        loaispAdapter = new LoaispAdapter(getApplicationContext(),mangloaisp);
                        listViewManHinhChinh.setAdapter(loaispAdapter);
                    }
                },
                throwable -> {
                    Toast.makeText(getApplicationContext(), "lỗi ở đây ", Toast.LENGTH_SHORT).show();
                }
        ));
    }

    private void ActionViewFlipper() {
        List<String> mangquangcao = new ArrayList<>();
        mangquangcao.add("https://hoangyenbuffet.com/wp-content/uploads/2020/03/HYG_40thAnni_Banner-web-CHA.jpg");
        mangquangcao.add("https://blog.utop.vn/uploads/richtexteditor/quan-ngon-phai-di-sau-khi-het-dich_722330013_20210722.jpg");
        mangquangcao.add("https://dathangtaobao.vn/wp-content/uploads/2020/08/mon-an-vat-noi-dia-trung-quoc-ngon-nhat.jpg");
        mangquangcao.add("https://anvuitudosong.com/wp-content/uploads/mon-an-ngon-nhat-the-gioi-ma-it-ai-biet.jpg");

        for (int i = 0; i<mangquangcao.size(); i++){
            ImageView imageView = new ImageView(getApplicationContext());
            Glide.with(getApplicationContext()).load(mangquangcao.get(i)).into(imageView);
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            viewFlipper.addView(imageView);
        }
        viewFlipper.setFlipInterval(3000);
        viewFlipper.setAutoStart(true);
        Animation slide_in = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide_in_right);
        Animation slide_out = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide_out_right);
        viewFlipper.setInAnimation(slide_in);
        viewFlipper.setOutAnimation(slide_out);

        }
        private void ActionBar() {
            setSupportActionBar(toolbar);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            toolbar.setNavigationIcon(android.R.drawable.ic_menu_sort_by_size);
            toolbar.setNavigationOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    drawerLayout.openDrawer(GravityCompat.START);

                }
            });
        }

    private void AnhXa() {
        toolbar = findViewById(R.id.toobarmanhinhchinh);
        viewFlipper = findViewById(R.id.viewlipper);
        recyclerViewManHinhChinh = findViewById(R.id.recycleview);
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this,2);
        recyclerViewManHinhChinh.setLayoutManager(layoutManager);
        recyclerViewManHinhChinh.setHasFixedSize(true);
        listViewManHinhChinh = findViewById(R.id.listviewmanhinhchinh);
        navigationView = findViewById(R.id.navigationview);
        drawerLayout = findViewById(R.id.drawerlayout);
        // khoi tao list
        mangloaisp = new ArrayList<>();
        mangSpMoi = new ArrayList<>();



    }
    private boolean isConnected (Context context){
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo wifi = connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI); // nho them quyen vao khong bi loi
        NetworkInfo mobile = connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_MOBILE);
        if ((wifi != null && wifi.isConnected()) || (mobile != null &&  mobile.isConnected()) ) {
            return true;
        }else {
            return false;
        }
    }

    @Override
    protected void onDestroy() {
        compositeDisposable.clear();
        super.onDestroy();
    }
}