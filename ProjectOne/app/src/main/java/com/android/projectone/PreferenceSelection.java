package com.android.projectone;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class PreferenceSelection extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.preferences_active);

        getFragmentManager().beginTransaction().replace(R.id.org_frame,
                new LayoutPreferenceFragment()).commit();
    }
}
