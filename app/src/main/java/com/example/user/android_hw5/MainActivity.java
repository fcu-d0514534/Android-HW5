package com.example.user.android_hw5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lv;
    ArrayList<Team> arrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv=(ListView)findViewById(R.id.lv);
        arrayList=new ArrayList<Team>();
        Team team1=new Team(R.drawable.p1,"暴龍",118,R.drawable.p2,"公鹿",93);
        Team team2=new Team(R.drawable.p3,"勇士",128,R.drawable.p4,"拓荒者",103);
        arrayList.add(team1);
        arrayList.add(team2);

        UsersAdapter adapter=new UsersAdapter(this,arrayList);
        lv.setAdapter(adapter);
    }
}
