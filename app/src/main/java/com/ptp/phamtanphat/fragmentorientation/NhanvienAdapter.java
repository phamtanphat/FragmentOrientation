package com.ptp.phamtanphat.fragmentorientation;

import android.content.Context;
import android.support.annotation.NonNull;
import android.widget.ArrayAdapter;

import java.util.List;

/**
 * Created by KhoaPhamPC on 9/4/2018.
 */

public class NhanvienAdapter extends ArrayAdapter<Nhanvien> {
    public NhanvienAdapter(@NonNull Context context, int resource, @NonNull List<Nhanvien> objects) {
        super(context, resource, objects);
    }
}
