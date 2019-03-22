package com.feranstirman.labo3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.feranstirman.labo3.Utils.AppConstants;

public class newActivity extends AppCompatActivity {

    private TextView mTv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);

        mTv1 = findViewById(R.id.t1);

        Intent mIntent = this.getIntent();

        if(mIntent != null){
            mTv1.setText(mIntent.getStringExtra(AppConstants.TEXT_KEY));
        }
    }
}
