package com.huqinghe.wykj.testactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
//        Intent intent = getIntent();
//        String string = intent.getStringExtra("comKey");
//        Log.d("tag==:", string);
//        Toast.makeText(Main2Activity.this,string,Toast.LENGTH_SHORT).show();

        Button button = (Button)findViewById(R.id.buttonTwo);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.putExtra("key","comeValue");
                setResult(RESULT_OK,intent);
                finish();
            }
        });
    }
}
