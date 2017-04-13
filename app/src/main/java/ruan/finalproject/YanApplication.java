package ruan.finalproject;

import android.app.Application;

import ruan.finalproject.util.UtilLog;


/**
 * Created by YoungH on 2/6/17.
 */

public class YanApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        UtilLog.setDebug(true);
    }
}
