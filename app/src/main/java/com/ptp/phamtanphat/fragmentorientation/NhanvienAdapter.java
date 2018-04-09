package com.ptp.phamtanphat.fragmentorientation;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by KhoaPhamPC on 9/4/2018.
 */

public class NhanvienAdapter extends ArrayAdapter<Nhanvien> {
    public NhanvienAdapter(@NonNull Context context, int resource, @NonNull List<Nhanvien> objects) {
        super(context, resource, objects);
    }
    class ViewHolder{
        TextView txtten;
        ImageView imageView;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ViewHolder viewHolder = null;
        if (convertView == null){
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.dong_nhan_vien,null);
            viewHolder = new ViewHolder();
            viewHolder.txtten = convertView.findViewById(R.id.textviewten);
            viewHolder.imageView = convertView.findViewById(R.id.imageviewlist);
            convertView.setTag(viewHolder);
        }else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        Nhanvien nhanvien = getItem(position);
        viewHolder.imageView.setImageResource(R.drawable.man);
        viewHolder.txtten.setText(nhanvien.getTen());
        return convertView;
    }
}
