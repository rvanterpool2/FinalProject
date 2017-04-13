package ruan.finalproject;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class AnimationActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation);


        final Animation animDecelerate = AnimationUtils.loadAnimation(this, R.anim.decelerate);

        final ImageView image = (ImageView)findViewById(R.id.image);

        Button btnDecelerate = (Button)findViewById(R.id.decelerate);
        btnDecelerate.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View arg0) {
                image.startAnimation(animDecelerate);

            }});

    }
}