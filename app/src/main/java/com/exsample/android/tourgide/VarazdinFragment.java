package com.exsample.android.tourgide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
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
public class VarazdinFragment extends Fragment {

    public VarazdinFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list,container,false);

        //Create a list of what to see in city
        final ArrayList<List> listToSee = new ArrayList<List>();
        listToSee.add(new List(R.string.varazdin_about,R.string.varazdin_text, R.drawable.varazdin,R.drawable.angels_3,R.drawable.spancir_3));
        listToSee.add(new List(R.string.spancir,R.string.spancir_text, R.drawable.spancir_1,R.drawable.spancir_2,R.drawable.spancir_3));
        listToSee.add(new List(R.string.angels,R.string.angels_text, R.drawable.angels_1,R.drawable.angels_2,R.drawable.angels_3));
        listToSee.add(new List(R.string.old_town,R.string.old_town_text, R.drawable.old_town_1,R.drawable.old_town_2,R.drawable.old_town_3));
        listToSee.add(new List(R.string.angelus,R.string.angelus_text, R.drawable.angelus_1,R.drawable.angelus_2,R.drawable.angelus_3));
        listToSee.add(new List(R.string.turist,R.string.turist_text, R.drawable.turist_1,R.drawable.turist_2,R.drawable.turist_3));
        listToSee.add(new List(R.string.sanjek,R.string.sanjek_text, R.drawable.sanjek_1,R.drawable.sanjek_2,R.drawable.sanjek_3));

        // Create an Adapter
        Adapter adapter = new Adapter(getActivity(), listToSee);

        // Find the ListView object in the view hierarchy
        ListView listView = rootView.findViewById(R.id.listToSee);

        // Make the ListView use the Adapter
        listView.setAdapter(adapter);

        return rootView;
    }

}
