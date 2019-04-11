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

public class SigninActivity extends AppCompatActivity {

    private EditText edHoten, edSodt, edPass1, edPass2;
    private Button btn_sign;
    private TextView tvLoginLink;
    private SQLiteDatabase db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);
        //initData
        initData();
        //ánh xạ
        edHoten= findViewById(R.id.input_user_name_signin);
        edSodt= findViewById(R.id.input_number_phone_signin);
        edPass1= findViewById(R.id.input_password_1_singin);
        edPass2= findViewById(R.id.input_password_2_signin);
        btn_sign= findViewById(R.id.btn_signin);
        tvLoginLink= findViewById(R.id.link_login);


        btn_sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                signup();
            }
        });

        tvLoginLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(SigninActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });


    }



    private void initData(){

        db= openOrCreateDatabase("qltk.db", MODE_PRIVATE, null);
        String sql= " CREATE table IF NOT EXISTS tbtk (id integer primary key autoincrement," +
                "username text," +
                "sdt number," +
                "matkhau text )";
        db.execSQL(sql);
    }
    /*private void resetView(){
        edHoten.setText("");
        edSodt.setText("");
        edPass1.setText("");
        edPass2.setText("");
    }*/
    public void signup(){
        String Hoten = edHoten.getText().toString();
        String Sodt = edSodt.getText().toString();
        String pass2 = edPass2.getText().toString();
        if (!validate()){
            onSignupFailed();
            return;
        }
        else {
            String sql= "INSERT INTO tbtk(username,sdt,matkhau) VALUES("+
                    "'"+ Hoten +"'," +
                    "'"+ Sodt +"'," +
                    "'"+ pass2 +"'"+")";
            db.execSQL(sql);
            onSignupSuccess();
            //resetView();
            Intent intent = new Intent(SigninActivity.this,LoginActivity.class);
            startActivity(intent);
        }


    }
    public void onSignupSuccess() {
        Toast.makeText(getBaseContext(), "Đăng ký thành công", Toast.LENGTH_LONG).show();


    }
    public void onSignupFailed() {
        Toast.makeText(getBaseContext(), "Đăng ký thất bại", Toast.LENGTH_LONG).show();

        btn_sign.setEnabled(true);
    }

    public boolean validate() {
        boolean valid = true;

        String Hoten = edHoten.getText().toString();
        String Sodt = edSodt.getText().toString();
        String pass1 = edPass1.getText().toString();
        String pass2 = edPass2.getText().toString();

        if (Hoten.isEmpty() || Hoten.length() < 3) {
            edHoten.setError("Tên có ít nhất 3 kí tự");
            valid = false;
        }
        else if (User()){
            edHoten.setError("Tên này đã có trong cơ sở dữ lệu");
            valid = false;
        }
        else {
            edHoten.setError(null);
        }

        if (Sodt.isEmpty() || Sodt.length()< 10) {
            edSodt.setError("Nhập số điện thoại hợp lệ");
            valid = false;
        } else {
            edSodt.setError(null);
        }

        if (pass1.isEmpty() || pass1.length() < 6 || pass1.length() > 15) {
            edPass1.setError("Nhập mật khẩu từ 6 đến 15 kí tự");
            valid = false;
        } else {

            edPass1.setError(null);
        }
        if (!pass2.equals(pass1)) {
            edPass2.setError("Không khớp mật khẩu, vui lòng nhập lại!");
            valid = false;
        } else {
            edPass1.setError(null);
        }
        return valid;

    }
    public boolean User(){
        String ten= edHoten.getText().toString();
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
        return valid;
    }
}
