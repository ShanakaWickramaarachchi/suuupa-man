package com.udacity.firebase.shoppinglistplusplus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class training5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_training5);
    }
    public void increment(View view){
        Intent intent = new Intent(this ,Main5Activity.class);
        startActivity(intent);

    }
}
