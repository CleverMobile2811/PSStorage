package com.psstorage.mandy.psstorage;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by maxch on 12/11/2017.
 */

public class SocialMediaFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.socialmedia_layout, container, false);
    }

    public static SocialMediaFragment newInstance(int page, String title) {
        SocialMediaFragment socialMediaFragment = new SocialMediaFragment();
        Bundle args = new Bundle();
        args.putInt("someInt", page);
        args.putString("someTitle", title);
        socialMediaFragment.setArguments(args);
        return socialMediaFragment;
    }
}
