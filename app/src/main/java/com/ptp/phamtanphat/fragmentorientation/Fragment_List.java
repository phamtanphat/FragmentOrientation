package com.ptp.phamtanphat.fragmentorientation;

import android.app.ListFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by KhoaPhamPC on 9/4/2018.
 */

public class Fragment_List extends ListFragment {


    ArrayList<Nhanvien> mangnhanvien;
    NhanvienAdapter nhanvienAdapter;
    View view;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_list,container,false);
        mangnhanvien = new ArrayList<>();
        mangnhanvien.add(new Nhanvien("Nguyen Van A","Quan 1","1990"));
        mangnhanvien.add(new Nhanvien("Nguyen Van B","Quan 2","1991"));
        mangnhanvien.add(new Nhanvien("Nguyen Van C","Quan 3","1992"));
        mangnhanvien.add(new Nhanvien("Nguyen Van D","Quan 4","1993"));
        mangnhanvien.add(new Nhanvien("Nguyen Van E","Quan 5","1994"));
        mangnhanvien.add(new Nhanvien("Nguyen Van F","Quan 6","1995"));
        mangnhanvien.add(new Nhanvien("Nguyen Van G","Quan 7","1996"));
        mangnhanvien.add(new Nhanvien("Nguyen Van H","Quan 8","1997"));

        nhanvienAdapter = new NhanvienAdapter(getActivity(),android.R.layout.simple_list_item_1,mangnhanvien);
        setListAdapter(nhanvienAdapter);

        return view;
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        Toast.makeText(getActivity(), mangnhanvien.get(position).getTen(), Toast.LENGTH_SHORT).show();
        super.onListItemClick(l, v, position, id);
    }
}
