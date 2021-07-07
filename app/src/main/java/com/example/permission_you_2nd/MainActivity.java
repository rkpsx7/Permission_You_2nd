package com.example.permission_you_2nd;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private final static int Req_Code=0;
    private Button getPermissions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getPermissions = findViewById(R.id.BtnGetPermissions);

        getPermissions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String[] permissions = {Manifest.permission.WRITE_EXTERNAL_STORAGE,Manifest.permission.ACCESS_FINE_LOCATION};
                ActivityCompat.requestPermissions(MainActivity.this,permissions,Req_Code);
            }
        });

    }
    public void showToast(String msg){
        Toast.makeText(MainActivity.this,msg,Toast.LENGTH_SHORT).show();
    }
}