package com.example.android.sunshine.app;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.LayoutInflater;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    String[] data = {
                                "Mon 6/23 - Sunny - 31/17",
                                "Tue 6/24 - Foggy - 21/8",
                                "Wed 6/25 - Cloudy - 22/17",
                                "Thurs 6/26 - Rainy - 18/11",
                                "Fri 6/27 - Foggy - 21/10",
                                "Sat 6/28 - TRAPPED IN WEATHERSTATION - 23/18",
                               "Sun 6/29 - Sunny - 20/7"
                                };
                List<String> weekForecast = new ArrayList<String>(Arrays.asList(data));
    View rootView = inflater.inflate(R.layout.fragment_main, container, false);
    return rootView;
}
