package com.example.labo03;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.labo03.utils.AppConstants;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    private Button mButton, mButtonShare;

    //Serializable
    //Parceable
    //Bundle

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButton = findViewById(R.id.tv_message);
        mButtonShare=findViewById(R.id.btn_share);
        mButton.setOnClickListener(v -> {
            Intent mIntent = new Intent(MainActivity.this, Main3Activity.class);
            mIntent.putExtra(AppConstants.TEXT_KEY, "Hala Juve :(");
            startActivity(mIntent);
        });

        mButtonShare.setOnClickListener(v -> {
            Intent mIntent = new Intent();
            mIntent.setAction(Intent.ACTION_SEND);
            mIntent.setType("text/plain");
            mIntent.putExtra(Intent.EXTRA_TEXT, "Cristic mierda!!!!!!!!!");
            startActivity(mIntent);
        });
    }

}
