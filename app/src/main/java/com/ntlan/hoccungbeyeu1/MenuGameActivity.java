package com.ntlan.hoccungbeyeu1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MenuGameActivity extends AppCompatActivity {
    ImageView btn_home, tro1, tro2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_game);
        btn_home= findViewById(R.id.btn_home);
        btn_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(MenuGameActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
        tro1= findViewById(R.id.tro1);
        tro1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(MenuGameActivity.this,TroChoiActivity.class);
                startActivity(intent);
            }
        });
        tro2= findViewById(R.id.tro2);
        tro2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(MenuGameActivity.this,TroChoi2Activity.class);
                startActivity(intent);
            }
        });
    }
}
