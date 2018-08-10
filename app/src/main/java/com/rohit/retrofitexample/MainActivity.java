package com.rohit.retrofitexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText id;
    Button send;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        id = (EditText) findViewById(R.id.id_editText);
        send = (Button) findViewById(R.id.button_send);

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mSendIntent = new Intent(MainActivity.this, Main2Activity.class);
                mSendIntent.putExtra("Id", id.getText().toString().trim());
                startActivity(mSendIntent);
            }
        });
    }
}
