package com.example.sdkexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.bulb.support.beacon.log.LogModule;
import com.example.sdklibrary.ToastMessage;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ToastMessage.s(MainActivity.this, "Minha biblioteca...");

        LogModule.d("Executando funcao LogModule...");

    }
}
