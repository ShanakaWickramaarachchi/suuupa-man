package com.udacity.firebase.shoppinglistplusplus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class recepies_rice extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recepies_rice);
    }
    public void xxaa(View view){
        Intent intent = new Intent(this ,Seafoodrecepie.class);
        startActivity(intent);

    }
}
