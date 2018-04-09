package com.ptp.phamtanphat.fragmentorientation;

import android.app.ListFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by KhoaPhamPC on 9/4/2018.
 */

public class Fragment_List extends ListFragment {
    View view;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_list,container,false);
        return view;
    }
}
