package com.example.user.android_hw5;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by user on 2017/4/25.
 */

public class UsersAdapter extends BaseAdapter{
    ArrayList<Team> arrayList;
    Context context;

    public UsersAdapter(Context c,ArrayList<Team> arr){
        arrayList=arr;
        context=c;
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        convertView=LayoutInflater.from(context).inflate(R.layout.itemlayout,parent,false);
        ImageView ig1,ig2;
        TextView tv1,tv2;
        TextView score1,score2;
        Team team=arrayList.get(position);

        ig1=(ImageView)convertView.findViewById(R.id.ig1);
        tv1=(TextView)convertView.findViewById(R.id.tv1);
        score1=(TextView)convertView.findViewById(R.id.tv2);
        ig2=(ImageView)convertView.findViewById(R.id.ig2);
        tv2=(TextView)convertView.findViewById(R.id.tv3);
        score2=(TextView)convertView.findViewById(R.id.tv4);

        ig1.setImageResource(team.ig1);
        tv1.setText(team.name1);
        score1.setText(String.valueOf(team.score1));
        ig2.setImageResource(team.ig2);
        tv2.setText(team.name2);
        score2.setText(String.valueOf(team.score2));

        if (team.score1>team.score2){
            tv1.setTextColor(Color.parseColor("#ffcc0000"));
        }else{
            tv2.setTextColor(Color.parseColor("#ffcc0000"));
        }

        return convertView;
    }
}
