package com.psstorage.mandy.psstorage;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.psstorage.mandy.psstorage.Adaptor.SocialMediaListAdaptor;
import com.psstorage.mandy.psstorage.Model.SocialMediaCell;

import static android.content.ContentValues.TAG;

/**
 * Created by maxch on 12/11/2017.
 */

public class SocialMediaFragment extends Fragment {
    public ListView listView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        SocialMediaCell weather_data[] = new SocialMediaCell[]
                {
                        new SocialMediaCell()
                };

        SocialMediaListAdaptor adapter = new SocialMediaListAdaptor(getActivity(),
                R.layout.socialmedia_cell, weather_data);


        listView = (ListView)getView().findViewById(R.id.socialmedia_listview);

//        View header = (View)getLayoutInflater().inflate(R.layout.listview_header_row, null);
//        listView.addHeaderView(header);

        listView.setAdapter(adapter);
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.socialmedia_layout, container, false);
    }

    public static SocialMediaFragment newInstance(int page, String title) {
        SocialMediaFragment socialMediaFragment = new SocialMediaFragment();
        Bundle args = new Bundle();
        args.putInt("someInt", page);
        args.putString("someTitle", title);
        socialMediaFragment.setArguments(args);
        Log.v(TAG, "test-1");
        return socialMediaFragment;
    }
}
