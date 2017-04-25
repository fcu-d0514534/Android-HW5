package com.example.user.android_hw5;

import android.media.Image;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by user on 2017/4/25.
 */

public class Team {
    public int ig1,ig2;
    public String name1,name2;
    public int score1,score2;

    public Team(int ig1,String name1,int score1,int ig2,String name2,int score2){
        this.ig1=ig1;
        this.name1=name1;
        this.score1=score1;
        this.ig2=ig2;
        this.name2=name2;
        this.score2=score2;
    }

}
