package com.example.androidndk;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

/**
 * Demo android NDK
 */
public class MainActivity extends AppCompatActivity {

    private static final String KEY = "security";
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.tv_testNative);
        // gọi lấy String từ C+
        helloLog("LUYENPHONG");

        Log.d("AAAÂ", getString(10,5));

        textView.setText(getStringHello());
    }

    private native void helloLog(String a);

    private native String getString(int a, int b);

    private native String getStringHello();


    static {
        System.loadLibrary(KEY);
    }
}