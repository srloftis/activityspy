package edu.washington.srloftis.activityspy;

        import android.app.Activity;
        import android.os.Bundle;
        import android.util.Log;

public class MainActivity extends Activity {
    public static final String tag = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(tag, "onCreate event fired");
    }
    @Override
    protected void onStart(){
        super.onStart();
        Log.i(tag, "onStart event fired");
    }
    @Override
    protected void onRestart(){
        super.onRestart();
        Log.i(tag, "onRestart event fired");
    }
    @Override
    protected void onResume(){
        super.onResume();
        Log.i(tag, "onResume event fired");
    }
    @Override
    protected void onPause(){
        super.onPause();
        Log.i(tag, "onPause event fired");
    }
    @Override
    protected void onStop(){
        super.onStop();
        Log.i(tag, "onStop event fired");
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.i(tag, "onDestroy event fired");
        Log.e(tag, "We're going down, Captain!");
    }
}
