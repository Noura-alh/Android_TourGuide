package com.example.android.tourguide;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Noura on 9/5/17.
 */

public class RestaurantsActivity extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.location_list);


        final ArrayList<Location> locations = new ArrayList<Location>();


        locations.add(new Location(R.string.restaurant1, R.string.restaurantInfo1, R.drawable.amber));
        locations.add(new Location(R.string.restaurant2, R.string.restaurantInfo2, R.drawable.arcane));
        locations.add(new Location(R.string.restaurant3, R.string.restaurantInfo3, R.drawable.heleefook));
        locations.add(new Location(R.string.restaurant4, R.string.restaurantInfo4, R.drawable.rhoda));


        LocationAdapter adapter = new LocationAdapter(this, locations);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);


    }


}
