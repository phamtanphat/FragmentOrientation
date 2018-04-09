package com.ptp.phamtanphat.fragmentorientation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ChitietnhanvienActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chitietnhanvien);
        Intent intent = getIntent();
        Nhanvien nhanvien = (Nhanvien) intent.getSerializableExtra("nhanvien");
        Fragment_Detail fragment_detail = (Fragment_Detail) getFragmentManager().findFragmentById(R.id.fragmentdungDetail);
        fragment_detail.SetTextUI(nhanvien);
    }
}
