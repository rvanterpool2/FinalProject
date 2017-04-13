package ruan.finalproject;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.BounceInterpolator;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

import static java.lang.Float.valueOf;
import static ruan.finalproject.R.id.img2Circle;

public class carAnimator extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car_animator);
        final EditText tfRadius=(EditText)findViewById(R.id.tfRadious);
        final ImageView imgCircle=(ImageView)findViewById(R.id.imgCircle);
        final ImageView imgCircle2=(ImageView)findViewById(R.id.img2Circle);
        Button btnDraw= (Button)findViewById(R.id.btnDraw);
        btnDraw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float radius= valueOf(tfRadius.getText().toString());
                Paint paint= new Paint();
                paint.setColor(Color.BLUE);
                //paint.setStyle(Paint.Style.STROKE);
                paint.setStyle(Paint.Style.FILL_AND_STROKE);
                Bitmap bmp= Bitmap.createBitmap(500,500, Bitmap.Config.ARGB_8888);
                Canvas canvas= new Canvas(bmp);
                canvas.drawCircle(bmp.getWidth()/2, bmp.getHeight()/2, radius, paint);
                imgCircle.setImageBitmap(bmp);
                imgCircle2.setImageBitmap(bmp);
            }
        });

    }

}

