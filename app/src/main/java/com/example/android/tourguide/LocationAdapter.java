package com.example.android.tourguide;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Noura on 9/6/17.
 */


public class LocationAdapter extends ArrayAdapter<Location> {

    private List<Location> objects;
    private Context context;

    public LocationAdapter(@NonNull Context context, @NonNull List<Location> objects) {
        super(context, 0, objects);
        this.context = context;
        this.objects = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {


        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }


        Location currentLocation = getItem(position);


        TextView titleTextView = (TextView) listItemView.findViewById(R.id.title);

        titleTextView.setText(currentLocation.getlName());


        TextView InfoTextView = (TextView) listItemView.findViewById(R.id.Info);

        InfoTextView.setText(currentLocation.getlInfo());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        imageView.setImageResource(currentLocation.getlImageId());


        return listItemView;
    }
}
