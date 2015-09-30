package com.example.david.test_list;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;

import java.util.ArrayList;

/**
 * Created by David on 9/27/2015.
 */
public class DemoAdapter extends ArrayAdapter<Demo> {

        public DemoAdapter(Context context, ArrayList<Demo> users) {
            super(context, 0, users);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            // Get the data item for this position
            Demo user = getItem(position);
            // Check if an existing view is being reused, otherwise inflate the view
            if (convertView == null) {
                convertView = LayoutInflater.from(getContext()).inflate(R.layout.demo, parent, false);
            }
            // Lookup view for data population
            EditText tvName = (EditText) convertView.findViewById(R.id.text);
            //TextView tvHome = (TextView) convertView.findViewById(R.id.tvHome);
            // Populate the data into the template view using the data object
            tvName.setText(user.name);
            //tvHome.setText(user.hometown);
            // Return the completed view to render on screen
            return convertView;
        }
    }

