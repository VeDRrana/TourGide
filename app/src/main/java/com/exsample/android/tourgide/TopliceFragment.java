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
public class TopliceFragment extends Fragment {


    public TopliceFragment() {   }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list,container,false);

        ArrayList<List> listToSee = new ArrayList<List>();
        listToSee.add(new List(R.string.aqua_about,R.string.aqua_text, R.drawable.aqua,R.drawable.hiza_1,R.drawable.house_2));
        listToSee.add(new List(R.string.iasae,R.string.iasae_text, R.drawable.aqua_1,R.drawable.aqua_2,R.drawable.aqua_3));
        listToSee.add(new List(R.string.house,R.string.house_text, R.drawable.house_1,R.drawable.house_2,R.drawable.house_3));
        listToSee.add(new List(R.string.hiza,R.string.hiza_text, R.drawable.hiza_1,R.drawable.huza_2,R.drawable.hiza_3));
        listToSee.add(new List(R.string.vila,R.string.vila_text, R.drawable.vila_1,R.drawable.vila_2,R.drawable.vila_3));

        Adapter adapter = new Adapter(getActivity(), listToSee);

        ListView listView = rootView.findViewById(R.id.listToSee);

        listView.setAdapter(adapter);

        return rootView;
    }

}
