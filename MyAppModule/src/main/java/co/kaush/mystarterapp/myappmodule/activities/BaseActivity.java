package co.kaush.mystarterapp.myappmodule.activities;

import android.app.Activity;

import static co.kaush.mystarterapp.myappmodule.utils.LogUtils.makeLogTag;

public class BaseActivity extends Activity {
    public final String TAG = makeLogTag(this.getClass());
}
