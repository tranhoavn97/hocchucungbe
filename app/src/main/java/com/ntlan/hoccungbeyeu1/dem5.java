package com.ntlan.hoccungbeyeu1;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class dem5 extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView= inflater.inflate(R.layout.dem5, container, false);
        TextView tvChu= rootView.findViewById(R.id.tv_so);
        ImageView anh1= rootView.findViewById(R.id.img_dem1);
        ImageView anh2= rootView.findViewById(R.id.img_dem2);
        ImageView anh3= rootView.findViewById(R.id.img_dem3);
        ImageView anh4= rootView.findViewById(R.id.img_dem4);
        ImageView anh5= rootView.findViewById(R.id.img_dem5);
        final MediaPlayer mediaPlayer= MediaPlayer.create(getActivity(),R.raw.cs_1);
        final MediaPlayer mediaPlayer2= MediaPlayer.create(getActivity(),R.raw.cs_2);
        final MediaPlayer mediaPlayer3= MediaPlayer.create(getActivity(),R.raw.cs_3);
        final MediaPlayer mediaPlayer4= MediaPlayer.create(getActivity(),R.raw.cs_4);
        final MediaPlayer mediaPlayer5= MediaPlayer.create(getActivity(),R.raw.cs_5);
        tvChu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer5.start();
            }
        });
        anh1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer.start();
            }
        });
        anh2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer2.start();
            }
        });
        anh3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer3.start();
            }
        });
        anh4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer4.start();
            }
        });
        anh5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer5.start();
            }
        });
        return rootView;
    }
}
