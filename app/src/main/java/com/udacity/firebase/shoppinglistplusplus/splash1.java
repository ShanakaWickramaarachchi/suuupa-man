package com.udacity.firebase.shoppinglistplusplus;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

import com.udacity.firebase.shoppinglistplusplus.ui.login.LoginActivity;

/**
 * Created by Shanaka Wickramaarachchi behalf of the Team Loafers for IMPACTO.
 */
public class splash1 extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        // splash screen code //
        Thread myThread = new Thread() {
            @Override
            public void run() {


                try {
                    sleep(3000);
                    //calling the main activity
                    Intent startsplash = new Intent(getApplicationContext(),LoginActivity.class);
                    startActivity(startsplash);
                    finish();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        myThread.start();
    }
}

