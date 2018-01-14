package com.example.android.quakereport;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.text.DateFormat;
import java.util.ArrayList;

/**
 * Created by William Lin on 1/14/2018.
 */

public class EarthquakeListAdapter extends ArrayAdapter<Earthquake> {

    public EarthquakeListAdapter(Activity context, ArrayList<Earthquake> earthquakes) {
        super(context, 0, earthquakes);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.earthquake_list_item_layout, parent, false);
        }

        // Get the Earthquake object located at this position in the list
        Earthquake earthquake = getItem(position);

        TextView magnitudeTextView = (TextView) listItemView.findViewById(R.id.txtViewMagnitude);
        magnitudeTextView.setText(earthquake.magnitude);

        TextView locationTextView = (TextView) listItemView.findViewById(R.id.txtViewLocation);
        locationTextView.setText(earthquake.location);

        TextView dateTextView = (TextView) listItemView.findViewById(R.id.txtViewDate);
        dateTextView.setText(DateFormat.getDateInstance(2).format(earthquake.when));

        return listItemView;
    }
}
