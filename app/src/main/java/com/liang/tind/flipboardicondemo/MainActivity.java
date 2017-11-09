package com.liang.tind.flipboardicondemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    private FlipboardIconView flipboradiconview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.flipboradiconview = (FlipboardIconView) findViewById(R.id.flipborad_icon_view);

        flipboradiconview.addAnimationListener(new FlipboardIconView.AnimationListener() {
            @Override
            public void onAnimationEnd() {
                Log.e(TAG, "onAnimationEnd: ");
            }

            @Override
            public void onAnimationStart() {
                Log.e(TAG, "onAnimationStart: ");
            }
        });
    }
}
