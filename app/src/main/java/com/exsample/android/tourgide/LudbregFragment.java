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
public class LudbregFragment extends Fragment {


    public LudbregFragment() {   }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list,container,false);

        ArrayList<List> listToSee = new ArrayList<List>();
        listToSee.add(new List(R.string.ludbreg_about,R.string.ludbreg_text, R.drawable.ludbreg,R.drawable.center_2,R.drawable.island_1));
        listToSee.add(new List(R.string.center,R.string.center_text, R.drawable.center_1,R.drawable.center_2,R.drawable.center_3));
        listToSee.add(new List(R.string.chapel,R.string.chapel_text, R.drawable.chapel_1,R.drawable.chapel_2,R.drawable.chapel_3));
        listToSee.add(new List(R.string.island,R.string.island_text, R.drawable.island_1,R.drawable.island_2,R.drawable.island_3));
        listToSee.add(new List(R.string.crnbel,R.string.crnbel_text, R.drawable.crnbel_1,R.drawable.crnbel_2,R.drawable.crnbel_3));

        Adapter adapter = new Adapter(getActivity(), listToSee);

        ListView listView = rootView.findViewById(R.id.listToSee);

        listView.setAdapter(adapter);

        return rootView;
    }

}
