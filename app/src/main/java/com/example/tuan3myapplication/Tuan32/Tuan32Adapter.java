package com.example.tuan3myapplication.Tuan32;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tuan3myapplication.R;

import java.util.ArrayList;

public class Tuan32Adapter extends BaseAdapter {
    private ArrayList<Tuan32Contact> ls;
    private Context context;

    public Tuan32Adapter(ArrayList<Tuan32Contact> ls, Context context) {
        this.ls = ls;
        this.context = context;
    }

    @Override
    public int getCount() {
        return ls.size();
    }

    @Override
    public Object getItem(int position) {
        return ls.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewAX ax;
        if(convertView==null)
        {
            ax=new ViewAX();
            convertView= LayoutInflater.from(context).inflate(R.layout.tuan32_listview_item,null);
            ax.img_hinh=convertView.findViewById(R.id.t32ItemImage);
            ax.tv_name=convertView.findViewById(R.id.t32ItemName);
            ax.tv_age=convertView.findViewById(R.id.t32ItemAge);
            convertView.setTag(ax);
        } else
        {
            ax=(ViewAX) convertView.getTag();
        }
        ax.img_hinh.setImageResource(ls.get(position).getHinh());
        ax.tv_name.setText(ls.get(position).getTen());
        ax.tv_age.setText(ls.get(position).getTuoi());
        return convertView;
    }

    class ViewAX{
        ImageView img_hinh;
        TextView tv_name, tv_age;

    }
}
