package ruan.finalproject;

import android.content.Context;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import ruan.finalproject.Adapter.ListViewAdapter;
import ruan.finalproject.util.UtilLog;

public class MainActivity1 extends BaseActivity1 implements AdapterView.OnItemClickListener,View.OnTouchListener {
  private final ArrayList<String> mobileArray= new ArrayList<String>();
    private GestureDetector mGestureDetector;
   @BindView(R.id.f1)
    FrameLayout fl;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mobileArray.add("Animation");
        mobileArray.add("Music Player");
        mobileArray.add("Quiz");
        ListViewAdapter listViewAdapter = new ListViewAdapter(this, mobileArray);
        ButterKnife.bind(this);
        mGestureDetector= new GestureDetector(this, new SimpleGestureListener());
        fl.setOnTouchListener(this);

//
//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
//                R.layout.activity_listview, mobileArray);

        ListView listView = (ListView) findViewById(R.id.listView1);
        listView.setAdapter(listViewAdapter);
        listView.setOnItemClickListener(this);


    }

    @Override
    public void onClick(View v) {

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        switch (position) {
            case 0:
                toActivity(AnimationActivity.class);
                break;
            case 1:
                toActivity(Music_Player.class);
                break;
            case 2:
                toActivity(ViewPagerActivity.class);
                break;
        }
    }
    @Override
    public boolean onTouch(View v, MotionEvent event) {
        mGestureDetector.onTouchEvent(event);
        return true;
    }
    private class SimpleGestureListener extends GestureDetector.SimpleOnGestureListener {
        public boolean onDown(MotionEvent e) {
            // UtilLog.logD("MyGesture", "onDown");
            toastShort("onDown");
            return false;
        }
        @Override
        public void onShowPress(MotionEvent e) {
            //UtilLog.logD("MyGesture", "onShowPress");
            toastShort("onShowPress");
        }
        @Override
        public void onLongPress(MotionEvent e) {
            //UtilLog.logD("MyGesture", "onLongPress");
            toastShort("onLongPress");
        }
        @Override
        public boolean onSingleTapConfirmed(MotionEvent e){
            UtilLog.logD("MyGesture","onSingleTap"+ e);
            toastShort("onSingleTap");
            return true;
        }
        @Override
        public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
            UtilLog.logD("MyGesture", "onScroll:" + (e1.getY() - e2.getY() + " " + distanceX));
            Context context= getApplicationContext();
            Toast toast = Toast.makeText(context, "onScroll" ,Toast.LENGTH_SHORT);
            // toastShort("onScroll");
            toast.show();
            return true;

        }
        @Override
        public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY){
            UtilLog.logD("MyGestures", "onFling: "+(e1.getY() - e2.getY() + " " + velocityX) );
            Context context= getApplicationContext();
            Toast toast = Toast.makeText(context, "onFling" ,Toast.LENGTH_SHORT);
            //toastShort("onFling");

            toast.show();

            return true;
        }
        @Override
        public boolean onDoubleTap(MotionEvent e){
            toastShort("onDoubleTap");
            return true;
        }
        @Override
        public boolean onDoubleTapEvent(MotionEvent e){
            toastShort("onDoubleTapEvent");
            return true;
        }
    }
}
//    private int checkedID;
//    @BindView(R.id.rdg) RadioGroup radioGroup;
//    @OnClick(R.id.bt_Ok)
//
//    public void okClick1() {
//        switch (checkedID) {
//            case R.id.rb1:
//                firstActivity();
//                break;
//            case R.id.rb2:
//                secondActivity();
//                break;
//            default:
//        }
//    }
//    private void firstActivity() {
//        startActivity(new Intent(this, DialogActivity.class));
//            }
//
//
//    private void secondActivity(){
//        startActivity(new Intent(this, carAnimator.class));
//    }
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        ButterKnife.bind(this);
//        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(RadioGroup group,@IdRes int checkedId) {
//                checkedID= checkedId;
//            }
//        });


//    @Override
//    public void onClick(View v) {
//
//    }