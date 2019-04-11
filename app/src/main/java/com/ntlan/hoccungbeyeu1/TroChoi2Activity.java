package com.ntlan.hoccungbeyeu1;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class TroChoi2Activity extends AppCompatActivity {
    Button b1,b2,b3,b4;
    TextView dem_qua;
    ImageView btn_home,btn_right;
    RelativeLayout traiQuyt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tro_choi2);

        final MediaPlayer m1= MediaPlayer.create(this,R.raw.tangerines);
        final MediaPlayer m2= MediaPlayer.create(this,R.raw.no);
        final MediaPlayer m3= MediaPlayer.create(this,R.raw.magic);
        dem_qua= findViewById(R.id.dem_qua);
        dem_qua.setVisibility(View.GONE);
        b1= findViewById(R.id.btn_1);
        b2= findViewById(R.id.btn_2);
        b3= findViewById(R.id.btn_3);
        b4= findViewById(R.id.btn_4);
        traiQuyt= findViewById(R.id.trai_quyt);
        traiQuyt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                m1.start();

            }
        });

        btn_home=findViewById(R.id.btn_home);

        btn_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(TroChoi2Activity.this,MainActivity.class);
                startActivity(intent);
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                m2.start();
                Toast.makeText(TroChoi2Activity.this,"Sai rồi bé ơi",Toast.LENGTH_SHORT).show();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                m2.start();
                Toast.makeText(TroChoi2Activity.this,"Sai rồi bé ơi",Toast.LENGTH_SHORT).show();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                m3.start();
                Toast.makeText(TroChoi2Activity.this,"Đúng rồi bé ơi",Toast.LENGTH_LONG).show();
                b3.setVisibility(View.GONE);
                dem_qua.setVisibility(View.VISIBLE);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                m2.start();
                Toast.makeText(TroChoi2Activity.this,"Sai rồi bé ơi",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
