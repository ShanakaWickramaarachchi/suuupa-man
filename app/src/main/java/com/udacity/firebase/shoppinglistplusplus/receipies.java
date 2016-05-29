package com.udacity.firebase.shoppinglistplusplus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class receipies extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receipies);
    }
    public void xxaa(View view){
        Intent intent = new Intent(this ,recepies_rice.class);
        startActivity(intent);

    }
}
