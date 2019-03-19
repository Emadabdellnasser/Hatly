package project.emad.hatly;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    FrameLayout frame;
    Adding_trip add_trip_fr;
   Shipments ship_fr;
   home home_fr;
   Search search_fr;
    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    Setfragment(home_fr);
                    return true;
                case R.id.navigation_dashboard:
                    Setfragment(ship_fr);
                    return true;
                case R.id.navigation_notifications:
                    Setfragment(search_fr);


                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        add_trip_fr=new Adding_trip();
        home_fr=new home();
        ship_fr=new Shipments();
        search_fr=new Search();
        Setfragment(home_fr);
        frame=(FrameLayout) findViewById(R.id.content);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }
    private void Setfragment(Fragment fragment) {
        FragmentTransaction fragmenttransaction = getSupportFragmentManager().beginTransaction();
        fragmenttransaction.replace(R.id.content, fragment);
        fragmenttransaction.commit();
    }
}
