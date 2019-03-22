package com.example.labo03;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.labo03.utils.AppConstants;

import org.w3c.dom.Text;

public class Main3Activity extends AppCompatActivity {

    private TextView mText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        mText = findViewById(R.id.txt_message);
        Intent mIntent = getIntent();

        if(mIntent != null){
            mText.setText(mIntent.getStringExtra(AppConstants.TEXT_KEY));
        }
    }
}
