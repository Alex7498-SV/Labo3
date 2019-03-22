package com.feranstirman.labo3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.feranstirman.labo3.Utils.AppConstants;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    private Button mButton, mButtonShare;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButton = findViewById(R.id.send);
        mButtonShare = findViewById(R.id.share);

        mButtonShare.setOnClickListener(v->{
            Intent mIntent  = new Intent();
            mIntent.setAction(Intent.ACTION_SEND);
            mIntent.setType("text/plain");
            mIntent.putExtra(Intent.EXTRA_TEXT, "ffwcSHBFW");
            startActivity(mIntent);
        });

        mButton.setOnClickListener(v-> {
            Intent mIntent = new Intent(MainActivity.this, newActivity.class);
            mIntent.putExtra(AppConstants.TEXT_KEY, "Hola, NewActivity");
            startActivity(mIntent);
        });


    }
}
