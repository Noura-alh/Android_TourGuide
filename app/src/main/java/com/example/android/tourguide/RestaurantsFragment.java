package com.example.android.tourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class RestaurantsFragment extends Fragment {


    public RestaurantsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);


        final ArrayList<Location> locations = new ArrayList<Location>();


        locations.add(new Location(R.string.restaurant1, R.string.restaurantInfo1, R.drawable.amber));
        locations.add(new Location(R.string.restaurant2, R.string.restaurantInfo2, R.drawable.arcane));
        locations.add(new Location(R.string.restaurant3, R.string.restaurantInfo3, R.drawable.heleefook));
        locations.add(new Location(R.string.restaurant4, R.string.restaurantInfo4, R.drawable.rhoda));


        LocationAdapter adapter = new LocationAdapter(getActivity(), locations);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
