package com.example.android.tourguide;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Noura on 9/5/17.
 */

public class ShoppingActivity extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.location_list);


        final ArrayList<Location> locations = new ArrayList<Location>();


        locations.add(new Location(R.string.shop1, R.string.shopInfo1, R.drawable.tsimsha));
        locations.add(new Location(R.string.shop2, R.string.shopInfo2, R.drawable.admiraltycentral_));
        locations.add(new Location(R.string.shop3, R.string.shopInfo3, R.drawable.mongkong));
        locations.add(new Location(R.string.shop4, R.string.shopInfo4, R.drawable.shamshui));


        LocationAdapter adapter = new LocationAdapter(this, locations);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);


    }
}




