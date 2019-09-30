package com.exsample.android.tourgide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class TrakoscanFragment extends Fragment {


    public TrakoscanFragment() {    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list,container,false);

        ArrayList<List> listToSee = new ArrayList<List>();
        listToSee.add(new List(R.string.trakoscan_about,R.string.trakoscan_text, R.drawable.trakoscan,R.drawable.trakoscan_2,R.drawable.lake_1));
        listToSee.add(new List(R.string.trakoscanMuseum,R.string.trakoscanMuseum_text, R.drawable.trakoscan_1,R.drawable.trakoscan_2,R.drawable.trakoscan_3));
        listToSee.add(new List(R.string.cross,R.string.cross_text, R.drawable.cross_1,R.drawable.cross_2,R.drawable.cross_3));
        listToSee.add(new List(R.string.lake,R.string.lake_text, R.drawable.lake_1,R.drawable.lake_2,R.drawable.lake_3));

        Adapter adapter = new Adapter(getActivity(), listToSee);

        ListView listView = rootView.findViewById(R.id.listToSee);

        listView.setAdapter(adapter);

        return rootView;

    }

}
