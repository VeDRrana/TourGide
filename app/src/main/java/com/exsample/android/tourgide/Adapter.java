package com.exsample.android.tourgide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Adapter extends ArrayAdapter<List> {

    // Create a new ListAdapter object

    public Adapter(Context context, ArrayList<List> lists) {
        super(context, 0, lists);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.place_item, parent, false);
        }
        // get the List object location at this position in the list
        List currentItem = getItem(position);

        //find the TextView in the place_item.xml layout
        TextView nameView = listItemView.findViewById(R.id.name);
        //get text for the current list object and set this text on the place_text TextView
        nameView.setText(currentItem.getName());

        TextView textView = listItemView.findViewById(R.id.place_text);
        textView.setText(currentItem.getText());

        ImageView imageViewOne = listItemView.findViewById(R.id.place_image_one);
        imageViewOne.setImageResource(currentItem.getImageOneId());

        ImageView imageViewTwo = listItemView.findViewById(R.id.place_image_two);
        imageViewTwo.setImageResource(currentItem.getImageTwoId());

        ImageView imageViewThree = listItemView.findViewById(R.id.place_image_three);
        imageViewThree.setImageResource(currentItem.getImageThreeId());

        //Return the whole place item_layout and show in ListView
        return listItemView;
    }}
