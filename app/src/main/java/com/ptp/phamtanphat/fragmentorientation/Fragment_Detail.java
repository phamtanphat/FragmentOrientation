package com.ptp.phamtanphat.fragmentorientation;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by KhoaPhamPC on 9/4/2018.
 */

public class Fragment_Detail extends Fragment {

    TextView txtten,txtdiachi,txtnamsinh;
    View view;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_detail,container,false);
        txtdiachi = view.findViewById(R.id.textviewdiachi);
        txtten = view.findViewById(R.id.textviewtennhanvien);
        txtnamsinh = view.findViewById(R.id.textviewnamsinh);
        return view;
    }
    public void SetTextUI(Nhanvien nhanvien){
        txtnamsinh.setText("Nam sinh : " + nhanvien.getNamsinh());
        txtdiachi.setText("Dia chi : " + nhanvien.getDiachi());
        txtten.setText("Ten : " + nhanvien.getTen());

    }
}
