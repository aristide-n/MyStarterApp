package co.kaush.mystarterapp.myappmodule.activities;

import android.os.Bundle;

import co.kaush.mystarterapp.myappmodule.R;
import co.kaush.mystarterapp.myappmodule.pojos.SamplePojo;

public class SampleActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample);
    }

    private void someMethodToIncludeAPojo() {
        SamplePojo tester = new SamplePojo();
        tester.someMethod();
    }
}
