package com.example.usingstrings;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txtVMsg2 = findViewById(R.id.TvMsg2);
        txtVMsg2.setText(R.string.Msg2);

        Log.i("Lifecycle", "OnCreate called....");
    }

    public void onStart() {
        super.onStart();
        Log.i("Lifecycle", "onStart called....");
    }

    public void onResume() {
        super.onResume();
        Log.i("Lifecycle", "onResume called....");
    }

    public void onPause()
    {
        super.onPause();
        Log.i("Lifecycle", "onPause called....");
    }

    public void onStop()
    {
        super.onStop();
        Log.i("Lifecycle", "onStop called....");
    }

    public void onDestroy()
    {
        super.onDestroy();
        Log.i("Lifecycle", "onDestroy called....");
    }
}