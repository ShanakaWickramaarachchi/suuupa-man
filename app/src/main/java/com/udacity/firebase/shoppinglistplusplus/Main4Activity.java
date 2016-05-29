package com.udacity.firebase.shoppinglistplusplus;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.udacity.firebase.shoppinglistplusplus.ui.MainActivity;

public class Main4Activity extends AppCompatActivity {

    Button sendMessageBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        sendMessageBtn = (Button) findViewById(R.id.sendMessageBtn);
        sendMessageBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                composeMmsMessage();
            }
        });

    }

    public void xx(View view){
        Intent intent = new Intent(this ,learn_to_cook.class);
        startActivity(intent);

    }

    public void xx2(View view){
        Intent intent = new Intent(this ,receipies.class);
        startActivity(intent);

    }
    public void xx3(View view){
        Intent intent = new Intent(this ,MainActivity.class);
        startActivity(intent);

    }

    public void composeMmsMessage() {
//        Intent intent = new Intent(Intent.ACTION_SEND);
//        intent.setData(Uri.parse("smsto:77000"));  // This ensures only SMS apps respond
//        intent.putExtra("sms_body","Reg supa");
//        //intent.putExtra(Intent.EXTRA_STREAM, attachment);
//        if (intent.resolveActivity(getPackageManager()) != null) {
//            startActivity(intent);
//        }

        try{
            SmsManager smsManager = SmsManager.getDefault();
            smsManager.sendTextMessage("77000", null, "reg supa", null, null);
        }catch (Exception ex)
        {
            Log.d("Error",ex.getMessage());
        }

    }


}
