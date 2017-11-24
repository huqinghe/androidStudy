package com.huqinghe.wykj.testactivity;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main,menu);
        return  true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId())
        {
            case  R.id.add_add:
            {
                Toast.makeText(MainActivity.this,"add",Toast.LENGTH_LONG).show();
            }break;
            case R.id.remove_remove:
            {
                Toast.makeText(MainActivity.this,"remove",Toast.LENGTH_SHORT).show();
            }break;
        }
        return true;
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data)
    {
//        String string = data.getStringExtra("key");
//        Toast.makeText(MainActivity.this,string,Toast.LENGTH_SHORT).show();

        switch (requestCode)
        {
            case 1:
            {
                if (resultCode == RESULT_OK)
                {
                    String string1 = data.getStringExtra("key");
                    Toast.makeText(MainActivity.this,string1,Toast.LENGTH_SHORT).show();
                }
            }break;
            default:
                break;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_layout);
        Button button = (Button)findViewById(R.id.button_1);
        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                //Toast.makeText(MainActivity.this,"myTost",Toast.LENGTH_SHORT).show();
                //finish();
//向下个页面传值
//                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
//                intent.putExtra("comKey","传来的值");
//                startActivity(intent);

    Intent intent = new Intent(MainActivity.this,Main2Activity.class);
    startActivityForResult(intent,1);

/**
 * 打开网页
 * */
//        Intent intent = new Intent(Intent.ACTION_VIEW);
//        intent.setData(Uri.parse("http://www.baidu.com"));
//        startActivity(intent);


            }
        });
    }
}
