package project.emad.hatly;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Adding_trip extends Fragment {
    private View mMainView;

    public static Adding_trip newInstance() {
        Adding_trip fragment = new Adding_trip();
        return fragment;
    }
 public Adding_trip()
 {

 }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        mMainView = inflater.inflate(R.layout.activity_adding_trip, container, false);

//        Toolbar toolbar = (Toolbar) mMainView.findViewById(R.id.toolbar);
//       getActivity().setSupportActionBar(toolbar);
//
//        if (((ActionBarActivity)getActivity()).getSupportActionBar() != null) {
//            ((ActionBarActivity)getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//        }
//
//        ((ActionBarActivity)getActivity()).setTitle("Add Your Trip");
        return mMainView;
    }
}
