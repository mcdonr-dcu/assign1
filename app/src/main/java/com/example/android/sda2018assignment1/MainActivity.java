package com.example.android.sda2018assignment1;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //method to display a message (toast) when the user clicks the button.
    public void showToast(View v) {
        //the message is stored in the strings.xml file
        CharSequence text = getResources().getString(R.string.mess_toast);
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(this, text, duration);
        toast.show();
    }
}
