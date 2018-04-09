package com.ptp.phamtanphat.fragmentorientation;

import android.app.FragmentManager;
import android.content.Intent;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements NhanvienService{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void RetriveData(Nhanvien nhanvien) {
        Fragment_Detail fragment_detail = (Fragment_Detail) getFragmentManager().findFragmentById(R.id.fragmentLandDetail);
//        Configuration configuration = getResources().getConfiguration();
//        if (configuration.orientation == Configuration.ORIENTATION_LANDSCAPE)
        if (fragment_detail != null && fragment_detail.isInLayout()) {
            fragment_detail.SetTextUI(nhanvien);
        }else {
            Intent intent = new Intent(MainActivity.this,ChitietnhanvienActivity.class);
            intent.putExtra("nhanvien",nhanvien);
            startActivity(intent);
        }
    }
}
