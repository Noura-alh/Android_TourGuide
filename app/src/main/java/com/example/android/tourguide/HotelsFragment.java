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
public class HotelsFragment extends Fragment {


    public HotelsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);


        final ArrayList<Location> locations = new ArrayList<Location>();


        locations.add(new Location(R.string.hotel1, R.string.hotelInfo1, R.drawable.hotelicon));
        locations.add(new Location(R.string.hotel2, R.string.hotelInfo2, R.drawable.hyattr));
        locations.add(new Location(R.string.hotel3, R.string.hotelInfo3, R.drawable.mandarin));
        locations.add(new Location(R.string.hotel4, R.string.hotelInfo4, R.drawable.inter));


        LocationAdapter adapter = new LocationAdapter(getActivity(), locations);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
