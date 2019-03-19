package project.emad.hatly;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

public class Search extends Fragment {
    private View mMainView;
LinearLayout shipment_sear,trips_sear,searchLay;
    public Search() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        mMainView = inflater.inflate(R.layout.activity_search, container, false);
        shipment_sear=mMainView.findViewById(R.id.shipments_lay);
        trips_sear=mMainView.findViewById(R.id.trips_lay);
        searchLay=mMainView.findViewById(R.id.search);
        shipment_sear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                shipment_sear.setBackgroundResource(R.drawable.backwhite);
                trips_sear.setBackgroundResource(0);

            }
        });

        trips_sear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                trips_sear.setBackgroundResource(R.drawable.backwhite);
                shipment_sear.setBackgroundResource(0);

            }
        });
        searchLay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment fragment = new ShipmentSearch();
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.content, fragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();

            }
        });

        return mMainView;

    }
}