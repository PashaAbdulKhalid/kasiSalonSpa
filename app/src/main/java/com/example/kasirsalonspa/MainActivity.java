package com.example.kasirsalonspa;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnKeluar;
    private ImageButton Fitur1;
    private ImageButton Fitur2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnKeluar = (Button) findViewById(R.id.btn_keluar);
        Fitur1 = findViewById(R.id.fitur_1);
        Fitur2 = findViewById(R.id.fitur_2);

        btnKeluar.setOnClickListener(this);
        Fitur1.setOnClickListener(this);
        Fitur2.setOnClickListener(this);
    }
    //fungsi signin untuk mengkonfirmasi data pengguna yang sudah mendaftar sebelumnya
    private void signout() {
        startActivity(new Intent(MainActivity.this, LoginActivity.class));
        finish();
    }
    //fungsi untuk click buton fitur 1
    private void ftr1 () {
        startActivity(new Intent(MainActivity.this, FiturPelayanan.class));
        finish();
    }

    //fungsi untuk click buton fitur 2
    private void ftr2 () {
        startActivity(new Intent(MainActivity.this, TransaksiActivity.class));
        finish();
    }


    @Override
    public void onClick(View v) {
        int i = v.getId();
        if (i == R.id.btn_keluar) {
            signout();
        }else if(i==R.id.fitur_1){
            ftr1();
        }else if (i==R.id.fitur_2){
            ftr2();
        }
    }

}
