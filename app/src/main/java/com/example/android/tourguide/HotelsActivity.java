package com.example.android.tourguide;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Noura on 9/5/17.
 */

public class HotelsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.location_list);

        final ArrayList<Location> locations = new ArrayList<Location>();


        locations.add(new Location(R.string.hotel1, R.string.hotelInfo1, R.drawable.hotelicon));
        locations.add(new Location(R.string.hotel2, R.string.hotelInfo2, R.drawable.hyattr));
        locations.add(new Location(R.string.hotel3, R.string.hotelInfo3, R.drawable.mandarin));
        locations.add(new Location(R.string.hotel4, R.string.hotelInfo4, R.drawable.inter));


        LocationAdapter adapter = new LocationAdapter(this, locations);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);


    }
}
