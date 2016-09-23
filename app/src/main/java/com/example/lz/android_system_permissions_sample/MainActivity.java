package com.example.lz.android_system_permissions_sample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startCheckPermissionsActivity(View view){
        Intent intent = new Intent(MainActivity.this,CheckPermissionsActivity.class);
        startActivity(intent);
    }
}
