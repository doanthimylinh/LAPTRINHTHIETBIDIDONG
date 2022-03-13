package com.example.ui_demo;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class NhanVienAdapter extends ArrayAdapter<NhanVien> {

    private Context mContext;
    private int mResource;
    @NonNull
    List<NhanVien> objects;

    public NhanVienAdapter(@NonNull Activity context, int resource, @NonNull List<NhanVien> objects) {
        super(context, resource, objects);
        this.mContext= context;
        this.mResource= resource;
        this.objects= objects;

    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater layoutInflater=LayoutInflater.from(mContext);
        convertView=layoutInflater.inflate(mResource,parent,false);

        ImageView imgItem=convertView.findViewById(R.id.imageView);
        ImageView img=convertView.findViewById(R.id.image);
        TextView profile= convertView.findViewById(R.id.profile);


        NhanVien nhanVien= this.objects.get(position);

        imgItem.setImageResource(nhanVien.getHinh());

        profile.setText("  " +"Mã NV: "+nhanVien.getMaSo() + "\n  " + "Tên NV: "+nhanVien.getHoTen() + "\n  "+ "Giới tính: "+nhanVien.getGioiTinh() + "\n  "+
                "Đơn vị: "+nhanVien.getDonVi());


        return convertView;

    }
}
