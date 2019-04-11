package com.ntlan.hoccungbeyeu1;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {


    private EditText edUser, edPass;
    private Button btnLogin;
    private TextView tvLinkSignup;
    private SQLiteDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        edUser= findViewById(R.id.input_user);
        edPass= findViewById(R.id.input_password);

        btnLogin= findViewById(R.id.btn_login);

        tvLinkSignup= findViewById(R.id.link_signin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(User()&&Pass()){
                    Toast.makeText(LoginActivity.this,"Đăng nhập thành công",Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                    intent.putExtra("username", edUser.getText().toString());
                    startActivity(intent);
                }
                else {
                    Toast.makeText(LoginActivity.this,"Đăng nhập thất bại",Toast.LENGTH_LONG).show();
                }
            }
        });

        tvLinkSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(LoginActivity.this, SigninActivity.class);
                startActivity(intent);
            }
        });


    }
    public boolean User(){
        String ten= edUser.getText().toString();
        String user="";
        boolean valid=false;
        db= openOrCreateDatabase("qltk.db", MODE_PRIVATE, null);
        String sql= "SELECT * FROM tbtk";
        Cursor cursor= db.rawQuery(sql,null);
        cursor.moveToFirst();
        while (!cursor.isAfterLast()){

            user= cursor.getString(1);
            if(user.equals(ten))
                valid=true;
            cursor.moveToNext();


        }
        db.close();
        return valid;
    }
    public boolean Pass(){
        String pass="";
        boolean valid=false;
        String mk= edPass.getText().toString();
        db= openOrCreateDatabase("qltk.db", MODE_PRIVATE, null);
        String sql= "SELECT * FROM tbtk";
        Cursor cursor= db.rawQuery(sql,null);
        cursor.moveToFirst();
        while (!cursor.isAfterLast()){

            pass= cursor.getString(3);
            if (pass.equals(mk))
                valid=true;
            cursor.moveToNext();


        }
        db.close();
        return valid;
    }

}
