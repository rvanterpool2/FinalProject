package ruan.finalproject;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;

public class StartActivity extends Activity {

    private static int TimeInterval=10000;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final MediaPlayer ocean= MediaPlayer.create(StartActivity.this,R.raw.ocean2);
        ocean.start();
        setContentView(R.layout.splash_screen);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent in = new Intent(StartActivity.this,MainActivity1.class);
                startActivity(in);
                this.finish();
                ocean.stop();
            }
            private void finish() {
            }
        },TimeInterval);

    };
}
