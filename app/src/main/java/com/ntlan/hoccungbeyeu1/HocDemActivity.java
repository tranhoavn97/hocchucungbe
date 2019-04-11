package com.ntlan.hoccungbeyeu1;

import android.content.Intent;
import android.graphics.drawable.GradientDrawable;
import android.media.MediaPlayer;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ScrollingTabContainerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.support.design.widget.TabLayout;
import android.widget.LinearLayout;

import java.util.EventListener;

public class HocDemActivity extends AppCompatActivity {

    ImageView btn_home, sound_on, sound_off;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hoc_dem);
        btn_home= findViewById(R.id.btn_home);
//        sound_on= findViewById(R.id.sound_on);
//        sound_off= findViewById(R.id.sound_off);
        btn_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(HocDemActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });

        addControl();
        final MediaPlayer mediaPlayer= MediaPlayer.create(this,R.raw.cs_1);
        final MediaPlayer mediaPlayer1= MediaPlayer.create(this,R.raw.cs_2);
        final MediaPlayer mediaPlayer2= MediaPlayer.create(this,R.raw.cs_3);
        final MediaPlayer mediaPlayer3= MediaPlayer.create(this,R.raw.cs_4);
        final MediaPlayer mediaPlayer4= MediaPlayer.create(this,R.raw.cs_5);
        final MediaPlayer mediaPlayer5= MediaPlayer.create(this,R.raw.cs_6);
        final MediaPlayer mediaPlayer6= MediaPlayer.create(this,R.raw.cs_7);
        final MediaPlayer mediaPlayer7= MediaPlayer.create(this,R.raw.cs_8);
        final MediaPlayer mediaPlayer8= MediaPlayer.create(this,R.raw.cs_9);
        final MediaPlayer mediaPlayer9= MediaPlayer.create(this,R.raw.cs_10);

        ViewPager pager = findViewById(R.id.view_pager);
        pager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                switch (position){
                    case 0:
                        mediaPlayer.start();
                        break;
                    case 1:
                        mediaPlayer1.start();
                        break;
                    case 2:
                        mediaPlayer2.start();
                        break;
                    case 3:
                        mediaPlayer3.start();
                        break;
                    case 4:
                        mediaPlayer4.start();
                        break;
                    case 5:
                        mediaPlayer5.start();
                        break;
                    case 6:
                        mediaPlayer6.start();
                        break;
                    case 7:
                        mediaPlayer7.start();
                        break;
                    case 8:
                        mediaPlayer8.start();
                        break;
                    case 9:
                        mediaPlayer9.start();
                        break;
                }

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });





    }

    private void addControl() {
        ViewPager pager = findViewById(R.id.view_pager);
        TabLayout tabLayout = findViewById(R.id.tab_layout);
        FragmentManager manager = getSupportFragmentManager();
        PagerAdapter adapter = new PagerAdapterDem(manager);
        pager.setAdapter(adapter);
        tabLayout.setupWithViewPager(pager);
        pager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.addOnTabSelectedListener(new TabLayout.ViewPagerOnTabSelectedListener(pager));

//        View root = tabLayout.getChildAt(0);
//        if (root instanceof LinearLayout) {
//            ((LinearLayout) root).setShowDividers(LinearLayout.SHOW_DIVIDER_MIDDLE);
//            GradientDrawable drawable = new GradientDrawable();
//            drawable.setColor(getResources().getColor(R.color.color_line));
//            drawable.setSize(3, 1);
//            ((LinearLayout) root).setDividerPadding(10);
//            ((LinearLayout) root).setDividerDrawable(drawable);
//        }


    }




}
