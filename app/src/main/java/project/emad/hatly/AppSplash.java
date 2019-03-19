package project.emad.hatly;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;

import project.emad.hatly.R;

public class AppSplash extends AppCompatActivity {
    /**
     * Duration of wait
     **/
    private final int SPLASH_DISPLAY_LENGTH = 1000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_logo);

        //splash duration body
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                /* Create an Intent that will start the Menu-Activity. */
                Intent mainIntent = new Intent(AppSplash.this, LoginActivity.class);
                AppSplash.this.startActivity(mainIntent);
                AppSplash.this.finish();
            }
        }, SPLASH_DISPLAY_LENGTH);
    }
}
