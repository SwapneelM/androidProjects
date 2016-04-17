package com.android.projectone;

import android.os.Bundle;
import android.preference.PreferenceFragment;


public class LayoutPreferenceFragment extends PreferenceFragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.layout_preference);
    }
}
