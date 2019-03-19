package project.emad.hatly;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.facebook.FacebookSdk;

public class LoginActivity extends AppCompatActivity {
Button login,signUp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        FacebookSdk.setApplicationId("222222222222");
//        FacebookSdk.sdkInitialize(getApplicationContext());
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        login=findViewById(R.id.loginBtn);
        signUp=findViewById(R.id.signUpBtn);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in =new Intent(LoginActivity.this,MainActivity.class);
                startActivity(in);
            }
        });



    }
}
