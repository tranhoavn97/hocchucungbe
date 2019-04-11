package com.ntlan.hoccungbeyeu1;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class HocChuActivity extends AppCompatActivity {
    ImageView btn_home, sound_on, sound_off;
    int i=-1;
    int j=-1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hoc_chu);

        btn_home= findViewById(R.id.btn_home);
        btn_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(HocChuActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
        addControl();
        final MediaPlayer mediaPlayer= MediaPlayer.create(this,R.raw.a);
        final MediaPlayer mediaPlayer1= MediaPlayer.create(this,R.raw.a1);
        final MediaPlayer mediaPlayer2= MediaPlayer.create(this,R.raw.a2);
        final MediaPlayer mediaPlayer3= MediaPlayer.create(this,R.raw.b);
        final MediaPlayer mediaPlayer4= MediaPlayer.create(this,R.raw.c);
        final MediaPlayer mediaPlayer5= MediaPlayer.create(this,R.raw.d1);
        final MediaPlayer mediaPlayer6= MediaPlayer.create(this,R.raw.d2);
        final MediaPlayer mediaPlayer7= MediaPlayer.create(this,R.raw.e);
        final MediaPlayer mediaPlayer8= MediaPlayer.create(this,R.raw.e1);
        final MediaPlayer mediaPlayer9= MediaPlayer.create(this,R.raw.g);
        final MediaPlayer mediaPlayer10= MediaPlayer.create(this,R.raw.h);
        final MediaPlayer mediaPlayer11= MediaPlayer.create(this,R.raw.i);
        final MediaPlayer mediaPlayer12= MediaPlayer.create(this,R.raw.k);
        final MediaPlayer mediaPlayer13= MediaPlayer.create(this,R.raw.l);
        final MediaPlayer mediaPlayer14= MediaPlayer.create(this,R.raw.m);
        final MediaPlayer mediaPlayer15= MediaPlayer.create(this,R.raw.n);
        final MediaPlayer mediaPlayer16= MediaPlayer.create(this,R.raw.o);
        final MediaPlayer mediaPlayer17= MediaPlayer.create(this,R.raw.o1);
        final MediaPlayer mediaPlayer28= MediaPlayer.create(this,R.raw.o2);
        final MediaPlayer mediaPlayer18= MediaPlayer.create(this,R.raw.p);
        final MediaPlayer mediaPlayer19= MediaPlayer.create(this,R.raw.q);
        final MediaPlayer mediaPlayer20= MediaPlayer.create(this,R.raw.r);
        final MediaPlayer mediaPlayer21= MediaPlayer.create(this,R.raw.s);
        final MediaPlayer mediaPlayer22= MediaPlayer.create(this,R.raw.t);
        final MediaPlayer mediaPlayer23= MediaPlayer.create(this,R.raw.u1);
        final MediaPlayer mediaPlayer24= MediaPlayer.create(this,R.raw.u2);
        final MediaPlayer mediaPlayer25= MediaPlayer.create(this,R.raw.v);
        final MediaPlayer mediaPlayer26= MediaPlayer.create(this,R.raw.x);
        final MediaPlayer mediaPlayer27= MediaPlayer.create(this,R.raw.y);


        final TabLayout tabLayout = findViewById(R.id.tab);
        ViewPager viewPager= findViewById(R.id.pager);
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
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
                    case 10:
                        mediaPlayer10.start();
                        break;
                    case 11:
                        mediaPlayer11.start();
                        break;
                    case 12:
                        mediaPlayer12.start();
                        break;
                    case 13:
                        mediaPlayer13.start();
                        break;
                    case 14:
                        mediaPlayer14.start();
                        break;
                    case 15:
                        mediaPlayer15.start();
                        break;
                    case 16:
                        mediaPlayer16.start();
                        break;
                    case 17:
                        mediaPlayer17.start();
                        break;
                    case 18:
                        mediaPlayer28.start();
                        break;
                    case 19:
                        mediaPlayer18.start();
                        break;
                    case 20:
                        mediaPlayer19.start();
                        break;
                    case 21:
                        mediaPlayer20.start();
                        break;
                    case 22:
                        mediaPlayer21.start();
                        break;
                    case 23:
                        mediaPlayer22.start();
                        break;
                    case 24:
                        mediaPlayer23.start();
                        break;
                    case 25:
                        mediaPlayer24.start();
                        break;
                    case 26:
                        mediaPlayer25.start();
                        break;
                    case 27:
                        mediaPlayer26.start();
                        break;
                    case 28:
                        mediaPlayer27.start();
                        break;
                }

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });






    }
    private void addControl() {
        ViewPager pager = findViewById(R.id.pager);
        TabLayout tabLayout = findViewById(R.id.tab);
        FragmentManager manager = getSupportFragmentManager();
        PagerAdapterHocChu adapter = new PagerAdapterHocChu(manager);
        pager.setAdapter(adapter);
        tabLayout.setupWithViewPager(pager);
        pager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.addOnTabSelectedListener(new TabLayout.ViewPagerOnTabSelectedListener(pager));
    }

}
