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

import java.util.Calendar;

public class a3 extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView= inflater.inflate(R.layout.a3, container, false);
        TextView tvChu= rootView.findViewById(R.id.tv_chu);
        ImageView anh1, anh2;
        final MediaPlayer mediaPlayer= MediaPlayer.create(getActivity(),R.raw.chu_a2);
        final MediaPlayer mediaPlayer2= MediaPlayer.create(getActivity(),R.raw.a2_2);
        final MediaPlayer mediaPlayer3= MediaPlayer.create(getActivity(),R.raw.a2_4);
        anh1= rootView.findViewById(R.id.anh3);
        anh2= rootView.findViewById(R.id.anh4);
        tvChu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer.start();
            }
        });
        anh1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer2.start();
            }
        });
        anh2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer3.start();
            }
        });
        return rootView;
    }
}
