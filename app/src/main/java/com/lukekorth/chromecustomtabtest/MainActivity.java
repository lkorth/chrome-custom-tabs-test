package com.lukekorth.chromecustomtabtest;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText mUrl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mUrl = (EditText) findViewById(R.id.url);
    }

    public void launchChromeCustomTab(View v) {
        Bundle extras = new Bundle();
        extras.putBinder("android.support.customtabs.extra.SESSION", null);

        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(mUrl.getText().toString()))
                .putExtras(extras);

        startActivity(intent);
    }
}
