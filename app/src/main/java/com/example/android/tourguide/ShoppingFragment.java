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
public class ShoppingFragment extends Fragment {


    public ShoppingFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);


        final ArrayList<Location> locations = new ArrayList<Location>();


        locations.add(new Location(R.string.shop1, R.string.shopInfo1, R.drawable.tsimsha));
        locations.add(new Location(R.string.shop2, R.string.shopInfo2, R.drawable.admiraltycentral_));
        locations.add(new Location(R.string.shop3, R.string.shopInfo3, R.drawable.mongkong));
        locations.add(new Location(R.string.shop4, R.string.shopInfo4, R.drawable.shamshui));


        LocationAdapter adapter = new LocationAdapter(getActivity(), locations);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}