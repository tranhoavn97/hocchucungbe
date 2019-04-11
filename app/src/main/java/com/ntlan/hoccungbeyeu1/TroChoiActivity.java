package com.ntlan.hoccungbeyeu1;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class TroChoiActivity extends AppCompatActivity {
    Button b1,b2,b3,b4,b5;
    ImageView imConHo,btn_home, btn_right;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tro_choi);
        final MediaPlayer mediaPlayer= MediaPlayer.create(this,R.raw.missinglettergame);
        mediaPlayer.start();
        final MediaPlayer m2= MediaPlayer.create(this,R.raw.no);
        final MediaPlayer m3= MediaPlayer.create(this,R.raw.magic);
        final MediaPlayer m4= MediaPlayer.create(this,R.raw.tiger);
        TextView tv_tieu_de= findViewById(R.id.tv_tieude);
        b1= findViewById(R.id.btn_a);
        b2= findViewById(R.id.btn_E);
        b3= findViewById(R.id.btn_I);
        b4= findViewById(R.id.btn_o3);
        b5= findViewById(R.id.btn_o2);
        btn_home=findViewById(R.id.btn_home);
        imConHo= findViewById(R.id.im_Con_ho);
        btn_right= findViewById(R.id.btn_right);
        tv_tieu_de.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer.start();
            }
        });
//        btn_right.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent= new Intent(TroChoiActivity.this,TroChoi2Activity.class);
//                startActivity(intent);
//            }
//        });
        btn_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(TroChoiActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
        imConHo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                m4.start();
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                m2.start();
                Toast.makeText(TroChoiActivity.this,"Sai rồi bé ơi",Toast.LENGTH_SHORT).show();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                m2.start();
                Toast.makeText(TroChoiActivity.this,"Sai rồi bé ơi",Toast.LENGTH_SHORT).show();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                m2.start();
                Toast.makeText(TroChoiActivity.this,"Sai rồi bé ơi",Toast.LENGTH_SHORT).show();
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                m3.start();
                b5.setText("Ổ");
                b4.setVisibility(View.GONE);
                Toast.makeText(TroChoiActivity.this,"Đúng rồi bé ơi",Toast.LENGTH_LONG).show();
            }
        });
    }

}
