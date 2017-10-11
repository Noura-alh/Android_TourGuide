package com.example.android.tourguide;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Noura on 9/5/17.
 */

public class MuseumsActivity extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.location_list);


        final ArrayList<Location> locations = new ArrayList<Location>();


        locations.add(new Location(R.string.museum1, R.string.museumInfo1, R.drawable.museumhistory));
        locations.add(new Location(R.string.museum2, R.string.museumInfo2, R.drawable.museumart));
        locations.add(new Location(R.string.museum3, R.string.museumInfo3, R.drawable.museumspace));
        locations.add(new Location(R.string.museum4, R.string.museumInfo4, R.drawable.musemmedical));


        LocationAdapter adapter = new LocationAdapter(this, locations);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);


    }
}
